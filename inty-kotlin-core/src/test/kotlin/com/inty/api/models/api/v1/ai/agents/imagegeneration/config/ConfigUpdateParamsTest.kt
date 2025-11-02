// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents.imagegeneration.config

import com.inty.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigUpdateParamsTest {

    @Test
    fun create() {
        ConfigUpdateParams.builder()
            .body(
                ConfigUpdateParams.Body.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ConfigUpdateParams.builder()
                .body(
                    ConfigUpdateParams.Body.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ConfigUpdateParams.Body.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
