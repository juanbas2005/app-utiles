# Módulo :features:red

Estado de la red ETECSA (cobertura/servicios).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/red/src/main/java/cu/lestebang/utiletecsa/red/navigation/Red.java

## Grafo de dependencias (planificado)
`features:red → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:red")` en `settings.gradle.kts`.
