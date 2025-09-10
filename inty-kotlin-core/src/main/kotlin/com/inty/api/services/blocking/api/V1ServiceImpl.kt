// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api

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
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.V1ListNotificationsParams
import com.inty.api.models.api.v1.V1ListNotificationsResponse
import com.inty.api.models.api.v1.V1UploadImageParams
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.blocking.api.v1.AiService
import com.inty.api.services.blocking.api.v1.AiServiceImpl
import com.inty.api.services.blocking.api.v1.AuthService
import com.inty.api.services.blocking.api.v1.AuthServiceImpl
import com.inty.api.services.blocking.api.v1.ChatService
import com.inty.api.services.blocking.api.v1.ChatServiceImpl
import com.inty.api.services.blocking.api.v1.ReportService
import com.inty.api.services.blocking.api.v1.ReportServiceImpl
import com.inty.api.services.blocking.api.v1.SettingService
import com.inty.api.services.blocking.api.v1.SettingServiceImpl
import com.inty.api.services.blocking.api.v1.SubscriptionService
import com.inty.api.services.blocking.api.v1.SubscriptionServiceImpl
import com.inty.api.services.blocking.api.v1.UserService
import com.inty.api.services.blocking.api.v1.UserServiceImpl
import com.inty.api.services.blocking.api.v1.VersionService
import com.inty.api.services.blocking.api.v1.VersionServiceImpl

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    private val report: ReportService by lazy { ReportServiceImpl(clientOptions) }

    private val ai: AiService by lazy { AiServiceImpl(clientOptions) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    private val subscription: SubscriptionService by lazy { SubscriptionServiceImpl(clientOptions) }

    private val version: VersionService by lazy { VersionServiceImpl(clientOptions) }

    private val chats: ChatService by lazy { ChatServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun auth(): AuthService = auth

    override fun users(): UserService = users

    override fun report(): ReportService = report

    override fun ai(): AiService = ai

    override fun settings(): SettingService = settings

    override fun subscription(): SubscriptionService = subscription

    override fun version(): VersionService = version

    override fun chats(): ChatService = chats

    override fun listNotifications(
        params: V1ListNotificationsParams,
        requestOptions: RequestOptions,
    ): V1ListNotificationsResponse =
        // get /api/v1/notifications/
        withRawResponse().listNotifications(params, requestOptions).parse()

    override fun uploadImage(
        params: V1UploadImageParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // post /api/v1/images
        withRawResponse().uploadImage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val auth: AuthService.WithRawResponse by lazy {
            AuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ai: AiService.WithRawResponse by lazy {
            AiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscription: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chats: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun auth(): AuthService.WithRawResponse = auth

        override fun users(): UserService.WithRawResponse = users

        override fun report(): ReportService.WithRawResponse = report

        override fun ai(): AiService.WithRawResponse = ai

        override fun settings(): SettingService.WithRawResponse = settings

        override fun subscription(): SubscriptionService.WithRawResponse = subscription

        override fun version(): VersionService.WithRawResponse = version

        override fun chats(): ChatService.WithRawResponse = chats

        private val listNotificationsHandler: Handler<V1ListNotificationsResponse> =
            jsonHandler<V1ListNotificationsResponse>(clientOptions.jsonMapper)

        override fun listNotifications(
            params: V1ListNotificationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListNotificationsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "notifications", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun uploadImage(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
