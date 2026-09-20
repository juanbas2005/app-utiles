# Módulo :features:registro

Registro de usuarios y detalle de contacto.

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/registro/src/main/java/cu/lestebang/utiletecsa/registro/navigation/ContactDetail.java
  - `app/features/registro/src/main/java/cu/lestebang/utiletecsa/registro/navigation/Registro.java
  - `app/features/registro/src/main/java/cu/lestebang/utiletecsa/registro/navigation/RegistroNavGraph.java

## Grafo de dependencias (planificado)
`features:registro → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:registro")` en `settings.gradle.kts`.
