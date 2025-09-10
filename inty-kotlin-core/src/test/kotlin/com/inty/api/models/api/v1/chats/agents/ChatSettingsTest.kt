// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatSettingsTest {

    @Test
    fun create() {
        val chatSettings =
            ChatSettings.builder()
                .id("id")
                .agentId("agent_id")
                .chatId("chat_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .language("language")
                .premiumMode(true)
                .stylePrompt("style_prompt")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voiceEnabled(true)
                .build()

        assertThat(chatSettings.id()).isEqualTo("id")
        assertThat(chatSettings.agentId()).isEqualTo("agent_id")
        assertThat(chatSettings.chatId()).isEqualTo("chat_id")
        assertThat(chatSettings.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chatSettings.userId()).isEqualTo("user_id")
        assertThat(chatSettings.language()).isEqualTo("language")
        assertThat(chatSettings.premiumMode()).isEqualTo(true)
        assertThat(chatSettings.stylePrompt()).isEqualTo("style_prompt")
        assertThat(chatSettings.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chatSettings.voiceEnabled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatSettings =
            ChatSettings.builder()
                .id("id")
                .agentId("agent_id")
                .chatId("chat_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .language("language")
                .premiumMode(true)
                .stylePrompt("style_prompt")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voiceEnabled(true)
                .build()

        val roundtrippedChatSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatSettings),
                jacksonTypeRef<ChatSettings>(),
            )

        assertThat(roundtrippedChatSettings).isEqualTo(chatSettings)
    }
}
