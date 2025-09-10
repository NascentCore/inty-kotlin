// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminProcessRefundResponseTest {

    @Test
    fun create() {
        val adminProcessRefundResponse =
            AdminProcessRefundResponse.builder()
                .code(0L)
                .data(
                    AdminProcessRefundResponse.Data.builder()
                        .message("message")
                        .refundAmount(0.0)
                        .subscriptionId("subscription_id")
                        .success(true)
                        .refundedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .message("message")
                .build()

        assertThat(adminProcessRefundResponse.code()).isEqualTo(0L)
        assertThat(adminProcessRefundResponse.data())
            .isEqualTo(
                AdminProcessRefundResponse.Data.builder()
                    .message("message")
                    .refundAmount(0.0)
                    .subscriptionId("subscription_id")
                    .success(true)
                    .refundedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(adminProcessRefundResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adminProcessRefundResponse =
            AdminProcessRefundResponse.builder()
                .code(0L)
                .data(
                    AdminProcessRefundResponse.Data.builder()
                        .message("message")
                        .refundAmount(0.0)
                        .subscriptionId("subscription_id")
                        .success(true)
                        .refundedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedAdminProcessRefundResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adminProcessRefundResponse),
                jacksonTypeRef<AdminProcessRefundResponse>(),
            )

        assertThat(roundtrippedAdminProcessRefundResponse).isEqualTo(adminProcessRefundResponse)
    }
}
