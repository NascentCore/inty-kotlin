// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.report

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiResponseDictTest {

    @Test
    fun create() {
        val apiResponseDict =
            ApiResponseDict.builder()
                .code(0L)
                .data(
                    ApiResponseDict.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        assertThat(apiResponseDict.code()).isEqualTo(0L)
        assertThat(apiResponseDict.data())
            .isEqualTo(
                ApiResponseDict.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(apiResponseDict.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiResponseDict =
            ApiResponseDict.builder()
                .code(0L)
                .data(
                    ApiResponseDict.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedApiResponseDict =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiResponseDict),
                jacksonTypeRef<ApiResponseDict>(),
            )

        assertThat(roundtrippedApiResponseDict).isEqualTo(apiResponseDict)
    }
}
