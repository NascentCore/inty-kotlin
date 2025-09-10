// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGetSubscriptionStatusParamsTest {

    @Test
    fun create() {
        UserGetSubscriptionStatusParams.builder().userId("user_id").build()
    }

    @Test
    fun pathParams() {
        val params = UserGetSubscriptionStatusParams.builder().userId("user_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
