// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdminProcessRefundParamsTest {

    @Test
    fun create() {
        AdminProcessRefundParams.builder()
            .subscriptionId("subscription_id")
            .reason("reason")
            .refundAmount(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            AdminProcessRefundParams.builder()
                .subscriptionId("subscription_id")
                .reason("reason")
                .refundAmount(0.0)
                .build()

        val body = params._body()

        assertThat(body.subscriptionId()).isEqualTo("subscription_id")
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.refundAmount()).isEqualTo(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AdminProcessRefundParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()

        assertThat(body.subscriptionId()).isEqualTo("subscription_id")
    }
}
