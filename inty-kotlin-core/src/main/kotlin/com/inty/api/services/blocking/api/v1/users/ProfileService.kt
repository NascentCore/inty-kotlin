// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.profile.ProfileMeParams
import com.inty.api.models.api.v1.users.profile.ProfileMeResponse
import com.inty.api.models.api.v1.users.profile.ProfileUpdateParams
import com.inty.api.models.api.v1.users.profile.ProfileUpdateResponse

interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileService

    /** Update current user profile, support avatar update */
    fun update(
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileUpdateResponse

    /** @see update */
    fun update(requestOptions: RequestOptions): ProfileUpdateResponse =
        update(ProfileUpdateParams.none(), requestOptions)

    /** Get current user profile. */
    fun me(
        params: ProfileMeParams = ProfileMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileMeResponse

    /** @see me */
    fun me(requestOptions: RequestOptions): ProfileMeResponse =
        me(ProfileMeParams.none(), requestOptions)

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/users/profile`, but is otherwise the same as
         * [ProfileService.update].
         */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<ProfileUpdateResponse> =
            update(ProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/users/me`, but is otherwise the same as
         * [ProfileService.me].
         */
        @MustBeClosed
        fun me(
            params: ProfileMeParams = ProfileMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileMeResponse>

        /** @see me */
        @MustBeClosed
        fun me(requestOptions: RequestOptions): HttpResponseFor<ProfileMeResponse> =
            me(ProfileMeParams.none(), requestOptions)
    }
}
