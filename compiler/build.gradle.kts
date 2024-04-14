plugins {
    id("java")
    id("antlr")
}

group = "org.katarine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.cojen:cojen-maker:2.5.5")
    implementation(project(":lib"))
    implementation("org.jetbrains:annotations:24.0.0")
    antlr("org.antlr:antlr4:4.13.1")
    
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}