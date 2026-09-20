# Módulo :features:settings

Servicios de ajustes: configuración de llamadas, USSD automático, alertas y utilidades (8 servicios en settings/services).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/CallAlertActivity.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/BalanceNotificationService.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/CallAlertReceiver.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/CallBlockService.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/GsmNetworkService.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/SpeedOverlayService.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/CallBlockReceiver.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/UssdAutoBootReceiver.java
  - `app/features/settings/src/main/java/cu/lestebang/utiletecsa/settings/service/UssdAutoUpdaterService.java

## Grafo de dependencias (planificado)
`features:settings → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:settings")` en `settings.gradle.kts`.
