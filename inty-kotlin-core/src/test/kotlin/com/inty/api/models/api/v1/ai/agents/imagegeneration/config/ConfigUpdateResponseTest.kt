// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents.imagegeneration.config

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigUpdateResponseTest {

    @Test
    fun create() {
        val configUpdateResponse =
            ConfigUpdateResponse.builder()
                .code(0L)
                .data(
                    ConfigUpdateResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        assertThat(configUpdateResponse.code()).isEqualTo(0L)
        assertThat(configUpdateResponse.data())
            .isEqualTo(
                ConfigUpdateResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(configUpdateResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configUpdateResponse =
            ConfigUpdateResponse.builder()
                .code(0L)
                .data(
                    ConfigUpdateResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedConfigUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configUpdateResponse),
                jacksonTypeRef<ConfigUpdateResponse>(),
            )

        assertThat(roundtrippedConfigUpdateResponse).isEqualTo(configUpdateResponse)
    }
}
