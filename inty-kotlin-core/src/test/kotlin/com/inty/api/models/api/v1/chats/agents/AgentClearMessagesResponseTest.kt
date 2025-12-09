// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentClearMessagesResponseTest {

    @Test
    fun create() {
        val agentClearMessagesResponse =
            AgentClearMessagesResponse.builder()
                .deletedCount(0L)
                .message("message")
                .success(true)
                .cutoffTimestamp("cutoff_timestamp")
                .deletedTimeRange(
                    AgentClearMessagesResponse.DeletedTimeRange.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .targetMessage(
                    AgentClearMessagesResponse.TargetMessage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(agentClearMessagesResponse.deletedCount()).isEqualTo(0L)
        assertThat(agentClearMessagesResponse.message()).isEqualTo("message")
        assertThat(agentClearMessagesResponse.success()).isEqualTo(true)
        assertThat(agentClearMessagesResponse.cutoffTimestamp()).isEqualTo("cutoff_timestamp")
        assertThat(agentClearMessagesResponse.deletedTimeRange())
            .isEqualTo(
                AgentClearMessagesResponse.DeletedTimeRange.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(agentClearMessagesResponse.targetMessage())
            .isEqualTo(
                AgentClearMessagesResponse.TargetMessage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentClearMessagesResponse =
            AgentClearMessagesResponse.builder()
                .deletedCount(0L)
                .message("message")
                .success(true)
                .cutoffTimestamp("cutoff_timestamp")
                .deletedTimeRange(
                    AgentClearMessagesResponse.DeletedTimeRange.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .targetMessage(
                    AgentClearMessagesResponse.TargetMessage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAgentClearMessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentClearMessagesResponse),
                jacksonTypeRef<AgentClearMessagesResponse>(),
            )

        assertThat(roundtrippedAgentClearMessagesResponse).isEqualTo(agentClearMessagesResponse)
    }
}
