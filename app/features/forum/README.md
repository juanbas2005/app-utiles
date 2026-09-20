# Módulo :features:forum

Foros ETECSA: feeds, categorías, posts y votos.

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/forum/src/main/java/cu/lestebang/utiletecsa/forum/navigation/Forum.java

## Grafo de dependencias (planificado)
`features:forum → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:forum")` en `settings.gradle.kts`.
