// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription.admin

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.core.JsonValue
import com.inty.api.models.api.v1.subscription.admin.plans.PlanCreateParams
import com.inty.api.models.api.v1.subscription.admin.plans.PlanListParams
import com.inty.api.models.api.v1.subscription.admin.plans.SubscriptionPlanType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planServiceAsync = client.api().v1().subscription().admin().plans()

        val plan =
            planServiceAsync.create(
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
            )

        plan.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planServiceAsync = client.api().v1().subscription().admin().plans()

        val plans = planServiceAsync.list(PlanListParams.builder().includeInactive(true).build())

        plans.validate()
    }
}
