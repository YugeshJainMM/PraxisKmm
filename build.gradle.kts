buildscript {
    val compose_version by extra("1.1.0-rc02")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        AppDependencies.plugins.forEach { dependency ->
            classpath(dependency)
        }
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.pkg.jetbrains.space/public/p/kotlinx-coroutines/maven")
        maven(url = "https://maven.pkg.jetbrains.space/public/p/ktor/eap")
    }
}
