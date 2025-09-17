// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

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
import com.inty.api.models.api.v1.users.profile.ProfileRetrieveParams
import com.inty.api.models.api.v1.users.profile.ProfileRetrieveResponse
import com.inty.api.models.api.v1.users.profile.ProfileUpdateParams
import com.inty.api.models.api.v1.users.profile.User

class ProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileServiceAsync {

    private val withRawResponse: ProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileServiceAsync =
        ProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): ProfileRetrieveResponse =
        // get /api/v1/users/profile
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: ProfileUpdateParams, requestOptions: RequestOptions): User =
        // put /api/v1/users/profile
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProfileServiceAsync.WithRawResponse =
            ProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ProfileRetrieveResponse> =
            jsonHandler<ProfileRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users", "profile")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<User> = jsonHandler<User>(clientOptions.jsonMapper)

        override suspend fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users", "profile")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
