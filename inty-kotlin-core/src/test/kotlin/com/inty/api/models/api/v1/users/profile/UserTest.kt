// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun create() {
        val user =
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
                .build()

        assertThat(user.id()).isEqualTo("id")
        assertThat(user.authType()).isEqualTo("auth_type")
        assertThat(user.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.isActive()).isEqualTo(true)
        assertThat(user.readableId()).isEqualTo("readable_id")
        assertThat(user.actions())
            .containsExactly(
                User.Action.builder().enabled(true).type(User.Action.Type.REQUEST_FEEDBACK).build()
            )
        assertThat(user.ageGroup()).isEqualTo("age_group")
        assertThat(user.avatar()).isEqualTo("avatar")
        assertThat(user.connectorCount()).isEqualTo(0L)
        assertThat(user.description()).isEqualTo("description")
        assertThat(user.email()).isEqualTo("email")
        assertThat(user.followersCount()).isEqualTo(0L)
        assertThat(user.gender()).isEqualTo(Gender.MALE)
        assertThat(user.isSuperuser()).isEqualTo(true)
        assertThat(user.nickname()).isEqualTo("nickname")
        assertThat(user.phone()).isEqualTo("phone")
        assertThat(user.publicAgentsCount()).isEqualTo(0L)
        assertThat(user.systemLanguage()).isEqualTo("system_language")
        assertThat(user.totalPublicAgentsFollows()).isEqualTo(0L)
        assertThat(user.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
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
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
