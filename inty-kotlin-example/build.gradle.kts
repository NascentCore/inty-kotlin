plugins {
    id("inty.kotlin")
    application
}

dependencies {
    implementation(project(":inty-kotlin-core"))
    implementation(project(":inty-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :inty-kotlin-example:run` to run `Main`
    // Use `./gradlew :inty-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.inty.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
