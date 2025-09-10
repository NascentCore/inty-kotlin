// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGetMessagesParamsTest {

    @Test
    fun create() {
        AgentGetMessagesParams.builder()
            .agentId("agent_id")
            .limit(1L)
            .offset(0L)
            .order("desc")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentGetMessagesParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AgentGetMessagesParams.builder()
                .agentId("agent_id")
                .limit(1L)
                .offset(0L)
                .order("desc")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("order", "desc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentGetMessagesParams.builder().agentId("agent_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
