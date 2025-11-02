// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.ai

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
import com.inty.api.core.prepare
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
import com.inty.api.services.blocking.api.v1.ai.agents.ImageGenerationService
import com.inty.api.services.blocking.api.v1.ai.agents.ImageGenerationServiceImpl

class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val imageGeneration: ImageGenerationService by lazy {
        ImageGenerationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun imageGeneration(): ImageGenerationService = imageGeneration

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse =
        // post /api/v1/ai/agents
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: AgentRetrieveParams, requestOptions: RequestOptions): Agent =
        // get /api/v1/ai/agents/{agent_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AgentUpdateParams, requestOptions: RequestOptions): Agent =
        // put /api/v1/ai/agents/{agent_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AgentListParams, requestOptions: RequestOptions): AgentListResponse =
        // get /api/v1/ai/agents/me
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions,
    ): ApiResponseAgent =
        // delete /api/v1/ai/agents/{agent_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun followAgent(
        params: AgentFollowAgentParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // post /api/v1/ai/agents/{agent_id}/follow
        withRawResponse().followAgent(params, requestOptions).parse()

    override fun following(
        params: AgentFollowingParams,
        requestOptions: RequestOptions,
    ): ApiResponsePaginationDataAgent =
        // get /api/v1/ai/agents/following
        withRawResponse().following(params, requestOptions).parse()

    override fun recommend(
        params: AgentRecommendParams,
        requestOptions: RequestOptions,
    ): ApiResponsePaginationDataAgent =
        // get /api/v1/ai/agents/recommend
        withRawResponse().recommend(params, requestOptions).parse()

    override fun search(
        params: AgentSearchParams,
        requestOptions: RequestOptions,
    ): ApiResponsePaginationDataAgent =
        // get /api/v1/ai/agents/search
        withRawResponse().search(params, requestOptions).parse()

    override fun unfollowAgent(
        params: AgentUnfollowAgentParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // delete /api/v1/ai/agents/{agent_id}/follow
        withRawResponse().unfollowAgent(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val imageGeneration: ImageGenerationService.WithRawResponse by lazy {
            ImageGenerationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun imageGeneration(): ImageGenerationService.WithRawResponse = imageGeneration

        private val createHandler: Handler<AgentCreateResponse> =
            jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: AgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "me")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun delete(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun followAgent(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun following(
            params: AgentFollowingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponsePaginationDataAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "following")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun recommend(
            params: AgentRecommendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponsePaginationDataAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "recommend")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun search(
            params: AgentSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponsePaginationDataAgent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ai", "agents", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun unfollowAgent(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
