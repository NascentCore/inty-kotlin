// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatDeleteParamsTest {

    @Test
    fun create() {
        ChatDeleteParams.builder().chatId("chat_id").build()
    }

    @Test
    fun pathParams() {
        val params = ChatDeleteParams.builder().chatId("chat_id").build()

        assertThat(params._pathParam(0)).isEqualTo("chat_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
