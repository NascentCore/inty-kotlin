// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.auth

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.auth.google.GoogleLoginParams
import com.inty.api.models.api.v1.users.profile.Gender
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GoogleServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun login() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val googleService = client.api().v1().auth().google()

        val response =
            googleService.login(
                GoogleLoginParams.builder()
                    .idToken("id_token")
                    .userInfo(
                        GoogleLoginParams.UserInfo.builder()
                            .ageGroup("age_group")
                            .gender(Gender.MALE)
                            .systemLanguage("system_language")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
