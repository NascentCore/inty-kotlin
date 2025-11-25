// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.v2.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatSendMessageResponseTest {

    @Test
    fun create() {
        val chatSendMessageResponse =
            ChatSendMessageResponse.builder()
                .code(0L)
                .data(JsonValue.from(mapOf<String, Any>()))
                .message("message")
                .build()

        assertThat(chatSendMessageResponse.code()).isEqualTo(0L)
        assertThat(chatSendMessageResponse._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(chatSendMessageResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatSendMessageResponse =
            ChatSendMessageResponse.builder()
                .code(0L)
                .data(JsonValue.from(mapOf<String, Any>()))
                .message("message")
                .build()

        val roundtrippedChatSendMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatSendMessageResponse),
                jacksonTypeRef<ChatSendMessageResponse>(),
            )

        assertThat(roundtrippedChatSendMessageResponse).isEqualTo(chatSendMessageResponse)
    }
}
