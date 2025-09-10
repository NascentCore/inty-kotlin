// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.plans

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListParamsTest {

    @Test
    fun create() {
        PlanListParams.builder().includeInactive(true).build()
    }

    @Test
    fun queryParams() {
        val params = PlanListParams.builder().includeInactive(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_inactive", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlanListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
