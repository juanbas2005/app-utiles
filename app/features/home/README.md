# Módulo :features:home

Home principal: navegación (HomeNavGraph), marcador, secciones colapsables, overlay VPN y tiles.

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/home/src/main/java/cu/lestebang/utiletecsa/home/navigation/Home.java
  - `app/features/home/src/main/java/cu/lestebang/utiletecsa/home/navigation/HomeNavGraph.java
  - `app/features/home/src/main/java/cu/lestebang/utiletecsa/home/navigation/Dialer.java
  - `app/features/home/src/main/java/cu/lestebang/utiletecsa/home/navigation/Pamarillas.java
  - `app/features/home/src/main/java/cu/lestebang/utiletecsa/home/navigation/Vpn.java
  - `app/features/home/src/main/java/cu/lestebang/utiletecsa/home/navigation/Item.java

## Grafo de dependencias (planificado)
`features:home → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:home")` en `settings.gradle.kts`.
