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
                .data(
                    ChatSendMessageResponse.Data.builder()
                        .id("id")
                        .addChoice(
                            ChatSendMessageResponse.Data.Choice.builder()
                                .finishReason("finish_reason")
                                .index(0L)
                                .message(
                                    ChatSendMessageResponse.Data.Choice.Message.builder()
                                        .content("content")
                                        .role("role")
                                        .id(0L)
                                        .audioUrl("audio_url")
                                        .metaData(
                                            ChatSendMessageResponse.Data.Choice.Message.MetaData
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .timestamp("timestamp")
                                        .build()
                                )
                                .build()
                        )
                        .created(0L)
                        .model("model")
                        .usage(
                            ChatSendMessageResponse.Data.Usage.builder()
                                .completionTokens(0L)
                                .promptTokens(0L)
                                .totalTokens(0L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        assertThat(chatSendMessageResponse.code()).isEqualTo(0L)
        assertThat(chatSendMessageResponse.data())
            .isEqualTo(
                ChatSendMessageResponse.Data.builder()
                    .id("id")
                    .addChoice(
                        ChatSendMessageResponse.Data.Choice.builder()
                            .finishReason("finish_reason")
                            .index(0L)
                            .message(
                                ChatSendMessageResponse.Data.Choice.Message.builder()
                                    .content("content")
                                    .role("role")
                                    .id(0L)
                                    .audioUrl("audio_url")
                                    .metaData(
                                        ChatSendMessageResponse.Data.Choice.Message.MetaData
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .timestamp("timestamp")
                                    .build()
                            )
                            .build()
                    )
                    .created(0L)
                    .model("model")
                    .usage(
                        ChatSendMessageResponse.Data.Usage.builder()
                            .completionTokens(0L)
                            .promptTokens(0L)
                            .totalTokens(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(chatSendMessageResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatSendMessageResponse =
            ChatSendMessageResponse.builder()
                .code(0L)
                .data(
                    ChatSendMessageResponse.Data.builder()
                        .id("id")
                        .addChoice(
                            ChatSendMessageResponse.Data.Choice.builder()
                                .finishReason("finish_reason")
                                .index(0L)
                                .message(
                                    ChatSendMessageResponse.Data.Choice.Message.builder()
                                        .content("content")
                                        .role("role")
                                        .id(0L)
                                        .audioUrl("audio_url")
                                        .metaData(
                                            ChatSendMessageResponse.Data.Choice.Message.MetaData
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .timestamp("timestamp")
                                        .build()
                                )
                                .build()
                        )
                        .created(0L)
                        .model("model")
                        .usage(
                            ChatSendMessageResponse.Data.Usage.builder()
                                .completionTokens(0L)
                                .promptTokens(0L)
                                .totalTokens(0L)
                                .build()
                        )
                        .build()
                )
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
