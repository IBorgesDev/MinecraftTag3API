plugins {
    id("java")
}

group = "com.credentech"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("commons-io:commons-io:2.11.0")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
    implementation("org.zeroturnaround:zt-zip:1.14")

}

tasks.test {
    useJUnitPlatform()
}