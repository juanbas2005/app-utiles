// Proyecto raíz — UtilEs (reconstrucción modular, AGP 9.2.1)
//
// Desde AGP 9.0 el soporte Kotlin es "built-in": no se aplica el plugin
// org.jetbrains.kotlin.android en ningún módulo (migración documentada en
// https://developer.android.com/build/migrate-to-built-in-kotlin).
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
