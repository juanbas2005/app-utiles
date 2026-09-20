# Módulo :features:auth

Auth: SignIn/SignUp con Supabase Auth (AuthNavGraph).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/auth/src/main/java/cu/lestebang/utiletecsa/auth/navigation/AuthNavGraph.java
  - `app/features/auth/src/main/java/cu/lestebang/utiletecsa/auth/navigation/SignIn.java
  - `app/features/auth/src/main/java/cu/lestebang/utiletecsa/auth/navigation/SignUp.java

## Grafo de dependencias (planificado)
`features:auth → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:auth")` en `settings.gradle.kts`.
