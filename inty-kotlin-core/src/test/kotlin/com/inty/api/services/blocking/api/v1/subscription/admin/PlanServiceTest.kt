// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.subscription.admin

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.core.JsonValue
import com.inty.api.models.api.v1.subscription.admin.plans.PlanCreateParams
import com.inty.api.models.api.v1.subscription.admin.plans.PlanListParams
import com.inty.api.models.api.v1.subscription.admin.plans.SubscriptionPlanType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.api().v1().subscription().admin().plans()

        val plan =
            planService.create(
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
                    .requestId("request_id")
                    .sortOrder(0L)
                    .build()
            )

        plan.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.api().v1().subscription().admin().plans()

        val plans = planService.list(PlanListParams.builder().includeInactive(true).build())

        plans.validate()
    }
}
