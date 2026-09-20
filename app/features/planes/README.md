# Módulo :features:planes

Planes: listado, precios y expiración de planes (notificación de caducidad).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/planes/src/main/java/cu/lestebang/utiletecsa/planes/navigation/Planes.java

## Grafo de dependencias (planificado)
`features:planes → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:planes")` en `settings.gradle.kts`.
