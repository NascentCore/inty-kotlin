// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import com.inty.api.errors.IntyInvalidDataException
import com.inty.api.models.api.v1.report.ApiResponseDict
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class AgentUpdateChatSettingsResponseTest {

    @Test
    fun ofApiResponseChatSettings() {
        val apiResponseChatSettings =
            AgentUpdateChatSettingsResponse.ApiResponseChatSettings.builder()
                .code(0L)
                .data(
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
                .message("message")
                .build()

        val agentUpdateChatSettingsResponse =
            AgentUpdateChatSettingsResponse.ofApiResponseChatSettings(apiResponseChatSettings)

        assertThat(agentUpdateChatSettingsResponse.apiResponseChatSettings())
            .isEqualTo(apiResponseChatSettings)
        assertThat(agentUpdateChatSettingsResponse.apiResponseDict()).isNull()
    }

    @Test
    fun ofApiResponseChatSettingsRoundtrip() {
        val jsonMapper = jsonMapper()
        val agentUpdateChatSettingsResponse =
            AgentUpdateChatSettingsResponse.ofApiResponseChatSettings(
                AgentUpdateChatSettingsResponse.ApiResponseChatSettings.builder()
                    .code(0L)
                    .data(
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
                    .message("message")
                    .build()
            )

        val roundtrippedAgentUpdateChatSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdateChatSettingsResponse),
                jacksonTypeRef<AgentUpdateChatSettingsResponse>(),
            )

        assertThat(roundtrippedAgentUpdateChatSettingsResponse)
            .isEqualTo(agentUpdateChatSettingsResponse)
    }

    @Test
    fun ofApiResponseDict() {
        val apiResponseDict =
            ApiResponseDict.builder()
                .code(0L)
                .data(
                    ApiResponseDict.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .message("message")
                .build()

        val agentUpdateChatSettingsResponse =
            AgentUpdateChatSettingsResponse.ofApiResponseDict(apiResponseDict)

        assertThat(agentUpdateChatSettingsResponse.apiResponseChatSettings()).isNull()
        assertThat(agentUpdateChatSettingsResponse.apiResponseDict()).isEqualTo(apiResponseDict)
    }

    @Test
    fun ofApiResponseDictRoundtrip() {
        val jsonMapper = jsonMapper()
        val agentUpdateChatSettingsResponse =
            AgentUpdateChatSettingsResponse.ofApiResponseDict(
                ApiResponseDict.builder()
                    .code(0L)
                    .data(
                        ApiResponseDict.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .message("message")
                    .build()
            )

        val roundtrippedAgentUpdateChatSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdateChatSettingsResponse),
                jacksonTypeRef<AgentUpdateChatSettingsResponse>(),
            )

        assertThat(roundtrippedAgentUpdateChatSettingsResponse)
            .isEqualTo(agentUpdateChatSettingsResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val agentUpdateChatSettingsResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<AgentUpdateChatSettingsResponse>())

        val e =
            assertThrows<IntyInvalidDataException> { agentUpdateChatSettingsResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
