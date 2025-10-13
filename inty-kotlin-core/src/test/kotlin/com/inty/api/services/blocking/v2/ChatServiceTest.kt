// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.v2

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.v2.chat.ChatSendMessageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun sendMessage() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.v2().chat()

        val response =
            chatService.sendMessage(
                ChatSendMessageParams.builder()
                    .agentId("agent_id")
                    .addMessage(
                        ChatSendMessageParams.Message.builder()
                            .content("content")
                            .role("role")
                            .build()
                    )
                    .language("language")
                    .model("model")
                    .requestId("request_id")
                    .stream(true)
                    .build()
            )

        response.validate()
    }
}
