// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.ai

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.ai.agents.Agent
import com.inty.api.models.api.v1.ai.agents.AgentCreateParams
import com.inty.api.models.api.v1.ai.agents.AgentCreateResponse
import com.inty.api.models.api.v1.ai.agents.AgentDeleteParams
import com.inty.api.models.api.v1.ai.agents.AgentFollowAgentParams
import com.inty.api.models.api.v1.ai.agents.AgentFollowingParams
import com.inty.api.models.api.v1.ai.agents.AgentListParams
import com.inty.api.models.api.v1.ai.agents.AgentListResponse
import com.inty.api.models.api.v1.ai.agents.AgentRecommendParams
import com.inty.api.models.api.v1.ai.agents.AgentRetrieveParams
import com.inty.api.models.api.v1.ai.agents.AgentSearchParams
import com.inty.api.models.api.v1.ai.agents.AgentUnfollowAgentParams
import com.inty.api.models.api.v1.ai.agents.AgentUpdateParams
import com.inty.api.models.api.v1.ai.agents.ApiResponseAgent
import com.inty.api.models.api.v1.ai.agents.ApiResponsePaginationDataAgent
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.async.api.v1.ai.agents.ImageGenerationServiceAsync

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

    fun imageGeneration(): ImageGenerationServiceAsync

    /** Create new AI agent, used by app and inty-eval */
    suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** Get public agent by ID, include pre-generated agents and user-created public agents */
    suspend fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see retrieve */
    suspend fun retrieve(agentId: String, requestOptions: RequestOptions): Agent =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /** 更新任何图片，都会将图片全部记录在 background_images 字段中，用于保存历史记录如果没有提供 avatar，则会自动截取头像，并记录在 avatar 字段中 */
    suspend fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see update */
    suspend fun update(agentId: String, requestOptions: RequestOptions): Agent =
        update(agentId, AgentUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used by an registered user to list their created AI characters (agents as a
     * misnomer)
     */
    suspend fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AgentListResponse =
        list(AgentListParams.none(), requestOptions)

    /** Delete AI agent */
    suspend fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseAgent = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseAgent

    /** @see delete */
    suspend fun delete(agentId: String, requestOptions: RequestOptions): ApiResponseAgent =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /** Follow AI agent */
    suspend fun followAgent(
        agentId: String,
        params: AgentFollowAgentParams = AgentFollowAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict = followAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see followAgent */
    suspend fun followAgent(
        params: AgentFollowAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** @see followAgent */
    suspend fun followAgent(agentId: String, requestOptions: RequestOptions): ApiResponseDict =
        followAgent(agentId, AgentFollowAgentParams.none(), requestOptions)

    /** Get current user's followed AI agents list */
    suspend fun following(
        params: AgentFollowingParams = AgentFollowingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponsePaginationDataAgent

    /** @see following */
    suspend fun following(requestOptions: RequestOptions): ApiResponsePaginationDataAgent =
        following(AgentFollowingParams.none(), requestOptions)

    /**
     * Get recommended AI agents list (public and approved agents), sort_seed is required when sort
     * is random, which is used to ensure deterministic order for the random sort option
     */
    suspend fun recommend(
        params: AgentRecommendParams = AgentRecommendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponsePaginationDataAgent

    /** @see recommend */
    suspend fun recommend(requestOptions: RequestOptions): ApiResponsePaginationDataAgent =
        recommend(AgentRecommendParams.none(), requestOptions)

    /** Search public AI agents Support fuzzy search by name, description, category */
    suspend fun search(
        params: AgentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponsePaginationDataAgent

    /** Unfollow AI agent */
    suspend fun unfollowAgent(
        agentId: String,
        params: AgentUnfollowAgentParams = AgentUnfollowAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict = unfollowAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see unfollowAgent */
    suspend fun unfollowAgent(
        params: AgentUnfollowAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** @see unfollowAgent */
    suspend fun unfollowAgent(agentId: String, requestOptions: RequestOptions): ApiResponseDict =
        unfollowAgent(agentId, AgentUnfollowAgentParams.none(), requestOptions)

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

        fun imageGeneration(): ImageGenerationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/ai/agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/{agent_id}`, but is otherwise the
         * same as [AgentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> = retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/ai/agents/{agent_id}`, but is otherwise the
         * same as [AgentServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> = update(agentId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/me`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListResponse> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/ai/agents/{agent_id}`, but is otherwise
         * the same as [AgentServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseAgent> =
            delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseAgent>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseAgent> =
            delete(agentId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/ai/agents/{agent_id}/follow`, but is
         * otherwise the same as [AgentServiceAsync.followAgent].
         */
        @MustBeClosed
        suspend fun followAgent(
            agentId: String,
            params: AgentFollowAgentParams = AgentFollowAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            followAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see followAgent */
        @MustBeClosed
        suspend fun followAgent(
            params: AgentFollowAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>

        /** @see followAgent */
        @MustBeClosed
        suspend fun followAgent(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> =
            followAgent(agentId, AgentFollowAgentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/following`, but is otherwise the
         * same as [AgentServiceAsync.following].
         */
        @MustBeClosed
        suspend fun following(
            params: AgentFollowingParams = AgentFollowingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponsePaginationDataAgent>

        /** @see following */
        @MustBeClosed
        suspend fun following(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponsePaginationDataAgent> =
            following(AgentFollowingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/recommend`, but is otherwise the
         * same as [AgentServiceAsync.recommend].
         */
        @MustBeClosed
        suspend fun recommend(
            params: AgentRecommendParams = AgentRecommendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponsePaginationDataAgent>

        /** @see recommend */
        @MustBeClosed
        suspend fun recommend(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponsePaginationDataAgent> =
            recommend(AgentRecommendParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/search`, but is otherwise the same
         * as [AgentServiceAsync.search].
         */
        @MustBeClosed
        suspend fun search(
            params: AgentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponsePaginationDataAgent>

        /**
         * Returns a raw HTTP response for `delete /api/v1/ai/agents/{agent_id}/follow`, but is
         * otherwise the same as [AgentServiceAsync.unfollowAgent].
         */
        @MustBeClosed
        suspend fun unfollowAgent(
            agentId: String,
            params: AgentUnfollowAgentParams = AgentUnfollowAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            unfollowAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see unfollowAgent */
        @MustBeClosed
        suspend fun unfollowAgent(
            params: AgentUnfollowAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>

        /** @see unfollowAgent */
        @MustBeClosed
        suspend fun unfollowAgent(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> =
            unfollowAgent(agentId, AgentUnfollowAgentParams.none(), requestOptions)
    }
}
