// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.texttospeech

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextToSpeechListVoicesParamsTest {

    @Test
    fun create() {
        TextToSpeechListVoicesParams.builder()
            .category("category")
            .pageSize(1L)
            .provider("provider")
            .search("search")
            .voiceType("voice_type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TextToSpeechListVoicesParams.builder()
                .category("category")
                .pageSize(1L)
                .provider("provider")
                .search("search")
                .voiceType("voice_type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("category", "category")
                    .put("page_size", "1")
                    .put("provider", "provider")
                    .put("search", "search")
                    .put("voice_type", "voice_type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TextToSpeechListVoicesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
