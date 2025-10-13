// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.v2.ChatServiceAsync

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2ServiceAsync

    fun chat(): ChatServiceAsync

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2ServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse
    }
}
