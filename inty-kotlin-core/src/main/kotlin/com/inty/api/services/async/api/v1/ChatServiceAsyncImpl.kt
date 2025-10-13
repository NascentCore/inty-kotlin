// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

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
import com.inty.api.models.api.v1.chats.Chat
import com.inty.api.models.api.v1.chats.ChatCreateCompletionParams
import com.inty.api.models.api.v1.chats.ChatCreateParams
import com.inty.api.models.api.v1.chats.ChatDeleteParams
import com.inty.api.models.api.v1.chats.ChatListParams
import com.inty.api.models.api.v1.chats.ChatRetrieveVoiceParams
import com.inty.api.models.api.v1.chats.ChatRetrieveVoiceResponse
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.async.api.v1.chats.AgentServiceAsync
import com.inty.api.services.async.api.v1.chats.AgentServiceAsyncImpl

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync =
        ChatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun agents(): AgentServiceAsync = agents

    override suspend fun create(params: ChatCreateParams, requestOptions: RequestOptions): Chat =
        // post /api/v1/chats/
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(params: ChatListParams, requestOptions: RequestOptions): List<Chat> =
        // get /api/v1/chats/
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: ChatDeleteParams, requestOptions: RequestOptions): Chat =
        // delete /api/v1/chats/{chat_id}
        withRawResponse().delete(params, requestOptions).parse()

    @Deprecated("deprecated")
    override suspend fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // post /api/v1/chat/completions/{agent_id}
        withRawResponse().createCompletion(params, requestOptions).parse()

    @Deprecated("deprecated")
    override suspend fun retrieveVoice(
        params: ChatRetrieveVoiceParams,
        requestOptions: RequestOptions,
    ): ChatRetrieveVoiceResponse =
        // get /api/v1/chats/voices/{voice_id}
        withRawResponse().retrieveVoice(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChatServiceAsync.WithRawResponse =
            ChatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun agents(): AgentServiceAsync.WithRawResponse = agents

        private val createHandler: Handler<Chat> = jsonHandler<Chat>(clientOptions.jsonMapper)

        override suspend fun create(
            params: ChatCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Chat> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chats", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<Chat>> =
            jsonHandler<List<Chat>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ChatListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Chat>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chats", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Chat> = jsonHandler<Chat>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Chat> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("chatId", params.chatId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chats", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createCompletionHandler: Handler<ApiResponseDict> =
            jsonHandler<ApiResponseDict>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chat", "completions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveVoiceHandler: Handler<ChatRetrieveVoiceResponse> =
            jsonHandler<ChatRetrieveVoiceResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun retrieveVoice(
            params: ChatRetrieveVoiceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveVoiceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("voiceId", params.voiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chats", "voices", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveVoiceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
