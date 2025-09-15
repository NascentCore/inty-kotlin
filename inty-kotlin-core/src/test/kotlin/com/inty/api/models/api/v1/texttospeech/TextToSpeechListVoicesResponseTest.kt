// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.texttospeech

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechListVoicesResponseTest {

    @Test
    fun create() {
        val textToSpeechListVoicesResponse =
            TextToSpeechListVoicesResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textToSpeechListVoicesResponse =
            TextToSpeechListVoicesResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedTextToSpeechListVoicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textToSpeechListVoicesResponse),
                jacksonTypeRef<TextToSpeechListVoicesResponse>(),
            )

        assertThat(roundtrippedTextToSpeechListVoicesResponse)
            .isEqualTo(textToSpeechListVoicesResponse)
    }
}
