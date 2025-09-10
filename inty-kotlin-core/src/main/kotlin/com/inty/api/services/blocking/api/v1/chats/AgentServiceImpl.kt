// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.chats

import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.checkRequired
import com.inty.api.core.handlers.errorBodyHandler
import com.inty.api.core.handlers.errorHandler
import com.inty.api.core.handlers.jsonHandler
import com.inty.api.core.http.HttpMethod
import com.inty.api.core.http.HttpRequest
import com.inty.api.core.http.HttpResponse
import com.inty.api.core.http.HttpResponse.Handler
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.core.http.parseable
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesParams
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesResponse
import com.inty.api.models.api.v1.chats.agents.AgentGetSettingsParams
import com.inty.api.models.api.v1.chats.agents.ChatSettings

class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getMessages(
        params: AgentGetMessagesParams,
        requestOptions: RequestOptions,
    ): AgentGetMessagesResponse =
        // get /api/v1/chats/agents/{agent_id}/messages
        withRawResponse().getMessages(params, requestOptions).parse()

    override fun getSettings(
        params: AgentGetSettingsParams,
        requestOptions: RequestOptions,
    ): ChatSettings =
        // get /api/v1/chats/agents/{agent_id}/settings
        withRawResponse().getSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val getMessagesHandler: Handler<AgentGetMessagesResponse> =
            jsonHandler<AgentGetMessagesResponse>(clientOptions.jsonMapper)

        override fun getMessages(
            params: AgentGetMessagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGetMessagesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "chats",
                        "agents",
                        params._pathParam(0),
                        "messages",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getMessagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSettingsHandler: Handler<ChatSettings> =
            jsonHandler<ChatSettings>(clientOptions.jsonMapper)

        override fun getSettings(
            params: AgentGetSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatSettings> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "chats",
                        "agents",
                        params._pathParam(0),
                        "settings",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
