// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionVerifyParamsTest {

    @Test
    fun create() {
        SubscriptionVerifyParams.builder()
            .productId("product_id")
            .purchaseToken("purchase_token")
            .orderId("order_id")
            .requestId("request_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionVerifyParams.builder()
                .productId("product_id")
                .purchaseToken("purchase_token")
                .orderId("order_id")
                .requestId("request_id")
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.purchaseToken()).isEqualTo("purchase_token")
        assertThat(body.orderId()).isEqualTo("order_id")
        assertThat(body.requestId()).isEqualTo("request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionVerifyParams.builder()
                .productId("product_id")
                .purchaseToken("purchase_token")
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.purchaseToken()).isEqualTo("purchase_token")
    }
}
