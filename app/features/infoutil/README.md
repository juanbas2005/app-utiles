# Módulo :features:infoutil

InfoUtil: información general de la app.

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/infoutil/src/main/java/cu/lestebang/utiletecsa/infoutil/navigation/InfoUtil.java

## Grafo de dependencias (planificado)
`features:infoutil → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:infoutil")` en `settings.gradle.kts`.
