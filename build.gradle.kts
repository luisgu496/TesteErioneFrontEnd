plugins {
    kotlin("multiplatform") version "1.9.24"
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
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.601")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.601")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.1-pre.601")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
            }
        }
    }
}

tasks.wrapper {
    gradleVersion = "8.7"
    distributionType = Wrapper.DistributionType.ALL
}
