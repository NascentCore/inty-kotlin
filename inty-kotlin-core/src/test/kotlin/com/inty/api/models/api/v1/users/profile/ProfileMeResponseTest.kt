// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileMeResponseTest {

    @Test
    fun create() {
        val profileMeResponse =
            ProfileMeResponse.builder()
                .code(0L)
                .data(
                    User.builder()
                        .id("id")
                        .authType("auth_type")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isActive(true)
                        .readableId("readable_id")
                        .addAction(
                            User.Action.builder()
                                .enabled(true)
                                .type(User.Action.Type.REQUEST_FEEDBACK)
                                .build()
                        )
                        .ageGroup("age_group")
                        .avatar("avatar")
                        .connectorCount(0L)
                        .description("description")
                        .email("email")
                        .followersCount(0L)
                        .gender(Gender.MALE)
                        .isSuperuser(true)
                        .nickname("nickname")
                        .phone("phone")
                        .publicAgentsCount(0L)
                        .systemLanguage("system_language")
                        .totalPublicAgentsFollows(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userPhoto("user_photo")
                        .build()
                )
                .message("message")
                .build()

        assertThat(profileMeResponse.code()).isEqualTo(0L)
        assertThat(profileMeResponse.data())
            .isEqualTo(
                User.builder()
                    .id("id")
                    .authType("auth_type")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isActive(true)
                    .readableId("readable_id")
                    .addAction(
                        User.Action.builder()
                            .enabled(true)
                            .type(User.Action.Type.REQUEST_FEEDBACK)
                            .build()
                    )
                    .ageGroup("age_group")
                    .avatar("avatar")
                    .connectorCount(0L)
                    .description("description")
                    .email("email")
                    .followersCount(0L)
                    .gender(Gender.MALE)
                    .isSuperuser(true)
                    .nickname("nickname")
                    .phone("phone")
                    .publicAgentsCount(0L)
                    .systemLanguage("system_language")
                    .totalPublicAgentsFollows(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userPhoto("user_photo")
                    .build()
            )
        assertThat(profileMeResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileMeResponse =
            ProfileMeResponse.builder()
                .code(0L)
                .data(
                    User.builder()
                        .id("id")
                        .authType("auth_type")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isActive(true)
                        .readableId("readable_id")
                        .addAction(
                            User.Action.builder()
                                .enabled(true)
                                .type(User.Action.Type.REQUEST_FEEDBACK)
                                .build()
                        )
                        .ageGroup("age_group")
                        .avatar("avatar")
                        .connectorCount(0L)
                        .description("description")
                        .email("email")
                        .followersCount(0L)
                        .gender(Gender.MALE)
                        .isSuperuser(true)
                        .nickname("nickname")
                        .phone("phone")
                        .publicAgentsCount(0L)
                        .systemLanguage("system_language")
                        .totalPublicAgentsFollows(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userPhoto("user_photo")
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedProfileMeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileMeResponse),
                jacksonTypeRef<ProfileMeResponse>(),
            )

        assertThat(roundtrippedProfileMeResponse).isEqualTo(profileMeResponse)
    }
}
