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
import com.inty.api.models.api.v1.users.UserDeleteAccountParams
import com.inty.api.models.api.v1.users.UserDeleteAccountResponse
import com.inty.api.services.blocking.api.v1.users.DeletionService
import com.inty.api.services.blocking.api.v1.users.DeletionServiceImpl
import com.inty.api.services.blocking.api.v1.users.DeviceService
import com.inty.api.services.blocking.api.v1.users.DeviceServiceImpl
import com.inty.api.services.blocking.api.v1.users.ProfileService
import com.inty.api.services.blocking.api.v1.users.ProfileServiceImpl

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val profile: ProfileService by lazy { ProfileServiceImpl(clientOptions) }

    private val device: DeviceService by lazy { DeviceServiceImpl(clientOptions) }

    private val deletion: DeletionService by lazy { DeletionServiceImpl(clientOptions) }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun profile(): ProfileService = profile

    override fun device(): DeviceService = device

    override fun deletion(): DeletionService = deletion

    override fun deleteAccount(
        params: UserDeleteAccountParams,
        requestOptions: RequestOptions,
    ): UserDeleteAccountResponse =
        // post /api/v1/users/delete-account
        withRawResponse().deleteAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val profile: ProfileService.WithRawResponse by lazy {
            ProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val device: DeviceService.WithRawResponse by lazy {
            DeviceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val deletion: DeletionService.WithRawResponse by lazy {
            DeletionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun profile(): ProfileService.WithRawResponse = profile

        override fun device(): DeviceService.WithRawResponse = device

        override fun deletion(): DeletionService.WithRawResponse = deletion

        private val deleteAccountHandler: Handler<UserDeleteAccountResponse> =
            jsonHandler<UserDeleteAccountResponse>(clientOptions.jsonMapper)

        override fun deleteAccount(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
