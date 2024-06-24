import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
    application
}

group = "me.okaryo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jsoup:jsoup:1.17.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
    implementation("org.json:json:20240303")
    implementation("org.seleniumhq.selenium:selenium-java:4.22.0")
    implementation("org.seleniumhq.selenium:selenium-support:4.22.0")
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
