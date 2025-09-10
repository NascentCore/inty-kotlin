// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.subscription.admin

import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.checkRequired
import com.inty.api.core.handlers.errorBodyHandler
import com.inty.api.core.handlers.errorHandler
import com.inty.api.core.handlers.jsonHandler
import com.inty.api.core.http.HttpMethod
import com.inty.api.core.http.HttpRequest
import com.inty.api.core.http.HttpResponse
import com.inty.api.core.http.HttpResponse.Handler
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.core.http.parseable
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.subscription.ApiResponseSubscriptionStatus
import com.inty.api.models.api.v1.subscription.ApiResponseUsageStatistics
import com.inty.api.models.api.v1.subscription.admin.users.UserGetSubscriptionStatusParams
import com.inty.api.models.api.v1.subscription.admin.users.UserGetUsageStatisticsParams

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getSubscriptionStatus(
        params: UserGetSubscriptionStatusParams,
        requestOptions: RequestOptions,
    ): ApiResponseSubscriptionStatus =
        // get /api/v1/subscription/admin/users/{user_id}/subscription
        withRawResponse().getSubscriptionStatus(params, requestOptions).parse()

    override fun getUsageStatistics(
        params: UserGetUsageStatisticsParams,
        requestOptions: RequestOptions,
    ): ApiResponseUsageStatistics =
        // get /api/v1/subscription/admin/users/{user_id}/usage
        withRawResponse().getUsageStatistics(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val getSubscriptionStatusHandler: Handler<ApiResponseSubscriptionStatus> =
            jsonHandler<ApiResponseSubscriptionStatus>(clientOptions.jsonMapper)

        override fun getSubscriptionStatus(
            params: UserGetSubscriptionStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseSubscriptionStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscription",
                        "admin",
                        "users",
                        params._pathParam(0),
                        "subscription",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSubscriptionStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUsageStatisticsHandler: Handler<ApiResponseUsageStatistics> =
            jsonHandler<ApiResponseUsageStatistics>(clientOptions.jsonMapper)

        override fun getUsageStatistics(
            params: UserGetUsageStatisticsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseUsageStatistics> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "subscription",
                        "admin",
                        "users",
                        params._pathParam(0),
                        "usage",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUsageStatisticsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
