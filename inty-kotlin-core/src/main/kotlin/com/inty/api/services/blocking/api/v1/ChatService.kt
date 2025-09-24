// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.chats.Chat
import com.inty.api.models.api.v1.chats.ChatCreateCompletionParams
import com.inty.api.models.api.v1.chats.ChatCreateParams
import com.inty.api.models.api.v1.chats.ChatDeleteParams
import com.inty.api.models.api.v1.chats.ChatListParams
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.blocking.api.v1.chats.AgentService

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

    fun agents(): AgentService

    /** Create new chat */
    fun create(
        params: ChatCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Chat

    /** Get current user's chat list */
    fun list(
        params: ChatListParams = ChatListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Chat>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Chat> =
        list(ChatListParams.none(), requestOptions)

    /** Delete chat */
    fun delete(
        chatId: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Chat = delete(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Chat

    /** @see delete */
    fun delete(chatId: String, requestOptions: RequestOptions): Chat =
        delete(chatId, ChatDeleteParams.none(), requestOptions)

    /** 基于Agent ID的OpenAI风格聊天接口 如果用户还没有和该Agent创建会话，则自动创建 */
    fun createCompletion(
        agentId: String,
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict =
        createCompletion(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see createCompletion */
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatService.WithRawResponse

        fun agents(): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/chats/`, but is otherwise the same as
         * [ChatService.create].
         */
        @MustBeClosed
        fun create(
            params: ChatCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Chat>

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/`, but is otherwise the same as
         * [ChatService.list].
         */
        @MustBeClosed
        fun list(
            params: ChatListParams = ChatListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Chat>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Chat>> =
            list(ChatListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/chats/{chat_id}`, but is otherwise the
         * same as [ChatService.delete].
         */
        @MustBeClosed
        fun delete(
            chatId: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Chat> = delete(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Chat>

        /** @see delete */
        @MustBeClosed
        fun delete(chatId: String, requestOptions: RequestOptions): HttpResponseFor<Chat> =
            delete(chatId, ChatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/chat/completions/{agent_id}`, but is
         * otherwise the same as [ChatService.createCompletion].
         */
        @MustBeClosed
        fun createCompletion(
            agentId: String,
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            createCompletion(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>
    }
}
