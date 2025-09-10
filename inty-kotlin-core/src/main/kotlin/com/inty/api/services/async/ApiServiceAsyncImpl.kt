// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.api.V1ServiceAsync
import com.inty.api.services.async.api.V1ServiceAsyncImpl

class ApiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiServiceAsync {

    private val withRawResponse: ApiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ApiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiServiceAsync =
        ApiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApiServiceAsync.WithRawResponse =
            ApiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
