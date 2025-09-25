// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatRetrieveVoiceParamsTest {

    @Test
    fun create() {
        ChatRetrieveVoiceParams.builder().voiceId("voice_id").build()
    }

    @Test
    fun pathParams() {
        val params = ChatRetrieveVoiceParams.builder().voiceId("voice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("voice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
