// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth.google

import com.inty.api.models.api.v1.users.profile.Gender
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GoogleLoginParamsTest {

    @Test
    fun create() {
        GoogleLoginParams.builder()
            .email("email")
            .idToken("id_token")
            .password("password")
            .requestId("request_id")
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
                .email("email")
                .idToken("id_token")
                .password("password")
                .requestId("request_id")
                .userInfo(
                    GoogleLoginParams.UserInfo.builder()
                        .ageGroup("age_group")
                        .gender(Gender.MALE)
                        .systemLanguage("system_language")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.idToken()).isEqualTo("id_token")
        assertThat(body.password()).isEqualTo("password")
        assertThat(body.requestId()).isEqualTo("request_id")
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
        val params = GoogleLoginParams.builder().build()

        val body = params._body()
    }
}
