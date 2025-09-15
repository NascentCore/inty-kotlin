// File generated from our OpenAPI spec by Stainless.

package com.inty.api.client

import com.inty.api.core.ClientOptions
import com.inty.api.core.getPackageVersion
import com.inty.api.services.blocking.ApiService
import com.inty.api.services.blocking.ApiServiceImpl

class IntyClientImpl(private val clientOptions: ClientOptions) : IntyClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: IntyClientAsync by lazy { IntyClientAsyncImpl(clientOptions) }

    private val withRawResponse: IntyClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val api: ApiService by lazy { ApiServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): IntyClientAsync = async

    override fun withRawResponse(): IntyClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntyClient =
        IntyClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun api(): ApiService = api

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntyClient.WithRawResponse {

        private val api: ApiService.WithRawResponse by lazy {
            ApiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IntyClient.WithRawResponse =
            IntyClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun api(): ApiService.WithRawResponse = api
    }
}
