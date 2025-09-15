// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRecommendParamsTest {

    @Test
    fun create() {
        AgentRecommendParams.builder()
            .page(1L)
            .pageSize(1L)
            .sort(AgentRecommendParams.Sort.CREATED_ASC)
            .sortSeed("sort_seed")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentRecommendParams.builder()
                .page(1L)
                .pageSize(1L)
                .sort(AgentRecommendParams.Sort.CREATED_ASC)
                .sortSeed("sort_seed")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("sort", "created_asc")
                    .put("sort_seed", "sort_seed")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentRecommendParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
