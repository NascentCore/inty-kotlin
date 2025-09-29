// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdminServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun processRefund() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val adminServiceAsync = client.api().v1().subscription().admin()

        val response =
            adminServiceAsync.processRefund(
                AdminProcessRefundParams.builder()
                    .subscriptionId("subscription_id")
                    .reason("reason")
                    .refundAmount(0.0)
                    .requestId("request_id")
                    .build()
            )

        response.validate()
    }
}
