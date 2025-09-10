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
import com.inty.api.models.api.v1.settings.SettingRetrieveParams
import com.inty.api.models.api.v1.settings.SettingUpdateParams
import com.inty.api.models.api.v1.settings.Settings

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: SettingRetrieveParams, requestOptions: RequestOptions): Settings =
        // get /api/v1/settings/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: SettingUpdateParams, requestOptions: RequestOptions): Settings =
        // put /api/v1/settings/
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Settings> =
            jsonHandler<Settings>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SettingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Settings> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "settings", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<Settings> =
            jsonHandler<Settings>(clientOptions.jsonMapper)

        override fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Settings> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "settings", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
