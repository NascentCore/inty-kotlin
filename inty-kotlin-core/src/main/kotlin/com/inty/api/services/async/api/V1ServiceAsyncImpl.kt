// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api

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
import com.inty.api.core.http.multipartFormData
import com.inty.api.core.http.parseable
import com.inty.api.core.prepareAsync
import com.inty.api.models.api.v1.V1ListNotificationsParams
import com.inty.api.models.api.v1.V1ListNotificationsResponse
import com.inty.api.models.api.v1.V1UploadImageParams
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.async.api.v1.AiServiceAsync
import com.inty.api.services.async.api.v1.AiServiceAsyncImpl
import com.inty.api.services.async.api.v1.AuthServiceAsync
import com.inty.api.services.async.api.v1.AuthServiceAsyncImpl
import com.inty.api.services.async.api.v1.ChatServiceAsync
import com.inty.api.services.async.api.v1.ChatServiceAsyncImpl
import com.inty.api.services.async.api.v1.ReportServiceAsync
import com.inty.api.services.async.api.v1.ReportServiceAsyncImpl
import com.inty.api.services.async.api.v1.SettingServiceAsync
import com.inty.api.services.async.api.v1.SettingServiceAsyncImpl
import com.inty.api.services.async.api.v1.SubscriptionServiceAsync
import com.inty.api.services.async.api.v1.SubscriptionServiceAsyncImpl
import com.inty.api.services.async.api.v1.UserServiceAsync
import com.inty.api.services.async.api.v1.UserServiceAsyncImpl
import com.inty.api.services.async.api.v1.VersionServiceAsync
import com.inty.api.services.async.api.v1.VersionServiceAsyncImpl

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val report: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    private val ai: AiServiceAsync by lazy { AiServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    private val subscription: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    private val version: VersionServiceAsync by lazy { VersionServiceAsyncImpl(clientOptions) }

    private val chats: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun auth(): AuthServiceAsync = auth

    override fun users(): UserServiceAsync = users

    override fun report(): ReportServiceAsync = report

    override fun ai(): AiServiceAsync = ai

    override fun settings(): SettingServiceAsync = settings

    override fun subscription(): SubscriptionServiceAsync = subscription

    override fun version(): VersionServiceAsync = version

    override fun chats(): ChatServiceAsync = chats

    override suspend fun listNotifications(
        params: V1ListNotificationsParams,
        requestOptions: RequestOptions,
    ): V1ListNotificationsResponse =
        // get /api/v1/notifications/
        withRawResponse().listNotifications(params, requestOptions).parse()

    override suspend fun uploadImage(
        params: V1UploadImageParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // post /api/v1/images
        withRawResponse().uploadImage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val auth: AuthServiceAsync.WithRawResponse by lazy {
            AuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ai: AiServiceAsync.WithRawResponse by lazy {
            AiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscription: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chats: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun report(): ReportServiceAsync.WithRawResponse = report

        override fun ai(): AiServiceAsync.WithRawResponse = ai

        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        override fun subscription(): SubscriptionServiceAsync.WithRawResponse = subscription

        override fun version(): VersionServiceAsync.WithRawResponse = version

        override fun chats(): ChatServiceAsync.WithRawResponse = chats

        private val listNotificationsHandler: Handler<V1ListNotificationsResponse> =
            jsonHandler<V1ListNotificationsResponse>(clientOptions.jsonMapper)

        override suspend fun listNotifications(
            params: V1ListNotificationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListNotificationsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "notifications", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listNotificationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadImageHandler: Handler<ApiResponseDict> =
            jsonHandler<ApiResponseDict>(clientOptions.jsonMapper)

        override suspend fun uploadImage(
            params: V1UploadImageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "images")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadImageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
