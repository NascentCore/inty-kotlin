// File generated from our OpenAPI spec by Stainless.

package com.inty.api.client

import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.getPackageVersion
import com.inty.api.core.handlers.errorBodyHandler
import com.inty.api.core.handlers.errorHandler
import com.inty.api.core.handlers.jsonHandler
import com.inty.api.core.http.HttpMethod
import com.inty.api.core.http.HttpRequest
import com.inty.api.core.http.HttpResponse
import com.inty.api.core.http.HttpResponse.Handler
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.core.http.parseable
import com.inty.api.core.prepareAsync
import com.inty.api.models.ClientHealthCheckParams
import com.inty.api.models.ClientHealthCheckResponse
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

    override suspend fun healthCheck(
        params: ClientHealthCheckParams,
        requestOptions: RequestOptions,
    ): ClientHealthCheckResponse =
        // get /
        withRawResponse().healthCheck(params, requestOptions).parse()

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntyClientAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

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

        private val healthCheckHandler: Handler<ClientHealthCheckResponse> =
            jsonHandler<ClientHealthCheckResponse>(clientOptions.jsonMapper)

        override suspend fun healthCheck(
            params: ClientHealthCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientHealthCheckResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { healthCheckHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
