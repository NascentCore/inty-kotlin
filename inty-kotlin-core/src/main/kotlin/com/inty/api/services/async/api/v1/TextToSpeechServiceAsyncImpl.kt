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
import com.inty.api.models.api.v1.texttospeech.TextToSpeechGenerateSpeechParams
import com.inty.api.models.api.v1.texttospeech.TextToSpeechGenerateSpeechResponse
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesParams
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesResponse

class TextToSpeechServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TextToSpeechServiceAsync {

    private val withRawResponse: TextToSpeechServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TextToSpeechServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TextToSpeechServiceAsync =
        TextToSpeechServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams,
        requestOptions: RequestOptions,
    ): TextToSpeechGenerateSpeechResponse =
        // post /api/v1/text-to-speech/messages/{message_id}
        withRawResponse().generateSpeech(params, requestOptions).parse()

    override suspend fun listVoices(
        params: TextToSpeechListVoicesParams,
        requestOptions: RequestOptions,
    ): List<TextToSpeechListVoicesResponse> =
        // get /api/v1/text-to-speech/list-voices
        withRawResponse().listVoices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TextToSpeechServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TextToSpeechServiceAsync.WithRawResponse =
            TextToSpeechServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val generateSpeechHandler: Handler<TextToSpeechGenerateSpeechResponse> =
            jsonHandler<TextToSpeechGenerateSpeechResponse>(clientOptions.jsonMapper)

        override suspend fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TextToSpeechGenerateSpeechResponse> {
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
                        "text-to-speech",
                        "messages",
                        params._pathParam(0),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateSpeechHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listVoicesHandler: Handler<List<TextToSpeechListVoicesResponse>> =
            jsonHandler<List<TextToSpeechListVoicesResponse>>(clientOptions.jsonMapper)

        override suspend fun listVoices(
            params: TextToSpeechListVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TextToSpeechListVoicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "text-to-speech", "list-voices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listVoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
