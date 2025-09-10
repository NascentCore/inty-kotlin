// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeletionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun checkEligibility() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deletionService = client.api().v1().users().deletion()

        val response = deletionService.checkEligibility()

        response.validate()
    }
}
