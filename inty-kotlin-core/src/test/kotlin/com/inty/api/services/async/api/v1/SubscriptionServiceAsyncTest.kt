// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.subscription.SubscriptionVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getStatus() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.api().v1().subscription()

        val apiResponseSubscriptionStatus = subscriptionServiceAsync.getStatus()

        apiResponseSubscriptionStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getUsage() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.api().v1().subscription()

        val apiResponseUsageStatistics = subscriptionServiceAsync.getUsage()

        apiResponseUsageStatistics.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listPlans() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.api().v1().subscription()

        val response = subscriptionServiceAsync.listPlans()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun verify() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.api().v1().subscription()

        val response =
            subscriptionServiceAsync.verify(
                SubscriptionVerifyParams.builder()
                    .productId("product_id")
                    .purchaseToken("purchase_token")
                    .orderId("order_id")
                    .requestId("request_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun webhook() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.api().v1().subscription()

        val response = subscriptionServiceAsync.webhook()

        response.validate()
    }
}
