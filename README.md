# UtilEs — auditoría y re-implementación endurecida

Repositorio de trabajo del análisis de seguridad de la app Android **UtilEs**
(`cu.lestebang.utiletecsa`), una aplicación de utilidades para ETECSA (Cuba):
consulta de saldo/datos por USSD, gestión de cuentas de correo Nauta, planes y
precios, foro comunitario, widgets de saldo/datos/VPN, atajos de marcación,
transferencia de saldo y VPN WireGuard.

El repositorio contiene:

1. **El APK original** verificado y su descompilación (`apk-original/`,
   `decompiled/`, `smali/`).
2. **Una re-implementación multi-módulo endurecida** (`app/`, `core/`,
   `security/`, `feature/`) que aplica las mitigaciones de la auditoría
   ([SECURITY.md](SECURITY.md)) con un stack moderno
   (Gradle 8.14, AGP 8.13, Kotlin 2.2, Jetpack Compose).
3. **CI** que compila, testa, firma y publica APKs por ABI en GitHub Releases
   ([.github/workflows/build.yml](.github/workflows/build.yml)).

## Documentación

| Documento | Contenido |
|---|---|
| [SECURITY.md](SECURITY.md) | Auditoría de seguridad: 11 hallazgos priorizados con CVSS, PoC y remediación |
| [ARCHITECTURE.md](ARCHITECTURE.md) | Grafo de módulos, responsabilidades y justificación de dependencias |
| [BUILD.md](BUILD.md) | Variants, ABIs, firma y verificación de builds |
| [CONTRIBUTING.md](CONTRIBUTING.md) | Guía de contribución |
| [apk-original/METADATA.md](apk-original/METADATA.md) | Procedencia, hash y certificado del binario original |

## Qué hace esta re-implementación

- **Consulta USSD segura** (`*222#`, `*234#`…): catálogo cerrado, validación
  estricta de códigos y confirmación explícita del usuario antes de marcar.
- **Almacenamiento cifrado**: contraseñas y datos sensibles con AES-256/GCM +
  AndroidKeyStore; nada sale del dispositivo (backups desactivados).
- **Red estricta**: TLS 1.2+ obligatorio, tráfico en claro prohibido por
  Network Security Config, allowlist de hosts para actualizaciones.
- **Actualizaciones verificadas**: `version.json` por HTTPS + comprobación
  SHA-256 del binario antes de proponer instalación.
- **Superficie mínima**: un solo componente exportado (el launcher), 3 permisos
  (frente a 31 del original), sin servicios ni receivers en background.

## Requisitos

- JDK 17+ (Temurin recomendado)
- Android Studio Ladybug+ o Gradle 8.14 via wrapper (`./gradlew`)
- Android SDK 36 (`compileSdk=36`, `minSdk=24`, `targetSdk=36`)

## Clonar y compilar

```bash
git clone https://github.com/juanbas2005/app-utiles.git
cd app-utiles
./gradlew assembleRelease            # APKs por ABI + universal (firmados con debug en local)
./gradlew testDebugUnitTest          # tests unitarios
```

Los APKs quedan en `app/build/outputs/apk/release/`. Detalles de variants,
ABIs y firma en [BUILD.md](BUILD.md).

## Descargar APKs de la Release

Ve a [Releases](https://github.com/juanbas2005/app-utiles/releases) y elige:

- `UtilEs-<tag>-arm64-v8a.apk` — dispositivos modernos (recomendado)
- `UtilEs-<tag>-armeabi-v7a.apk` — dispositivos 32-bit
- `UtilEs-<tag>-x86_64.apk` — emuladores
- `UtilEs-<tag>-universal.apk` — universal

Cada release publica `SHA256SUMS.txt` para verificar la integridad de los
binarios antes de instalar.

## Estado de la re-implementación

Base sólida y compilable de la shell endurecida (Home, consulta USSD con
confirmación, ajustes, verificación de actualizaciones). Los módulos del
original no re-implementados (foro, Nauta completo, planes, widgets, backend
WireGuard nativo) están documentados como trabajo pendiente en
[ARCHITECTURE.md](ARCHITECTURE.md).

## Aviso legal

Proyecto de auditoría de seguridad sobre una copia obtenida legítimamente de un
APK distribuido públicamente. El código decompilado incluido para análisis se
mantiene únicamente con fines de investigación y reproducibilidad; los derechos
del binario original pertenecen a su autor. No se eluden licencias, DRM ni
funciones de pago. Licencia del código nuevo: Apache-2.0 (ver [LICENSE](LICENSE)).
