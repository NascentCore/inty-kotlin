// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.users.profile.Gender
import com.inty.api.models.api.v1.users.profile.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProfileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.api().v1().users().profile()

        val profile = profileServiceAsync.retrieve()

        profile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileServiceAsync = client.api().v1().users().profile()

        val user =
            profileServiceAsync.update(
                ProfileUpdateParams.builder()
                    .ageGroup("age_group")
                    .avatar("avatar")
                    .description("description")
                    .email("email")
                    .gender(Gender.MALE)
                    .nickname("nickname")
                    .phone("phone")
                    .systemLanguage("system_language")
                    .build()
            )

        user.validate()
    }
}
