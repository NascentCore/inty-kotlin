// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

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
import com.inty.api.models.api.v1.users.UserDeleteAccountParams
import com.inty.api.models.api.v1.users.UserDeleteAccountResponse
import com.inty.api.services.async.api.v1.users.DeletionServiceAsync
import com.inty.api.services.async.api.v1.users.DeletionServiceAsyncImpl
import com.inty.api.services.async.api.v1.users.ProfileServiceAsync
import com.inty.api.services.async.api.v1.users.ProfileServiceAsyncImpl

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val profile: ProfileServiceAsync by lazy { ProfileServiceAsyncImpl(clientOptions) }

    private val deletion: DeletionServiceAsync by lazy { DeletionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun profile(): ProfileServiceAsync = profile

    override fun deletion(): DeletionServiceAsync = deletion

    override suspend fun deleteAccount(
        params: UserDeleteAccountParams,
        requestOptions: RequestOptions,
    ): UserDeleteAccountResponse =
        // post /api/v1/users/delete-account
        withRawResponse().deleteAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val profile: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val deletion: DeletionServiceAsync.WithRawResponse by lazy {
            DeletionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun profile(): ProfileServiceAsync.WithRawResponse = profile

        override fun deletion(): DeletionServiceAsync.WithRawResponse = deletion

        private val deleteAccountHandler: Handler<UserDeleteAccountResponse> =
            jsonHandler<UserDeleteAccountResponse>(clientOptions.jsonMapper)

        override suspend fun deleteAccount(
            params: UserDeleteAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserDeleteAccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users", "delete-account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
