// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.api.V1Service

interface ApiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiService

    fun v1(): V1Service

    /** A view of [ApiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiService.WithRawResponse

        fun v1(): V1Service.WithRawResponse
    }
}
