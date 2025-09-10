// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription.admin

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.subscription.admin.plans.PlanCreateParams
import com.inty.api.models.api.v1.subscription.admin.plans.PlanCreateResponse
import com.inty.api.models.api.v1.subscription.admin.plans.PlanListParams
import com.inty.api.models.api.v1.subscription.admin.plans.PlanListResponse

interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlanServiceAsync

    /** 创建订阅计划（管理员接口） */
    suspend fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanCreateResponse

    /** 获取所有订阅计划（管理员接口） */
    suspend fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PlanListResponse =
        list(PlanListParams.none(), requestOptions)

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscription/admin/plans`, but is otherwise
         * the same as [PlanServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/subscription/admin/plans`, but is otherwise
         * the same as [PlanServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PlanListResponse> =
            list(PlanListParams.none(), requestOptions)
    }
}
