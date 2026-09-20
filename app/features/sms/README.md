# Módulo :features:sms

SMS: envío y recepción (permiso SEND_SMS — justificado en F-03).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/sms/src/main/java/cu/lestebang/utiletecsa/sms/navigation/Sms.java

## Grafo de dependencias (planificado)
`features:sms → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:sms")` en `settings.gradle.kts`.
