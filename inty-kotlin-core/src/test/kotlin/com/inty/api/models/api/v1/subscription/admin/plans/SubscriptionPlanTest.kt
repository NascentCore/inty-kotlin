// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.plans

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPlanTest {

    @Test
    fun create() {
        val subscriptionPlan =
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

        assertThat(subscriptionPlan.id()).isEqualTo("id")
        assertThat(subscriptionPlan.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionPlan.googlePlayProductId()).isEqualTo("google_play_product_id")
        assertThat(subscriptionPlan.name()).isEqualTo("name")
        assertThat(subscriptionPlan.planType()).isEqualTo(SubscriptionPlanType.MONTHLY)
        assertThat(subscriptionPlan.price()).isEqualTo(0.0)
        assertThat(subscriptionPlan.agentCreationLimit()).isEqualTo(0L)
        assertThat(subscriptionPlan.backgroundGenerationLimitPerDay()).isEqualTo(0L)
        assertThat(subscriptionPlan.chatLimitPerDay()).isEqualTo(0L)
        assertThat(subscriptionPlan.currency()).isEqualTo("currency")
        assertThat(subscriptionPlan.description()).isEqualTo("description")
        assertThat(subscriptionPlan.discountRate()).isEqualTo(0.0)
        assertThat(subscriptionPlan.features())
            .isEqualTo(
                SubscriptionPlan.Features.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(subscriptionPlan.isActive()).isEqualTo(true)
        assertThat(subscriptionPlan.sortOrder()).isEqualTo(0L)
        assertThat(subscriptionPlan.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionPlan =
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

        val roundtrippedSubscriptionPlan =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionPlan),
                jacksonTypeRef<SubscriptionPlan>(),
            )

        assertThat(roundtrippedSubscriptionPlan).isEqualTo(subscriptionPlan)
    }
}
