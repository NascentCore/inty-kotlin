// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.ai.agents.imagegeneration

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigRetrieveParams
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigRetrieveResponse
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateParams
import com.inty.api.models.api.v1.ai.agents.imagegeneration.config.ConfigUpdateResponse

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigServiceAsync

    /** 获取当前图片生成的提示词模板和默认参数配置 */
    suspend fun retrieve(
        params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): ConfigRetrieveResponse =
        retrieve(ConfigRetrieveParams.none(), requestOptions)

    /** 更新图片生成的提示词模板和默认参数配置（仅超级用户） */
    suspend fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigUpdateResponse

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/ai/agents/image-generation/config`, but is
         * otherwise the same as [ConfigServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ConfigRetrieveParams = ConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<ConfigRetrieveResponse> =
            retrieve(ConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/ai/agents/image-generation/config`, but is
         * otherwise the same as [ConfigServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigUpdateResponse>
    }
}
