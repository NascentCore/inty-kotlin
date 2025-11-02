// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.ai.agents.imagegeneration

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
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigRetrieveParams
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigRetrieveResponse
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateParams
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateResponse

class ConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigService {

    private val withRawResponse: ConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigService =
        ConfigServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): ConfigRetrieveResponse =
        // get /api/v1/ai/agents/image-generation/config
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions,
    ): ConfigUpdateResponse =
        // put /api/v1/ai/agents/image-generation/config
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigService.WithRawResponse =
            ConfigServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<ConfigRetrieveResponse> =
            jsonHandler<ConfigRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "image-generation", "config")
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

        private val updateHandler: Handler<ConfigUpdateResponse> =
            jsonHandler<ConfigUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "image-generation", "config")
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
