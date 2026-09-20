plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "cu.lestebang.utiletecsa.ui"
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
    implementation(libs.androidx.core.ktx)
    testImplementation(libs.junit)
}
