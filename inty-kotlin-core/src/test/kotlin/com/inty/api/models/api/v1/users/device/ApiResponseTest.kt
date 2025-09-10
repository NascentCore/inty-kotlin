// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.device

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiResponseTest {

    @Test
    fun create() {
        val apiResponse =
            ApiResponse.builder()
                .code(0L)
                .data(JsonValue.from(mapOf<String, Any>()))
                .message("message")
                .build()

        assertThat(apiResponse.code()).isEqualTo(0L)
        assertThat(apiResponse._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(apiResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiResponse =
            ApiResponse.builder()
                .code(0L)
                .data(JsonValue.from(mapOf<String, Any>()))
                .message("message")
                .build()

        val roundtrippedApiResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiResponse),
                jacksonTypeRef<ApiResponse>(),
            )

        assertThat(roundtrippedApiResponse).isEqualTo(apiResponse)
    }
}
