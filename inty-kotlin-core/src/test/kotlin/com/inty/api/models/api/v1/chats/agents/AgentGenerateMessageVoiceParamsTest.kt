// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGenerateMessageVoiceParamsTest {

    @Test
    fun create() {
        AgentGenerateMessageVoiceParams.builder()
            .agentId("agent_id")
            .messageId("message_id")
            .language("language")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentGenerateMessageVoiceParams.builder()
                .agentId("agent_id")
                .messageId("message_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("message_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AgentGenerateMessageVoiceParams.builder()
                .agentId("agent_id")
                .messageId("message_id")
                .language("language")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("language", "language").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AgentGenerateMessageVoiceParams.builder()
                .agentId("agent_id")
                .messageId("message_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
