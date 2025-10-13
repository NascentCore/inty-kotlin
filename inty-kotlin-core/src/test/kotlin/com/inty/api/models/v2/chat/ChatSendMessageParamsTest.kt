// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.v2.chat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatSendMessageParamsTest {

    @Test
    fun create() {
        ChatSendMessageParams.builder()
            .agentId("agent_id")
            .addMessage(
                ChatSendMessageParams.Message.builder().content("content").role("role").build()
            )
            .language("language")
            .model("model")
            .requestId("request_id")
            .stream(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChatSendMessageParams.builder()
                .agentId("agent_id")
                .addMessage(
                    ChatSendMessageParams.Message.builder().content("content").role("role").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChatSendMessageParams.builder()
                .agentId("agent_id")
                .addMessage(
                    ChatSendMessageParams.Message.builder().content("content").role("role").build()
                )
                .language("language")
                .model("model")
                .requestId("request_id")
                .stream(true)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatSendMessageParams.Message.builder().content("content").role("role").build()
            )
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.stream()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatSendMessageParams.builder()
                .agentId("agent_id")
                .addMessage(
                    ChatSendMessageParams.Message.builder().content("content").role("role").build()
                )
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatSendMessageParams.Message.builder().content("content").role("role").build()
            )
    }
}
