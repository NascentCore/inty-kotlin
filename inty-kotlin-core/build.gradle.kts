plugins {
    id("inty.kotlin")
    id("inty.publish")
}

configurations.all {
    resolutionStrategy {
        // Compile and test against a lower Jackson version to ensure we're compatible with it. Note that
        // we generally support 2.13.4, but test against 2.14.0 because 2.13.4 has some annoying (but
        // niche) bugs (users should upgrade if they encounter them). We publish with a higher version
        // (see below) to ensure users depend on a secure version by default.
        force("com.fasterxml.jackson.core:jackson-core:2.14.0")
        force("com.fasterxml.jackson.core:jackson-databind:2.14.0")
        force("com.fasterxml.jackson.core:jackson-annotations:2.14.0")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.0")
        force("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.0")
        force("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")
    }
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:2.20.0")
    api("com.fasterxml.jackson.core:jackson-databind:2.20.0")
    api("com.google.errorprone:error_prone_annotations:2.42.0")

    implementation("com.fasterxml.jackson.core:jackson-annotations:2.20")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.20.0")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.20.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.20.0")
    implementation("org.apache.httpcomponents.core5:httpcore5:5.3.6")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.5.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    testImplementation(kotlin("test"))
    testImplementation(project(":inty-kotlin-client-okhttp"))
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
    testImplementation("org.assertj:assertj-core:3.27.6")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
    testImplementation("org.junit-pioneer:junit-pioneer:1.9.1")
    testImplementation("org.mockito:mockito-core:5.20.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.20.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:6.1.0")
}
