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
import com.inty.api.models.api.v1.chats.ChatGenerateImageParams
import com.inty.api.models.api.v1.chats.ChatGenerateImageResponse
import com.inty.api.models.api.v1.chats.ChatListParams
import com.inty.api.models.api.v1.chats.ChatRetrieveVoiceParams
import com.inty.api.models.api.v1.chats.ChatRetrieveVoiceResponse
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

    /** 可以处理包括图片在内的各种消息类型，媒体类型应该先上传，然后将 URL 作为索引发送到此 API */
    @Deprecated("deprecated")
    fun createCompletion(
        agentId: String,
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict =
        createCompletion(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see createCompletion */
    @Deprecated("deprecated")
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /**
     * 根据Agent角色、聊天历史和用户消息生成图片，并保存到聊天历史中。注意：路径参数 `agent_id` 仅作为目前的名称，实际应为
     * `chat_id`。未来如需扩展可直接重命名。agent id 则代表与该 agent 的*当前*会话的 id
     */
    fun generateImage(
        agentId: String,
        params: ChatGenerateImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatGenerateImageResponse =
        generateImage(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see generateImage */
    fun generateImage(
        params: ChatGenerateImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatGenerateImageResponse

    /** Get voice info by voice_id */
    @Deprecated("deprecated")
    fun retrieveVoice(
        voiceId: String,
        params: ChatRetrieveVoiceParams = ChatRetrieveVoiceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveVoiceResponse =
        retrieveVoice(params.toBuilder().voiceId(voiceId).build(), requestOptions)

    /** @see retrieveVoice */
    @Deprecated("deprecated")
    fun retrieveVoice(
        params: ChatRetrieveVoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveVoiceResponse

    /** @see retrieveVoice */
    @Deprecated("deprecated")
    fun retrieveVoice(voiceId: String, requestOptions: RequestOptions): ChatRetrieveVoiceResponse =
        retrieveVoice(voiceId, ChatRetrieveVoiceParams.none(), requestOptions)

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
        @Deprecated("deprecated")
        @MustBeClosed
        fun createCompletion(
            agentId: String,
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            createCompletion(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see createCompletion */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>

        /**
         * Returns a raw HTTP response for `post /api/v1/chat/images/{agent_id}`, but is otherwise
         * the same as [ChatService.generateImage].
         */
        @MustBeClosed
        fun generateImage(
            agentId: String,
            params: ChatGenerateImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatGenerateImageResponse> =
            generateImage(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see generateImage */
        @MustBeClosed
        fun generateImage(
            params: ChatGenerateImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatGenerateImageResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/voices/{voice_id}`, but is otherwise
         * the same as [ChatService.retrieveVoice].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveVoice(
            voiceId: String,
            params: ChatRetrieveVoiceParams = ChatRetrieveVoiceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveVoiceResponse> =
            retrieveVoice(params.toBuilder().voiceId(voiceId).build(), requestOptions)

        /** @see retrieveVoice */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveVoice(
            params: ChatRetrieveVoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveVoiceResponse>

        /** @see retrieveVoice */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieveVoice(
            voiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveVoiceResponse> =
            retrieveVoice(voiceId, ChatRetrieveVoiceParams.none(), requestOptions)
    }
}
