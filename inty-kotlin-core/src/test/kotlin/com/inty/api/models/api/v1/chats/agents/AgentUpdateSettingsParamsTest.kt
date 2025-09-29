// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateSettingsParamsTest {

    @Test
    fun create() {
        AgentUpdateSettingsParams.builder()
            .agentId("agent_id")
            .language("language")
            .premiumMode(true)
            .requestId("request_id")
            .stylePrompt("style_prompt")
            .voiceEnabled(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateSettingsParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateSettingsParams.builder()
                .agentId("agent_id")
                .language("language")
                .premiumMode(true)
                .requestId("request_id")
                .stylePrompt("style_prompt")
                .voiceEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.language()).isEqualTo("language")
        assertThat(body.premiumMode()).isEqualTo(true)
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.stylePrompt()).isEqualTo("style_prompt")
        assertThat(body.voiceEnabled()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateSettingsParams.builder().agentId("agent_id").build()

        val body = params._body()
    }
}
