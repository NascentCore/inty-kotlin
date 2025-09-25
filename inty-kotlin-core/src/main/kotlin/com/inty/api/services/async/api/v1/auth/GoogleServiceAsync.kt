// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.auth

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.auth.google.GoogleLoginParams
import com.inty.api.models.api.v1.auth.google.GoogleLoginResponse

interface GoogleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GoogleServiceAsync

    /** Google登录 */
    suspend fun login(
        params: GoogleLoginParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GoogleLoginResponse

    /**
     * A view of [GoogleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): GoogleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/auth/google/login`, but is otherwise the
         * same as [GoogleServiceAsync.login].
         */
        @MustBeClosed
        suspend fun login(
            params: GoogleLoginParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GoogleLoginResponse>
    }
}
