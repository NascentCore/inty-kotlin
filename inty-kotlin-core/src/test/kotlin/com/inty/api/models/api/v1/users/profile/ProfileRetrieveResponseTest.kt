// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRetrieveResponseTest {

    @Test
    fun create() {
        val profileRetrieveResponse =
            ProfileRetrieveResponse.builder()
                .code(0L)
                .data(
                    User.builder()
                        .id("id")
                        .authType("auth_type")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isActive(true)
                        .readableId("readable_id")
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
                        .build()
                )
                .message("message")
                .build()

        assertThat(profileRetrieveResponse.code()).isEqualTo(0L)
        assertThat(profileRetrieveResponse.data())
            .isEqualTo(
                User.builder()
                    .id("id")
                    .authType("auth_type")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isActive(true)
                    .readableId("readable_id")
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
                    .build()
            )
        assertThat(profileRetrieveResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileRetrieveResponse =
            ProfileRetrieveResponse.builder()
                .code(0L)
                .data(
                    User.builder()
                        .id("id")
                        .authType("auth_type")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isActive(true)
                        .readableId("readable_id")
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
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileRetrieveResponse),
                jacksonTypeRef<ProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedProfileRetrieveResponse).isEqualTo(profileRetrieveResponse)
    }
}
