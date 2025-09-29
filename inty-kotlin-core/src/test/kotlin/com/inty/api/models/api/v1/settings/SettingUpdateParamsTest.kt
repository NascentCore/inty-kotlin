// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpdateParamsTest {

    @Test
    fun create() {
        SettingUpdateParams.builder()
            .language("language")
            .requestId("request_id")
            .voiceEnabled(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            SettingUpdateParams.builder()
                .language("language")
                .requestId("request_id")
                .voiceEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.language()).isEqualTo("language")
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.voiceEnabled()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SettingUpdateParams.builder().build()

        val body = params._body()
    }
}
