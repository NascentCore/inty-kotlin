// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.subscription.ApiResponseSubscriptionStatus
import com.inty.api.models.api.v1.subscription.ApiResponseUsageStatistics
import com.inty.api.models.api.v1.subscription.SubscriptionGetStatusParams
import com.inty.api.models.api.v1.subscription.SubscriptionGetUsageParams
import com.inty.api.models.api.v1.subscription.SubscriptionListPlansParams
import com.inty.api.models.api.v1.subscription.SubscriptionListPlansResponse
import com.inty.api.models.api.v1.subscription.SubscriptionVerifyParams
import com.inty.api.models.api.v1.subscription.SubscriptionVerifyResponse
import com.inty.api.models.api.v1.subscription.SubscriptionWebhookParams
import com.inty.api.models.api.v1.subscription.SubscriptionWebhookResponse
import com.inty.api.services.async.api.v1.subscription.AdminServiceAsync

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionServiceAsync

    fun admin(): AdminServiceAsync

    /** 获取用户订阅状态 */
    suspend fun getStatus(
        params: SubscriptionGetStatusParams = SubscriptionGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseSubscriptionStatus

    /** @see getStatus */
    suspend fun getStatus(requestOptions: RequestOptions): ApiResponseSubscriptionStatus =
        getStatus(SubscriptionGetStatusParams.none(), requestOptions)

    /** 获取用户使用统计 */
    suspend fun getUsage(
        params: SubscriptionGetUsageParams = SubscriptionGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseUsageStatistics

    /** @see getUsage */
    suspend fun getUsage(requestOptions: RequestOptions): ApiResponseUsageStatistics =
        getUsage(SubscriptionGetUsageParams.none(), requestOptions)

    /** 现有订阅计划、用户订阅的内容、以及其他与用户订阅状态相关的信息 */
    suspend fun listPlans(
        params: SubscriptionListPlansParams = SubscriptionListPlansParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPlansResponse

    /** @see listPlans */
    suspend fun listPlans(requestOptions: RequestOptions): SubscriptionListPlansResponse =
        listPlans(SubscriptionListPlansParams.none(), requestOptions)

    /** Used by app to prove user has purchased a subscription */
    suspend fun verify(
        params: SubscriptionVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionVerifyResponse

    /** Google Play Developer Notifications webhook 处理订阅状态变化通知 */
    suspend fun webhook(
        params: SubscriptionWebhookParams = SubscriptionWebhookParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionWebhookResponse

    /** @see webhook */
    suspend fun webhook(requestOptions: RequestOptions): SubscriptionWebhookResponse =
        webhook(SubscriptionWebhookParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionServiceAsync.WithRawResponse

        fun admin(): AdminServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/subscription/status`, but is otherwise the
         * same as [SubscriptionServiceAsync.getStatus].
         */
        @MustBeClosed
        suspend fun getStatus(
            params: SubscriptionGetStatusParams = SubscriptionGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseSubscriptionStatus>

        /** @see getStatus */
        @MustBeClosed
        suspend fun getStatus(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponseSubscriptionStatus> =
            getStatus(SubscriptionGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/subscription/usage`, but is otherwise the
         * same as [SubscriptionServiceAsync.getUsage].
         */
        @MustBeClosed
        suspend fun getUsage(
            params: SubscriptionGetUsageParams = SubscriptionGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseUsageStatistics>

        /** @see getUsage */
        @MustBeClosed
        suspend fun getUsage(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponseUsageStatistics> =
            getUsage(SubscriptionGetUsageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/subscription/plans`, but is otherwise the
         * same as [SubscriptionServiceAsync.listPlans].
         */
        @MustBeClosed
        suspend fun listPlans(
            params: SubscriptionListPlansParams = SubscriptionListPlansParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPlansResponse>

        /** @see listPlans */
        @MustBeClosed
        suspend fun listPlans(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionListPlansResponse> =
            listPlans(SubscriptionListPlansParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscription/verify`, but is otherwise the
         * same as [SubscriptionServiceAsync.verify].
         */
        @MustBeClosed
        suspend fun verify(
            params: SubscriptionVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionVerifyResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/subscription/webhook`, but is otherwise the
         * same as [SubscriptionServiceAsync.webhook].
         */
        @MustBeClosed
        suspend fun webhook(
            params: SubscriptionWebhookParams = SubscriptionWebhookParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionWebhookResponse>

        /** @see webhook */
        @MustBeClosed
        suspend fun webhook(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionWebhookResponse> =
            webhook(SubscriptionWebhookParams.none(), requestOptions)
    }
}
