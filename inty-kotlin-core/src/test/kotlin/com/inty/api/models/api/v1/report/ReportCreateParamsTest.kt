// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.report

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCreateParamsTest {

    @Test
    fun create() {
        ReportCreateParams.builder()
            .addReasonId(0L)
            .targetId("target_id")
            .targetType(ReportCreateParams.TargetType.USER)
            .description("description")
            .addImageUrl("string")
            .requestId("request_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            ReportCreateParams.builder()
                .addReasonId(0L)
                .targetId("target_id")
                .targetType(ReportCreateParams.TargetType.USER)
                .description("description")
                .addImageUrl("string")
                .requestId("request_id")
                .build()

        val body = params._body()

        assertThat(body.reasonIds()).containsExactly(0L)
        assertThat(body.targetId()).isEqualTo("target_id")
        assertThat(body.targetType()).isEqualTo(ReportCreateParams.TargetType.USER)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.imageUrls()).containsExactly("string")
        assertThat(body.requestId()).isEqualTo("request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReportCreateParams.builder()
                .addReasonId(0L)
                .targetId("target_id")
                .targetType(ReportCreateParams.TargetType.USER)
                .build()

        val body = params._body()

        assertThat(body.reasonIds()).containsExactly(0L)
        assertThat(body.targetId()).isEqualTo("target_id")
        assertThat(body.targetType()).isEqualTo(ReportCreateParams.TargetType.USER)
    }
}
