// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListResponseTest {

    @Test
    fun create() {
        val planListResponse =
            PlanListResponse.builder()
                .code(0L)
                .addData(
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

        assertThat(planListResponse.code()).isEqualTo(0L)
        assertThat(planListResponse.data())
            .containsExactly(
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
        assertThat(planListResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListResponse =
            PlanListResponse.builder()
                .code(0L)
                .addData(
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

        val roundtrippedPlanListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListResponse),
                jacksonTypeRef<PlanListResponse>(),
            )

        assertThat(roundtrippedPlanListResponse).isEqualTo(planListResponse)
    }
}
