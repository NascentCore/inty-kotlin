plugins {
    id("inty.kotlin")
    id("inty.publish")
}

dependencies {
    api(project(":inty-kotlin-core"))

    implementation("com.squareup.okhttp3:okhttp:5.2.1")
    implementation("com.squareup.okhttp3:logging-interceptor:5.2.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.6")
}
