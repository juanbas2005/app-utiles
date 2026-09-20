# Reglas ProGuard/R8 de la reconstrucción.
# El original usaba R8 con mapping privado (r8-map-id a2600502…); esta
# reconstrucción genera su propio mapping en cada build (BUILD.md §5).
-keep class cu.lestebang.utiletecsa.BuildInfo { *; }
