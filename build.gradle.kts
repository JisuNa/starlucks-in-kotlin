plugins {
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}