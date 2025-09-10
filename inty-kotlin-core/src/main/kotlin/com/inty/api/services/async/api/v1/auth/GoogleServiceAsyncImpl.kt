// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.auth

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
import com.inty.api.models.api.v1.auth.google.GoogleLoginParams
import com.inty.api.models.api.v1.auth.google.GoogleLoginResponse

class GoogleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GoogleServiceAsync {

    private val withRawResponse: GoogleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GoogleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GoogleServiceAsync =
        GoogleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun login(
        params: GoogleLoginParams,
        requestOptions: RequestOptions,
    ): GoogleLoginResponse =
        // post /api/v1/auth/google/login
        withRawResponse().login(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GoogleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): GoogleServiceAsync.WithRawResponse =
            GoogleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val loginHandler: Handler<GoogleLoginResponse> =
            jsonHandler<GoogleLoginResponse>(clientOptions.jsonMapper)

        override suspend fun login(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
