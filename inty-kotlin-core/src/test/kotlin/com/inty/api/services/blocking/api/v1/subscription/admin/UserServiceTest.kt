// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.subscription.admin

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getSubscriptionStatus() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.api().v1().subscription().admin().users()

        val apiResponseSubscriptionStatus = userService.getSubscriptionStatus("user_id")

        apiResponseSubscriptionStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUsageStatistics() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.api().v1().subscription().admin().users()

        val apiResponseUsageStatistics = userService.getUsageStatistics("user_id")

        apiResponseUsageStatistics.validate()
    }
}
