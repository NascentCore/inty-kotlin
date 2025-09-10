// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.deletion.DeletionCheckEligibilityParams
import com.inty.api.models.api.v1.users.deletion.DeletionCheckEligibilityResponse

interface DeletionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeletionServiceAsync

    /** 检查用户是否可以删除账户 */
    suspend fun checkEligibility(
        params: DeletionCheckEligibilityParams = DeletionCheckEligibilityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeletionCheckEligibilityResponse

    /** @see checkEligibility */
    suspend fun checkEligibility(requestOptions: RequestOptions): DeletionCheckEligibilityResponse =
        checkEligibility(DeletionCheckEligibilityParams.none(), requestOptions)

    /**
     * A view of [DeletionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeletionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/users/deletion/check`, but is otherwise the
         * same as [DeletionServiceAsync.checkEligibility].
         */
        @MustBeClosed
        suspend fun checkEligibility(
            params: DeletionCheckEligibilityParams = DeletionCheckEligibilityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeletionCheckEligibilityResponse>

        /** @see checkEligibility */
        @MustBeClosed
        suspend fun checkEligibility(
            requestOptions: RequestOptions
        ): HttpResponseFor<DeletionCheckEligibilityResponse> =
            checkEligibility(DeletionCheckEligibilityParams.none(), requestOptions)
    }
}
