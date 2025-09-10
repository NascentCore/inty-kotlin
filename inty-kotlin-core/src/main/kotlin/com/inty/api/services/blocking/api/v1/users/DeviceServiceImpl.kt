// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

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
import com.inty.api.models.api.v1.users.device.ApiResponse
import com.inty.api.models.api.v1.users.device.DeviceRegisterParams

class DeviceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeviceService {

    private val withRawResponse: DeviceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeviceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceService =
        DeviceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun register(
        params: DeviceRegisterParams,
        requestOptions: RequestOptions,
    ): ApiResponse =
        // post /api/v1/users/device/register
        withRawResponse().register(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeviceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeviceService.WithRawResponse =
            DeviceServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val registerHandler: Handler<ApiResponse> =
            jsonHandler<ApiResponse>(clientOptions.jsonMapper)

        override fun register(
            params: DeviceRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users", "device", "register")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { registerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
