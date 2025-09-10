// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.subscription

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
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundParams
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundResponse
import com.inty.api.services.blocking.api.v1.subscription.admin.PlanService
import com.inty.api.services.blocking.api.v1.subscription.admin.PlanServiceImpl
import com.inty.api.services.blocking.api.v1.subscription.admin.UserService
import com.inty.api.services.blocking.api.v1.subscription.admin.UserServiceImpl

class AdminServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminService {

    private val withRawResponse: AdminService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): AdminService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdminService =
        AdminServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun plans(): PlanService = plans

    override fun users(): UserService = users

    override fun processRefund(
        params: AdminProcessRefundParams,
        requestOptions: RequestOptions,
    ): AdminProcessRefundResponse =
        // post /api/v1/subscription/admin/refund
        withRawResponse().processRefund(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdminService.WithRawResponse =
            AdminServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun plans(): PlanService.WithRawResponse = plans

        override fun users(): UserService.WithRawResponse = users

        private val processRefundHandler: Handler<AdminProcessRefundResponse> =
            jsonHandler<AdminProcessRefundResponse>(clientOptions.jsonMapper)

        override fun processRefund(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
