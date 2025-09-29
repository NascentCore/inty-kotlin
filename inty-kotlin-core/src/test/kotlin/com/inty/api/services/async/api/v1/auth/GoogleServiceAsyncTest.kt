// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.auth

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.auth.google.GoogleLoginParams
import com.inty.api.models.api.v1.users.profile.Gender
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GoogleServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun login() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val googleServiceAsync = client.api().v1().auth().google()

        val response =
            googleServiceAsync.login(
                GoogleLoginParams.builder()
                    .idToken("id_token")
                    .requestId("request_id")
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
