plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "cu.utiletecsa.core.preferences"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(project(":security"))
    implementation(project(":core:common"))
    api(libs.datastore.preferences)
    implementation(libs.coroutines.core)

    testImplementation(libs.junit)
}
