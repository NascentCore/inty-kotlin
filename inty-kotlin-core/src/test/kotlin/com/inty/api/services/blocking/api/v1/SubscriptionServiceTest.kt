// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.subscription.SubscriptionVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.api().v1().subscription()

        val apiResponseSubscriptionStatus = subscriptionService.getStatus()

        apiResponseSubscriptionStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUsage() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.api().v1().subscription()

        val apiResponseUsageStatistics = subscriptionService.getUsage()

        apiResponseUsageStatistics.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPlans() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.api().v1().subscription()

        val response = subscriptionService.listPlans()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.api().v1().subscription()

        val response =
            subscriptionService.verify(
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
    fun webhook() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.api().v1().subscription()

        val response = subscriptionService.webhook()

        response.validate()
    }
}
