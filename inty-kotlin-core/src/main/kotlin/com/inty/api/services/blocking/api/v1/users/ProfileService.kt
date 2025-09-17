// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.profile.ProfileRetrieveParams
import com.inty.api.models.api.v1.users.profile.ProfileRetrieveResponse
import com.inty.api.models.api.v1.users.profile.ProfileUpdateParams
import com.inty.api.models.api.v1.users.profile.User

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

    /** Get current user profile. */
    fun retrieve(
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): ProfileRetrieveResponse =
        retrieve(ProfileRetrieveParams.none(), requestOptions)

    /** Update current user profile. */
    fun update(
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see update */
    fun update(requestOptions: RequestOptions): User =
        update(ProfileUpdateParams.none(), requestOptions)

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/users/profile`, but is otherwise the same as
         * [ProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/users/profile`, but is otherwise the same as
         * [ProfileService.update].
         */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<User> =
            update(ProfileUpdateParams.none(), requestOptions)
    }
}
