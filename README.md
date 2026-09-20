# UtilEs — reconstrucción modular con auditoría de seguridad

Repositorio de **auditoría de seguridad y reconstrucción modular** de la app
*UtilEs* (paquete `cu.lestebang.utiletecsa`), una app Android de servicios
ETECSA para Cuba: consulta USSD (saldo/datos/voz/SMS), Nauta (WiFi/VPN
ETECSA), bloqueo y alertas de llamadas, foros y spots de conexión, planes y
precios, y widgets de estado.

> ⚖️ **Aviso legal.** Este análisis se realizó sobre una copia legítima y
> controlada de la app, con fines de auditoría de seguridad e investigación
> personal del propietario. **No** se incluye código para eludir licencias,
> DRM ni activar funciones de pago. El código decompilado se conserva como
> **evidencia de auditoría** y referencia; la licencia aplicable al código
> original es la del editor (este repositorio licencia su propio código bajo
> [Apache-2.0](LICENSE)).

## ¿Qué contiene este repositorio?

| Ruta | Contenido |
|---|---|
| `apk-original/` | APK original + SHA-256 + evidencia de firma (certificado, informe del PoC) |
| `SECURITY.md` | **Auditoría completa**: hallazgos priorizados por CVSS, PoCs y mitigaciones |
| `audit/verify_signature.py` | PoC de verificación de firma apksig (v1/v2/v3) usado en la auditoría y en la CI |
| `decompiled/` | Salida de **jadx** (código, 10.487 ficheros) y **apktool** (recursos) |
| `smali/` | Desensamblado Dalvik (apktool d) como referencia |
| `app/` | **Proyecto Gradle modular** de la reconstrucción (este README lo detalla) |
| `features/` — dentro de `app/` | 15 módulos de features con el código decompilado de referencia |
| `ci/build.yml` | CI: integridad del APK original, build, tests, releases (en staging; activar con `cp ci/build.yml .github/workflows/build.yml` — ver `ci/README.md`) |

## Estructura del proyecto `app/`

```
app/
├── settings.gradle.kts        # :app :core :data :ui :security  (features DESACTIVADAS)
├── gradle/libs.versions.toml  # catálogo: AGP 9.2.1, Gradle 9.4.1, Kotlin integrado
├── build.gradle.kts           # raíz
├── app/                       # :app  — aplicación (manifiesto endurecido, iconos)
├── core/                      # :core — modelos de dominio (Kotlin)
├── data/                      # :data — contratos de repositorio + DTOs (Kotlin)
├── ui/                        # :ui   — shell de UI (tema, secciones, acciones USSD)
├── security/                  # :security — mitigaciones (UpdatePolicy, SignatureVerifier,
│                              #             SecureStorage) — las novedades de seguridad
└── features/                  # :features/* — 15 módulos de referencia (DESACTIVADOS)
    ├── home/  auth/  registro/  nauta/  settings/  sms/  forum/
    ├── planes/  precios/  red/  ayuda/  infoutil/  servicios/  profile/  widget/
```

El **grafo de dependencias** y la justificación de cada módulo están en
[ARCHITECTURE.md](ARCHITECTURE.md).

## Requisitos

| Herramienta | Versión | Notas |
|---|---|---|
| JDK | 21 (mínimo 17) | AGP 9.2 requiere JDK 17+ |
| Gradle | 9.4.1 (wrapper incluido) | `./gradlew` |
| AGP | 9.2.1 | la misma con la que se construyó el APK original |
| Kotlin | integrado (built-in) de AGP 9.2 | **no** se aplica `org.jetbrains.kotlin.android` |
| Android SDK | compileSdk 37, minSdk 24 | build-tools 36+ |

## Clonar, compilar y ejecutar

```bash
# 1) Clonar
git clone https://github.com/juanbas2005/app-utiles.git
cd app-utiles/app

# 2) Compilar + tests (JVM)
./gradlew assembleRelease test

# 3) APKs de salida (4: 3 ABIs + universal)
ls app/build/outputs/apk/release/
#   app-release-armeabi-v7a.apk
#   app-release-arm64-v8a.apk
#   app-release-x86_64.apk
#   app-release.apk                      (universal)

# 4) Instalar en un dispositivo/emulador
adb install -r app/build/outputs/apk/release/app-release-arm64-v8a.apk
```

Detalles de variants, ABIs, R8 y keystore en [BUILD.md](BUILD.md).

## Descarga de las APKs (Release de GitHub)

La CI publica en **Releases** (tags `v*`) los 4 APK con sus SHA-256. Ejemplo
con la última release `v1.6.3-security.1`:

```
https://github.com/juanbas2005/app-utiles/releases/download/v1.6.3-security.1/app-release-arm64-v8a.apk
https://github.com/juanbas2005/app-utiles/releases/download/v1.6.3-security.1/app-release-armeabi-v7a.apk
https://github.com/juanbas2005/app-utiles/releases/download/v1.6.3-security.1/app-release-x86_64.apk
https://github.com/juanbas2005/app-utiles/releases/download/v1.6.3-security.1/app-release.apk   (universal)
```

También aparecen como artefactos de cada ejecución de la workflow `build`
(pestaña *Actions* → job *Build modular* → artefacto `apks-release`).

## Estado de la reconstrucción

- ✅ **Compilable**: `:app`, `:core`, `:data`, `:ui`, `:security` + tests.
- ✅ **Mitigaciones de manifiesto** aplicadas (F-02/03/04/05/08/10, ver
  [SECURITY.md](SECURITY.md)).
- ✅ **Mitigaciones de código**: `UpdatePolicy`/`SignatureVerifier` (F-08) y
  `SecureStorage` (F-06) en `:security`.
- ⏳ **Pendiente**: las 15 `:features/*` son **referencia** (Java decompilado
  con referencias minificadas por R8); se habilitan al recuperar el source
  original o el mapping de R8. Ver [ARCHITECTURE.md §6](ARCHITECTURE.md).

## Documentación

- [SECURITY.md](SECURITY.md) — auditoría (hallazgos F-01…F-11, CVSS, PoCs)
- [ARCHITECTURE.md](ARCHITECTURE.md) — grafo de módulos y justificaciones
- [BUILD.md](BUILD.md) — toolchain, variants, ABIs, keystore, CI
- [CONTRIBUTING.md](CONTRIBUTING.md) — convenciones y flujo de trabajo
