plugins {
    idea
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.spring") version "1.8.10"
//    kotlin("plugin.jpa") version "1.8.10"
    kotlin("kapt") version "1.8.10"
    id("org.springframework.boot") version "3.0.4"
    id("io.spring.dependency-management") version "1.1.0"
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
//    apply(plugin = "org.jetbrains.kotlin.kapt")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
//    apply(plugin = "org.jetbrains.kotlin.plugin.jpa")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
}

dependencies {
    implementation(project(":payment"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

//application {
//    // Define the main class for the application.
//    mainClass.set("starlucks.AppKt")
//}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
