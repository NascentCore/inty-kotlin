// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.texttospeech

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechGenerateSpeechParamsTest {

    @Test
    fun create() {
        TextToSpeechGenerateSpeechParams.builder().messageId("message_id").build()
    }

    @Test
    fun pathParams() {
        val params = TextToSpeechGenerateSpeechParams.builder().messageId("message_id").build()

        assertThat(params._pathParam(0)).isEqualTo("message_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
