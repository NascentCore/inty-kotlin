// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.subscription

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdminServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun processRefund() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val adminService = client.api().v1().subscription().admin()

        val response =
            adminService.processRefund(
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
