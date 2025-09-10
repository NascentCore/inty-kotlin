// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionWebhookResponseTest {

    @Test
    fun create() {
        val subscriptionWebhookResponse =
            SubscriptionWebhookResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionWebhookResponse =
            SubscriptionWebhookResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("string"))
                .build()

        val roundtrippedSubscriptionWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionWebhookResponse),
                jacksonTypeRef<SubscriptionWebhookResponse>(),
            )

        assertThat(roundtrippedSubscriptionWebhookResponse).isEqualTo(subscriptionWebhookResponse)
    }
}
