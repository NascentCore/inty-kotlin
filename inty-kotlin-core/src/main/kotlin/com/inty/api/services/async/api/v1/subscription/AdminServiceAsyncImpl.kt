// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription

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
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundParams
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundResponse
import com.inty.api.services.async.api.v1.subscription.admin.PlanServiceAsync
import com.inty.api.services.async.api.v1.subscription.admin.PlanServiceAsyncImpl
import com.inty.api.services.async.api.v1.subscription.admin.UserServiceAsync
import com.inty.api.services.async.api.v1.subscription.admin.UserServiceAsyncImpl

class AdminServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminServiceAsync {

    private val withRawResponse: AdminServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AdminServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdminServiceAsync =
        AdminServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun plans(): PlanServiceAsync = plans

    override fun users(): UserServiceAsync = users

    override suspend fun processRefund(
        params: AdminProcessRefundParams,
        requestOptions: RequestOptions,
    ): AdminProcessRefundResponse =
        // post /api/v1/subscription/admin/refund
        withRawResponse().processRefund(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdminServiceAsync.WithRawResponse =
            AdminServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        override fun users(): UserServiceAsync.WithRawResponse = users

        private val processRefundHandler: Handler<AdminProcessRefundResponse> =
            jsonHandler<AdminProcessRefundResponse>(clientOptions.jsonMapper)

        override suspend fun processRefund(
            params: AdminProcessRefundParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdminProcessRefundResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscription", "admin", "refund")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { processRefundHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
