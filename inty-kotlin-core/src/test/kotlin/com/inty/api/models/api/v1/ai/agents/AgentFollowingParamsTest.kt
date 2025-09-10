// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentFollowingParamsTest {

    @Test
    fun create() {
        AgentFollowingParams.builder().page(1L).pageSize(1L).build()
    }

    @Test
    fun queryParams() {
        val params = AgentFollowingParams.builder().page(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "1").put("page_size", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentFollowingParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
