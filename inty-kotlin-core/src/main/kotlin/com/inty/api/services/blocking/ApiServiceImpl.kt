// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.api.V1Service
import com.inty.api.services.blocking.api.V1ServiceImpl

class ApiServiceImpl internal constructor(private val clientOptions: ClientOptions) : ApiService {

    private val withRawResponse: ApiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): ApiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiService =
        ApiServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApiService.WithRawResponse =
            ApiServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
