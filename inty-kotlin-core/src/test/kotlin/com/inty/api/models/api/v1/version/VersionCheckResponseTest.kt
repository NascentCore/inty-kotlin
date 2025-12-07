// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.version

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionCheckResponseTest {

    @Test
    fun create() {
        val versionCheckResponse =
            VersionCheckResponse.builder()
                .code(0L)
                .data(
                    VersionCheckResponse.Data.builder()
                        .changelog("changelog")
                        .currentVersion("current_version")
                        .downloadUrl("download_url")
                        .error("error")
                        .forceUpdate(true)
                        .addForceUpdateReason("string")
                        .latestVersion("latest_version")
                        .latestVersionCode(0L)
                        .message("message")
                        .minimumVersion("minimum_version")
                        .reminderAction(VersionCheckResponse.Data.ReminderAction.NONE)
                        .updateRequired(true)
                        .build()
                )
                .message("message")
                .build()

        assertThat(versionCheckResponse.code()).isEqualTo(0L)
        assertThat(versionCheckResponse.data())
            .isEqualTo(
                VersionCheckResponse.Data.builder()
                    .changelog("changelog")
                    .currentVersion("current_version")
                    .downloadUrl("download_url")
                    .error("error")
                    .forceUpdate(true)
                    .addForceUpdateReason("string")
                    .latestVersion("latest_version")
                    .latestVersionCode(0L)
                    .message("message")
                    .minimumVersion("minimum_version")
                    .reminderAction(VersionCheckResponse.Data.ReminderAction.NONE)
                    .updateRequired(true)
                    .build()
            )
        assertThat(versionCheckResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionCheckResponse =
            VersionCheckResponse.builder()
                .code(0L)
                .data(
                    VersionCheckResponse.Data.builder()
                        .changelog("changelog")
                        .currentVersion("current_version")
                        .downloadUrl("download_url")
                        .error("error")
                        .forceUpdate(true)
                        .addForceUpdateReason("string")
                        .latestVersion("latest_version")
                        .latestVersionCode(0L)
                        .message("message")
                        .minimumVersion("minimum_version")
                        .reminderAction(VersionCheckResponse.Data.ReminderAction.NONE)
                        .updateRequired(true)
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedVersionCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionCheckResponse),
                jacksonTypeRef<VersionCheckResponse>(),
            )

        assertThat(roundtrippedVersionCheckResponse).isEqualTo(versionCheckResponse)
    }
}
