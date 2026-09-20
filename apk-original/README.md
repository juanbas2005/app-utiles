# APK original — UtilEs v1.6.2

Este directorio guarda el binario original descargado de
<https://apputiles.com/assets/UtilEs.apk> y la evidencia de su análisis.

## Integridad

| Campo | Valor |
|---|---|
| Archivo | `UtilEs.apk` |
| Tamaño | 22 407 919 bytes (22.4 MB) |
| **SHA-256** | `e2631f1f9096ffaee56224735758f901a9207f365e46cd08950fadf2ad2f2e9f` |
| Versión | versionName `1.6.2` · versionCode `10602` |
| Paquete | `cu.lestebang.utiletecsa` |
| minSdk / targetSdk / compileSdk | 24 / 36 / 37 (Android 17) |
| DEX | 1 × `classes.dex` (10 053 072 bytes, versión 037) — 12 453 clases, 43 188 métodos |
| ABIs nativas | armeabi-v7a, arm64-v8a, x86, x86_64 (librerías WireGuard: `libwg-go.so`, `libwg-quick.so`, `libwg.so`) |
| AGP de construcción | 9.2.1 (`META-INF/com/android/build/gradle/app-metadata.properties`) |
| Revisión git del build | `e52df625827de304edb7bfde283d5a6c6cef47fd` (`META-INF/version-control-info.textproto`) |

Verificación local:

```console
$ sha256sum -c UtilEs.apk.sha256
UtilEs.apk: OK
```

## Firma

Análisis completo: [`signature/`](signature/) · Informe: [`../SECURITY.md` §F-01](../SECURITY.md)

- **v1 (JAR): ausente** — sin `MANIFEST.MF`/`*.SF`/`*.RSA` en `META-INF`.
- **v2/v3 (APK Signing Block): presente pero no conforme a la especificación apksig.**
  El bloque contiene un par con el ID oficial v2 (`0x7109871a`) cuyo valor usa un
  formato propietario (hash SHA-256 + certificado X.509 + firma RSA-2048 + clave
  pública embebidas, fuera de la disposición `[datos][certs][sigs]` oficial), y un
  par `PKDS` (metadatos de dependencias de AGP) que rompe la alineación del bloque.
  Resultado: **ningún esquema estándar pasa `apksigner verify`** (PoC:
  `../audit/verify_signature.py`, salida en `signature/verificacion-firma.txt`).
- Certificado presente en el bloque (extraído, no validable vía apksig):

| Campo | Valor |
|---|---|
| Sujeto | `CN=Luis Esteban, OU=CUSOFT, O=CUSOFT, L=La Habana, ST=La Habana, C=10400` |
| Emisor | idem (autofirmado) |
| Validez | 2016-04-29 → 2041-04-23 (25 años) |
| Clave | RSA 2048-bit · sha256WithRSAEncryption |
| Serial | `7F87FD49` |
| SHA-256 (cert) | `187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8` |
| SHA-1 (cert) | `fd162ee7d7a0280c4ebe82dce47f5a971f70206a` |

> ⚠️ La app se autoactualiza descargando este mismo APK desde
> `https://apputiles.com/assets/UtilEs.apk` (clase `DownloadApkReceiver`).
> Cualquier usuario que ya tenga la app instalada **no puede distinguir una
> versión legítima de una comprometida** con herramientas estándar, porque la
> firma no sigue un esquema verificable. Ver SECURITY.md §F-01 y §F-08.
