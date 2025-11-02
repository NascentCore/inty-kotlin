// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.chats.ChatCreateCompletionParams
import com.inty.api.models.api.v1.chats.ChatCreateParams
import com.inty.api.models.api.v1.chats.ChatGenerateImageParams
import com.inty.api.models.api.v1.chats.ChatListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.api().v1().chats()

        val chat =
            chatService.create(
                ChatCreateParams.builder().agentId("agent_id").requestId("request_id").build()
            )

        chat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.api().v1().chats()

        val chats = chatService.list(ChatListParams.builder().limit(0L).skip(0L).build())

        chats.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.api().v1().chats()

        val chat = chatService.delete("chat_id")

        chat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.api().v1().chats()

        val apiResponseDict =
            chatService.createCompletion(
                ChatCreateCompletionParams.builder()
                    .agentId("agent_id")
                    .addMessage(
                        ChatCreateCompletionParams.Message.builder()
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

        apiResponseDict.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun generateImage() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.api().v1().chats()

        val response =
            chatService.generateImage(
                ChatGenerateImageParams.builder()
                    .agentId("agent_id")
                    .messageId(0L)
                    .historyCount(0L)
                    .requestId("request_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveVoice() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.api().v1().chats()

        val response = chatService.retrieveVoice("voice_id")

        response.validate()
    }
}
