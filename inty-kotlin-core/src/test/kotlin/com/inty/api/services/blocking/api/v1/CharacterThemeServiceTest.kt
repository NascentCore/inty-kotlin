// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.characterthemes.CharacterThemeListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CharacterThemeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val characterThemeService = client.api().v1().characterThemes()

        val apiResponseListCharacterTheme =
            characterThemeService.list(
                CharacterThemeListParams.builder().includeHidden(true).limit(1L).skip(0L).build()
            )

        apiResponseListCharacterTheme.validate()
    }
}
