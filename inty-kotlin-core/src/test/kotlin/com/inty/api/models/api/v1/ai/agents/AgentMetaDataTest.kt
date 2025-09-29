// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentMetaDataTest {

    @Test
    fun create() {
        val agentMetaData = AgentMetaData.builder().comment("comment").score(0L).build()

        assertThat(agentMetaData.comment()).isEqualTo("comment")
        assertThat(agentMetaData.score()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentMetaData = AgentMetaData.builder().comment("comment").score(0L).build()

        val roundtrippedAgentMetaData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentMetaData),
                jacksonTypeRef<AgentMetaData>(),
            )

        assertThat(roundtrippedAgentMetaData).isEqualTo(agentMetaData)
    }
}
