plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "kr.go.overtime.reminder"
    compileSdk = 35
    defaultConfig {
        applicationId = "kr.go.overtime.reminder"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
