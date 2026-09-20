import java.util.Base64

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "cu.utiletecsa.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "cu.utiletecsa.app"
        minSdk = 24
        targetSdk = 36
        versionCode = 2
        versionName = "2.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // ABI splits: APK por arquitectura + universal (pedido del entregable).
    splits {
        abi {
            isEnable = true
            reset()
            include("armeabi-v7a", "arm64-v8a", "x86_64")
            isUniversalApk = true
        }
    }

    // Firma: usa un keystore proporcionado por CI (secrets) o, en su defecto,
    // la firma debug para builds locales. Nunca se versiona un keystore real.
    signingConfigs {
        if (System.getenv("CI_KEYSTORE_BASE64") != null) {
            val keystoreFile = File.createTempFile("ci-keystore", ".jks").apply {
                writeBytes(Base64.getDecoder().decode(System.getenv("CI_KEYSTORE_BASE64")))
            }
            create("ci") {
                storeFile = keystoreFile
                storePassword = System.getenv("CI_KEYSTORE_PASSWORD")
                keyAlias = System.getenv("CI_KEY_ALIAS")
                keyPassword = System.getenv("CI_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = if (System.getenv("CI_KEYSTORE_BASE64") != null) {
                signingConfigs.getByName("ci")
            } else {
                signingConfigs.getByName("debug")
            }
        }
        debug {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:common"))
    implementation(project(":core:network"))
    implementation(project(":core:preferences"))
    implementation(project(":core:database"))
    implementation(project(":core:ussd"))
    implementation(project(":security"))
    implementation(project(":feature:home"))
    implementation(project(":feature:saldo"))
    implementation(project(":feature:settings"))
    implementation(project(":feature:vpn"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.viewmodel.compose)
    implementation(libs.navigation.compose)
    implementation(libs.coroutines.android)
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)

    testImplementation(libs.junit)
}
