// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiResponseUsageStatisticsTest {

    @Test
    fun create() {
        val apiResponseUsageStatistics =
            ApiResponseUsageStatistics.builder()
                .code(0L)
                .data(
                    ApiResponseUsageStatistics.Data.builder()
                        .agentCount(0L)
                        .agentLimit(0L)
                        .chat24hCount(0L)
                        .chat24hLimit(0L)
                        .todayChatCount(0L)
                        .todayLimit(0L)
                        .totalChatCount(0L)
                        .totalChatLimit(0L)
                        .addUsageHistory(
                            ApiResponseUsageStatistics.Data.UsageHistory.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageType("usage_type")
                                .userId("user_id")
                                .extraData(
                                    ApiResponseUsageStatistics.Data.UsageHistory.ExtraData.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .subscriptionId("subscription_id")
                                .usageCount(0L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        assertThat(apiResponseUsageStatistics.code()).isEqualTo(0L)
        assertThat(apiResponseUsageStatistics.data())
            .isEqualTo(
                ApiResponseUsageStatistics.Data.builder()
                    .agentCount(0L)
                    .agentLimit(0L)
                    .chat24hCount(0L)
                    .chat24hLimit(0L)
                    .todayChatCount(0L)
                    .todayLimit(0L)
                    .totalChatCount(0L)
                    .totalChatLimit(0L)
                    .addUsageHistory(
                        ApiResponseUsageStatistics.Data.UsageHistory.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usageDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .usageType("usage_type")
                            .userId("user_id")
                            .extraData(
                                ApiResponseUsageStatistics.Data.UsageHistory.ExtraData.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .subscriptionId("subscription_id")
                            .usageCount(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(apiResponseUsageStatistics.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiResponseUsageStatistics =
            ApiResponseUsageStatistics.builder()
                .code(0L)
                .data(
                    ApiResponseUsageStatistics.Data.builder()
                        .agentCount(0L)
                        .agentLimit(0L)
                        .chat24hCount(0L)
                        .chat24hLimit(0L)
                        .todayChatCount(0L)
                        .todayLimit(0L)
                        .totalChatCount(0L)
                        .totalChatLimit(0L)
                        .addUsageHistory(
                            ApiResponseUsageStatistics.Data.UsageHistory.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .usageType("usage_type")
                                .userId("user_id")
                                .extraData(
                                    ApiResponseUsageStatistics.Data.UsageHistory.ExtraData.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .subscriptionId("subscription_id")
                                .usageCount(0L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedApiResponseUsageStatistics =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiResponseUsageStatistics),
                jacksonTypeRef<ApiResponseUsageStatistics>(),
            )

        assertThat(roundtrippedApiResponseUsageStatistics).isEqualTo(apiResponseUsageStatistics)
    }
}
