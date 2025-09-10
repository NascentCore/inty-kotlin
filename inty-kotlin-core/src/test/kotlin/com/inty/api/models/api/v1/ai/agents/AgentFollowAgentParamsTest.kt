// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentFollowAgentParamsTest {

    @Test
    fun create() {
        AgentFollowAgentParams.builder().agentId("agent_id").build()
    }

    @Test
    fun pathParams() {
        val params = AgentFollowAgentParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
