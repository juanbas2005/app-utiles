# decompiled/sources — código Java (jadx 1.4.7)

Salida de `jadx --no-res` sobre `apk-original/UtilEs.apk`.

## Alcance versionado

Solo se versiona el código **first-party** de la app (`cu/lestebang/utiletecsa/**`,
84 clases `.java`). Las ~6 000 clases restantes son dependencias third-party
(AndroidX, Compose, Firebase, OkHttp, Retrofit, Room, Coil, WireGuard-Android,
Kotlin stdlib, kotlinx-serialization, Dagger/Hilt, Material…) y se excluyen del
repositorio por volumen. Regéneralas con `tools/decompile.sh`.

> Nota: el APK fue procesado por R8 (minificación). Parte de la lógica first-party
> (repositorios, DAOs generados, casos de uso) quedó renombrada al paquete
> `defpackage` con nombres tipo `su0`, `dv7`, `zk3`… Ese código se puede reconstruir
> con el script de arriba y es referenciado en `SECURITY.md` donde aplica.

## Estructura observada (mapa modular de la app original)

| Paquete | Responsabilidad |
|---|---|
| `App`, `MainActivity` | Application (Hilt + WorkManager: `AppUpdateWorker` cada 24 h) y actividad raíz Compose |
| `core.network` | modelo de red (`NetworkPost`) |
| `core.preferences` | `UserDataPreferences`, `PreferencesUserProfile`, `DarkThemeConfigPreferences` (DataStore + kotlinx-serialization) |
| `core.room` | `JetpackDatabase` (Room): `jetpacks`, `nauta_accounts`, `transfer_recipients`, `ussd_codes`, `ussd_responses` |
| `data.repository` | DTOs (kotlinx-serialization): account/licencias, feedback, forum, profile, spots |
| `feature.auth` | navegación de sign-in / sign-up |
| `feature.ayuda` | ayuda y pantalla de licencia |
| `feature.forum` | foro comunitario |
| `feature.home` | Home, Dialer, Mapa de pamarillas, pantalla VPN |
| `feature.infoutil` | información útil |
| `feature.nauta` | gestión de cuentas Nauta + `NautaOverlayService` (overlay) + `NautaTileService` (Quick Settings) |
| `feature.planes` | planes de datos |
| `feature.precios` | precios |
| `feature.profile` | perfil de usuario |
| `feature.red` | red |
| `feature.registro` | registro/registro de llamadas (contactos) |
| `feature.servicios` | servicios |
| `feature.settings` | ajustes + servicios en background (`BalanceNotificationService`, `CallAlert*`, `CallBlock*`, `GsmNetworkService`, `SpeedOverlayService`, `UssdAuto*`) |
| `feature.sms` | utilidades SMS |
| `messaging` | `UtilEsMessagingService` (FCM) |
| `shortcuts` | `UssdShortcutActivity` (atajos de USSD) |
| `sync` | auto-actualización: `AppUpdateWorker` (version.json) + `DownloadApkReceiver` (DownloadManager) |
| `sync.worker` | workers: sync, nauta logout, plan expiry, ussd refresh, delegating |
| `widget` | widgets de saldo, datos, VPN, APN, LTE y resumen |

## Errores de decompilación

jadx reportó 28 clases con errores de decompilación (típico en bytecode de
coroutines/R8). No afectan al análisis: el respaldo siempre es el smali en `/smali`.
