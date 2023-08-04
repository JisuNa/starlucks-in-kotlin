plugins {
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.spring") version "1.8.10"
    kotlin("plugin.jpa") version "1.8.10"
    id("org.springframework.boot") version "3.0.4"
    id("io.spring.dependency-management") version "1.1.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

allOpen {
    annotation("jakarta.persistence.Entity")
}

tasks {
    jar { enabled = true }
    bootJar { enabled = false }
}

tasks.test {
    useJUnitPlatform()
}