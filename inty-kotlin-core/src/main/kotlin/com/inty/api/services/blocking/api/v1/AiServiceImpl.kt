// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.api.v1.ai.AgentService
import com.inty.api.services.blocking.api.v1.ai.AgentServiceImpl

class AiServiceImpl internal constructor(private val clientOptions: ClientOptions) : AiService {

    private val withRawResponse: AiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentService by lazy { AgentServiceImpl(clientOptions) }

    override fun withRawResponse(): AiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiService =
        AiServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun agents(): AgentService = agents

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiService.WithRawResponse {

        private val agents: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AiService.WithRawResponse =
            AiServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun agents(): AgentService.WithRawResponse = agents
    }
}
