// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.UserDeleteAccountParams
import com.inty.api.models.api.v1.users.UserDeleteAccountResponse
import com.inty.api.services.async.api.v1.users.DeletionServiceAsync
import com.inty.api.services.async.api.v1.users.ProfileServiceAsync

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    fun profile(): ProfileServiceAsync

    fun deletion(): DeletionServiceAsync

    /** 删除用户账户 */
    suspend fun deleteAccount(
        params: UserDeleteAccountParams = UserDeleteAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserDeleteAccountResponse

    /** @see deleteAccount */
    suspend fun deleteAccount(requestOptions: RequestOptions): UserDeleteAccountResponse =
        deleteAccount(UserDeleteAccountParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        fun profile(): ProfileServiceAsync.WithRawResponse

        fun deletion(): DeletionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/users/delete-account`, but is otherwise the
         * same as [UserServiceAsync.deleteAccount].
         */
        @MustBeClosed
        suspend fun deleteAccount(
            params: UserDeleteAccountParams = UserDeleteAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserDeleteAccountResponse>

        /** @see deleteAccount */
        @MustBeClosed
        suspend fun deleteAccount(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserDeleteAccountResponse> =
            deleteAccount(UserDeleteAccountParams.none(), requestOptions)
    }
}
