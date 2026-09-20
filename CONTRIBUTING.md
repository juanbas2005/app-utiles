# CONTRIBUTING.md

¡Gracias por aportar! Este repositorio tiene una naturaleza especial: es a la
vez **auditoría de seguridad** y **base de re-implementación**, así que las
reglas buscan mantener trazabilidad y reproducibilidad.

## Cómo colaborar

1. Haz fork y crea una rama descriptiva:
   `git checkout -b feature/mi-aporte`
2. Commits **atómicos** con mensajes en **español** y formato convencional:
   - `auditoría: …` — cambios sobre el análisis (SECURITY.md, decompilación)
   - `módulos: …` — estructura Gradle / nuevos módulos
   - `fix(security): …` — mitigaciones
   - `ci: …`, `docs: …`, `test: …`
3. Antes de abrir el PR:
   ```bash
   ./gradlew testDebugUnitTest lint
   ```
4. Describe el porqué del cambio, y si toca seguridad, cita el hallazgo
   (ID `A-*`, `M-*`, `B-*` de [SECURITY.md](SECURITY.md)).

## Reglas del proyecto

- **Todo en español** (código, comentarios, docs), coherente con el resto.
- **No versiones binarios nuevos** del APK original ni keystores: el binario de
  referencia es solo `apk-original/UtilEs.apk` y el CI lo verifica.
- **No secretos**: ninguna clave, token ni credencial en el código. La firma de
  release llega por secrets de CI (`CI_KEYSTORE_*`).
- **Seguridad primero**: cualquier nueva superficie de red debe usar
  `:core:network` (TLS restringido + allowlist); cualquier dato sensible debe
  pasar por `:security` (`CryptoEngine`); cualquier componente nuevo en el
  manifest debe quedar `exported=false` salvo justificación documentada.
- **Tests mínimos obligatorios**: la lógica nueva en `core/*` lleva su test
  unitario en el mismo commit.
- Los hallazgos del informe no se "suavizan": si una mitigación se revierte, el
  hallazgo vuelve a estar vigente y debe documentarse.

## Estilo de código

- Kotlin idiomático, Kotlin 2.2, Compose con Material 3.
- Comentarios Javadoc/KDoc en interfaces públicas de `core/*` y `security`.
- Nada de logs con PII: usa `cu.utiletecsa.security.SafeLogger`.

## Reportar problemas de seguridad

Por favor **no** abras issues públicos con detalles explotables nuevos. Usa el
proceso descrito en [SECURITY.md](SECURITY.md) (divulgación responsable) o
contacta al mantenedor del repo.
