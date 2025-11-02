// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.ai.agents

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.api.v1.ai.agents.imagegeneration.ConfigService
import com.inty.api.services.blocking.api.v1.ai.agents.imagegeneration.ConfigServiceImpl

class ImageGenerationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImageGenerationService {

    private val withRawResponse: ImageGenerationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptions) }

    override fun withRawResponse(): ImageGenerationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageGenerationService =
        ImageGenerationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun config(): ConfigService = config

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageGenerationService.WithRawResponse {

        private val config: ConfigService.WithRawResponse by lazy {
            ConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ImageGenerationService.WithRawResponse =
            ImageGenerationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun config(): ConfigService.WithRawResponse = config
    }
}
