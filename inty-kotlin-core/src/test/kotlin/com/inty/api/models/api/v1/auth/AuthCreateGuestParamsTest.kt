// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCreateGuestParamsTest {

    @Test
    fun create() {
        AuthCreateGuestParams.builder()
            .ageGroup("age_group")
            .deviceId("device_id")
            .requestId("request_id")
            .systemLanguage("system_language")
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthCreateGuestParams.builder()
                .ageGroup("age_group")
                .deviceId("device_id")
                .requestId("request_id")
                .systemLanguage("system_language")
                .build()

        val body = params._body()

        assertThat(body.ageGroup()).isEqualTo("age_group")
        assertThat(body.deviceId()).isEqualTo("device_id")
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.systemLanguage()).isEqualTo("system_language")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AuthCreateGuestParams.builder().build()

        val body = params._body()
    }
}
