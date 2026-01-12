// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.users.profile.Gender
import com.inty.api.models.api.v1.users.profile.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProfileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileService = client.api().v1().users().profile()

        val profile =
            profileService.update(
                ProfileUpdateParams.builder()
                    .ageGroup("age_group")
                    .avatar("avatar")
                    .description("description")
                    .email("email")
                    .gender(Gender.MALE)
                    .nickname("nickname")
                    .phone("phone")
                    .requestId("request_id")
                    .systemLanguage("system_language")
                    .userPhoto("user_photo")
                    .build()
            )

        profile.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun me() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val profileService = client.api().v1().users().profile()

        val response = profileService.me()

        response.validate()
    }
}
