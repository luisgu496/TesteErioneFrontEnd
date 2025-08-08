plugins {
    kotlin("multiplatform") version "1.9.23"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
            binaries.executable()
        }
    }
}

tasks.wrapper {
    gradleVersion = "8.7"
    distributionType = Wrapper.DistributionType.ALL
}

dependencies {
    implementation(kotlin("stdlib-js"))

    // React + React DOM
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.601")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.601")

    // CSS support
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.1-pre.601")

    // Coroutines para async
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
}
