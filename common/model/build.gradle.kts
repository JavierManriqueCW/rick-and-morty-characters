plugins {
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.kotlin.parcelize)
}

android {
    namespace = "com.jmp.common.model"
    compileSdk = libs.versions.androidCompileSdkVersion.get().toInt()

    defaultConfig {
        minSdk = libs.versions.androidMinSdkVersion.get().toInt()
        multiDexEnabled = true

        javaCompileOptions {
            annotationProcessorOptions {
                arguments += mapOf("room.schemaLocation" to "$projectDir/schemas")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

kotlin {
    jvmToolchain(libs.versions.jvmToolchain.get().toInt())
}