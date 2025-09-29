// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.profile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileUpdateParamsTest {

    @Test
    fun create() {
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
            .build()
    }

    @Test
    fun body() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body.ageGroup()).isEqualTo("age_group")
        assertThat(body.avatar()).isEqualTo("avatar")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.gender()).isEqualTo(Gender.MALE)
        assertThat(body.nickname()).isEqualTo("nickname")
        assertThat(body.phone()).isEqualTo("phone")
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.systemLanguage()).isEqualTo("system_language")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProfileUpdateParams.builder().build()

        val body = params._body()
    }
}
