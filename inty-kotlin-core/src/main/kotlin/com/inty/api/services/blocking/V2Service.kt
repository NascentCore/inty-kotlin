// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.v2.ChatService

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2Service

    fun chat(): ChatService

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2Service.WithRawResponse

        fun chat(): ChatService.WithRawResponse
    }
}
