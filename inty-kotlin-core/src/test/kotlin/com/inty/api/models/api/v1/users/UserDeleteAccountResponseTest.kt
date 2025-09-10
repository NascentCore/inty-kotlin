// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDeleteAccountResponseTest {

    @Test
    fun create() {
        val userDeleteAccountResponse =
            UserDeleteAccountResponse.builder()
                .code(0L)
                .data(
                    UserDeleteAccountResponse.Data.builder()
                        .message("账户删除成功")
                        .success(true)
                        .userId("user_123")
                        .anonymizedFields(listOf("email", "phone", "nickname"))
                        .deletionLogId("del_log_456")
                        .build()
                )
                .message("message")
                .build()

        assertThat(userDeleteAccountResponse.code()).isEqualTo(0L)
        assertThat(userDeleteAccountResponse.data())
            .isEqualTo(
                UserDeleteAccountResponse.Data.builder()
                    .message("账户删除成功")
                    .success(true)
                    .userId("user_123")
                    .anonymizedFields(listOf("email", "phone", "nickname"))
                    .deletionLogId("del_log_456")
                    .build()
            )
        assertThat(userDeleteAccountResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userDeleteAccountResponse =
            UserDeleteAccountResponse.builder()
                .code(0L)
                .data(
                    UserDeleteAccountResponse.Data.builder()
                        .message("账户删除成功")
                        .success(true)
                        .userId("user_123")
                        .anonymizedFields(listOf("email", "phone", "nickname"))
                        .deletionLogId("del_log_456")
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedUserDeleteAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userDeleteAccountResponse),
                jacksonTypeRef<UserDeleteAccountResponse>(),
            )

        assertThat(roundtrippedUserDeleteAccountResponse).isEqualTo(userDeleteAccountResponse)
    }
}
