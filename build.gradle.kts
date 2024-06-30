plugins {
    id("java")
    antlr
    id("com.github.johnrengelman.shadow") version ("8.1.1")
    id("maven-publish")
}

group = "org.katarine"
version = "pre-0.1"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }

}

dependencies {
    implementation("org.ow2.asm:asm:9.7")

    implementation("com.google.guava:guava:33.1.0-jre")

    antlr("org.antlr:antlr4:4.13.1")

    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
}

tasks.shadowJar {
    archiveFileName = "${rootProject.name}-$version.jar"
    archiveBaseName = ""
    manifest {
        attributes["Main-Class"] = "org.katarine.katlan.compiler.Compiler"
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["java"])
                groupId = "org.katarine"
                artifactId = "KatLan"
                version = "pre-0.1"
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}