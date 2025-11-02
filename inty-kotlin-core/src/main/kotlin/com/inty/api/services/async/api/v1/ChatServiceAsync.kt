// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.chats.Chat
import com.inty.api.models.api.v1.chats.ChatCreateCompletionParams
import com.inty.api.models.api.v1.chats.ChatCreateParams
import com.inty.api.models.api.v1.chats.ChatDeleteParams
import com.inty.api.models.api.v1.chats.ChatGenerateImageParams
import com.inty.api.models.api.v1.chats.ChatGenerateImageResponse
import com.inty.api.models.api.v1.chats.ChatListParams
import com.inty.api.models.api.v1.chats.ChatRetrieveVoiceParams
import com.inty.api.models.api.v1.chats.ChatRetrieveVoiceResponse
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.async.api.v1.chats.AgentServiceAsync

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

    fun agents(): AgentServiceAsync

    /** Create new chat */
    suspend fun create(
        params: ChatCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Chat

    /** Get current user's chat list */
    suspend fun list(
        params: ChatListParams = ChatListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Chat>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<Chat> =
        list(ChatListParams.none(), requestOptions)

    /** Delete chat */
    suspend fun delete(
        chatId: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Chat = delete(params.toBuilder().chatId(chatId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Chat

    /** @see delete */
    suspend fun delete(chatId: String, requestOptions: RequestOptions): Chat =
        delete(chatId, ChatDeleteParams.none(), requestOptions)

    /** 可以处理包括图片在内的各种消息类型，媒体类型应该先上传，然后将 URL 作为索引发送到此 API */
    @Deprecated("deprecated")
    suspend fun createCompletion(
        agentId: String,
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict =
        createCompletion(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see createCompletion */
    @Deprecated("deprecated")
    suspend fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /**
     * 根据Agent角色、聊天历史和用户消息生成图片，并保存到聊天历史中。注意：路径参数 `agent_id` 仅作为目前的名称，实际应为
     * `chat_id`。未来如需扩展可直接重命名。agent id 则代表与该 agent 的*当前*会话的 id
     */
    suspend fun generateImage(
        agentId: String,
        params: ChatGenerateImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatGenerateImageResponse =
        generateImage(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see generateImage */
    suspend fun generateImage(
        params: ChatGenerateImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatGenerateImageResponse

    /** Get voice info by voice_id */
    @Deprecated("deprecated")
    suspend fun retrieveVoice(
        voiceId: String,
        params: ChatRetrieveVoiceParams = ChatRetrieveVoiceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveVoiceResponse =
        retrieveVoice(params.toBuilder().voiceId(voiceId).build(), requestOptions)

    /** @see retrieveVoice */
    @Deprecated("deprecated")
    suspend fun retrieveVoice(
        params: ChatRetrieveVoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveVoiceResponse

    /** @see retrieveVoice */
    @Deprecated("deprecated")
    suspend fun retrieveVoice(
        voiceId: String,
        requestOptions: RequestOptions,
    ): ChatRetrieveVoiceResponse =
        retrieveVoice(voiceId, ChatRetrieveVoiceParams.none(), requestOptions)

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync.WithRawResponse

        fun agents(): AgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/chats/`, but is otherwise the same as
         * [ChatServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ChatCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Chat>

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/`, but is otherwise the same as
         * [ChatServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ChatListParams = ChatListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Chat>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Chat>> =
            list(ChatListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/chats/{chat_id}`, but is otherwise the
         * same as [ChatServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            chatId: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Chat> = delete(params.toBuilder().chatId(chatId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Chat>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(chatId: String, requestOptions: RequestOptions): HttpResponseFor<Chat> =
            delete(chatId, ChatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/chat/completions/{agent_id}`, but is
         * otherwise the same as [ChatServiceAsync.createCompletion].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun createCompletion(
            agentId: String,
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            createCompletion(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see createCompletion */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>

        /**
         * Returns a raw HTTP response for `post /api/v1/chat/images/{agent_id}`, but is otherwise
         * the same as [ChatServiceAsync.generateImage].
         */
        @MustBeClosed
        suspend fun generateImage(
            agentId: String,
            params: ChatGenerateImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatGenerateImageResponse> =
            generateImage(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see generateImage */
        @MustBeClosed
        suspend fun generateImage(
            params: ChatGenerateImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatGenerateImageResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/voices/{voice_id}`, but is otherwise
         * the same as [ChatServiceAsync.retrieveVoice].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieveVoice(
            voiceId: String,
            params: ChatRetrieveVoiceParams = ChatRetrieveVoiceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveVoiceResponse> =
            retrieveVoice(params.toBuilder().voiceId(voiceId).build(), requestOptions)

        /** @see retrieveVoice */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieveVoice(
            params: ChatRetrieveVoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveVoiceResponse>

        /** @see retrieveVoice */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieveVoice(
            voiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveVoiceResponse> =
            retrieveVoice(voiceId, ChatRetrieveVoiceParams.none(), requestOptions)
    }
}
