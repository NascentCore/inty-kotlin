// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.characterthemes

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterThemeListParamsTest {

    @Test
    fun create() {
        CharacterThemeListParams.builder().includeHidden(true).limit(1L).skip(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            CharacterThemeListParams.builder().includeHidden(true).limit(1L).skip(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_hidden", "true")
                    .put("limit", "1")
                    .put("skip", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CharacterThemeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
