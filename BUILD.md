# BUILD — toolchain, variants, ABIs y CI

## 1. Comandos

```bash
cd app
./gradlew assembleRelease test        # build + tests JVM
./gradlew :app:assembleRelease        # solo el APK final
./gradlew :core:testDebugUnitTest     # tests de un módulo
./gradlew clean
```

Los 4 APK de salida:

```
app/app/build/outputs/apk/release/app-release-armeabi-v7a.apk
app/app/build/outputs/apk/release/app-release-arm64-v8a.apk
app/app/build/outputs/apk/release/app-release-x86_64.apk
app/app/build/outputs/apk/release/app-release.apk            (universal)
```

## 2. Toolchain (justificada, a 2026-09-20)

| Pieza | Versión | Motivo |
|---|---|---|
| Gradle | **9.4.1** (wrapper) | versión por defecto y mínima de AGP 9.2 |
| AGP | **9.2.1** | la misma con la que se construyó el APK original (metadata PKDS de `apk-original/`) |
| JDK | **21** (mínimo 17) | AGP 9.2 exige JDK 17+; la CI usa Temurin 21 |
| Kotlin | **integrado (built-in) en AGP 9.2** (KGP 2.2.10 por defecto) | Desde AGP 9.0 el plugin `org.jetbrains.kotlin.android` se retira del flujo: no se declara en ningún módulo (ver `settings`/`build` root) |
| compileSdk / targetSdk | **37** | máximo soportado por AGP 9.2 (target 37 = Android 16) |
| minSdk | **24** | el mismo que el original |

Nota del wrapper: `services.gradle.org` no es alcanzable desde el sandbox de
auditoría; el `gradle-wrapper.jar` se obtuvo de un repositorio público
canónico (`jetbrains/kotlin`, wrapper oficial). La CI (GitHub Actions)
descarga la distribución Gradle sin problema.

## 3. Variantes

| buildType | R8/minify | shrinkResources | Firma |
|---|---|---|---|
| `debug` | no | no | keystore debug (auto) |
| `release` | **sí** | **sí** | keystore CI (ver §6) |

El `release` genera mapping de R8 propio en
`app/app/build/outputs/mapping/release/mapping.txt` (el original no publicó
el suyo: I-01).

## 4. ABI splits

```kotlin
splits {
    abi {
        isEnable = true
        include("armeabi-v7a", "arm64-v8a", "x86_64")
        isUniversalApk = true
    }
}
```

4 APKs por build: 3 ABIs + universal. **Nota**: la reconstrucción todavía no
incluye `.so` (el WireGuard original vivía en `assets/`); mientras tanto los
4 APK son idénticos en contenido — el split queda configurado para cuando la
feature de VPN se reintegre.

## 5. R8

- `proguard-rules.pro` (raíz de `:app`) + `consumer-rules.pro` por módulo.
- Regla actual: `keep BuildInfo` (metadatos de auditoría).
- Al habilitar features, añadir reglas de las clases de la feature
  (viewmodels/serializers).

## 6. Keystore de firma

| Escenario | Qué hace la CI |
|---|---|
| Secrets `CI_KEYSTORE_BASE64` + `CI_KEYSTORE_PASSWORD` presentes | usa el keystore real del propietario (recomendado para releases) |
| Sin secrets | genera un keystore **desechable** con `keytool` (RSA-2048) solo para que el build firme y `apksigner verify` pase en CI |

Para re-firmar la app de producción con apksig estándar (mitigación completa
de **F-01**), el propietario debe:

1. Crear su keystore de producción (keytool o Android Studio).
2. Añadir los 4 secretos al repo (Settings → Secrets):
   `CI_KEYSTORE_BASE64` (base64 del .keystore), `CI_KEYSTORE_PASSWORD`,
   `CI_KEY_ALIAS`, `CI_KEY_PASSWORD`.
3. A partir de ahí, todos los releases usarán el mismo certificado
   (actualmente el de 2016: sha256
   `187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8`;
   puede mantenerse si se exporta el .keystore original, o renovarse).

## 7. CI (`.github/workflows/build.yml`)

| Job | Qué hace |
|---|---|
| `apk-original-integrity` | `sha256sum -c` del APK original + `audit/verify_signature.py` con la expectativa de **F-01** (exit 2, "ningún esquema de firma estándar"); se invierte al re-firmar |
| `build` | JDK 21 + setup-android + gradle-build-action → `assembleRelease test` → `apksigner verify --print-certs` de cada APK → 4 APK como artefacto |
| `release` | solo en tags `v*`: publica los 4 APK + SHA-256 en GitHub Release |

Despliegue: push/PR a `main`, tags `v*`, `workflow_dispatch`.

## 8. Troubleshooting rápido

| Síntoma | Causa probable / solución |
|---|---|
| `SDK location not found` | definir `ANDROID_HOME` o un `local.properties` con `sdk.dir` |
| Error de JDK < 17 | usar JDK 17/21 (`org.gradle.java.home`) |
| `Could not resolve com.android.application:9.2.1` | revisar conectividad a `google()` (dl.google.com) |
| Tests fallan por APIs Android | solo los tests **puros** (JVM) deben pasar sin emulador; el resto va a instrumentación |
