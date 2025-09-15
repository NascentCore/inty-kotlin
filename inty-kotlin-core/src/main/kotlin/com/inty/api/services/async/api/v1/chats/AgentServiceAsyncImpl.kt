// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.chats

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
import com.inty.api.core.http.json
import com.inty.api.core.http.parseable
import com.inty.api.core.prepareAsync
import com.inty.api.models.api.v1.chats.agents.AgentGenerateMessageVoiceParams
import com.inty.api.models.api.v1.chats.agents.AgentGenerateMessageVoiceResponse
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesParams
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesResponse
import com.inty.api.models.api.v1.chats.agents.AgentGetSettingsParams
import com.inty.api.models.api.v1.chats.agents.AgentUpdateSettingsParams
import com.inty.api.models.api.v1.chats.agents.AgentUpdateSettingsResponse
import com.inty.api.models.api.v1.chats.agents.ChatSettings

class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val withRawResponse: AgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentServiceAsync =
        AgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun generateMessageVoice(
        params: AgentGenerateMessageVoiceParams,
        requestOptions: RequestOptions,
    ): AgentGenerateMessageVoiceResponse =
        // post /api/v1/chats/agents/{agent_id}/messages/{message_id}/voice
        withRawResponse().generateMessageVoice(params, requestOptions).parse()

    override suspend fun getMessages(
        params: AgentGetMessagesParams,
        requestOptions: RequestOptions,
    ): AgentGetMessagesResponse =
        // get /api/v1/chats/agents/{agent_id}/messages
        withRawResponse().getMessages(params, requestOptions).parse()

    override suspend fun getSettings(
        params: AgentGetSettingsParams,
        requestOptions: RequestOptions,
    ): ChatSettings =
        // get /api/v1/chats/agents/{agent_id}/settings
        withRawResponse().getSettings(params, requestOptions).parse()

    override suspend fun updateSettings(
        params: AgentUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): AgentUpdateSettingsResponse =
        // put /api/v1/chats/agents/{agent_id}/settings
        withRawResponse().updateSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentServiceAsync.WithRawResponse =
            AgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val generateMessageVoiceHandler: Handler<AgentGenerateMessageVoiceResponse> =
            jsonHandler<AgentGenerateMessageVoiceResponse>(clientOptions.jsonMapper)

        override suspend fun generateMessageVoice(
            params: AgentGenerateMessageVoiceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGenerateMessageVoiceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "chats",
                        "agents",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "voice",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateMessageVoiceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getMessagesHandler: Handler<AgentGetMessagesResponse> =
            jsonHandler<AgentGetMessagesResponse>(clientOptions.jsonMapper)

        override suspend fun getMessages(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun getSettings(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateSettingsHandler: Handler<AgentUpdateSettingsResponse> =
            jsonHandler<AgentUpdateSettingsResponse>(clientOptions.jsonMapper)

        override suspend fun updateSettings(
            params: AgentUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdateSettingsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "chats",
                        "agents",
                        params._pathParam(0),
                        "settings",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
