// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateCompletionParamsTest {

    @Test
    fun create() {
        ChatCreateCompletionParams.builder()
            .agentId("agent_id")
            .addMessage(
                ChatCreateCompletionParams.Message.builder().content("content").role("role").build()
            )
            .language("language")
            .model("model")
            .stream(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChatCreateCompletionParams.builder()
                .agentId("agent_id")
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("content")
                        .role("role")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChatCreateCompletionParams.builder()
                .agentId("agent_id")
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("content")
                        .role("role")
                        .build()
                )
                .language("language")
                .model("model")
                .stream(true)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCreateCompletionParams.Message.builder().content("content").role("role").build()
            )
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.stream()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatCreateCompletionParams.builder()
                .agentId("agent_id")
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("content")
                        .role("role")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCreateCompletionParams.Message.builder().content("content").role("role").build()
            )
    }
}
