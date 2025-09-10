// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCreateGuestResponseTest {

    @Test
    fun create() {
        val authCreateGuestResponse =
            AuthCreateGuestResponse.builder()
                .code(0L)
                .data(
                    AuthCreateGuestResponse.Data.builder()
                        .token("token")
                        .guestId("guest_id")
                        .isNewGuest(true)
                        .build()
                )
                .message("message")
                .build()

        assertThat(authCreateGuestResponse.code()).isEqualTo(0L)
        assertThat(authCreateGuestResponse.data())
            .isEqualTo(
                AuthCreateGuestResponse.Data.builder()
                    .token("token")
                    .guestId("guest_id")
                    .isNewGuest(true)
                    .build()
            )
        assertThat(authCreateGuestResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCreateGuestResponse =
            AuthCreateGuestResponse.builder()
                .code(0L)
                .data(
                    AuthCreateGuestResponse.Data.builder()
                        .token("token")
                        .guestId("guest_id")
                        .isNewGuest(true)
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedAuthCreateGuestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCreateGuestResponse),
                jacksonTypeRef<AuthCreateGuestResponse>(),
            )

        assertThat(roundtrippedAuthCreateGuestResponse).isEqualTo(authCreateGuestResponse)
    }
}
