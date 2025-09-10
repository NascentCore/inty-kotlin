// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription.admin

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
import com.inty.api.models.api.v1.subscription.admin.plans.PlanCreateParams
import com.inty.api.models.api.v1.subscription.admin.plans.PlanCreateResponse
import com.inty.api.models.api.v1.subscription.admin.plans.PlanListParams
import com.inty.api.models.api.v1.subscription.admin.plans.PlanListResponse

class PlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanServiceAsync {

    private val withRawResponse: PlanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlanServiceAsync =
        PlanServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions,
    ): PlanCreateResponse =
        // post /api/v1/subscription/admin/plans
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: PlanListParams,
        requestOptions: RequestOptions,
    ): PlanListResponse =
        // get /api/v1/subscription/admin/plans
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlanServiceAsync.WithRawResponse =
            PlanServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PlanCreateResponse> =
            jsonHandler<PlanCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "admin", "plans")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PlanListResponse> =
            jsonHandler<PlanListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "admin", "plans")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
