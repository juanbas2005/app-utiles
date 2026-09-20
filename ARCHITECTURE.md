# Arquitectura — grafo de módulos y justificación

Este documento justifica la fragmentación de UtilEs en módulos Gradle
(requisito de la auditoría) y documenta cada módulo. El código fuente de
referencia está en `decompiled/sources/cu/lestebang/utiletecsa/` (jadx) y el
proyecto compilable en `app/`.

## 1. Grafo de dependencias

```
                         ┌────────────┐
                         │    :app    │  application (ID cu.lestebang.utiletecsa)
                         └──┬───┬───┬─┘
              ┌──────────┐   │   │   │   ┌────────────┐
              │   :ui    │◀──┘   │   └──▶│ :security  │
              └────┬─────┘       │       └────────────┘
              ┌────▼─────┐       │
              │  :data   │       │
              └────┬─────┘       │
              ┌────▼─────┐       │
              │  :core   │◀──────┘
              └──────────┘   (no depende de nada)

  :features/* (15) → :ui → :core / :data      [DESACTIVADOS, ver §6]
```

Reglas:

1. **`core` no depende de nada** del proyecto: son los modelos de dominio
   (puros, sin framework). Cualquier módulo puede usarlo sin ciclos.
2. **`data` depende solo de `core`**: los contratos de repositorio y los
   DTOs mapean hacia modelos de dominio.
3. **`ui` depende de `core`**: constantes visuales y de navegación.
4. **`security` no depende de nada del proyecto** (solo APIs de plataforma):
   es independiente y reutilizable; `:app` lo consume para la
   auto-actualización y el storage de secretos.
5. **`app` depende de todos** (módulo de composición): manifiesto, iconos,
   `Application` y `MainActivity`.

## 2. `:app` — aplicación

| Aspecto | Detalle |
|---|---|
| Responsabilidad | Manifiesto endurecido, iconos, `UtilEsApp`/`MainActivity` (shell), ABI splits, versión |
| Contenido nuevo | `UtilEsApp.kt` (sin Firebase/telemetría, sin AppUpdateWorker), `MainActivity.kt` (placeholder), `BuildInfo.kt`, `res/xml/network_security_config.xml` |
| Referencia | `ui/src/reference/java/…/App.java`, `MainActivity.java`, `R.java` (decompilados) |
| Mitigaciones aquí | F-02 (NSC + sin cleartext), F-03 (mínimo permisos), F-04 (`allowBackup=false`), F-05/F-08/F-10 (componentes peligrosos excluidos) |

## 3. `:core` — modelos de dominio

| Aspecto | Detalle |
|---|---|
| Responsabilidad | Modelos puros: `NetworkPost`, `UserDataPreferences` (59 campos), `DarkThemeConfigPreferences`, `PreferencesUserProfile` |
| Justificación | Es el contrato de datos compartido por `:data` y las features; al ser puro (sin Android), se puede testear en JVM sin emulador |
| Evidencia | `core/src/reference/java/…` = decompilado original de `core/{network,preferences}` |
| Decisión | `@Serializable` retirado (ver `core/README.md` §3): los DTOs conservan la misma forma sin acoplar el build al plugin de serialización |
| Seguridad | `UserDataPreferences.secureFields` marca los campos que **deben** persistirse cifrados (F-06): `transferPin`, `nautaCookies`, `licenseTransferId`, `licenseCouponCode`, `accountEmail` |

## 4. `:data` — contratos de repositorio

| Aspecto | Detalle |
|---|---|
| Responsabilidad | Interfaces `AccountRepository`, `ProfileRepository`, `ForumRepository`, `SpotRepository`, `FeedbackRepository` + DTOs (licencia, perfil, foros, spots, feedback) |
| Justificación | En el original, `data/repository/**` solo contiene DTOs; las implementaciones son clases minificadas por R8. Delimitar el **contrato** permite reconstruir las implementaciones (Supabase/REST) sin tocar la UI |
| Evidencia | `data/src/reference/java/…` = decompilado original |
| Seguridad | `ProfileDto.fcmToken` documentado (F-09); el backend real (Supabase ref + clave publishable) documentado en F-07 |

## 5. `:ui` — shell de UI

| Aspecto | Detalle |
|---|---|
| Responsabilidad | Paleta (placeholder documentado), secciones colapsables del home, acciones USSD del atajo |
| Justificación | Agrupa constantes que las 15 features comparten; el tema Compose real es recuperable solo con el source |
| Evidencia | `ui/src/reference/java/…/App.java`, `MainActivity.java`, `R.java` |

## 6. `:features/*` — 15 módulos DESACTIVADOS

| Módulo | Responsabilidad (evidencia decompilada) |
|---|---|
| `features/home` | `HomeNavGraph`, `Dialer`, `Item`, `Pamarillas`, `Vpn` (navegación principal) |
| `features/auth` | `SignIn`, `SignUp`, `AuthNavGraph` (Supabase Auth) |
| `features/registro` | `Registro`, `ContactDetail` |
| `features/nauta` | `Nauta`, `NautaOverlayService`, `NautaTileService` (QS tile, permiso protegido) |
| `features/settings` | 8 servicios de configuración (call alert/block, USSD auto, etc.) |
| `features/sms` | `Sms` (SEND_SMS — justificado en F-03) |
| `features/forum` | `Forum` (feeds/posts/votos) |
| `features/planes` | `Planes` (caducidad, precios) |
| `features/precios` | `Precios` (catálogo) |
| `features/red` | `Red` (estado de red) |
| `features/ayuda` | `Ayuda`, `Licencia` |
| `features/infoutil` | `InfoUtil` |
| `features/servicios` | `Servicios` (catálogo ETECSA) |
| `features/profile` | `Profile` |
| `features/widget` | 6 widget providers + 3 activities de soporte |

**¿Por qué desactivados?** El Java decompilado por jadx referencia clases
minificadas por R8 (paquete `defpackage`, `r8-map-id a2600502…`) que no
existen en el repositorio. Sin el source original o el mapping de R8 no
compilan — y "stubbearlos" a mano introduciría código inventado. Cada módulo
trae su `build.gradle.kts` listo y su `README.md`; habilitar = añadir
`include(":features:<módulo>")` a `settings.gradle.kts` (ver
`CONTRIBUTING.md` §3).

> La capa minificada (`defpackage/*`, 12.000+ clases) **no** se fragmenta:
> vive solo en `decompiled/` y `smali/` como evidencia.

## 7. `:security` — mitigaciones implementadas

| Clase | Hallazgo | Qué hace |
|---|---|---|
| `UpdatePolicy` | F-08 | Lógica pura: `shouldUpdate` (versionCode), `compareVersionName`, `sha256Matches` (constant-time), `checkUpdate` (política completa) |
| `SignatureVerifier` | F-08 | `sha256OfFile` (APK descargado), `installedCertificateSha256` (cert. instalado), `verifyDownloadedApk` (orquestación) |
| `SecureStorage` | F-06 | AES-256-GCM con clave no exportable en Android KeyStore; wrapper `put/getString/remove` |

Código decompilado de la superficie original (`messaging/`, `sync/`,
`shortcuts/`) conservado en `security/src/reference/java/…`.

## 8. Tabla de endurecimiento del manifiesto

| Atributo/componente | Original | Reconstrucción | Hallazgo |
|---|---|---|---|
| `usesCleartextTraffic` | `true` | `false` + NSC (TLS 1.2+) | F-02 |
| `networkSecurityConfig` | ausente | `@xml/network_security_config` | F-02 |
| `allowBackup` | `true` (sin reglas) | `false` | F-04 |
| `SEND_SMS`, `READ_CALL_LOG`, `READ_CONTACTS` | declarados | **no** declarados (vuelven con su feature, justificados) | F-03 |
| `READ_SMS`, `CALL_PHONE`, `ANSWER_PHONE_CALLS`, `ACCESS_FINE_LOCATION`, `SYSTEM_ALERT_WINDOW` | declarados | no declarados en el shell | F-03 |
| `UssdShortcutActivity` | `exported=true` + action implícita global | excluido; al reconstruir: `exported=false` + filtro solo de action | F-05 |
| `DownloadApkReceiver` | exportado (intent de update) | excluido; update por `UpdatePolicy` con verificación | F-08 |
| Receptores `PHONE_STATE` (CallAlert/CallBlock) | exportados (broadcast protegido) | excluidos hasta reconstruir la feature | F-10 |
| `UssdAutoBootReceiver` + opt-out battery optimizations | presentes | excluidos | F-11 |
| Firebase (Crashlytics/Analytics/Perf/Sessions/RC/Installations) + `AD_ID` | en `App.java` | ausente del shell; reintroducir solo lo necesario con data collection desactivado por defecto | F-09 |
| `targetSdk` | 36 | 37 | I-03 |
| Versión | 1.6.2 / 10602 | 1.6.3-security.1 / 10603 | — |
