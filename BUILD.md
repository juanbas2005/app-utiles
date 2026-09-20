# BUILD.md — Variants, ABIs y firma

## Requisitos

| Herramienta | Versión |
|---|---|
| JDK | 17+ (Temurin recomendado) |
| Gradle | 8.14.3 (via `./gradlew`, se descarga automáticamente) |
| AGP | 8.13.0 |
| Kotlin | 2.2.20 |
| Android SDK | Platform 36 (compileSdk), Build-Tools 36 |
| minSdk / targetSdk | 24 / 36 |

En CI (`.github/workflows/build.yml`) todo esto es automático: el runner de
GitHub ya trae el SDK y acepta licencias.

## Tareas principales

```bash
./gradlew tasks                       # listado completo
./gradlew assembleDebug               # APK debug
./gradlew assembleRelease             # APKs release firmados (ver firma)
./gradlew testDebugUnitTest           # tests unitarios de TODOS los módulos
./gradlew :security:testDebugUnitTest # tests de un módulo concreto
./gradlew lint                        # Android Lint
```

## Variants

| Variant | Minify | Shrink resources | Firma | Uso |
|---|---|---|---|---|
| `debug` | no | no | debug keystore | desarrollo, logs activos con redacción |
| `release` | **sí (R8)** | **sí** | CI keystore (o debug en local) | distribución |

`buildTypes.release.signingConfig` en `app/build.gradle.kts`:

- Si existen las variables de entorno `CI_KEYSTORE_BASE64`,
  `CI_KEYSTORE_PASSWORD`, `CI_KEY_ALIAS` y `CI_KEY_PASSWORD` (secrets del repo),
  se decodifica y usa ese keystore.
- En local (sin variables), se firma con el debug keystore para poder instalar;
  **no apto para distribución pública**.

## ABI splits

Configurado en `app/build.gradle.kts`:

```kotlin
splits {
    abi {
        isEnable = true
        reset()
        include("armeabi-v7a", "arm64-v8a", "x86_64")
        isUniversalApk = true
    }
}
```

Salida (`app/build/outputs/apk/release/` tras `assembleRelease`):

| APK | Arquitectura | Cuándo usarlo |
|---|---|---|
| `*-armeabi-v7a.apk` | 32-bit ARM | teléfonos antiguos |
| `*-arm64-v8a.apk` | 64-bit ARM | la mayoría de dispositivos modernos — **recomendado** |
| `*-x86_64.apk` | 64-bit x86 | emuladores, Chromebooks |
| `*-universal.apk` | todas | distribución simple (instala en cualquier máquina) |

> El APK original distribuía librerías nativas (`libwg-go.so` de WireGuard) en
> 4 ABIs; por eso la base conserva splits por ABI incluso sin código nativo
> propio: cuando se re-integre el backend WireGuard (ver ARCHITECTURE.md), los
> APKs por ABI seguirán siendo los entregables correctos.

## Verificación del binario original (regla de oro del repo)

Cada build de CI **re-verifica** que `apk-original/UtilEs.apk`:

1. Conserva su SHA-256 (`sha256sum -c apk-original/CHECKSUMS.sha256`).
2. Firma y verifica con esquema v2 (`apksigner verify`).
3. Su certificado coincide con la huella publicada en
   `apk-original/METADATA.md`:
   `187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8`.

Si alguien sustituye el binario de referencia, el pipeline se rompe a propósito:
la auditoría debe ejecutarse siempre contra el mismo artefacto.

## Verificar los APKs de una Release (usuario)

```bash
# 1. Descarga los ficheros de la release + SHA256SUMS.txt
sha256sum -c SHA256SUMS.txt

# 2. Comprueba la firma antes de instalar (opcional, con build-tools):
apksigner verify --print-certs UtilEs-*-arm64-v8a.apk
```

## Publicar una release

1. **Por tag:** empuja `git tag v2.0.0 && git push origin v2.0.0` → el workflow
   compila y publica la release con los 4 APKs + `SHA256SUMS.txt`.
2. **Manual:** ejecuta el workflow `build` con `workflow_dispatch` marcando
   `publicar_release=true` → crea el tag `v2.0.0-r<run_number>` y publica.

## Resolución de problemas

| Problema | Solución |
|---|---|
| `SDK location not found` | crea `local.properties` con `sdk.dir=/ruta/al/sdk` |
| `Unsupported class file major version` | usa JDK 17+ (`java -version`) |
| Descarga de Gradle lenta | el wrapper usa `gradle-8.14.3-bin.zip`; el CI cachea |
| Firma falla en CI | revisa los secrets `CI_KEYSTORE_*` (Base64 del `.jks` completo) |
