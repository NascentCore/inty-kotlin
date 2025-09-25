// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.ai

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.ai.agents.Agent
import com.inty.api.models.api.v1.ai.agents.AgentCreateParams
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

    /** Create new AI agent, used by app and inty-eval */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseAgent

    /** Get public agent by ID, include pre-generated agents and user-created public agents */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see retrieve */
    fun retrieve(agentId: String, requestOptions: RequestOptions): Agent =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /** 更新任何图片，都会将图片全部记录在 background_images 字段中，用于保存历史记录如果没有提供 avatar，则会自动截取头像，并记录在 avatar 字段中 */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see update */
    fun update(agentId: String, requestOptions: RequestOptions): Agent =
        update(agentId, AgentUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used by an registered user to list their created AI characters (agents as a
     * misnomer)
     */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListResponse =
        list(AgentListParams.none(), requestOptions)

    /** Delete AI agent */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseAgent = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseAgent

    /** @see delete */
    fun delete(agentId: String, requestOptions: RequestOptions): ApiResponseAgent =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /** Follow AI agent */
    fun followAgent(
        agentId: String,
        params: AgentFollowAgentParams = AgentFollowAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict = followAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see followAgent */
    fun followAgent(
        params: AgentFollowAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** @see followAgent */
    fun followAgent(agentId: String, requestOptions: RequestOptions): ApiResponseDict =
        followAgent(agentId, AgentFollowAgentParams.none(), requestOptions)

    /** Get current user's followed AI agents list */
    fun following(
        params: AgentFollowingParams = AgentFollowingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponsePaginationDataAgent

    /** @see following */
    fun following(requestOptions: RequestOptions): ApiResponsePaginationDataAgent =
        following(AgentFollowingParams.none(), requestOptions)

    /**
     * Get recommended AI agents list (public and approved agents), sort_seed is required when sort
     * is random, which is used to ensure deterministic order for the random sort option
     */
    fun recommend(
        params: AgentRecommendParams = AgentRecommendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponsePaginationDataAgent

    /** @see recommend */
    fun recommend(requestOptions: RequestOptions): ApiResponsePaginationDataAgent =
        recommend(AgentRecommendParams.none(), requestOptions)

    /** Search public AI agents Support fuzzy search by name, description, category */
    fun search(
        params: AgentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponsePaginationDataAgent

    /** Unfollow AI agent */
    fun unfollowAgent(
        agentId: String,
        params: AgentUnfollowAgentParams = AgentUnfollowAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict = unfollowAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see unfollowAgent */
    fun unfollowAgent(
        params: AgentUnfollowAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** @see unfollowAgent */
    fun unfollowAgent(agentId: String, requestOptions: RequestOptions): ApiResponseDict =
        unfollowAgent(agentId, AgentUnfollowAgentParams.none(), requestOptions)

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/ai/agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseAgent>

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/{agent_id}`, but is otherwise the
         * same as [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(agentId: String, requestOptions: RequestOptions): HttpResponseFor<Agent> =
            retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/ai/agents/{agent_id}`, but is otherwise the
         * same as [AgentService.update].
         */
        @MustBeClosed
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see update */
        @MustBeClosed
        fun update(agentId: String, requestOptions: RequestOptions): HttpResponseFor<Agent> =
            update(agentId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/me`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListResponse> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/ai/agents/{agent_id}`, but is otherwise
         * the same as [AgentService.delete].
         */
        @MustBeClosed
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseAgent> =
            delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseAgent>

        /** @see delete */
        @MustBeClosed
        fun delete(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseAgent> =
            delete(agentId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/ai/agents/{agent_id}/follow`, but is
         * otherwise the same as [AgentService.followAgent].
         */
        @MustBeClosed
        fun followAgent(
            agentId: String,
            params: AgentFollowAgentParams = AgentFollowAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            followAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see followAgent */
        @MustBeClosed
        fun followAgent(
            params: AgentFollowAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>

        /** @see followAgent */
        @MustBeClosed
        fun followAgent(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> =
            followAgent(agentId, AgentFollowAgentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/following`, but is otherwise the
         * same as [AgentService.following].
         */
        @MustBeClosed
        fun following(
            params: AgentFollowingParams = AgentFollowingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponsePaginationDataAgent>

        /** @see following */
        @MustBeClosed
        fun following(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponsePaginationDataAgent> =
            following(AgentFollowingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/recommend`, but is otherwise the
         * same as [AgentService.recommend].
         */
        @MustBeClosed
        fun recommend(
            params: AgentRecommendParams = AgentRecommendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponsePaginationDataAgent>

        /** @see recommend */
        @MustBeClosed
        fun recommend(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponsePaginationDataAgent> =
            recommend(AgentRecommendParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/search`, but is otherwise the same
         * as [AgentService.search].
         */
        @MustBeClosed
        fun search(
            params: AgentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponsePaginationDataAgent>

        /**
         * Returns a raw HTTP response for `delete /api/v1/ai/agents/{agent_id}/follow`, but is
         * otherwise the same as [AgentService.unfollowAgent].
         */
        @MustBeClosed
        fun unfollowAgent(
            agentId: String,
            params: AgentUnfollowAgentParams = AgentUnfollowAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict> =
            unfollowAgent(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see unfollowAgent */
        @MustBeClosed
        fun unfollowAgent(
            params: AgentUnfollowAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>

        /** @see unfollowAgent */
        @MustBeClosed
        fun unfollowAgent(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> =
            unfollowAgent(agentId, AgentUnfollowAgentParams.none(), requestOptions)
    }
}
