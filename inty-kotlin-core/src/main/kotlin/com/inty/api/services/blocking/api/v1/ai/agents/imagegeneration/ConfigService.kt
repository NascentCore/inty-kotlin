// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.ai.agents.imagegeneration

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigRetrieveParams
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigRetrieveResponse
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateParams
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateResponse

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigService

    /** 获取当前图片生成的提示词模板和默认参数配置 */
    fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigRetrieveResponse

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): ConfigRetrieveResponse =
        retrieve(ConfigRetrieveParams.none(), requestOptions)

    /** 更新图片生成的提示词模板和默认参数配置（仅超级用户） */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigUpdateResponse

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/image-generation/config`, but is
         * otherwise the same as [ConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<ConfigRetrieveResponse> =
            retrieve(ConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/ai/agents/image-generation/config`, but is
         * otherwise the same as [ConfigService.update].
         */
        @MustBeClosed
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigUpdateResponse>
    }
}
