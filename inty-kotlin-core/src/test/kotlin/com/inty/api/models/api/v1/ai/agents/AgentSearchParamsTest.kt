// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSearchParamsTest {

    @Test
    fun create() {
        AgentSearchParams.builder().q("q").page(1L).pageSize(1L).build()
    }

    @Test
    fun queryParams() {
        val params = AgentSearchParams.builder().q("q").page(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("q", "q").put("page", "1").put("page_size", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentSearchParams.builder().q("q").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("q", "q").build())
    }
}
