// File generated from our OpenAPI spec by Stainless.

package com.inty.api.client

import com.inty.api.core.ClientOptions
import com.inty.api.core.getPackageVersion
import com.inty.api.services.async.ApiServiceAsync
import com.inty.api.services.async.ApiServiceAsyncImpl

class IntyClientAsyncImpl(private val clientOptions: ClientOptions) : IntyClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: IntyClient by lazy { IntyClientImpl(clientOptions) }

    private val withRawResponse: IntyClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val api: ApiServiceAsync by lazy { ApiServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): IntyClient = sync

    override fun withRawResponse(): IntyClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntyClientAsync =
        IntyClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun api(): ApiServiceAsync = api

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntyClientAsync.WithRawResponse {

        private val api: ApiServiceAsync.WithRawResponse by lazy {
            ApiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IntyClientAsync.WithRawResponse =
            IntyClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun api(): ApiServiceAsync.WithRawResponse = api
    }
}
