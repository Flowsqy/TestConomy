plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots");
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.jetbrains:annotations:24.0.1")
    implementation("org.spigotmc:spigot-api:1.21-R0.1-SNAPSHOT")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

project.base.archivesName.set(rootProject.name)
group = "fr.flowsqy.testconomy"
version = "1.0.0-SNAPSHOT"

tasks.processResources {
    expand(Pair("version", version))
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

