plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "cu.lestebang.utiletecsa.core"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-rules.pro")
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}

// El código original usa kotlinx.serialization; en la reconstrucción los
// modelos son data classes Kotlin puros (ver core/README.md §3) para no
// acoplar el build al plugin de serialización mientras se recupera el source.
dependencies {
    testImplementation(libs.junit)
}
