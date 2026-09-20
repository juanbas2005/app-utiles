# Metadatos del artefacto original

| Campo | Valor |
|---|---|
| Archivo | `UtilEs.apk` |
| Tamaño | 22 407 919 bytes (21.4 MiB) |
| SHA-256 | `e2631f1f9096ffaee56224735758f901a9207f365e46cd08950fadf2ad2f2e9f` |
| Origen oficial | `https://apputiles.com/assets/UtilEs.apk` |
| Vía de obtención en este entorno | repositorio oficial del landing del autor (`lestebang/utiles-landing`, ruta `assets/UtilEs.apk`, blob `5ec1f97816126d66fc7e3db0aecbead0e7f060e8`) — el dominio `apputiles.com` no era alcanzable desde el sandbox de análisis |
| Package | `cu.lestebang.utiletecsa` |
| applicationId / autor | UtilEs (utiletecsa) — Luis Esteban (CUSOFT) |
| minSdk / targetSdk | 24 (Android 7.0) / 36 (Android 16) |
|compileSdk declarado | 37 (platformBuildVersionCode=37) |
| Firma | esquema v2 únicamente (sin v1, sin v3) |
| Certificado | autofirmado RSA-2048, `sha256WithRSAEncryption` |
| SHA-256 del certificado | `187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8` |
| Sujeto | C=10400 (inválido), ST=La Habana, L=La Habana, O=CUSOFT, OU=CUSOFT, CN=Luis Esteban |
| Validez | 2016-04-29 → 2041-04-23 |
| Fecha de análisis | 2026-09-20 |

## Verificación de integridad

```bash
sha256sum -c CHECKSUMS.sha256
```

## Contenido relevante

- `classes.dex` (10 MB, 6 103 clases procesadas por jadx)
- Libs nativas por ABI (`arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64`): `libwg-go.so`,
  `libwg.so`, `libwg-quick.so` (backend Go de WireGuard), `libdatastore_shared_counter.so`,
  `libandroidx.graphics.path.so`
- Firma solo por esquema v2: válido para minSdk 24 (v2 existe desde Android 7.0)
- `assets/dexopt/baseline.prof`: baseline profile (startup optimizado)

## Nota legal

Copia obtenida legítimamente para auditoría de seguridad e investigación personal sobre
una aplicación cuyo APK se distribuye públicamente. No se eluden licencias, DRM ni
funciones de pago. La re-distribución del binario original en este repositorio es
exclusivamente para reproducibilidad de la auditoría.
