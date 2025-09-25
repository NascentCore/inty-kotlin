// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.version.VersionCheckParams
import com.inty.api.models.api.v1.version.VersionCheckResponse

interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VersionService

    /**
     * 检查应用版本更新
     *
     * 通过HTTP头传递版本信息：
     * - appVersionCode: 应用版本代码（必填，整数）
     * - appVersionName: 应用版本名称（可选，字符串）
     */
    fun check(
        params: VersionCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionCheckResponse

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/version/check`, but is otherwise the same
         * as [VersionService.check].
         */
        @MustBeClosed
        fun check(
            params: VersionCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionCheckResponse>
    }
}
