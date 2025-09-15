// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateSpeechResponseTest {

    @Test
    fun create() {
        val textToSpeechGenerateSpeechResponse =
            TextToSpeechGenerateSpeechResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textToSpeechGenerateSpeechResponse =
            TextToSpeechGenerateSpeechResponse.builder().build()

        val roundtrippedTextToSpeechGenerateSpeechResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textToSpeechGenerateSpeechResponse),
                jacksonTypeRef<TextToSpeechGenerateSpeechResponse>(),
            )

        assertThat(roundtrippedTextToSpeechGenerateSpeechResponse)
            .isEqualTo(textToSpeechGenerateSpeechResponse)
    }
}
