import com.bmuschko.gradle.docker.tasks.image.*

plugins {
    `java-gradle-plugin`

    kotlin("jvm") version "1.8.0"
    id("com.bmuschko.docker-remote-api") version "9.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.create("buildMyAppImage", DockerBuildImage::class) {
    inputDir.set(file("docker"))
    images.add("test/myapp:latest")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}