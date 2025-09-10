// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.api.v1.ai.AgentServiceAsync
import com.inty.api.services.async.api.v1.ai.AgentServiceAsyncImpl

class AiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AiServiceAsync {

    private val withRawResponse: AiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiServiceAsync =
        AiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun agents(): AgentServiceAsync = agents

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiServiceAsync.WithRawResponse {

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AiServiceAsync.WithRawResponse =
            AiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun agents(): AgentServiceAsync.WithRawResponse = agents
    }
}
