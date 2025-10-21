// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.v2

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.v2.chat.ChatSendMessageParams
import com.inty.api.models.v2.chat.ChatSendMessageResponse

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync

    /** 可以处理包括图片在内的各种消息类型，媒体类型应该先上传，然后将 URL 作为索引发送到此 API */
    @Deprecated("deprecated")
    suspend fun sendMessage(
        agentId: String,
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSendMessageResponse =
        sendMessage(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see sendMessage */
    @Deprecated("deprecated")
    suspend fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSendMessageResponse

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/chat/completions/{agent_id}`, but is
         * otherwise the same as [ChatServiceAsync.sendMessage].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun sendMessage(
            agentId: String,
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSendMessageResponse> =
            sendMessage(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see sendMessage */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSendMessageResponse>
    }
}
