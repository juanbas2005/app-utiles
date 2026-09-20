# Módulo `:data` — contratos de repositorio y DTOs de API

## Responsabilidad
Contratos (interfaces) y DTOs de las capas de acceso a datos de UtilEs:
cuenta/licencias, perfil, foros, spots de conexión y feedback. Los DTOs son
reconstrucciones fieles de `decompiled/sources/cu/lestebang/utiletecsa/data/
repository/**` (que solo contenía DTOs + una excepción; las *implementaciones*
de los repositorios viven en clases minificadas por R8 — `defpackage/*`).

```
:app ─▶ :data ─▶ :core
```

## Contenido
- `dto/` — DTOs reconstruidos en Kotlin: `LicensePricingDto`,
  `LicenseRequestDto`, `RedeemCouponDto`, `ProfileDto`, `ProfileRowDto`,
  `ForumCategoryDto`, `ForumPostInsertDto`, `SpotInsertDto`, `AppReportDto`,
  `EmailNotVerifiedException`.
- `repository/` — contratos: `AccountRepository`, `ProfileRepository`,
  `ForumRepository`, `SpotRepository`, `FeedbackRepository`.
- `src/reference/java/…` — DTOs decompilados originales (evidencia).

## Observaciones de auditoría
- `ProfileDto` envía el **FCM token** al backend (Supabase): ver
  SECURITY.md §F-09 (telemetría) — el token permite enviar notificaciones
  push al dispositivo desde el servidor; auditar su conservación.
- Los endpoints reales (`jbkhreemmiagdyfssfep.supabase.co`, clave
  `sb_publishable_…`) ver SECURITY.md §F-07.

## Tests
`src/test/java/…/RepositoryContractsTest.kt` — verificación de la forma de
los DTOs y del resultado de redención de cupones.
