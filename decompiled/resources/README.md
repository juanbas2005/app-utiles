# decompiled/resources — recursos y Manifest (apktool 2.4.1)

Salida de `apktool d` sobre `apk-original/UtilEs.apk` (recursos decodificados).

## Contenido

| Ruta | Descripción |
|---|---|
| `AndroidManifest.xml` | Manifest decodificado — objetivo principal de la auditoría (permisos, componentes exportados, `usesCleartextTraffic`, `allowBackup`) |
| `res/` | recursos (1 198 archivos): layouts, drawables, `values/strings.xml` (incluye la API key pública de Firebase — ver `SECURITY.md`), `xml/` (shortcuts, definiciones de widgets, locale config) |
| `assets/` | assets (`dexopt/baseline.prof`…) |
| `original/` | manifest binario original + `META-INF/` del APK (metadatos de build) |
| `apktool.yml` | metadatos del proyecto apktool (sdkInfo: minSdk 24, targetSdk 36) |

## Hallazgos rápidos (detalle en `SECURITY.md`)

- `usesCleartextTraffic="true"` en `<application>` — tráfico en claro permitido globalmente.
- `allowBackup="true"` sin `backup_rules.xml` ni `data_extraction_rules.xml`.
- 31 permisos declarados, varios peligrosos y uno muerto (`PROCESS_OUTGOING_CALLS`, removido en API 29).
- Componentes first-party exportados sin permiso: `UssdShortcutActivity`,
  `CallAlertReceiver`, `CallBlockReceiver`.
- API key de Firebase (`AIza…`) en `res/values/strings.xml` (normal en apps Firebase;
  se mitiga con App Check / reglas de backend, no ocultándola).

El smali completo (10 507 clases) no se versiona por volumen; la parte first-party
está en `/smali` y todo el árbol se regenera con `tools/decompile.sh`.
