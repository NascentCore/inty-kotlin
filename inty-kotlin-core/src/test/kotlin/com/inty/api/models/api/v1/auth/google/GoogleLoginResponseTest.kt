// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth.google

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import com.inty.api.models.api.v1.users.profile.Gender
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GoogleLoginResponseTest {

    @Test
    fun create() {
        val googleLoginResponse =
            GoogleLoginResponse.builder()
                .code(0L)
                .data(
                    GoogleLoginResponse.Data.builder()
                        .token("token")
                        .user(
                            GoogleLoginResponse.Data.User.builder()
                                .id("id")
                                .authType(GoogleLoginResponse.Data.User.AuthType.PHONE)
                                .email("email")
                                .isNewUser(true)
                                .nickname("nickname")
                                .ageGroup("age_group")
                                .avatar("avatar")
                                .description("description")
                                .gender(Gender.MALE)
                                .phone("phone")
                                .systemLanguage("system_language")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        assertThat(googleLoginResponse.code()).isEqualTo(0L)
        assertThat(googleLoginResponse.data())
            .isEqualTo(
                GoogleLoginResponse.Data.builder()
                    .token("token")
                    .user(
                        GoogleLoginResponse.Data.User.builder()
                            .id("id")
                            .authType(GoogleLoginResponse.Data.User.AuthType.PHONE)
                            .email("email")
                            .isNewUser(true)
                            .nickname("nickname")
                            .ageGroup("age_group")
                            .avatar("avatar")
                            .description("description")
                            .gender(Gender.MALE)
                            .phone("phone")
                            .systemLanguage("system_language")
                            .build()
                    )
                    .build()
            )
        assertThat(googleLoginResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val googleLoginResponse =
            GoogleLoginResponse.builder()
                .code(0L)
                .data(
                    GoogleLoginResponse.Data.builder()
                        .token("token")
                        .user(
                            GoogleLoginResponse.Data.User.builder()
                                .id("id")
                                .authType(GoogleLoginResponse.Data.User.AuthType.PHONE)
                                .email("email")
                                .isNewUser(true)
                                .nickname("nickname")
                                .ageGroup("age_group")
                                .avatar("avatar")
                                .description("description")
                                .gender(Gender.MALE)
                                .phone("phone")
                                .systemLanguage("system_language")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedGoogleLoginResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(googleLoginResponse),
                jacksonTypeRef<GoogleLoginResponse>(),
            )

        assertThat(roundtrippedGoogleLoginResponse).isEqualTo(googleLoginResponse)
    }
}
