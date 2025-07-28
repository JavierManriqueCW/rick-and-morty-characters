plugins {
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.com.google.devtools.ksp)
}

android {
    namespace = "com.jmp.data"
    compileSdk = libs.versions.androidCompileSdkVersion.get().toInt()

    defaultConfig {
        minSdk = libs.versions.androidMinSdkVersion.get().toInt()
        multiDexEnabled = true

        javaCompileOptions {
            annotationProcessorOptions {
                arguments += mapOf(
                    "room.schemaLocation" to "$projectDir/schemas"
                )
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

    buildFeatures {
        buildConfig = true
    }
}

kotlin {
    jvmToolchain(libs.versions.jvmToolchain.get().toInt())
}

dependencies {

    // Modules
    implementation(project(":common:model"))
    implementation(project(":common:di:provider"))
    implementation(project(":domain"))

    // Core
    implementation(libs.kotlin)

    // DI
    implementation(libs.koin.core)
    implementation(libs.koin.core.android)

    // Cache
    api(libs.room.runtime)
    ksp(libs.room.compiler)
    api(libs.room.ktx)

    // Remote
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter)
    implementation(libs.retrofit.adapter)
    implementation(libs.okhttp)
    implementation(libs.okhttp.interceptor)
    api(libs.gson)
}

ksp {
    arg("room.schemaLocation", "$projectDir/schemas")
}
