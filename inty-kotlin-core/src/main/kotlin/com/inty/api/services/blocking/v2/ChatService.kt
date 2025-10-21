// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.v2

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.v2.chat.ChatSendMessageParams
import com.inty.api.models.v2.chat.ChatSendMessageResponse

interface ChatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatService

    /** 可以处理包括图片在内的各种消息类型，媒体类型应该先上传，然后将 URL 作为索引发送到此 API */
    @Deprecated("deprecated")
    fun sendMessage(
        agentId: String,
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSendMessageResponse =
        sendMessage(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see sendMessage */
    @Deprecated("deprecated")
    fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSendMessageResponse

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/chat/completions/{agent_id}`, but is
         * otherwise the same as [ChatService.sendMessage].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sendMessage(
            agentId: String,
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSendMessageResponse> =
            sendMessage(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see sendMessage */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSendMessageResponse>
    }
}
