// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TextToSpeechServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listVoices() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val textToSpeechService = client.api().v1().textToSpeech()

        val response =
            textToSpeechService.listVoices(
                TextToSpeechListVoicesParams.builder()
                    .category("category")
                    .pageSize(1L)
                    .provider("provider")
                    .search("search")
                    .voiceType("voice_type")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
