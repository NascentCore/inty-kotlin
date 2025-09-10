// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.chats

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getMessages() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().chats().agents()

        val response =
            agentService.getMessages(
                AgentGetMessagesParams.builder()
                    .agentId("agent_id")
                    .limit(1L)
                    .offset(0L)
                    .order("desc")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSettings() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().chats().agents()

        val chatSettings = agentService.getSettings("agent_id")

        chatSettings.validate()
    }
}
