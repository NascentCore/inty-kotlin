// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatListParamsTest {

    @Test
    fun create() {
        ChatListParams.builder().limit(0L).skip(0L).build()
    }

    @Test
    fun queryParams() {
        val params = ChatListParams.builder().limit(0L).skip(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "0").put("skip", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChatListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
