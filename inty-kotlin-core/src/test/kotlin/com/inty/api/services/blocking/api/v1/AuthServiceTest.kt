// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.auth.AuthCreateGuestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createGuest() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.api().v1().auth()

        val response =
            authService.createGuest(
                AuthCreateGuestParams.builder()
                    .ageGroup("age_group")
                    .deviceId("device_id")
                    .systemLanguage("system_language")
                    .build()
            )

        response.validate()
    }
}
