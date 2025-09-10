// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.api.v1.ai.AgentServiceAsync

interface AiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiServiceAsync

    fun agents(): AgentServiceAsync

    /** A view of [AiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AiServiceAsync.WithRawResponse

        fun agents(): AgentServiceAsync.WithRawResponse
    }
}
