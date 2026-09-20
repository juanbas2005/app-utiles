# Seguridad — Auditoría de UtilEs v1.6.2 (`cu.lestebang.utiletecsa`)

> **Alcance**: APK `apk-original/UtilEs.apk` (SHA-256 `e2631f1f…2f2e9f`),
> versionName 1.6.2 / versionCode 10602, descargado de
> <https://apputiles.com/assets/UtilEs.apk> el 2026-09-20. Análisis estático
> sobre `decompiled/` (jadx) y `smali/` (apktool).
>
> **Aclaración**: auditoría realizada sobre una copia legítimamente obtenida de
> una app bajo control del propietario, con fines de seguridad e investigación
> personal. No se solicita ni se describe elusión de licencias, DRM ni
> desbloqueo de funciones de pago.
>
> **Metodología**: revisión de manifiesto, permisos, componentes exportados,
> esquemas de firma (apksig), almacenamiento local, secretos embebidos,
> telemetría y flujo de auto-actualización. Cada hallazgo incluye evidencia,
> PoC y remediación. Puntuación **CVSS v3.1**.

## Resumen ejecutivo

| ID | Hallazgo | Severidad | CVSS | Estado |
|---|---|---|---|---|
| F-08 | Auto-actualización sin verificación de firma del APK descargado | **Crítico** | 9.1 | Mitigado en `:security` (pendiente integración) |
| F-01 | Firma no conforme a apksig: ninguna verificación estándar posible | **Alto** | 7.5 | Documentado (re-firma a cargo del dueño) |
| F-02 | `usesCleartextTraffic=true` sin network security config | **Alto** | 7.5 | Mitigado en `:app` (NSC + flag) |
| F-03 | Permisos excesivos (SEND_SMS, READ_CALL_LOG, READ_CONTACTS, …) | **Medio** | 5.4 | Mitigado en manifiesto `:app` |
| F-06 | Almacenamiento local sin cifrar (DataStore/Room: PIN, licencias, teléfono) | **Medio** | 5.5 | `SecureStorage` en `:security` (pendiente migración) |
| F-07 | Clave Supabase + project ref embebidos; seguridad dependiente de RLS | **Medio*** | 6.5 | PoC listo; verificación RLS a cargo del dueño |
| F-04 | `allowBackup=true` sin reglas de backup | **Medio** | 5.5 | Mitigado en manifiesto `:app` |
| F-05 | Actividad exportada con acción implícita (`UssdShortcutActivity`) | **Medio** | 4.3 | Mitigado en manifiesto `:app` |
| F-09 | Telemetría amplia (Analytics + Crashlytics + Perf + AD_ID) | **Bajo** | 4.3 | Documentado |
| F-10 | Receivers exportados para `PHONE_STATE` | **Bajo** | 3.7 | Mitigado en manifiesto `:app` |
| F-11 | Arranque automático + exención de optimización de batería | **Bajo** | 3.3 | Documentado |

\* F-07 escala a **Crítico** si las políticas RLS de Supabase están
mal configuradas (ver PoC; no evaluable desde el entorno de auditoría).

**Hallazgos positivos** (buenas prácticas presentes): ningún `ContentProvider`
exportado, servicios FCM/WorkManager no exportados, VPN (WireGuard) protegida
con `BIND_VPN_SERVICE`, tile QS protegida con `BIND_QUICK_SETTINGS_TILE`,
biometría vía `BiometricPrompt`, sin WebView con JavaScript habilitado,
endpoints de negocio por HTTPS.

---

## F-08 · Auto-actualización sin verificación de firma — **CRÍTICO (9.1)**

`AV:N/AC:L/PR:N/UI:R/S:C/C:H/I:H/A:H`

### Descripción
La app se actualiza a sí misma descargando un APK completo desde su sitio web
y ofreciéndolo a instalar, **sin verificar ni el hash ni la firma del
descargado**:

- `cu/lestebang/utiletecsa/sync/worker/AppUpdateWorker.java` (WorkManager)
  programa la actualización y dispara el broadcast
  `cu.lestebang.utiletecsa.sync.action.DOWNLOAD_APK`.
- `cu/lestebang/utiletecsa/sync/DownloadApkReceiver.java` lo ejecuta:

```java
new DownloadManager.Request(Uri.parse("https://apputiles.com/assets/UtilEs.apk"))
    .setMimeType("application/vnd.android.package-archive")
    ...
    .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "UtilEs.apk");
```

No hay comparación de SHA-256, no hay verificación de certificado, no hay
comparación con el certificado de la versión instalada.

### Por qué es crítico
1. **Sin firma verificable (F-01)**: aunque el APK actual se firmara "bien",
   ninguna herramienta estándar puede comprobar su autenticidad; el usuario no
   tiene forma de detectar un APK adulterado.
2. **Superficie de ataque amplia**: el APK atacado obtendría `READ_SMS`,
   `CALL_PHONE`, localización fina, contactos, log de llamadas y overlays
   (F-03) → robo de códigos de transferencia, fraudes telefónicos, espionaje.
3. **Infraestructura frágil**: durante la auditoría el dominio
   `apputiles.com` (GitHub Pages) presentaba handshakes TLS intermitentes
   (`SSL_ERROR_SYSCALL` en varios nodos 185.199.x.x), un síntoma que facilita
   MITM/hijacking DNS o expiración del dominio (registrado en Namecheap).
4. El canal es **HTTP(S) de un sitio estático**: sin Play App Signing, sin
   Play Integrity, sin store intermedia que valide integridad.

### PoC (conceptual)
```console
# 1) Atacante que controla apputiles.com (o MITM del TLS):
$ cp /ruta/UtilEs-malicioso.apk /var/www/html/assets/UtilEs.apk
# 2) La app v1.6.2 instalada ofrece "Nueva versión disponible" → descarga →
#    instala. Ningún control técnico impide la instalación del APK adulterado.
```
La ausencia de verificación está probada por el análisis de código:
`grep -n "UtilEs.apk" decompiled/sources/cu/lestebang/utiletecsa/sync/DownloadApkReceiver.java`
y por la ausencia de `MessageDigest`/`sha256`/`PackageManager` en todo el
flujo `sync/` (verificado con `grep -rni "digest\|verify\|signature" decompiled/sources/cu/lestebang/utiletecsa/sync/` → sin resultados).

### Remediación
1. **Verificación obligatoria antes de instalar** (implementada como API en
   `:security`, ver `UpdatePolicy.kt` / `SignatureVerifier.kt`):
   - SHA-256 del APK publicado, publicado en el sitio junto al APK y
     verificado en la app contra el hash embebido.
   - Verificación del certificado del APK descargado contra el certificado de
     la versión instalada (`PackageManager` + parseo del bloque v2/v3) —
     **imprescindible re-firmar primero con apksig estándar (F-01)**.
2. Preferir distribución por Play Store (App Signing) o, como mínimo,
   verificar integridad con `Play Integrity`/`SafetyNet` reemplazado por
   verificación local.
3. Fijar (pin) el certificado TLS de `apputiles.com` y publicar la huella del
   certificado de firma en el sitio para que el usuario pueda contrastar.

---

## F-01 · Firma no conforme a apksig: el APK no es verificable con herramientas estándar — **ALTO (7.5)**

`AV:N/AC:L/PR:N/UI:R/S:U/C:H/I:H/A:N`

### Descripción
El APK **no contiene ninguna firma verificable según la especificación
oficial** (esquemas v1/v2/v3 de apksig):

- **v1 (JAR)**: ausente. No hay `MANIFEST.MF`, `*.SF` ni `*.RSA` en `META-INF`.
- **v2/v3 (APK Signing Block)**: el bloque existe, pero:
  - el par con ID oficial v2 (`0x7109871a`, 1 543 bytes) **no sigue el
    formato oficial** `[u32 len][datos][u32 ncerts][certs][u32 nsigs][sigs]`:
    contiene en su lugar una estructura propietaria — 5 u32 de longitud, un
    hash SHA-256 de 32 B, el certificado X.509 (897 B) y, al final, una firma
    RSA de 256 B más la clave pública RSA-2048 embebida (294 B). La firma no
    verifica contra el contenido canónico v2 (`[u32 len_bloque][bloque][u32
    len_eocd][EOCD]`) con SHA-256 (probado en el PoC).
  - el bloque además es **malformado según la especificación**: tras el par
    v2, la secuencia de pares siguiente no se alinea/parsea (aparece un par
    `id=0x48` con longitud fuera de límites; el bloque `PKDS` de metadatos de
    dependencias de AGP, `0x504b4453`, rompe la alineación de 4 bytes).
- **v3**: ausente.
- Certificado presente (no validable vía apksig por lo anterior):
  `CN=Luis Esteban, O=CUSOFT, L=La Habana`, RSA-2048, autofirmado,
  2016-04-29 → 2041-04-23, serial `7F87FD49`,
  SHA-256 `187c763aad58634aaf6c65e8043525c159d6afe061c1ec3e51c962b4ca6519b8`.

Conclusión: `apksigner verify` reportaría "sin firma válida". El APK
probablemente fue firmado con una herramienta no estándar (propiedad del
desarrollador o de su pipeline), y ese mismo formato es el motivo por el que
ni el propio canal de auto-actualización (F-08) puede comprobar autenticidad.

### PoC
```console
$ python3 audit/verify_signature.py apk-original/UtilEs.apk
== Verificación de firma: apk-original/UtilEs.apk (22,407,919 bytes) ==
[v1] AUSENTE: no hay MANIFEST.MF/.SF/.RSA en META-INF → sin firma JAR (v1)
[bloque] APK Signing Block presente desde offset 22299268
[bloque]   par id=0x0000060f (desconocido) valor=0 bytes en 22299284
[bloque]   par id=0x7109871a (v2) valor=1543 bytes en 22299292
[bloque] MALFORMADO: par id=0x00000048 con len=1392508928 fuera de límites en 22300836
[v2] ERROR de análisis del valor: valor v2: no quedan bytes para la lista de certificados (formato no estándar)
RESULTADO: ningún esquema de firma estándar (v1/v2/v3) pasa la verificación apksig.
```
(Salida completa en `apk-original/signature/verificacion-firma.txt`;
certificado extraído en `apk-original/signature/signing_cert.der`.)

### Remediación
1. Re-firmar el APK con `apksigner` oficial en esquema **v2+v3** (y v1 solo si
   se soportan API < 24; aquí `minSdk=24`, así que v2+v3 bastan):
   ```console
   apksigner sign --ks release.keystore --v1-signing-enabled false \
       --v2-signing-enabled true --v3-signing-enabled true UtilEs.apk
   apksigner verify --print-certs UtilEs.apk
   ```
2. Publicar en apputiles.com las huellas SHA-256/SHA-1 del certificado para
   que usuarios y scripts puedan contrastar.
3. Mantener el mismo keytool/keystore de forma segura (HSM/KMS) y versionar
   los builds; el pipeline debe ejecutar `apksigner verify` como gate de CI
   (ver `.github/workflows/build.yml`).

---

## F-02 · Tráfico en claro habilitado globalmente — **ALTO (7.5)**

`AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:N/A:N`

### Descripción
- `AndroidManifest.xml` → `<application … android:usesCleartextTraffic="true">`.
- **No existe** `res/xml/network_security_config.xml` (verificado en
  `decompiled/resources/res/xml/`): sin restricción de dominios, sin
  cifrado por defecto, sin certificate pinning.

La app transfiere datos sensibles (saldo, PIN de transferencia, licencias,
correo/contraseña vía Supabase Auth, teléfono) y con este flag **cualquier
conexión HTTP en claro está permitida** (incluida cualquier librería que haga
peticiones `http://`), y el HTTPS no está anclado.

### PoC
```console
# En el dispositivo con la app:
adb shell setprop http.proxy 10.0.2.2:8080   # mitmproxy/caido
$ mitmproxy --mode transparent
# Observar/alterar tráfico; con cleartext permitido, un atacante en la red
# (wifi público, operador) puede inyectar respuestas a cualquier http:// que
# realice la app o sus SDKs, y el HTTPS no tiene pinning que lo impida
# (con CA del atacante instalada).
```

### Remediación (aplicada en `:app`)
1. `android:usesCleartextTraffic="false"`.
2. `res/xml/network_security_config.xml` con `base-config cleartext=false`
   y, solo si un endpoint lo exige temporalmente, una `domain-config`
   específica (ver `app/src/main/res/xml/network_security_config.xml`).
3. Certificate pinning (okhttp `CertificatePinner` o NSC `pin-set`) para
   `jbkhreemmiagdyfssfep.supabase.co` y `apputiles.com`.

---

## F-03 · Permisos excesivos — **MEDIO (5.4)**

`AV:P/AC:L/PR:N/UI:R/S:U/C:H/I:L/A:N`

### Descripción
Permisos peligrosos declarados que exceden la funcionalidad declarada en el
sitio (consulta de saldo/bono, recargas, transferencias, USSD):

| Permiso | Justificado | Valoración |
|---|---|---|
| `READ_SMS` | "lee el contenido de los SMS de confirmación" | Aceptable (documentar) |
| `SEND_SMS` | — | **Excesivo**: la app no envía SMS por cuenta del usuario según lo declarado |
| `READ_CALL_LOG` | "historial de llamadas" (opción de la app) | Revisar; exigir consentimiento explícito |
| `READ_CONTACTS` | bloqueo por "números fuera de contactos" | Revisar; ofrecer modo sin contactos |
| `CALL_PHONE`, `ANSWER_PHONE_CALLS`, `PROCESS_OUTGOING_CALLS` | marcación rápida / bloqueo de llamadas | Aceptable para la feature, pero amplia |
| `ACCESS_FINE_LOCATION` | "puntos de conexión ETECSA (spots)" | Justificable; granularidad gruesa bastaría para spots |
| `SYSTEM_ALERT_WINDOW` | tarjetas flotantes (Nauta/velocidad) | Restringido desde Android 13; ofrecer alternativa por notificación |
| `RECEIVE_BOOT_COMPLETED` | refresco de saldo al arranque | Ver F-11 |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | servicios en segundo plano | Pedir solo si el usuario activa la feature |
| `com.google.android.gms.permission.AD_ID` + `ACCESS_ADSERVICES_*` | identificación publicitaria | **Privacidad**: revela el Advertising ID; ver F-09 |
| `CAMERA` | escáner QR (recarga) | Aceptable (feature opcional) |

### PoC / evidencia
```console
$ aapt dump badging apk-original/UtilEs.apk | grep uses-permission
# 31 permisos peligrosos/normal listados; ver decompiled/resources/AndroidManifest.xml
```

### Remediación (aplicada en `:app`)
Manifiesto recortado a lo estrictamente necesario; los permisos no
verificadamente usados por el flujo mínimo (saldo/USSD/VPN) se eliminan o se
declaran como `tools:node="remove"` con placeholders para reactivar features
opcionales (`manifestPlaceholders`) en builds que las incluyan.

---

## F-06 · Almacenamiento local sin cifrar — **MEDIO (5.5)**

`AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N`

### Descripción
- Preferencias en **DataStore** (`libdatastore_shared_counter.so`,
  `com.russhwolf.settings` + `androidx.datastore`): sin cifrar; guardan
  configuración de usuario, perfil, tema y (según el modelo
  `UserDataPreferences`) datos de sesión/licencia.
- Base de datos **Room** (`JetpackDatabase`) en `databases/`: sin cifrar
  (no se detectó SQLCipher ni `androidx.security` en el DEX).
- No se detecta `EncryptedSharedPreferences`/Tink KeysetManager en uso
  (el `PublicSuffixDatabase.list` de Tink proviene de otra librería, no se
  usa para prefs).
- Un dispositivo root/forense (o malware con `READ_EXTERNAL`+exploit) puede
  leer: **número de teléfono, PIN de transferencia, token de sesión Supabase,
  licencia, historial de saldos y foros**.

### PoC
```console
$ adb shell run-as cu.lestebang.utiletecsa ls files/        # sin root, en debug
# o con root:
$ cat /data/data/cu.lestebang.utiletecsa/files/datastore/*.preferences
$ sqlite3 /data/data/cu.lestebang.utiletecsa/databases/*.db '.tables'
# TODO en claro (texto/protobuf legible)
```

### Remediación
1. `:security` incluye `SecureStorage.kt` (Android Keystore + Tink
   `EncryptedSharedPreferences` / `EncryptedFile`) para PIN, tokens y
   licencia; migrar las keys sensibles desde DataStore a `SecureStorage`.
2. Room: cifrar con SQLCipher (o, como mínimo, no almacenar secretos en tablas;
   tokens en `SecureStorage`).
3. `FLAG_SECURE` en pantallas con saldo/PIN.

---

## F-07 · Clave Supabase y project ref embebidos; dependencia de RLS — **MEDIO (6.5)***

`AV:N/AC:H/PR:N/UI:N/S:C/C:H/I:N/A:N` *(hipótesis: RLS mal configurado)*

### Descripción
- URL del backend: `https://jbkhreemmiagdyfssfep.supabase.co` (hardcodeada,
  p. ej. `defpackage/cy6.java`, `defpackage/ud1.java`).
- Clave publicable embebida (encontrada en `defpackage/l77.java`, clase
  `SupabaseClientConfig`):
  ```
  sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9
  ```
- La clave `sb_publishable_*` está **diseñada para ser pública** (la seguridad
  real reside en las políticas de Row Level Security de Supabase). El riesgo
  real es doble:
  1. La **project ref** (`jbkhreemmiagdyfssfep`) queda pública: el atacante
     conoce el endpoint exacto de REST/Realtime/Auth/Storage del proyecto.
  2. Si **RLS está mal configurado** en alguna tabla (usuarios, licencias,
     saldo, foros, spots) → acceso no autorizado a datos de todos los
     usuarios. El sitio afirma "reglas de seguridad a nivel de fila"; no está
     verificado.

### PoC (a ejecutar desde red propia, solo lectura)
```console
# Listar tablas expuestas por PostgREST con la clave publicable:
curl -s "https://jbkhreemmiagdyfssfep.supabase.co/rest/v1/" \
  -H "apikey: sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9"
# Intentar lectura sin autenticación (debe dar 401/403 si RLS está bien):
curl -s "https://jbkhreemmiagdyfssfep.supabase.co/rest/v1/profile?select=*&limit=1" \
  -H "apikey: sb_publishable_oATzKs8xbTBq2ESlgAQr0g_rl5XnZF9"
```
> ⚠️ El entorno de auditoría no podía alcanzar `supabase.co`; ejecutar
> exclusivamente el propietario, de forma no destructiva.

### Remediación
1. Auditoría RLS completa (SELECT/INSERT/UPDATE/DELETE por tabla, con
   `auth.uid()` en cada policy) + prueba automatizada en CI del backend.
2. No exponer datos de terceros (teléfonos de otros usuarios) a la tabla de
   foros/spots sin `USING` estricto.
3. Rotar la clave publicable al confirmar el alcance; auditar el Storage
   (buckets públicos/privados) y la Realtime (privileges).

---

## F-04 · `allowBackup=true` sin reglas de backup — **MEDIO (5.5)**

`AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N`

### Descripción
`<application android:allowBackup="true" …>` **sin** `fullBackupContent` ni
`dataExtractionRules`. Todo el estado de la app (DataStore, Room, caché FCM)
es elegible para backup de cuenta: cualquier actor con acceso a la cuenta
Google del usuario (o a un `adb backup` en dispositivos antiguos) obtiene los
mismos secretos que en F-06.

### PoC
```console
$ adb backup -f utilEs.ab -noapk cu.lestebang.utiletecsa   # API < 31
# y restaurar en otro dispositivo / extraer con `adb backup` + `abe`
```

### Remediación (aplicada en `:app`)
`android:allowBackup="false"` (o backup con `dataExtractionRules` que excluya
`files/datastore/**`, `databases/**` y `shared_prefs/**` sensibles).

---

## F-05 · Actividad exportada con acción implícita — **MEDIO (4.3)**

`AV:L/AC:L/PR:N/UI:R/S:U/C:L/I:L/A:N`

### Descripción
`UssdShortcutActivity` está **exportada** con un intent-filter de acción
personalizada y sin permiso:

```xml
<activity android:exported="true" android:name="…shortcuts.UssdShortcutActivity" …>
  <intent-filter>
    <action android:name="cu.lestebang.utiletecsa.action.USSD_SHORTCUT"/>
    <category android:name="android.intent.category.DEFAULT"/>
  </intent-filter>
</activity>
```
`onCreate` lee el extra `ussd_action` (`saldo|datos|voz|sms`) y dispara la
consulta USSD correspondiente. Cualquier app del dispositivo puede
dispararla: consultas no deseadas (coste de sesión USSD, ruido, revelación de
uso de la app) y posible interacción con otras features (dialer).

### PoC
```console
adb shell am start -a cu.lestebang.utiletecsa.action.USSD_SHORTCUT \
  --es ussd_action saldo
# (o desde cualquier app: Intent("cu.lestebang.utiletecsa.action.USSD_SHORTCUT")
#  .putExtra("ussd_action","datos"))
```

### Remediación (aplicada en `:app`)
`android:exported="false"`: los atajos dinámicos de Android usan **intents
explícitos** hacia la app, no requieren exportación (ver `res/xml/shortcuts.xml`).

---

## F-09 · Telemetría amplia con identificador publicitario — **BAJO (4.3)**

`AV:N/AC:L/PR:N/UI:N/S:U/C:L/I:N/A:N`

### Descripción
Registradores activos (manifest, `FirebaseComponentDiscoveryService`):
**Crashlytics, Firebase Analytics, Firebase Performance, Sessions, Remote
Config, Installations** + permisos `AD_ID`, `ACCESS_ADSERVICES_ATTRIBUTION`,
`ACCESS_ADSERVICES_AD_ID` y `androidx.privacysandbox.ads`. Para una app que
maneja saldo telefónico, el perfil de comportamiento (USSD consultados,
velocidad de descarga, ubicación de spots) enviado a Google + el Advertising ID
constituyen un riesgo de privacidad (datos que salen del país sin DPA
evidente).

### Remediación
Consentimiento explícito antes de inicializar analytics; minimizar eventos;
documentar privacidad (privacypolicy en la web); evaluar analítica
auto-hosteada; si la monetización publicitaria no es el modelo principal,
eliminar `AD_ID`.

---

## F-10 · Receivers exportados para `PHONE_STATE` — **BAJO (3.7)**

`AV:L/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:N`

### Descripción
`CallAlertReceiver` y `CallBlockReceiver` están `exported="true"` con filtro
`android.intent.action.PHONE_STATE`. `PHONE_STATE` es broadcast **protegido**
(no falsificable por apps normales), por lo que el impacto es limitado, pero
la exportación es innecesaria y ensancha la superficie.

### Remediación (aplicada en `:app`)
`exported="false"` (las apps pueden recibir broadcasts del sistema sin
exportarse).

---

## F-11 · Arranque automático y exención de batería — **BAJO (3.3)**

`AV:L/AC:L/PR:N/UI:N/S:U/C:N/I:N/A:L`

### Descripción
`UssdAutoBootReceiver` (`BOOT_COMPLETED`/`MY_PACKAGE_REPLACED`) + permisos
`RECEIVE_BOOT_COMPLETED` y `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS`: la app
revive tras el arranque y consulta USSD en segundo plano (impacto en batería
y privacidad; el usuario no siempre elige activarlo).

### Remediación
Convertir en **opt-in** desde Ajustes (por defecto off); documentar el
comportamiento; evitar `RECEIVE_BOOT_COMPLETED` mientras la feature esté
desactivada.

---

## Observaciones informativas (sin CVSS)

- **I-01 · Minificación R8 full**: 9 748 clases renombradas; sin mapping
  publicado, la respuesta a incidentes (trazado de un bug o backdoor en
  producción) es muy difícil para el propio propietario. Conservar el mapping
  fuera del APK, por versión.
- **I-02 · Doble activity de licencias OSS** (`OssLicensesMenuActivity` v1 y
  v2) — código duplicado legado; eliminar una en el próximo build.
- **I-03 · `targetSdk 36` con `compileSdk 37`**: el target debería ir a la
  última API soportada para cumplir requisitos de Play (aplicado a 37 en `:app`).
- **I-04 · `DebugProbesKt.bin`** en el APK: binario de profiling de Kotlin
  (normal en builds, comprobar que no se incluyan builds debug en producción).
- **I-05 · WireGuard embebido** (4 ABIs, ~3 MB/ABI): feature VPN/Nauta;
  comprobar que la configuración del tunnel no exponga claves en claro y que
  el `GoBackend$VpnService` no sea alcanzable fuera de la app (hoy: OK,
  protegido con `BIND_VPN_SERVICE`).

## Checklist de remediación en este repositorio

| Cambio | Dónde |
|---|---|
| `usesCleartextTraffic=false` + `network_security_config.xml` | `:app` (F-02) |
| `allowBackup=false` | `:app` (F-04) |
| `UssdShortcutActivity` no exportada | `:app` (F-05) |
| Receivers `PHONE_STATE` no exportados | `:app` (F-10) |
| Permisos recortados (sin SEND_SMS/READ_CALL_LOG/READ_CONTACTS/AD_ID) | `:app` (F-03) |
| `UpdatePolicy` + `SignatureVerifier` (verificación de la auto-actualización) | `:security` (F-08) |
| `SecureStorage` (Keystore + Tink) para secretos | `:security` (F-06) |
| `apksigner verify` como gate de CI | `.github/workflows/build.yml` (F-01) |
