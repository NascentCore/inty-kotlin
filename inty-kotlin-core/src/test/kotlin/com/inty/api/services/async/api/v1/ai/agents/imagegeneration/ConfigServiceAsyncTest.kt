// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.ai.agents.imagegeneration

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.core.JsonValue
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configServiceAsync = client.api().v1().ai().agents().imageGeneration().config()

        val config = configServiceAsync.retrieve()

        config.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configServiceAsync = client.api().v1().ai().agents().imageGeneration().config()

        val config =
            configServiceAsync.update(
                ConfigUpdateParams.builder()
                    .body(
                        ConfigUpdateParams.Body.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        config.validate()
    }
}
