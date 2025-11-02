// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.ai.agents

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.api.v1.ai.agents.imagegeneration.ConfigServiceAsync
import com.inty.api.services.async.api.v1.ai.agents.imagegeneration.ConfigServiceAsyncImpl

class ImageGenerationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ImageGenerationServiceAsync {

    private val withRawResponse: ImageGenerationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val config: ConfigServiceAsync by lazy { ConfigServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ImageGenerationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): ImageGenerationServiceAsync =
        ImageGenerationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun config(): ConfigServiceAsync = config

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageGenerationServiceAsync.WithRawResponse {

        private val config: ConfigServiceAsync.WithRawResponse by lazy {
            ConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ImageGenerationServiceAsync.WithRawResponse =
            ImageGenerationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun config(): ConfigServiceAsync.WithRawResponse = config
    }
}
