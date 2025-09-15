// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TextToSpeechServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun generateSpeech() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val textToSpeechServiceAsync = client.api().v1().textToSpeech()

        val response = textToSpeechServiceAsync.generateSpeech("message_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listVoices() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val textToSpeechServiceAsync = client.api().v1().textToSpeech()

        val response =
            textToSpeechServiceAsync.listVoices(
                TextToSpeechListVoicesParams.builder()
                    .category("category")
                    .pageSize(1L)
                    .search("search")
                    .voiceType("voice_type")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
