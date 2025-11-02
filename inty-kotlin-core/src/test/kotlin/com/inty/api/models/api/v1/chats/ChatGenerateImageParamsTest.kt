// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatGenerateImageParamsTest {

    @Test
    fun create() {
        ChatGenerateImageParams.builder()
            .agentId("agent_id")
            .messageId(0L)
            .historyCount(0L)
            .requestId("request_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ChatGenerateImageParams.builder().agentId("agent_id").messageId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChatGenerateImageParams.builder()
                .agentId("agent_id")
                .messageId(0L)
                .historyCount(0L)
                .requestId("request_id")
                .build()

        val body = params._body()

        assertThat(body.messageId()).isEqualTo(0L)
        assertThat(body.historyCount()).isEqualTo(0L)
        assertThat(body.requestId()).isEqualTo("request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ChatGenerateImageParams.builder().agentId("agent_id").messageId(0L).build()

        val body = params._body()

        assertThat(body.messageId()).isEqualTo(0L)
    }
}
