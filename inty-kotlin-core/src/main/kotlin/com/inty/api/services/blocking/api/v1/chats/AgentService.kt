// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.chats

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesParams
import com.inty.api.models.api.v1.chats.agents.AgentGetMessagesResponse
import com.inty.api.models.api.v1.chats.agents.AgentGetSettingsParams
import com.inty.api.models.api.v1.chats.agents.ChatSettings

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService

    /** Get only chat message records by Agent ID (lighter interface) */
    fun getMessages(
        agentId: String,
        params: AgentGetMessagesParams = AgentGetMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGetMessagesResponse =
        getMessages(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see getMessages */
    fun getMessages(
        params: AgentGetMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGetMessagesResponse

    /** @see getMessages */
    fun getMessages(agentId: String, requestOptions: RequestOptions): AgentGetMessagesResponse =
        getMessages(agentId, AgentGetMessagesParams.none(), requestOptions)

    /**
     * Get chat settings by Agent ID, bause we only support 1 chat per agent, so we do not use
     * chat_id to get settings
     */
    fun getSettings(
        agentId: String,
        params: AgentGetSettingsParams = AgentGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSettings = getSettings(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        params: AgentGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatSettings

    /** @see getSettings */
    fun getSettings(agentId: String, requestOptions: RequestOptions): ChatSettings =
        getSettings(agentId, AgentGetSettingsParams.none(), requestOptions)

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/agents/{agent_id}/messages`, but is
         * otherwise the same as [AgentService.getMessages].
         */
        @MustBeClosed
        fun getMessages(
            agentId: String,
            params: AgentGetMessagesParams = AgentGetMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGetMessagesResponse> =
            getMessages(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            params: AgentGetMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGetMessagesResponse>

        /** @see getMessages */
        @MustBeClosed
        fun getMessages(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGetMessagesResponse> =
            getMessages(agentId, AgentGetMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chats/agents/{agent_id}/settings`, but is
         * otherwise the same as [AgentService.getSettings].
         */
        @MustBeClosed
        fun getSettings(
            agentId: String,
            params: AgentGetSettingsParams = AgentGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSettings> =
            getSettings(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            params: AgentGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatSettings>

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatSettings> =
            getSettings(agentId, AgentGetSettingsParams.none(), requestOptions)
    }
}
