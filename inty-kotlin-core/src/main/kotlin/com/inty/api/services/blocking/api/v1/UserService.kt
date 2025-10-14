// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.UserDeleteAccountParams
import com.inty.api.models.api.v1.users.UserDeleteAccountResponse
import com.inty.api.services.blocking.api.v1.users.DeletionService
import com.inty.api.services.blocking.api.v1.users.ProfileService

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    fun profile(): ProfileService

    fun deletion(): DeletionService

    /** 删除用户账户 */
    fun deleteAccount(
        params: UserDeleteAccountParams = UserDeleteAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserDeleteAccountResponse

    /** @see deleteAccount */
    fun deleteAccount(requestOptions: RequestOptions): UserDeleteAccountResponse =
        deleteAccount(UserDeleteAccountParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        fun profile(): ProfileService.WithRawResponse

        fun deletion(): DeletionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/users/delete-account`, but is otherwise the
         * same as [UserService.deleteAccount].
         */
        @MustBeClosed
        fun deleteAccount(
            params: UserDeleteAccountParams = UserDeleteAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserDeleteAccountResponse>

        /** @see deleteAccount */
        @MustBeClosed
        fun deleteAccount(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserDeleteAccountResponse> =
            deleteAccount(UserDeleteAccountParams.none(), requestOptions)
    }
}
