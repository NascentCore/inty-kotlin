// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.v2

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
import com.inty.api.models.v2.chat.ChatSendMessageParams
import com.inty.api.models.v2.chat.ChatSendMessageResponse

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync =
        ChatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override suspend fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions,
    ): ChatSendMessageResponse =
        // post /api/v2/chat/completions/{agent_id}
        withRawResponse().sendMessage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChatServiceAsync.WithRawResponse =
            ChatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val sendMessageHandler: Handler<ChatSendMessageResponse> =
            jsonHandler<ChatSendMessageResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatSendMessageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "chat", "completions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendMessageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
