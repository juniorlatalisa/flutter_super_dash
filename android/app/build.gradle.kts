plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.verygoodventures.super_dash"
    compileSdk = flutter.compileSdkVersion
    // ndkVersion = flutter.ndkVersion
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.verygoodventures.super_dash"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        // minSdk = 23
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
        multiDexEnabled = true
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    // flavorDimensions += "default"
    // productFlavors {
    //     create("development") {
    //         dimension = "default"
    //         applicationIdSuffix = ""
    //     }
    //     create("production") {
    //         dimension = "default"
    //         applicationIdSuffix = ""
    //     }
    // }

}

flutter {
    source = "../.."
}

dependencies {
    implementation("androidx.multidex:multidex:2.0.1")
    // implementation("androidx.core:core:1.3.0")
    // implementation("androidx.media:media:1.1.0")
    // implementation("com.google.code.gson:gson:2.12.0")

    // debugImplementation("com.android.tools:desugar_jdk_libs:2.0.4")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
}
