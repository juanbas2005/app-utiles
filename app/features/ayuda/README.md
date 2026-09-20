# Módulo :features:ayuda

Ayuda y pantalla de licencias OSS.

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/ayuda/src/main/java/cu/lestebang/utiletecsa/ayuda/navigation/Ayuda.java
  - `app/features/ayuda/src/main/java/cu/lestebang/utiletecsa/ayuda/navigation/Licencia.java

## Grafo de dependencias (planificado)
`features:ayuda → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:ayuda")` en `settings.gradle.kts`.
