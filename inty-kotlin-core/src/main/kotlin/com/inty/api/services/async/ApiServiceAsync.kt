// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.api.V1ServiceAsync

interface ApiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiServiceAsync

    fun v1(): V1ServiceAsync

    /** A view of [ApiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiServiceAsync.WithRawResponse

        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
