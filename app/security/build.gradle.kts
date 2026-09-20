plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "cu.lestebang.utiletecsa.security"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-rules.pro")
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}

// Sin dependencias externas: las mitigaciones usan solo APIs de plataforma
// (MessageDigest, AndroidKeyStore/JCE, PackageManager). Alternativas con Tink
// documentadas en SecureStorage.kt.
dependencies {
    testImplementation(libs.junit)
}
