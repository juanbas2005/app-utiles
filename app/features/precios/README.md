# Módulo :features:precios

Precios de servicios y planes (catálogo).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/precios/src/main/java/cu/lestebang/utiletecsa/precios/navigation/Precios.java

## Grafo de dependencias (planificado)
`features:precios → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:precios")` en `settings.gradle.kts`.
