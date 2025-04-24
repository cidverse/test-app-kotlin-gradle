plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
    id("application")
    id("me.philippheuer.configuration") version "0.16.0"
}

version = properties["version"] as String

projectConfiguration {
    type.set(me.philippheuer.projectcfg.domain.ProjectType.APP)
    language.set(me.philippheuer.projectcfg.domain.ProjectLanguage.KOTLIN)
    javaVersion.set(JavaVersion.VERSION_17)
    artifactGroupId.set("io.github.cidverse.test")
    artifactId.set("kotlin-app-gradle")
    artifactDisplayName.set("Library - Kotlin Gradle")
    artifactDescription.set("A simple Kotlin App for testing purposes")
}

dependencies {
    // annotations
    implementation("org.jetbrains:annotations:26.0.2")

    // test
    testImplementation(kotlin("test"))
}

application {
    mainClass = "io.github.cidverse.test.app.kotlin.gradle.ApplicationKt"
}
