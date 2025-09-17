// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.profile.ProfileRetrieveParams
import com.inty.api.models.api.v1.users.profile.ProfileRetrieveResponse
import com.inty.api.models.api.v1.users.profile.ProfileUpdateParams
import com.inty.api.models.api.v1.users.profile.User

interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProfileServiceAsync

    /** Get current user profile. */
    suspend fun retrieve(
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): ProfileRetrieveResponse =
        retrieve(ProfileRetrieveParams.none(), requestOptions)

    /** Update current user profile. */
    suspend fun update(
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see update */
    suspend fun update(requestOptions: RequestOptions): User =
        update(ProfileUpdateParams.none(), requestOptions)

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/users/profile`, but is otherwise the same as
         * [ProfileServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/users/profile`, but is otherwise the same as
         * [ProfileServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see update */
        @MustBeClosed
        suspend fun update(requestOptions: RequestOptions): HttpResponseFor<User> =
            update(ProfileUpdateParams.none(), requestOptions)
    }
}
