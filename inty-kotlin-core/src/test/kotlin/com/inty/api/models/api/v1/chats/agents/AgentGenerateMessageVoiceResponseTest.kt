// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGenerateMessageVoiceResponseTest {

    @Test
    fun create() {
        val agentGenerateMessageVoiceResponse = AgentGenerateMessageVoiceResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGenerateMessageVoiceResponse = AgentGenerateMessageVoiceResponse.builder().build()

        val roundtrippedAgentGenerateMessageVoiceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGenerateMessageVoiceResponse),
                jacksonTypeRef<AgentGenerateMessageVoiceResponse>(),
            )

        assertThat(roundtrippedAgentGenerateMessageVoiceResponse)
            .isEqualTo(agentGenerateMessageVoiceResponse)
    }
}
