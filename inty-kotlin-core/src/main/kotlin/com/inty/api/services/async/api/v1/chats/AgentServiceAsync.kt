// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.chats

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.chats.agents.AgentClearMessagesParams
import com.inty.api.models.api.v1.chats.agents.AgentClearMessagesResponse
import com.inty.api.models.api.v1.chats.agents.AgentGenerateMessageVoiceParams
import com.inty.api.models.api.v1.chats.agents.AgentGenerateMessageVoiceResponse
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesParams
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesResponse
import com.inty.api.models.api.v1.chats.agents.AgentGetSettingsParams
import com.inty.api.models.api.v1.chats.agents.AgentUpdateSettingsParams
import com.inty.api.models.api.v1.chats.agents.AgentUpdateSettingsResponse
import com.inty.api.models.api.v1.chats.agents.ChatSettings

interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentServiceAsync

    /**
     * Clear chat messages by Agent ID, currently used by inty-eval, probably will be used by inty
     * app as well.
     */
    suspend fun clearMessages(
        agentId: String,
        params: AgentClearMessagesParams = AgentClearMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentClearMessagesResponse =
        clearMessages(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see clearMessages */
    suspend fun clearMessages(
        params: AgentClearMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentClearMessagesResponse

    /** @see clearMessages */
    suspend fun clearMessages(
        agentId: String,
        requestOptions: RequestOptions,
    ): AgentClearMessagesResponse =
        clearMessages(agentId, AgentClearMessagesParams.none(), requestOptions)

    /** Generate voice for a message */
    suspend fun generateMessageVoice(
        messageId: String,
        params: AgentGenerateMessageVoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGenerateMessageVoiceResponse =
        generateMessageVoice(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see generateMessageVoice */
    suspend fun generateMessageVoice(
        params: AgentGenerateMessageVoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGenerateMessageVoiceResponse

    /** Get only chat message records by Agent ID (lighter interface) */
    suspend fun getMessages(
        agentId: String,
        params: AgentGetMessagesParams = AgentGetMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGetMessagesResponse =
        getMessages(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see getMessages */
    suspend fun getMessages(
        params: AgentGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGetMessagesResponse

    /** @see getMessages */
    suspend fun getMessages(
        agentId: String,
        requestOptions: RequestOptions,
    ): AgentGetMessagesResponse =
        getMessages(agentId, AgentGetMessagesParams.none(), requestOptions)

    /**
     * [Deprecated, use /chats/{chat_id}/settings instead] Get chat settings by Agent ID, bause we
     * only support 1 chat per agent, so we do not use chat_id to get settings
     */
    suspend fun getSettings(
        agentId: String,
        params: AgentGetSettingsParams = AgentGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSettings = getSettings(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see getSettings */
    suspend fun getSettings(
        params: AgentGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSettings

    /** @see getSettings */
    suspend fun getSettings(agentId: String, requestOptions: RequestOptions): ChatSettings =
        getSettings(agentId, AgentGetSettingsParams.none(), requestOptions)

    /**
     * We do not use chat_id to get settings, because we only support 1 chat per agent.TODO: We
     * should switch to /chats/{chat_id}/settings
     */
    suspend fun updateSettings(
        agentId: String,
        params: AgentUpdateSettingsParams = AgentUpdateSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentUpdateSettingsResponse =
        updateSettings(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see updateSettings */
    suspend fun updateSettings(
        params: AgentUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentUpdateSettingsResponse

    /** @see updateSettings */
    suspend fun updateSettings(
        agentId: String,
        requestOptions: RequestOptions,
    ): AgentUpdateSettingsResponse =
        updateSettings(agentId, AgentUpdateSettingsParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/chats/agents/{agent_id}/clear-messages`,
         * but is otherwise the same as [AgentServiceAsync.clearMessages].
         */
        @MustBeClosed
        suspend fun clearMessages(
            agentId: String,
            params: AgentClearMessagesParams = AgentClearMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentClearMessagesResponse> =
            clearMessages(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see clearMessages */
        @MustBeClosed
        suspend fun clearMessages(
            params: AgentClearMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentClearMessagesResponse>

        /** @see clearMessages */
        @MustBeClosed
        suspend fun clearMessages(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentClearMessagesResponse> =
            clearMessages(agentId, AgentClearMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/chats/agents/{agent_id}/messages/{message_id}/voice`, but is otherwise the same
         * as [AgentServiceAsync.generateMessageVoice].
         */
        @MustBeClosed
        suspend fun generateMessageVoice(
            messageId: String,
            params: AgentGenerateMessageVoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGenerateMessageVoiceResponse> =
            generateMessageVoice(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see generateMessageVoice */
        @MustBeClosed
        suspend fun generateMessageVoice(
            params: AgentGenerateMessageVoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGenerateMessageVoiceResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/agents/{agent_id}/messages`, but is
         * otherwise the same as [AgentServiceAsync.getMessages].
         */
        @MustBeClosed
        suspend fun getMessages(
            agentId: String,
            params: AgentGetMessagesParams = AgentGetMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGetMessagesResponse> =
            getMessages(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see getMessages */
        @MustBeClosed
        suspend fun getMessages(
            params: AgentGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGetMessagesResponse>

        /** @see getMessages */
        @MustBeClosed
        suspend fun getMessages(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGetMessagesResponse> =
            getMessages(agentId, AgentGetMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/agents/{agent_id}/settings`, but is
         * otherwise the same as [AgentServiceAsync.getSettings].
         */
        @MustBeClosed
        suspend fun getSettings(
            agentId: String,
            params: AgentGetSettingsParams = AgentGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSettings> =
            getSettings(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see getSettings */
        @MustBeClosed
        suspend fun getSettings(
            params: AgentGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSettings>

        /** @see getSettings */
        @MustBeClosed
        suspend fun getSettings(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatSettings> =
            getSettings(agentId, AgentGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/chats/agents/{agent_id}/settings`, but is
         * otherwise the same as [AgentServiceAsync.updateSettings].
         */
        @MustBeClosed
        suspend fun updateSettings(
            agentId: String,
            params: AgentUpdateSettingsParams = AgentUpdateSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentUpdateSettingsResponse> =
            updateSettings(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see updateSettings */
        @MustBeClosed
        suspend fun updateSettings(
            params: AgentUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentUpdateSettingsResponse>

        /** @see updateSettings */
        @MustBeClosed
        suspend fun updateSettings(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdateSettingsResponse> =
            updateSettings(agentId, AgentUpdateSettingsParams.none(), requestOptions)
    }
}
