plugins {
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.com.android.library)
}

android {
    namespace = "com.jmp.domain"
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
        jvmTarget = libs.versions.jvmTarget.get()
    }
}

kotlin {
    jvmToolchain(libs.versions.jvmToolchain.get().toInt())
}

dependencies {

    implementation(project(":common:model"))
    implementation(project(":common:di:provider"))
    implementation(libs.kotlin)
    implementation(libs.koin.core)
    implementation(libs.kotlinx.coroutines.core)
}
