// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.plans

import com.inty.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateParamsTest {

    @Test
    fun create() {
        PlanCreateParams.builder()
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
                PlanCreateParams.Features.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .isActive(true)
            .sortOrder(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            PlanCreateParams.builder()
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
                    PlanCreateParams.Features.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .isActive(true)
                .sortOrder(0L)
                .build()

        val body = params._body()

        assertThat(body.googlePlayProductId()).isEqualTo("google_play_product_id")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.planType()).isEqualTo(SubscriptionPlanType.MONTHLY)
        assertThat(body.price()).isEqualTo(0.0)
        assertThat(body.agentCreationLimit()).isEqualTo(0L)
        assertThat(body.backgroundGenerationLimitPerDay()).isEqualTo(0L)
        assertThat(body.chatLimitPerDay()).isEqualTo(0L)
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.discountRate()).isEqualTo(0.0)
        assertThat(body.features())
            .isEqualTo(
                PlanCreateParams.Features.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.isActive()).isEqualTo(true)
        assertThat(body.sortOrder()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .googlePlayProductId("google_play_product_id")
                .name("name")
                .planType(SubscriptionPlanType.MONTHLY)
                .price(0.0)
                .build()

        val body = params._body()

        assertThat(body.googlePlayProductId()).isEqualTo("google_play_product_id")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.planType()).isEqualTo(SubscriptionPlanType.MONTHLY)
        assertThat(body.price()).isEqualTo(0.0)
    }
}
