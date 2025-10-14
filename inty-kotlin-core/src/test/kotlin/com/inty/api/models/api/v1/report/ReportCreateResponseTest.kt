// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.report

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCreateResponseTest {

    @Test
    fun create() {
        val reportCreateResponse =
            ReportCreateResponse.builder()
                .code(0L)
                .data(JsonValue.from(mapOf<String, Any>()))
                .message("message")
                .build()

        assertThat(reportCreateResponse.code()).isEqualTo(0L)
        assertThat(reportCreateResponse._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(reportCreateResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportCreateResponse =
            ReportCreateResponse.builder()
                .code(0L)
                .data(JsonValue.from(mapOf<String, Any>()))
                .message("message")
                .build()

        val roundtrippedReportCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportCreateResponse),
                jacksonTypeRef<ReportCreateResponse>(),
            )

        assertThat(roundtrippedReportCreateResponse).isEqualTo(reportCreateResponse)
    }
}
