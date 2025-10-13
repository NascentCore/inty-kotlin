// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.v2

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.v2.chat.ChatSendMessageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun sendMessage() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.v2().chat()

        val response =
            chatServiceAsync.sendMessage(
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
