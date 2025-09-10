// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeletionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun checkEligibility() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deletionServiceAsync = client.api().v1().users().deletion()

        val response = deletionServiceAsync.checkEligibility()

        response.validate()
    }
}
