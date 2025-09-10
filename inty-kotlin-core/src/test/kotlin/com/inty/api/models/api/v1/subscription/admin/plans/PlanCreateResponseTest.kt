// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateResponseTest {

    @Test
    fun create() {
        val planCreateResponse =
            PlanCreateResponse.builder()
                .code(0L)
                .data(
                    SubscriptionPlan.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .googlePlayProductId("google_play_product_id")
                        .name("name")
                        .planType(SubscriptionPlanType.MONTHLY)
                        .price(0.0)
                        .agentCreationLimit(0L)
                        .backgroundGenerationLimitPerDay(0L)
                        .chatLimitPerDay(0L)
                        .currency("currency")
                        .description("description")
                        .discountRate(0.0)
                        .features(
                            SubscriptionPlan.Features.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isActive(true)
                        .sortOrder(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .message("message")
                .build()

        assertThat(planCreateResponse.code()).isEqualTo(0L)
        assertThat(planCreateResponse.data())
            .isEqualTo(
                SubscriptionPlan.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .googlePlayProductId("google_play_product_id")
                    .name("name")
                    .planType(SubscriptionPlanType.MONTHLY)
                    .price(0.0)
                    .agentCreationLimit(0L)
                    .backgroundGenerationLimitPerDay(0L)
                    .chatLimitPerDay(0L)
                    .currency("currency")
                    .description("description")
                    .discountRate(0.0)
                    .features(
                        SubscriptionPlan.Features.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .isActive(true)
                    .sortOrder(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(planCreateResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planCreateResponse =
            PlanCreateResponse.builder()
                .code(0L)
                .data(
                    SubscriptionPlan.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .googlePlayProductId("google_play_product_id")
                        .name("name")
                        .planType(SubscriptionPlanType.MONTHLY)
                        .price(0.0)
                        .agentCreationLimit(0L)
                        .backgroundGenerationLimitPerDay(0L)
                        .chatLimitPerDay(0L)
                        .currency("currency")
                        .description("description")
                        .discountRate(0.0)
                        .features(
                            SubscriptionPlan.Features.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isActive(true)
                        .sortOrder(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedPlanCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planCreateResponse),
                jacksonTypeRef<PlanCreateResponse>(),
            )

        assertThat(roundtrippedPlanCreateResponse).isEqualTo(planCreateResponse)
    }
}
