import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.3.0"
    kotlin("plugin.serialization") version "2.3.0"
    application
}

group = "me.okaryo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jsoup:jsoup:1.21.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.7.1-0.6.x-compat")
    implementation("org.json:json:20250517")
    implementation("org.seleniumhq.selenium:selenium-java:4.38.0")
    implementation("org.seleniumhq.selenium:selenium-support:4.38.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(19)
    }
}

application {
    mainClass = "MainKt"
}
