# Módulo :features:servicios

Servicios ETECSA: catálogo y acciones.

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/servicios/src/main/java/cu/lestebang/utiletecsa/servicios/navigation/Servicios.java

## Grafo de dependencias (planificado)
`features:servicios → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:servicios")` en `settings.gradle.kts`.
