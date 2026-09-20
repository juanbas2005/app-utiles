# Módulo :features:widget

Widgets (Saldo, Datos, LTE, Vpn, Resumen) + activities de soporte (APN, VpnToggle, LteOnly).

## Estado
**Referencia (no compilable)** — el código en `src/main/java` es el decompilado
por jadx. Incluye:
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/ApnSettingsActivity.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/ApnWidgetProvider.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/LteOnlyActivity.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/DatosWidgetProvider.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/LteWidgetProvider.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/ResumenWidgetProvider.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/VpnToggleActivity.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/SaldoWidgetProvider.java
  - `app/features/widget/src/main/java/cu/lestebang/utiletecsa/widget/VpnWidgetProvider.java

## Grafo de dependencias (planificado)
`features:widget → :ui → :core` y `:data` (según la feature).

## Cómo habilitarlo
1. Recuperar el source original (o el mapping de R8) para sustituir las
   referencias a clases minificadas.
2. Añadir `include(":features:widget")` en `settings.gradle.kts`.
