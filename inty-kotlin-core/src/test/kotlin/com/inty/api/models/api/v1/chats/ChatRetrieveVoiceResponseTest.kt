// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatRetrieveVoiceResponseTest {

    @Test
    fun create() {
        val chatRetrieveVoiceResponse = ChatRetrieveVoiceResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatRetrieveVoiceResponse = ChatRetrieveVoiceResponse.builder().build()

        val roundtrippedChatRetrieveVoiceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatRetrieveVoiceResponse),
                jacksonTypeRef<ChatRetrieveVoiceResponse>(),
            )

        assertThat(roundtrippedChatRetrieveVoiceResponse).isEqualTo(chatRetrieveVoiceResponse)
    }
}
