// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundParams
import com.inty.api.models.api.v1.subscription.admin.AdminProcessRefundResponse
import com.inty.api.services.async.api.v1.subscription.admin.PlanServiceAsync
import com.inty.api.services.async.api.v1.subscription.admin.UserServiceAsync

interface AdminServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdminServiceAsync

    fun plans(): PlanServiceAsync

    fun users(): UserServiceAsync

    /** 手动处理退款（管理员接口） */
    suspend fun processRefund(
        params: AdminProcessRefundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminProcessRefundResponse

    /** A view of [AdminServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdminServiceAsync.WithRawResponse

        fun plans(): PlanServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscription/admin/refund`, but is
         * otherwise the same as [AdminServiceAsync.processRefund].
         */
        @MustBeClosed
        suspend fun processRefund(
            params: AdminProcessRefundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdminProcessRefundResponse>
    }
}
