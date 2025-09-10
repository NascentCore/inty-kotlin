// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

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
import com.inty.api.models.api.v1.auth.AuthCreateGuestParams
import com.inty.api.models.api.v1.auth.AuthCreateGuestResponse
import com.inty.api.services.blocking.api.v1.auth.GoogleService
import com.inty.api.services.blocking.api.v1.auth.GoogleServiceImpl

class AuthServiceImpl internal constructor(private val clientOptions: ClientOptions) : AuthService {

    private val withRawResponse: AuthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val google: GoogleService by lazy { GoogleServiceImpl(clientOptions) }

    override fun withRawResponse(): AuthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService =
        AuthServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun google(): GoogleService = google

    override fun createGuest(
        params: AuthCreateGuestParams,
        requestOptions: RequestOptions,
    ): AuthCreateGuestResponse =
        // post /api/v1/auth/guest
        withRawResponse().createGuest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val google: GoogleService.WithRawResponse by lazy {
            GoogleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthService.WithRawResponse =
            AuthServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun google(): GoogleService.WithRawResponse = google

        private val createGuestHandler: Handler<AuthCreateGuestResponse> =
            jsonHandler<AuthCreateGuestResponse>(clientOptions.jsonMapper)

        override fun createGuest(
            params: AuthCreateGuestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthCreateGuestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "auth", "guest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createGuestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
