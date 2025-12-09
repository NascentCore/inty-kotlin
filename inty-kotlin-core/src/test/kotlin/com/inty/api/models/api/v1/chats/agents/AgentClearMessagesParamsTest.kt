// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentClearMessagesParamsTest {

    @Test
    fun create() {
        AgentClearMessagesParams.builder()
            .agentId("agent_id")
            .messageId(123L)
            .requestId("request_id")
            .timestamp("2024-01-01T10:00:00Z")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentClearMessagesParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentClearMessagesParams.builder()
                .agentId("agent_id")
                .messageId(123L)
                .requestId("request_id")
                .timestamp("2024-01-01T10:00:00Z")
                .build()

        val body = params._body()

        assertThat(body.messageId()).isEqualTo(123L)
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.timestamp()).isEqualTo("2024-01-01T10:00:00Z")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentClearMessagesParams.builder().agentId("agent_id").build()

        val body = params._body()
    }
}
