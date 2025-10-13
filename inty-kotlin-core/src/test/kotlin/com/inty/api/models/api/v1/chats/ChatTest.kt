// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import com.inty.api.models.api.v1.chats.agents.ChatSettings
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatTest {

    @Test
    fun create() {
        val chat =
            Chat.builder()
                .id("id")
                .agentId("agent_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .agentAvatar("agent_avatar")
                .agentBackground("agent_background")
                .agentIsDeleted(true)
                .agentName("agent_name")
                .lastMessage("last_message")
                .lastMessageTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .settings(
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
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(chat.id()).isEqualTo("id")
        assertThat(chat.agentId()).isEqualTo("agent_id")
        assertThat(chat.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chat.userId()).isEqualTo("user_id")
        assertThat(chat.agentAvatar()).isEqualTo("agent_avatar")
        assertThat(chat.agentBackground()).isEqualTo("agent_background")
        assertThat(chat.agentIsDeleted()).isEqualTo(true)
        assertThat(chat.agentName()).isEqualTo("agent_name")
        assertThat(chat.lastMessage()).isEqualTo("last_message")
        assertThat(chat.lastMessageTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chat.settings())
            .isEqualTo(
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
            )
        assertThat(chat.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chat =
            Chat.builder()
                .id("id")
                .agentId("agent_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .agentAvatar("agent_avatar")
                .agentBackground("agent_background")
                .agentIsDeleted(true)
                .agentName("agent_name")
                .lastMessage("last_message")
                .lastMessageTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .settings(
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
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedChat =
            jsonMapper.readValue(jsonMapper.writeValueAsString(chat), jacksonTypeRef<Chat>())

        assertThat(roundtrippedChat).isEqualTo(chat)
    }
}
