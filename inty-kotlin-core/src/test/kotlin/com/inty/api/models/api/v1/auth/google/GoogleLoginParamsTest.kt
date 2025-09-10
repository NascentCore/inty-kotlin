// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth.google

import com.inty.api.models.api.v1.users.profile.Gender
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GoogleLoginParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.idToken()).isEqualTo("id_token")
        assertThat(body.userInfo())
            .isEqualTo(
                GoogleLoginParams.UserInfo.builder()
                    .ageGroup("age_group")
                    .gender(Gender.MALE)
                    .systemLanguage("system_language")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GoogleLoginParams.builder().idToken("id_token").build()

        val body = params._body()

        assertThat(body.idToken()).isEqualTo("id_token")
    }
}
