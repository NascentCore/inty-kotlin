// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateParamsTest {

    @Test
    fun create() {
        ChatCreateParams.builder().agentId("agent_id").build()
    }

    @Test
    fun body() {
        val params = ChatCreateParams.builder().agentId("agent_id").build()

        val body = params._body()

        assertThat(body.agentId()).isEqualTo("agent_id")
    }
}
