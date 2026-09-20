// :features:nauta — DESACTIVADO (no incluido en settings.gradle.kts)
//
// Razón: el código bajo src/main/java es el Java decompilado por jadx, que
// referencia clases minificadas por R8 (defpackage/*, r8-map-id a2600502…).
// Solo será compilable con el source original o el mapping de R8.
// Al habilitarlo, incluir en settings.gradle.kts: include(":features:nauta")
plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "cu.lestebang.utiletecsa.feature.nauta"
    compileSdk = 37
    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-rules.pro")
    }
}

// Dependencias planificadas (activar al habilitar el módulo):
//   implementation(project(":core"))
//   implementation(project(":data"))
//   implementation(project(":ui"))
