# SECURITY.md — Auditoría de seguridad de UtilEs (`cu.lestebang.utiletecsa`)

> **Alcance:** análisis estático del APK original (`apk-original/UtilEs.apk`,
> SHA-256 `e2631f1f…ad2f2e9f`, ver `apk-original/METADATA.md`) mediante
> descompilación (jadx 1.4.7 / apktool 2.4.1 / baksmali) y revisión manual del
> código first-party y de los manifest/recursos.
>
> **Marco legal:** análisis de una copia obtenida legítimamente con fines de
> auditoría de seguridad e investigación personal. No se eluden licencias, DRM
> ni funciones de pago.
>
> **Metodología:** revisión guiada por OWASP MASVS v2 (almacenamiento, red,
> plataforma, criptografía) con puntuación CVSS v3.1 propia por hallazgo.

---

## Resumen ejecutivo

| ID | Severidad | CVSS v3.1 | Hallazgo | Estado en este repo |
|----|-----------|-----------|----------|---------------------|
| A-1 | 🔴 ALTO | **7.4** | Tráfico en claro permitido globalmente (`usesCleartextTraffic="true"`) sin Network Security Config | ✅ Mitigado |
| A-2 | 🟠 MEDIO | **6.5** | `allowBackup="true"` sin reglas de backup/extracción → exfiltración de datos vía backup | ✅ Mitigado |
| A-3 | 🟠 MEDIO | **6.1** | Canal de auto-actualización sin verificación de integridad in-app del APK descargado | ✅ Mitigado (diseño) |
| M-1 | 🟠 MEDIO | **5.4** | Componentes exportados sin permiso: USSD sin interacción y spoofing de `PHONE_STATE` → phishing | ✅ Mitigado |
| M-2 | 🟠 MEDIO | **5.0** | Permisos excesivos, deprecados y muertos (31 declarados) | ✅ Mitigado (3) |
| M-3 | 🟠 MEDIO | **4.6** | Historial USSD/cuentas en SQLite sin cifrado a nivel de fichero; preferencias sin cifrar | ✅ Mitigado (parcial) |
| B-1 | 🟡 BAJO | **3.7** | Certificado autofirmado desde 2016, campo `C` inválido, sin rotación de claves (v3 ausente) | ⚠️ Documentado |
| B-2 | 🟡 BAJO | **3.3** | Token FCM concatenado en llamada a log (inerte en release, filtraría en debug) | ✅ Mitigado |
| B-3 | 🟡 BAJO | **3.1** | API key de Firebase embebida en recursos (riesgo si el backend no restringe) | ⚠️ Documentado |
| B-4 | 🟡 BAJO | **2.4** | Metadatos de build embebidos (`profileable`, `version-control-info.textproto`) | ✅ Mitigado |
| I-1 | ⚪ INFO | — | Ofuscación R8 parcial (nombres first-party preservados) | ⚠️ Documentado |

**Puntos FUERTES verificados** (importantes para un informe honesto):

- ✅ Sin secretos criptográficos hardcodeados: no se encontró ninguna clave,
  contraseña o secreto embebido en el código first-party.
- ✅ Las contraseñas de cuentas Nauta se almacenan cifradas con **AES/GCM y
  AndroidKeyStore** (clave `nauta_account_key`, IV aleatorio, tag 128 bits) —
  implementación correcta (clase `su0` del paquete R8, tabla `nauta_accounts`).
- ✅ Sin `WebView` en la app (no aplica el patrón `setJavaScriptEnabled` +
  `setAllowFileAccess`): verificado a nivel de todo el dex.
- ✅ Sin `TrustManager` promiscuos ni `HostnameVerifier` permisivos; sin
  `MODE_WORLD_READABLE/WRITABLE`.
- ✅ Firma v2 (sin v1) es correcta para minSdk 24; `PendingIntent`s con
  `FLAG_IMMUTABLE`.
- ✅ El logging en release es inerte (fachada tipo Timber sin `plant()`).
- ✅ Librerías de red muy recientes (OkHttp/Retrofit/Room/WorkManager 2024–2025)
  sin CVEs conocidos aplicables.

---

## Hallazgos en detalle

### 🔴 A-1 — Tráfico en claro permitido globalmente (CVSS 7.4)

**Vector:** `CVSS:3.1/AV:N/AC:H/PR:N/UI:N/S:U/C:H/I:H/A:N`

**Evidencia** (`decompiled/resources/AndroidManifest.xml`):

```xml
<application
    android:usesCleartextTraffic="true"
    ...>
```

No existe `android:networkSecurityConfig` ni `res/xml/network_security_config`.
Esto permite a **cualquier** componente (incluidos SDKs third-party: Firebase,
analytics, ADS-AdServices, Coil) realizar peticiones HTTP sin cifrar. En una red
hostil (Wi-Fi público, ARP spoofing, DNS controlado) un atacante MITM puede
observar o manipular ese tráfico.

La app accede a datos personales reales: consultas USSD de saldo, cuentas de
correo Nauta, historial de llamadas/SMS → la exposición es de confidencialidad
e integridad altas.

**PoC:**

```bash
# En la red del atacante, forzar respuestas DNS + proxy transparente HTTP:
sudo responder -I eth0            # o mitmproxy --mode transparent
# Cualquier SDK que haga una petición http:// queda expuesta/alterable;
# se verifica que la política global lo permite:
adb shell dumpsys package cu.lestebang.utiletecsa | grep -i cleartext
```

**Remediación aplicada en este repo:**

- `android:usesCleartextTraffic="false"` + `network_security_config.xml`
  (`cleartextTrafficPermitted="false"`, trust anchors solo de sistema) en
  `app/src/main/res/xml/`.
- `:core:network` fuerza `ConnectionSpec.RESTRICTED_TLS` (TLS 1.2/1.3) y
  allowlist de hosts para el canal de actualizaciones
  (`cu.utiletecsa.core.network.TlsPolicy`).

---

### 🟠 A-2 — Backup y transferencia de datos sin restricciones (CVSS 6.5)

**Vector:** `CVSS:3.1/AV:L/AC:H/PR:H/UI:N/S:C/C:H/I:H/A:L`

**Evidencia:** `android:allowBackup="true"` y **ningún** `backup_rules.xml` ni
`data_extraction_rules.xml`. En Android ≤ 11, `adb backup` (con interacción del
usuario) extraía DataStore (perfil de usuario serializado) y Room (`nauta_accounts`
con correos, `ussd_responses` con historial de saldo, `transfer_recipients` con
números de teléfono). En Android 12+ la transferencia D2D y el backup en nube
incluirían esos ficheros por defecto.

Nota positiva: la **contraseña** Nauta está cifrada con AndroidKeyStore, y las
claves del keystore no salen del dispositivo → el backup no la expone en claro.
El resto de datos sí viajan.

**PoC:**

```bash
adb backup -f utiles.ab -noapk cu.lestebang.utiletecsa   # Android ≤ 11
dd if=utiles.ab bs=24 skip=1 | zlib-flate -uncompress | tar tf - | head
# → apps/cu.lestebang.utiletecsa/db/utiletecsa.db (historial USSD en claro)
```

**Remediación aplicada:** `allowBackup="false"`, `backup_rules.xml` y
`data_extraction_rules.xml` excluyendo todo (`app/src/main/res/xml/`).

---

### 🟠 A-3 — Auto-actualización sin verificación de integridad in-app (CVSS 6.1)

**Vector:** `CVSS:3.1/AV:N/AC:H/PR:N/UI:R/S:U/C:H/I:H/A:L`

**Evidencia** (`decompiled/sources/cu/lestebang/utiletecsa/sync/`):

- `AppUpdateWorker` consulta cada 24 h `https://apputiles.com/version.json` con
  `HttpURLConnection` **sin endurecer** (sin pinning, sin validación de URL,
  sigue redirecciones por defecto).
- Si hay versión nueva, `DownloadApkReceiver` (acción custom
  `...sync.action.DOWNLOAD_APK`) encola en `DownloadManager` el APK de
  `https://apputiles.com/assets/UtilEs.apk` **sin comprobar su hash ni firma**
  in-app; la instalación queda a cargo del instalador del sistema (que solo
  garantiza continuidad de firma respecto a la app ya instalada).

Riesgo: compromiso del CDN/DNS + ingeniería del usuario → instalación de un
APK "actualizado" manipulado si el atacante controla el canal (p. ej. proxy con
certificado raíz instalado en el dispositivo de la víctima, posible por A-1 en
el caso de tráfico auxiliar HTTP). El campo `size` de version.json no se usa
para verificar nada.

**Remediación aplicada (rediseño, `:core:network` + `app/UpdateManager`):**

1. Cliente OkHttp con `RESTRICTED_TLS` y **allowlist de hosts HTTPS**
   (`TlsPolicy.isAllowedUpdateUrl`).
2. `version.json` parseado con esquema tipado; se **rechaza** el manifiesto si
   no publica SHA-256 o si la URL del binario no es HTTPS.
3. `ApkIntegrityVerifier` compara el SHA-256 del binario descargado con el
   publicado **antes** de proponer instalación; no hay descarga automática ni
   receivers exportados.

---

### 🟠 M-1 — Componentes exportados sin protección (CVSS 5.4)

**Vector:** `CVSS:3.1/AV:L/AC:L/PR:L/UI:R/S:U/C:L/I:L/A:L`

**Evidencia** (`decompiled/resources/AndroidManifest.xml`):

```xml
<activity android:exported="true" android:name="...shortcuts.UssdShortcutActivity"
          android:theme="@style/Theme.Jetpack.Transparent">
    <intent-filter>
        <action android:name="cu.lestebang.utiletecsa.action.USSD_SHORTCUT"/>
        <category android:name="android.intent.category.DEFAULT"/>
    </intent-filter>
</activity>

<receiver android:exported="true" android:name="...service.CallAlertReceiver">
    <intent-filter><action android:name="android.intent.action.PHONE_STATE"/></intent-filter>
</receiver>
<receiver android:exported="true" android:name="...service.CallBlockReceiver">
    <intent-filter><action android:name="android.intent.action.PHONE_STATE"/></intent-filter>
</receiver>
```

- **`UssdShortcutActivity`**: cualquier app puede lanzarla con
  `--es ussd_action saldo|datos|voz|sms` y provoca el **marcado de códigos USSD
  sin interacción del usuario** (la actividad es transparente). Un malware puede
  generar sesiones USSD repetidas (consumo/abuso) o enmascarar phishing.
- **`CallAlertReceiver`/`CallBlockReceiver`** (exported, sin permiso, filtro
  `PHONE_STATE`): cualquier app puede emitir un `PHONE_STATE` falsificado con
  `EXTRA_STATE_RINGING` + número arbitrario; `CallAlertReceiver` consulta
  contactos y publica una **notificación de pantalla completa
  (`USE_FULL_SCREEN_INTENT`) con número y nombre falsos** → phishing visual
  ("tu banco llama…").

**PoC:**

```bash
# USSD sin interacción:
adb shell am start -n cu.lestebang.utiletecsa/.shortcuts.UssdShortcutActivity \
  -a cu.lestebang.utiletecsa.action.USSD_SHORTCUT --es ussd_action saldo

# Alerta de llamada falsificada (desde otra app instalada):
adb shell am broadcast -a android.intent.action.PHONE_STATE \
  --es state RINGING --es incoming_number "+5355555555"
```

**Remediación aplicada:** en la re-implementación no existe ningún componente
exportado aparte del launcher; las consultas USSD requieren diálogo de
confirmación explícito (`feature/saldo`) y el catálogo de códigos es cerrado
(`core/ussd/UssdCatalog` + `UssdCodeValidator`).

---

### 🟠 M-2 — Permisos excesivos, deprecados y muertos (CVSS 5.0)

**Vector:** `CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:L/I:L/A:N`

**Evidencia:** 31 permisos declarados, entre ellos:

| Permiso | Problema |
|---|---|
| `PROCESS_OUTGOING_CALLS` | **Muerto**: removido en API 29 (targetSdk 36). Solo expande superficie de auditoría |
| `USE_FINGERPRINT` | Deprecado (API 28) junto a `USE_BIOMETRIC` — redundante |
| `READ_CALL_LOG` + `READ_SMS` + `SEND_SMS` + `READ_CONTACTS` | Alcance máximo (runtime) donde quizá bastaría `READ_PHONE_NUMBERS`/`sms-reading selectivo`; gran potencial de PII |
| `ACCESS_FINE_LOCATION` | Solo se usa `ACCESS_WIFI_STATE`/red; ubicación fina no aparente en el flujo principal |
| `SYSTEM_ALERT_WINDOW` | Overlays (speed test, alertas) — riesgo de tapjacking si se abusa |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | Innecesario con WorkManager; Google lo prohíbe salvo casos justificados |
| `AD_ID` + `ACCESS_ADSERVICES_*` | Publicidad/atribución (Firebase Analytics) sin necesidad funcional aparente |

**Remediación aplicada:** el manifest endurecido declara **3** permisos
(`INTERNET`, `ACCESS_NETWORK_STATE`, `CALL_PHONE` documentado como reserva de
compatibilidad USSD). Para el proyecto original se recomienda: eliminar los
muertos, acotar con `android:maxSdkVersion` los redundantes y justificar el
resto en la revisión de Play Store (Data Safety).

---

### 🟠 M-3 — Almacenamiento local sin cifrado de ficheros (CVSS 4.6)

**Vector:** `CVSS:3.1/AV:L/AC:H/PR:H/UI:N/S:U/C:H/I:N/A:N`

**Evidencia:**

- Room `JetpackDatabase` (`zk3.java` decompilado):
  ```sql
  CREATE TABLE nauta_accounts (email TEXT, encryptedPassword TEXT, lastUsed INTEGER);
  CREATE TABLE ussd_responses (ussd_code, field_name, value, raw_response, timestamp);
  CREATE TABLE transfer_recipients (number TEXT, lastUsed INTEGER);
  ```
  La **contraseña** está cifrada correctamente (AndroidKeyStore AES-GCM, ✅), pero
  correos, historial de respuestas USSD y destinatarios de transferencias están
  **en claro** en el fichero `db`.
- `UserDataPreferences`/`PreferencesUserProfile` (DataStore, kotlinx-serialization)
  se persisten **sin cifrar** (nombre de usuario, ajustes, token FCM).

Un atacante con acceso físico/root (o vía A-2) lee todo lo anterior.

**Remediación aplicada:** `core/preferences` cifra los valores sensibles campo a
campo (`CryptoEngine`); `core/database` replica el esquema con la contraseña
cifrada y documenta el riesgo residual; combinado con A-2 (sin backups) el
exposición residual queda limitada a dispositivos comprometidos (root), fuera de
alcance de una app sin protección de integridad del sistema operativo. Para el
proyecto original: valorar `androidx.security:security-crypto` (EncryptedFile /
EncryptedSharedPreferences) o SQLCipher si el historial es sensible.

---

### 🟡 B-1 — Gestión de la clave de firma (CVSS 3.7)

**Evidencia** (bloque v2, `apk-original/METADATA.md`):

- Certificado **autofirmado** RSA-2048 `sha256WithRSAEncryption`, CN `Luis
  Esteban`, O `CUSOFT`, **`C=10400` (campo inválido: 10400 no es un código
  ISO 3166)** — indicador de keystore generado a mano en 2016.
- Validez 25 años (2016→2041), **sin esquema v3** → no hay rotación de claves
  configurada. La pérdida/compromiso del keystore dejaría de poder actualizarse
  la app (o obligaría a confiar en claves heredadas sin control).

**Remediación recomendada:** migrar a **Play App Signing** (o rotación v3 con
`apksigner sign --rotation-min-sdk-version 28`), regenerar keystore con
`CN`/`O`/`C` correctos y custodiarlo en un gestor de secretos. Documentado; no
aplicable desde este repo (requiere la clave del editor).

---

### 🟡 B-2 — Token FCM en camino de log (CVSS 3.3)

**Evidencia** (`messaging/UtilEsMessagingService.java:76`):

```java
"New FCM token: ".concat(str);   // pasa a la fachada de logging (hr2/yh7)
```

En release la fachada no tiene árbol plantado → no imprime (inerte). Pero en
cualquier build de debug o si alguien planta un árbol, el **token FCM del
dispositivo** (identificador de notificaciones) sale por logcat, accesible a
otras apps con permiso de logs o vía `adb logcat`.

**Remediación aplicada:** `security/SafeLogger` — logging desactivado por
defecto en release y **redacción de PII/tokens** en debug; el token FCM se
persiste cifrado y jamás se loguea (`core/preferences`).

---

### 🟡 B-3 — API key de Firebase embebida (CVSS 3.1)

**Evidencia** (`res/values/strings.xml`): `google_api_key = AIzaSyB5awUchZ7xJ5Mzws1kk1ZoHYZIkjTb4ZU`
(duplicada en `google_crash_reporting_api_key`).

Es el patrón estándar de las apps Firebase (la clave identifica el proyecto, no
es un secreto en sí), pero si el backend no restringe (reglas Firestore/RTDB
abiertas, API key sin restricciones de aplicación/paquete), permite abuso de
cuota o acceso no autorizado a datos del proyecto.

**Remediación recomendada (proyecto original):** restricciones de app
(`cu.lestebang.utiletecsa`) + huella SHA-1/SHA-256 de firma en Google Cloud
Console, App Check (Play Integrity), reglas Firestore con autenticación
obligatoria. En este repo no existe dependencia de Firebase.

---

### 🟡 B-4 — Metadatos de build embebidos (CVSS 2.4)

**Evidencia:** `<profileable android:shell="true"/>` (permite profiling desde
adb shell a un atacante local) y `META-INF/version-control-info.textproto`
(AGP embedía el origen del repo — rastrea commit/ramificación del build).

**Remediación aplicada:** el manifest endurecido no declara `profileable`;
`vcsInfo.include=false` recomendado en builds públicos (AGP: `buildFeatures`).
Informativo.

---

### ⚪ I-1 — Ofuscación R8 parcial

Los nombres de paquetes/clases first-party están preservados (`App`,
`MainActivity`, `feature.*.navigation.*`, `sync.worker.*`…), mientras que buena
parte de la lógica (repositorios, DAOs generados, casos de uso) quedó renombrada
a `defpackage` (`su0`, `dv7`, `zk3`…). La mezcla facilita la ingeniería inversa
de los flujos principales. **Recomendación:** R8 full-mode con reglas de keep
mínimas (lo que ya hace el build de este repo con `proguard-rules.pro`).

---

## Verificaciones sin hallazgo (cobertura del informe)

| Área (pedida) | Resultado |
|---|---|
| Secretos/keys hardcodeadas | **No encontrados** en first-party ni en recursos (salvo API key Firebase, B-3) |
| WebView con JS + file access | **No aplica**: no hay WebView en el APK |
| TLS mal configurado | Sin TrustManager promiscuos; confianza en CAs de sistema correcta; el gap real era A-1 |
| Componentes exportados | Solo los 3 de M-1 (+ estándares AndroidX/WorkManager/Firebase correctamente protegidos con permisos del sistema: `BIND_VPN_SERVICE`, `BIND_QUICK_SETTINGS_TILE`, `BIND_SCREENING_SERVICE`, `c2dm.permission.SEND`, `DUMP`) |
| Intents implícitos | Sin `sendBroadcast` con acciones custom exportables ni `startActivity` implícitos sensibles; `PendingIntent` siempre `FLAG_IMMUTABLE`; fallback USSD por `ACTION_CALL` requiere permiso y validación |
| Firmas débiles | RSA-2048/SHA-256 correcto; observación de gestión en B-1 |
| Fugas en logs/Analytics | Fachada de logging inerte en release (B-2); Firebase Analytics/Measurement presente (ADS-AdServices) → revisar Data Safety |
| Almacenamiento inseguro | Contraseñas Nauta bien cifradas (Keystore); resto documentado en M-3/A-2 |

## Cómo reproducir la auditoría

```bash
./tools/decompile.sh          # regenera jadx + apktool completos en /tmp
# Responder a estas preguntas con el árbol decompilado:
grep -rn "usesCleartextTraffic\|allowBackup" decompiled/resources/AndroidManifest.xml
grep -rn "Cipher.getInstance\|SecretKeySpec" decompiled/sources/
grep -rln "setJavaScriptEnabled" decompiled/sources/ || echo "sin WebView"
python3 - <<'EOF'   # certificado v2
# (ver apk-original/METADATA.md para el resultado ya calculado)
EOF
```

## Divulgación responsable

Este informe se publica como auditoría propia del binario distribuido
públicamente. Si eres el editor y crees que algo es incorrecto o ya está
mitigado en versiones nuevas, abre un issue en este repositorio.
