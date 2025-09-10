// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.auth

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
import com.inty.api.models.api.v1.auth.google.GoogleLoginParams
import com.inty.api.models.api.v1.auth.google.GoogleLoginResponse

class GoogleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GoogleService {

    private val withRawResponse: GoogleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GoogleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GoogleService =
        GoogleServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun login(
        params: GoogleLoginParams,
        requestOptions: RequestOptions,
    ): GoogleLoginResponse =
        // post /api/v1/auth/google/login
        withRawResponse().login(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GoogleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): GoogleService.WithRawResponse =
            GoogleServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val loginHandler: Handler<GoogleLoginResponse> =
            jsonHandler<GoogleLoginResponse>(clientOptions.jsonMapper)

        override fun login(
            params: GoogleLoginParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GoogleLoginResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "auth", "google", "login")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { loginHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
