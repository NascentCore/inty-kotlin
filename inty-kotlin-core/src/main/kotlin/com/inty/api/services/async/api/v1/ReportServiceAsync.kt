// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.report.ReportCreateParams
import com.inty.api.models.api.v1.report.ReportCreateResponse

interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportServiceAsync

    /** Submit report */
    suspend fun create(
        params: ReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreateResponse

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/report/`, but is otherwise the same as
         * [ReportServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreateResponse>
    }
}
