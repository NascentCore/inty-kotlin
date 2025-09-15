// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.texttospeech.TextToSpeechGenerateSpeechParams
import com.inty.api.models.api.v1.texttospeech.TextToSpeechGenerateSpeechResponse
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesParams
import com.inty.api.models.api.v1.texttospeech.TextToSpeechListVoicesResponse

interface TextToSpeechService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TextToSpeechService

    /** Generate voice for a message */
    fun generateSpeech(
        messageId: String,
        params: TextToSpeechGenerateSpeechParams = TextToSpeechGenerateSpeechParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TextToSpeechGenerateSpeechResponse =
        generateSpeech(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see generateSpeech */
    fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TextToSpeechGenerateSpeechResponse

    /** @see generateSpeech */
    fun generateSpeech(
        messageId: String,
        requestOptions: RequestOptions,
    ): TextToSpeechGenerateSpeechResponse =
        generateSpeech(messageId, TextToSpeechGenerateSpeechParams.none(), requestOptions)

    /** 获取 ElevenLabs 可用音色列表，支持搜索和过滤功能 */
    fun listVoices(
        params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TextToSpeechListVoicesResponse>

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): List<TextToSpeechListVoicesResponse> =
        listVoices(TextToSpeechListVoicesParams.none(), requestOptions)

    /**
     * A view of [TextToSpeechService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TextToSpeechService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/text-to-speech/messages/{message_id}`, but
         * is otherwise the same as [TextToSpeechService.generateSpeech].
         */
        @MustBeClosed
        fun generateSpeech(
            messageId: String,
            params: TextToSpeechGenerateSpeechParams = TextToSpeechGenerateSpeechParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TextToSpeechGenerateSpeechResponse> =
            generateSpeech(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see generateSpeech */
        @MustBeClosed
        fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TextToSpeechGenerateSpeechResponse>

        /** @see generateSpeech */
        @MustBeClosed
        fun generateSpeech(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TextToSpeechGenerateSpeechResponse> =
            generateSpeech(messageId, TextToSpeechGenerateSpeechParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/text-to-speech/list-voices`, but is
         * otherwise the same as [TextToSpeechService.listVoices].
         */
        @MustBeClosed
        fun listVoices(
            params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TextToSpeechListVoicesResponse>>

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<TextToSpeechListVoicesResponse>> =
            listVoices(TextToSpeechListVoicesParams.none(), requestOptions)
    }
}
