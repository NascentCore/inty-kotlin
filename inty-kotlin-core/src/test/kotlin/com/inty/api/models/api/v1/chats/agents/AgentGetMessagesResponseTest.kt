// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGetMessagesResponseTest {

    @Test
    fun create() {
        val agentGetMessagesResponse = AgentGetMessagesResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGetMessagesResponse = AgentGetMessagesResponse.builder().build()

        val roundtrippedAgentGetMessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGetMessagesResponse),
                jacksonTypeRef<AgentGetMessagesResponse>(),
            )

        assertThat(roundtrippedAgentGetMessagesResponse).isEqualTo(agentGetMessagesResponse)
    }
}
