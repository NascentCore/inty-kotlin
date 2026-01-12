// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.chats.ChatCreateCompletionParams
import com.inty.api.models.api.v1.chats.ChatCreateParams
import com.inty.api.models.api.v1.chats.ChatGenerateImageParams
import com.inty.api.models.api.v1.chats.ChatListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.api().v1().chats()

        val chat =
            chatServiceAsync.create(
                ChatCreateParams.builder().agentId("agent_id").requestId("request_id").build()
            )

        chat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.api().v1().chats()

        val chats = chatServiceAsync.list(ChatListParams.builder().limit(0L).skip(0L).build())

        chats.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.api().v1().chats()

        val chat = chatServiceAsync.delete("chat_id")

        chat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createCompletion() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.api().v1().chats()

        val apiResponseDict =
            chatServiceAsync.createCompletion(
                ChatCreateCompletionParams.builder()
                    .agentId("agent_id")
                    .addMessage(
                        ChatCreateCompletionParams.Message.builder()
                            .content("content")
                            .role("role")
                            .build()
                    )
                    .language("language")
                    .messageId("message_id")
                    .model("model")
                    .requestId("request_id")
                    .stream(true)
                    .build()
            )

        apiResponseDict.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun generateImage() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.api().v1().chats()

        val response =
            chatServiceAsync.generateImage(
                ChatGenerateImageParams.builder()
                    .agentId("agent_id")
                    .messageId(0L)
                    .historyCount(0L)
                    .model("model")
                    .requestId("request_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieveVoice() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.api().v1().chats()

        val response = chatServiceAsync.retrieveVoice("voice_id")

        response.validate()
    }
}
