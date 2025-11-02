// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents.imagegeneration.config

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigRetrieveResponseTest {

    @Test
    fun create() {
        val configRetrieveResponse =
            ConfigRetrieveResponse.builder()
                .code(0L)
                .data(
                    ConfigRetrieveResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        assertThat(configRetrieveResponse.code()).isEqualTo(0L)
        assertThat(configRetrieveResponse.data())
            .isEqualTo(
                ConfigRetrieveResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(configRetrieveResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configRetrieveResponse =
            ConfigRetrieveResponse.builder()
                .code(0L)
                .data(
                    ConfigRetrieveResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedConfigRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configRetrieveResponse),
                jacksonTypeRef<ConfigRetrieveResponse>(),
            )

        assertThat(roundtrippedConfigRetrieveResponse).isEqualTo(configRetrieveResponse)
    }
}
