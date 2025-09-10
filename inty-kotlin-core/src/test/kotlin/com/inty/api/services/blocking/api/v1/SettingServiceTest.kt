// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val settingService = client.api().v1().settings()

        val settings = settingService.retrieve()

        settings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val settingService = client.api().v1().settings()

        val settings =
            settingService.update(
                SettingUpdateParams.builder().language("language").voiceEnabled(true).build()
            )

        settings.validate()
    }
}
