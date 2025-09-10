// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.ai

import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.checkRequired
import com.inty.api.core.handlers.errorBodyHandler
import com.inty.api.core.handlers.errorHandler
import com.inty.api.core.handlers.jsonHandler
import com.inty.api.core.http.HttpMethod
import com.inty.api.core.http.HttpRequest
import com.inty.api.core.http.HttpResponse
import com.inty.api.core.http.HttpResponse.Handler
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.core.http.json
import com.inty.api.core.http.parseable
import com.inty.api.core.prepareAsync
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

class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val withRawResponse: AgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentServiceAsync =
        AgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): ApiResponseAgent =
        // post /api/v1/ai/agents
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions,
    ): Agent =
        // get /api/v1/ai/agents/{agent_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: AgentUpdateParams, requestOptions: RequestOptions): Agent =
        // put /api/v1/ai/agents/{agent_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AgentListParams,
        requestOptions: RequestOptions,
    ): AgentListResponse =
        // get /api/v1/ai/agents/me
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions,
    ): ApiResponseAgent =
        // delete /api/v1/ai/agents/{agent_id}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun followAgent(
        params: AgentFollowAgentParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // post /api/v1/ai/agents/{agent_id}/follow
        withRawResponse().followAgent(params, requestOptions).parse()

    override suspend fun following(
        params: AgentFollowingParams,
        requestOptions: RequestOptions,
    ): ApiResponsePaginationDataAgent =
        // get /api/v1/ai/agents/following
        withRawResponse().following(params, requestOptions).parse()

    override suspend fun recommend(
        params: AgentRecommendParams,
        requestOptions: RequestOptions,
    ): ApiResponsePaginationDataAgent =
        // get /api/v1/ai/agents/recommend
        withRawResponse().recommend(params, requestOptions).parse()

    override suspend fun search(
        params: AgentSearchParams,
        requestOptions: RequestOptions,
    ): ApiResponsePaginationDataAgent =
        // get /api/v1/ai/agents/search
        withRawResponse().search(params, requestOptions).parse()

    override suspend fun unfollowAgent(
        params: AgentUnfollowAgentParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // delete /api/v1/ai/agents/{agent_id}/follow
        withRawResponse().unfollowAgent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentServiceAsync.WithRawResponse =
            AgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ApiResponseAgent> =
            jsonHandler<ApiResponseAgent>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Agent> = jsonHandler<Agent>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Agent> = jsonHandler<Agent>(clientOptions.jsonMapper)

        override suspend fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AgentListResponse> =
            jsonHandler<AgentListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "me")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<ApiResponseAgent> =
            jsonHandler<ApiResponseAgent>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseAgent> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val followAgentHandler: Handler<ApiResponseDict> =
            jsonHandler<ApiResponseDict>(clientOptions.jsonMapper)

        override suspend fun followAgent(
            params: AgentFollowAgentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", params._pathParam(0), "follow")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { followAgentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val followingHandler: Handler<ApiResponsePaginationDataAgent> =
            jsonHandler<ApiResponsePaginationDataAgent>(clientOptions.jsonMapper)

        override suspend fun following(
            params: AgentFollowingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponsePaginationDataAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "following")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { followingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recommendHandler: Handler<ApiResponsePaginationDataAgent> =
            jsonHandler<ApiResponsePaginationDataAgent>(clientOptions.jsonMapper)

        override suspend fun recommend(
            params: AgentRecommendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponsePaginationDataAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "recommend")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recommendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<ApiResponsePaginationDataAgent> =
            jsonHandler<ApiResponsePaginationDataAgent>(clientOptions.jsonMapper)

        override suspend fun search(
            params: AgentSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponsePaginationDataAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unfollowAgentHandler: Handler<ApiResponseDict> =
            jsonHandler<ApiResponseDict>(clientOptions.jsonMapper)

        override suspend fun unfollowAgent(
            params: AgentUnfollowAgentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", params._pathParam(0), "follow")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unfollowAgentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
