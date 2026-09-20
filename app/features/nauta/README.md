# Módulo :features:nauta

Nauta (WiFi/VPN ETECSA): sesión, cookies, overlay de velocidad y Quick Settings tile (BIND_QUICK_SETTINGS_TILE, protegido).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/nauta/src/main/java/cu/lestebang/utiletecsa/nauta/navigation/Nauta.java
  - `app/features/nauta/src/main/java/cu/lestebang/utiletecsa/nauta/service/NautaTileService.java
  - `app/features/nauta/src/main/java/cu/lestebang/utiletecsa/nauta/service/NautaOverlayService.java

## Grafo de dependencias (planificado)
`features:nauta → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:nauta")` en `settings.gradle.kts`.
