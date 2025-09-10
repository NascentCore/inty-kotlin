// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.auth.AuthCreateGuestParams
import com.inty.api.models.api.v1.auth.AuthCreateGuestResponse
import com.inty.api.services.blocking.api.v1.auth.GoogleService

interface AuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService

    fun google(): GoogleService

    /** 创建游客账号 */
    fun createGuest(
        params: AuthCreateGuestParams = AuthCreateGuestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthCreateGuestResponse

    /** @see createGuest */
    fun createGuest(requestOptions: RequestOptions): AuthCreateGuestResponse =
        createGuest(AuthCreateGuestParams.none(), requestOptions)

    /** A view of [AuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService.WithRawResponse

        fun google(): GoogleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/auth/guest`, but is otherwise the same as
         * [AuthService.createGuest].
         */
        @MustBeClosed
        fun createGuest(
            params: AuthCreateGuestParams = AuthCreateGuestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthCreateGuestResponse>

        /** @see createGuest */
        @MustBeClosed
        fun createGuest(requestOptions: RequestOptions): HttpResponseFor<AuthCreateGuestResponse> =
            createGuest(AuthCreateGuestParams.none(), requestOptions)
    }
}
