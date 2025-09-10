// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import com.inty.api.models.api.v1.subscription.admin.plans.SubscriptionPlan
import com.inty.api.models.api.v1.subscription.admin.plans.SubscriptionPlanType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionVerifyResponseTest {

    @Test
    fun create() {
        val subscriptionVerifyResponse =
            SubscriptionVerifyResponse.builder()
                .code(0L)
                .data(
                    SubscriptionVerifyResponse.Data.builder()
                        .isValid(true)
                        .isVerified(true)
                        .message("message")
                        .errorCode("error_code")
                        .subscription(
                            UserSubscription.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .planId("plan_id")
                                .userId("user_id")
                                .autoRenew(true)
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .extraData(
                                    UserSubscription.ExtraData.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .googlePlayOrderId("google_play_order_id")
                                .googlePlayPurchaseToken("google_play_purchase_token")
                                .googlePlaySubscriptionId("google_play_subscription_id")
                                .plan(
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
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(UserSubscription.Status.ACTIVE)
                                .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        assertThat(subscriptionVerifyResponse.code()).isEqualTo(0L)
        assertThat(subscriptionVerifyResponse.data())
            .isEqualTo(
                SubscriptionVerifyResponse.Data.builder()
                    .isValid(true)
                    .isVerified(true)
                    .message("message")
                    .errorCode("error_code")
                    .subscription(
                        UserSubscription.builder()
                            .id("id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planId("plan_id")
                            .userId("user_id")
                            .autoRenew(true)
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .extraData(
                                UserSubscription.ExtraData.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .googlePlayOrderId("google_play_order_id")
                            .googlePlayPurchaseToken("google_play_purchase_token")
                            .googlePlaySubscriptionId("google_play_subscription_id")
                            .plan(
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
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(UserSubscription.Status.ACTIVE)
                            .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(subscriptionVerifyResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionVerifyResponse =
            SubscriptionVerifyResponse.builder()
                .code(0L)
                .data(
                    SubscriptionVerifyResponse.Data.builder()
                        .isValid(true)
                        .isVerified(true)
                        .message("message")
                        .errorCode("error_code")
                        .subscription(
                            UserSubscription.builder()
                                .id("id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .planId("plan_id")
                                .userId("user_id")
                                .autoRenew(true)
                                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .extraData(
                                    UserSubscription.ExtraData.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .googlePlayOrderId("google_play_order_id")
                                .googlePlayPurchaseToken("google_play_purchase_token")
                                .googlePlaySubscriptionId("google_play_subscription_id")
                                .plan(
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
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(UserSubscription.Status.ACTIVE)
                                .trialEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedSubscriptionVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionVerifyResponse),
                jacksonTypeRef<SubscriptionVerifyResponse>(),
            )

        assertThat(roundtrippedSubscriptionVerifyResponse).isEqualTo(subscriptionVerifyResponse)
    }
}
