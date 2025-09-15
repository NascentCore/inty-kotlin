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
import com.inty.api.core.http.parseable
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesParams
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesResponse

class TextToSpeechServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TextToSpeechService {

    private val withRawResponse: TextToSpeechService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TextToSpeechService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TextToSpeechService =
        TextToSpeechServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun listVoices(
        params: TextToSpeechListVoicesParams,
        requestOptions: RequestOptions,
    ): List<TextToSpeechListVoicesResponse> =
        // get /api/v1/text-to-speech/list-voices
        withRawResponse().listVoices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TextToSpeechService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TextToSpeechService.WithRawResponse =
            TextToSpeechServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listVoicesHandler: Handler<List<TextToSpeechListVoicesResponse>> =
            jsonHandler<List<TextToSpeechListVoicesResponse>>(clientOptions.jsonMapper)

        override fun listVoices(
            params: TextToSpeechListVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TextToSpeechListVoicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "text-to-speech", "list-voices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
