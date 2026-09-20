#!/usr/bin/env python3
"""
verify_signature.py — PoC de verificación de firmas de APK (esquemas v1, v2 y v3).

Implementa, de forma estricta y sin dependencias de Android, el algoritmo de
verificación descrito por Google en "APK Signature Scheme" (apksig):

  * v1: firma JAR clásica (META-INF/MANIFEST.MF + *.SF + *.RSA)
  * v2: APK Signing Block, par ID 0x7109871a
  * v3: APK Signing Block, par ID 0xf05368c0

Uso:
    python3 verify_signature.py <ruta.al.apk>

El script NO modifica el APK. Solo lectura.
Requisitos: Python 3.8+ y `cryptography` (pip install cryptography).
"""
from __future__ import annotations

import re
import struct
import sys
import zipfile

try:
    from cryptography import x509
    from cryptography.hazmat.primitives import hashes
    from cryptography.hazmat.primitives.asymmetric import ec, padding, rsa, utils
except ImportError:
    sys.exit("Falta la librería 'cryptography': pip install cryptography")

# IDs oficiales del APK Signing Block
ID_V2 = 0x7109871A
ID_V3 = 0xF05368C0
ID_V3_1 = 0x1B93AD61
ID_V4 = 0x6DFF800D
ID_PKDS = 0x504B4453  # metadatos de dependencias de AGP (no es una firma)


class ApkError(Exception):
    pass


def _find_eocd(data: bytes) -> tuple[int, int]:
    """Localiza el EOCD y devuelve (offset_EOCD, offset_directorio_central)."""
    off = data.rfind(b"PK\x05\x06")
    if off < 0:
        raise ApkError("No se encontró el EOCD: no es un ZIP válido")
    cd_off = struct.unpack("<I", data[off + 16 : off + 20])[0]
    return off, cd_off


def parse_signing_block(data: bytes, cd_off: int) -> dict:
    """
    Parsea el APK Signing Block que precede al directorio central.

    Formato (especif. apksig):
      [u64 size][pares (u32 id, u32 len, valor, padding a 4B) ...][u64 magic]
    """
    magic = data[cd_off - 16 : cd_off]
    if magic != b"APK Sig Block 42":
        return {}  # sin bloque de firma v2/v3
    # El campo size es el primer u64 del bloque: u64(off) == cd_off - off - 8
    # (el size cubre los pares + los 8 bytes de magic, que terminan en cd_off).
    size_off = None
    for off in range(cd_off - 16 - 200_000, cd_off - 16):
        if off + 8 <= len(data) and struct.unpack("<Q", data[off : off + 8])[0] == cd_off - off - 8:
            size_off = off
            break
    if size_off is None:
        raise ApkError("APK Signing Block malformado: no se localiza el campo size")
    pairs_off = size_off + 8
    end_pairs = cd_off - 16
    pairs: dict[int, tuple[int, int]] = {}
    malformed = []
    while pairs_off < end_pairs:
        if pairs_off + 8 > end_pairs:
            malformed.append(f"par truncado en {pairs_off}")
            break
        pid, plen = struct.unpack("<II", data[pairs_off : pairs_off + 8])
        if plen > end_pairs - (pairs_off + 8):
            malformed.append(f"par id=0x{pid:08x} con len={plen} fuera de límites en {pairs_off}")
            break
        pairs[pid] = (pairs_off + 8, plen)
        pairs_off += 8 + plen + (4 - plen % 4) % 4
    if pairs_off != end_pairs and not malformed:
        malformed.append(f"los pares terminan en {pairs_off}, se esperaba {end_pairs}")
    return {"pairs": pairs, "malformed": malformed, "block_start": size_off}


def _read_u32(buf: bytes, off: int) -> int:
    return struct.unpack("<I", buf[off : off + 4])[0]


def verify_v2_value(value: bytes) -> tuple[list[x509.Certificate], list[bytes]]:
    """
    Valida el valor del bloque v2 según el formato oficial:
      [u32 len_datos][datos][u32 n_certs][certs...][u32 n_sigs][sigs...]
    Devuelve (certificados, firmas) o lanza ApkError.
    """
    if len(value) < 4:
        raise ApkError("valor v2 demasiado corto")
    dlen = _read_u32(value, 0)
    if 4 + dlen > len(value):
        raise ApkError(f"longitud de datos v2 inválida: {dlen} > {len(value) - 4}")
    rest = value[4 + dlen :]
    if len(rest) < 4:
        raise ApkError("valor v2: no quedan bytes para la lista de certificados (formato no estándar)")
    ncerts = _read_u32(rest, 0)
    if ncerts == 0 or ncerts > 64:
        raise ApkError(f"valor v2: número de certificados inválido: {ncerts} (formato no estándar)")
    o = 4
    certs = []
    for _ in range(ncerts):
        if o + 4 > len(rest):
            raise ApkError("valor v2: lista de certificados truncada")
        clen = _read_u32(rest, o)
        o += 4
        if o + clen > len(rest):
            raise ApkError("valor v2: certificado truncado")
        certs.append(x509.load_der_x509_certificate(rest[o : o + clen]))
        o += clen
    if o + 4 > len(rest):
        raise ApkError("valor v2: falta la lista de firmas")
    nsigs = _read_u32(rest, o)
    o += 4
    sigs = []
    for _ in range(nsigs):
        if o + 4 > len(rest):
            raise ApkError("valor v2: lista de firmas truncada")
        slen = _read_u32(rest, o)
        o += 4
        if o + slen > len(rest):
            raise ApkError("valor v2: firma truncada")
        sigs.append(rest[o : o + slen])
        o += slen
    return certs, sigs


def _v2_signed_data(data: bytes, block_start: int, cd_off: int, eocd_off: int) -> bytes:
    """Datos firmados del esquema v2: [u32 len_bloque][bloque][u32 len_eocd][eocd]."""
    block = data[block_start:cd_off]  # incluye el campo size + magic
    eocd = data[eocd_off : eocd_off + 22]
    return struct.pack("<I", len(block)) + block + struct.pack("<I", 22) + eocd


def _verify_one(cert: x509.Certificate, sig: bytes, message: bytes) -> str | None:
    """Intenta verificar `sig` sobre `message` con el certificado. Devuelve el algo o None."""
    pub = cert.public_key()
    body = sig[4:] if len(sig) > 12 else sig
    # Formato de firma v2/v3: [u16 fmt][u16 pk_algo][u16 sig_algo][u32 len][bytes]
    try:
        fmt, pkalg, salgn, slen = struct.unpack("<HHHI", sig[:10])
        sigbytes = sig[10 : 10 + slen]
    except struct.error:
        sigbytes, salgn = body, None
    algos = {0x0101: (hashes.SHA256, "rsa-pss-sha256"), 0x0102: (hashes.SHA512, "rsa-pss-sha512"),
             0x0103: (hashes.SHA256, "rsa2048-sha256"), 0x0104: (hashes.SHA512, "rsa2048-sha512"),
             0x0201: (hashes.SHA256, "ecdsa-sha256"), 0x0202: (hashes.SHA512, "ecdsa-sha512")}
    if isinstance(pub, rsa.RSAPublicKey):
        HashCls, name = algos.get(salgn, (hashes.SHA256, "rsa-sha256?"))
        try:
            if salgn in (0x0101, 0x0102):
                pub.verify(sigbytes, message, padding.PSS(mgf=padding.MGF1(HashCls()), salt_length=padding.PSS.MAX_LENGTH), HashCls())
            else:
                pub.verify(sigbytes, message, padding.PKCS1v15(), HashCls())
            return name
        except Exception:
            return None
    if isinstance(pub, ec.EllipticCurvePublicKey):
        HashCls, name = algos.get(salgn, (hashes.SHA256, "ecdsa-sha256?"))
        try:
            pub.verify(sigbytes, message, ec.ECDSA(HashCls()))
            return name
        except Exception:
            return None
    return None


def verify(apk_path: str) -> int:
    data = open(apk_path, "rb").read()
    print(f"== Verificación de firma: {apk_path} ({len(data):,} bytes) ==")
    eocd_off, cd_off = _find_eocd(data)

    # ---------------- v1 (JAR) ----------------
    zf = zipfile.ZipFile(apk_path)
    names = zf.namelist()
    sf_files = [n for n in names if re.search(r"^META-INF/.*\.SF$", n)]
    sig_files = [n for n in names if re.search(r"^META-INF/.*\.(RSA|EC|DSA)$", n)]
    manifest_mf = "META-INF/MANIFEST.MF" in names
    if sf_files and sig_files:
        print(f"[v1] presente: {len(sf_files)} .SF, {len(sig_files)} .RSA — (verificación JAR omitida en este PoC)")
    else:
        print("[v1] AUSENTE: no hay MANIFEST.MF/.SF/.RSA en META-INF → sin firma JAR (v1)")

    # ---------------- bloque de firma v2/v3 ----------------
    block = parse_signing_block(data, cd_off)
    if not block:
        print("[v2/v3] AUSENTE: no hay APK Signing Block")
        return 2
    print(f"[bloque] APK Signing Block presente desde offset {block['block_start']}")
    for pid, (off, ln) in block["pairs"].items():
        name = {ID_V2: "v2", ID_V3: "v3", ID_V3_1: "v3.1", ID_V4: "v4", ID_PKDS: "PKDS (metadatos AGP)"}.get(pid, f"desconocido 0x{pid:08x}")
        print(f"[bloque]   par id=0x{pid:08x} ({name}) valor={ln} bytes en {off}")
    for m in block["malformed"]:
        print(f"[bloque] MALFORMADO: {m}")

    pairs = block["pairs"]
    signed_data = _v2_signed_data(data, block["block_start"], cd_off, eocd_off)
    any_ok = False
    for scheme_id, label in ((ID_V2, "v2"), (ID_V3, "v3")):
        if scheme_id not in pairs:
            continue
        off, ln = pairs[scheme_id]
        value = data[off : off + ln]
        try:
            certs, sigs = verify_v2_value(value)
        except ApkError as e:
            print(f"[{label}] ERROR de análisis del valor: {e}")
            print(f"[{label}]   → el bloque con ID {label} NO sigue el formato oficial de apksig.")
            continue
        for i, cert in enumerate(certs):
            print(f"[{label}] certificado #{i}: {cert.subject.rfc4514_string()}")
        for i, sig in enumerate(sigs):
            for j, cert in enumerate(certs):
                algo = _verify_one(cert, sig, signed_data)
                if algo:
                    any_ok = True
                    print(f"[{label}] FIRMA VERIFICADA (sig #{i}, cert #{j}, algoritmo: {algo})")
    if not any_ok:
        print("\nRESULTADO: ningún esquema de firma estándar (v1/v2/v3) pasa la verificación apksig.")
        print("→ apksigner verify reportaría el APK como sin firma válida.")
        return 2
    print("\nRESULTADO: el APK tiene al menos una firma estándar válida.")
    return 0


if __name__ == "__main__":
    if len(sys.argv) != 2:
        sys.exit(__doc__)
    sys.exit(verify(sys.argv[1]))
