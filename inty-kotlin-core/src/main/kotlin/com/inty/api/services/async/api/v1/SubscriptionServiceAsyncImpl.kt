// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.handlers.errorBodyHandler
import com.inty.api.core.handlers.errorHandler
import com.inty.api.core.handlers.jsonHandler
import com.inty.api.core.http.HttpMethod
import com.inty.api.core.http.HttpRequest
import com.inty.api.core.http.HttpResponse
import com.inty.api.core.http.HttpResponse.Handler
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.core.http.json
import com.inty.api.core.http.parseable
import com.inty.api.core.prepareAsync
import com.inty.api.models.api.v1.subscription.ApiResponseSubscriptionStatus
import com.inty.api.models.api.v1.subscription.ApiResponseUsageStatistics
import com.inty.api.models.api.v1.subscription.SubscriptionGetStatusParams
import com.inty.api.models.api.v1.subscription.SubscriptionGetUsageParams
import com.inty.api.models.api.v1.subscription.SubscriptionListPlansParams
import com.inty.api.models.api.v1.subscription.SubscriptionListPlansResponse
import com.inty.api.models.api.v1.subscription.SubscriptionVerifyParams
import com.inty.api.models.api.v1.subscription.SubscriptionVerifyResponse
import com.inty.api.services.async.api.v1.subscription.AdminServiceAsync
import com.inty.api.services.async.api.v1.subscription.AdminServiceAsyncImpl

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val admin: AdminServiceAsync by lazy { AdminServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionServiceAsync =
        SubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun admin(): AdminServiceAsync = admin

    override suspend fun getStatus(
        params: SubscriptionGetStatusParams,
        requestOptions: RequestOptions,
    ): ApiResponseSubscriptionStatus =
        // get /api/v1/subscription/status
        withRawResponse().getStatus(params, requestOptions).parse()

    override suspend fun getUsage(
        params: SubscriptionGetUsageParams,
        requestOptions: RequestOptions,
    ): ApiResponseUsageStatistics =
        // get /api/v1/subscription/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    override suspend fun listPlans(
        params: SubscriptionListPlansParams,
        requestOptions: RequestOptions,
    ): SubscriptionListPlansResponse =
        // get /api/v1/subscription/plans
        withRawResponse().listPlans(params, requestOptions).parse()

    override suspend fun verify(
        params: SubscriptionVerifyParams,
        requestOptions: RequestOptions,
    ): SubscriptionVerifyResponse =
        // post /api/v1/subscription/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val admin: AdminServiceAsync.WithRawResponse by lazy {
            AdminServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionServiceAsync.WithRawResponse =
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun admin(): AdminServiceAsync.WithRawResponse = admin

        private val getStatusHandler: Handler<ApiResponseSubscriptionStatus> =
            jsonHandler<ApiResponseSubscriptionStatus>(clientOptions.jsonMapper)

        override suspend fun getStatus(
            params: SubscriptionGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseSubscriptionStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUsageHandler: Handler<ApiResponseUsageStatistics> =
            jsonHandler<ApiResponseUsageStatistics>(clientOptions.jsonMapper)

        override suspend fun getUsage(
            params: SubscriptionGetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseUsageStatistics> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPlansHandler: Handler<SubscriptionListPlansResponse> =
            jsonHandler<SubscriptionListPlansResponse>(clientOptions.jsonMapper)

        override suspend fun listPlans(
            params: SubscriptionListPlansParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListPlansResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "plans")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPlansHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<SubscriptionVerifyResponse> =
            jsonHandler<SubscriptionVerifyResponse>(clientOptions.jsonMapper)

        override suspend fun verify(
            params: SubscriptionVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionVerifyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "verify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
