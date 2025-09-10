// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.chats

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getMessages() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.api().v1().chats().agents()

        val response =
            agentServiceAsync.getMessages(
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
    suspend fun getSettings() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.api().v1().chats().agents()

        val chatSettings = agentServiceAsync.getSettings("agent_id")

        chatSettings.validate()
    }
}
