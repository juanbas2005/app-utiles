plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "cu.lestebang.utiletecsa.data"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-rules.pro")
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {
    api(project(":core"))
    testImplementation(libs.junit)
}
