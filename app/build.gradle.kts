plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.com.google.devtools.ksp)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.jmp.rickandmortycharacters"
    compileSdk = libs.versions.androidCompileSdkVersion.get().toInt()

    defaultConfig {
        applicationId = "com.jmp.rickandmortycharacters"
        targetSdk = libs.versions.androidTargetSdkVersion.get().toInt()
        minSdk = libs.versions.androidMinSdkVersion.get().toInt()
        versionCode = 1
        versionName = "1.0.0"
        multiDexEnabled = true

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    sourceSets["main"].apply {
        manifest.srcFile("src/main/AndroidManifest.xml")
        res.srcDirs("src/main/res")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = libs.versions.jvmTarget.get()
    }

    buildFeatures {
        viewBinding = true
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlin.compiler.extension.get()
    }
}

dependencies {
    implementation(project(":common:model"))
    implementation(project(":common:di:core"))
    implementation(project(":domain"))

    implementation(libs.kotlin)
    implementation(libs.ktxcore)
    implementation(libs.material)
    implementation(libs.lifecycle.vmktx)
    implementation(libs.appcompat)
    implementation(libs.window)
    implementation(libs.recyclerview)
    implementation(libs.security)

    implementation(libs.lifecycle.extensions)

    debugImplementation(libs.ui.tooling)
    implementation(libs.lifecycle.runtime)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)

    implementation(platform(libs.koin.bom))
    implementation(libs.koin.core)
    implementation(libs.koin.core.android)
    implementation(libs.koin.android.compat)
    implementation(libs.koin.compose)

    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.coil)

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.material)
    implementation(libs.compose.constraintlayout)
    implementation(libs.compose.coil)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)

    implementation(libs.splash.screen)
}
