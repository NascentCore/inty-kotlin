// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsTest {

    @Test
    fun create() {
        val settings =
            Settings.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .language("language")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voiceEnabled(true)
                .build()

        assertThat(settings.id()).isEqualTo("id")
        assertThat(settings.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settings.userId()).isEqualTo("user_id")
        assertThat(settings.language()).isEqualTo("language")
        assertThat(settings.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settings.voiceEnabled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settings =
            Settings.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .language("language")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voiceEnabled(true)
                .build()

        val roundtrippedSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settings),
                jacksonTypeRef<Settings>(),
            )

        assertThat(roundtrippedSettings).isEqualTo(settings)
    }
}
