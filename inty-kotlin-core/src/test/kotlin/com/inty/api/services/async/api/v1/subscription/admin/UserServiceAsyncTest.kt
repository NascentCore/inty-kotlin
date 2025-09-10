// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription.admin

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getSubscriptionStatus() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.api().v1().subscription().admin().users()

        val apiResponseSubscriptionStatus = userServiceAsync.getSubscriptionStatus("user_id")

        apiResponseSubscriptionStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getUsageStatistics() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.api().v1().subscription().admin().users()

        val apiResponseUsageStatistics = userServiceAsync.getUsageStatistics("user_id")

        apiResponseUsageStatistics.validate()
    }
}
