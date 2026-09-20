# Módulo :features:profile

Perfil de usuario (avatar, usuario, invitaciones).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/profile/src/main/java/cu/lestebang/utiletecsa/profile/navigation/Profile.java

## Grafo de dependencias (planificado)
`features:profile → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:profile")` en `settings.gradle.kts`.
