// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListParamsTest {

    @Test
    fun create() {
        AgentListParams.builder().limit(0L).skip(0L).build()
    }

    @Test
    fun queryParams() {
        val params = AgentListParams.builder().limit(0L).skip(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "0").put("skip", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
