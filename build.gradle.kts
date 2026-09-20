/*
 * Proyecto raíz — UtilEs (re-implementación hardenizada).
 * Los plugins se declaran con versión aquí y se aplican (sin versión) en cada módulo.
 */
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
}
