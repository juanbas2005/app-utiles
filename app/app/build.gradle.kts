// :app — aplicación UtilEs (reconstrucción de seguridad)
//
// ABI splits: armeabi-v7a / arm64-v8a / x86_64 + universalApk (4 APK por
// build; BUILD.md §4). La reconstrucción no incluye todavía .so (el
// WireGuard original vivía en assets); los 4 APK son idénticos en contenido
// hasta que se reintegre la feature de VPN.
plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "cu.lestebang.utiletecsa"
    compileSdk = 37

    defaultConfig {
        applicationId = "cu.lestebang.utiletecsa"
        minSdk = 24
        targetSdk = 37
        versionCode = 10603
        versionName = "1.6.3-security.1"
    }

    signingConfigs {
        // Keystore de CI: se genera en .github/workflows/build.yml (keytool)
        // o se inyecta por secretos (ver BUILD.md §6). Sin keystore el
        // build produce release SIGNED solo si existe signing/utiles-ci.keystore.
        create("ciRelease") {
            val ksFile = layout.projectDirectory.file("signing/utiles-ci.keystore")
            val password = System.getenv("CI_KEYSTORE_PASSWORD") ?: System.getenv("ANDROID_KEY_PASSWORD")
            if (ksFile.exists() && password != null) {
                storeFile = ksFile
                storePassword = password
                keyAlias = System.getenv("CI_KEY_ALIAS") ?: "utiles-ci"
                keyPassword = System.getenv("CI_KEY_PASSWORD") ?: password
            }
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
            val ci = signingConfigs.findByName("ciRelease")
            if (ci != null && ci.storeFile != null) {
                signingConfig = ci
            }
        }
    }

    splits {
        abi {
            isEnable = true
            reset()
            include("armeabi-v7a", "arm64-v8a", "x86_64")
            isUniversalApk = true
        }
    }

    buildFeatures {
        buildConfig = true
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    lint {
        abortOnError = true
        checkReleaseBuilds = false
    }
}

dependencies {
    implementation(project(":ui"))
    implementation(project(":data"))
    implementation(project(":security"))
    implementation(project(":core"))
    testImplementation(libs.junit)
}
