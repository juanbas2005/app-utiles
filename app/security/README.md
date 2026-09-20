# Módulo `:security` — mitigaciones de seguridad

## Responsabilidad
Código que implementa las mitigaciones del SECURITY.md en la reconstrucción:

| Clase | Mitiga |
|---|---|
| `UpdatePolicy` | §F-08 — política pura de auto-actualización (versionCode + SHA-256 + certificado) |
| `SignatureVerifier` | §F-08 — hash del APK descargado, certificado instalado y orquestación de la verificación |
| `SecureStorage` | §F-06 — secretos (PIN, cookies Nauta, transferId) cifrados con AES-256-GCM + Android KeyStore |

Además, el manifiesto de `:app` aplica las mitigaciones de manifiesto
(F-02, F-03, F-04, F-05, F-10) y `.github/workflows/build.yml` ejecuta la
verificación de firma del APK original (F-01) en cada build.

## Grafo de dependencias
```
:app ─▶ :security   (no depende de nada del proyecto)
```

## `src/reference/java/…`
Código decompilado original de la superficie de seguridad:
- `messaging/UtilEsMessagingService.java` — servicio FCM
- `sync/DownloadApkReceiver.java` — **el receptor que descarga el APK sin
  verificación** (evidencia §F-08)
- `sync/worker/*.java` — workers de actualización y sincronización
- `shortcuts/UssdShortcutActivity.java` — actividad exportada (evidencia §F-05)

NO participa en la compilación (referencia clases minificadas por R8).

## Tests
`src/test/java/…/UpdatePolicyTest.kt` — 8 tests de la política de
actualización (puros JVM). `SecureStorage` y `SignatureVerifier` requieren
Android (robolectric/instrumentación) — pendiente de añadir cuando el entorno
de CI lo incluya.
