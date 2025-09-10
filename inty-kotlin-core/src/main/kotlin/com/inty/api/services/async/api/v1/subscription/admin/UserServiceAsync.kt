// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription.admin

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.subscription.ApiResponseSubscriptionStatus
import com.inty.api.models.api.v1.subscription.ApiResponseUsageStatistics
import com.inty.api.models.api.v1.subscription.admin.users.UserGetSubscriptionStatusParams
import com.inty.api.models.api.v1.subscription.admin.users.UserGetUsageStatisticsParams

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

    /** 获取指定用户的订阅状态（管理员接口） */
    suspend fun getSubscriptionStatus(
        userId: String,
        params: UserGetSubscriptionStatusParams = UserGetSubscriptionStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseSubscriptionStatus =
        getSubscriptionStatus(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getSubscriptionStatus */
    suspend fun getSubscriptionStatus(
        params: UserGetSubscriptionStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseSubscriptionStatus

    /** @see getSubscriptionStatus */
    suspend fun getSubscriptionStatus(
        userId: String,
        requestOptions: RequestOptions,
    ): ApiResponseSubscriptionStatus =
        getSubscriptionStatus(userId, UserGetSubscriptionStatusParams.none(), requestOptions)

    /** 获取指定用户的使用统计（管理员接口） */
    suspend fun getUsageStatistics(
        userId: String,
        params: UserGetUsageStatisticsParams = UserGetUsageStatisticsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseUsageStatistics =
        getUsageStatistics(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getUsageStatistics */
    suspend fun getUsageStatistics(
        params: UserGetUsageStatisticsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseUsageStatistics

    /** @see getUsageStatistics */
    suspend fun getUsageStatistics(
        userId: String,
        requestOptions: RequestOptions,
    ): ApiResponseUsageStatistics =
        getUsageStatistics(userId, UserGetUsageStatisticsParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/subscription/admin/users/{user_id}/subscription`, but is otherwise the same as
         * [UserServiceAsync.getSubscriptionStatus].
         */
        @MustBeClosed
        suspend fun getSubscriptionStatus(
            userId: String,
            params: UserGetSubscriptionStatusParams = UserGetSubscriptionStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseSubscriptionStatus> =
            getSubscriptionStatus(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getSubscriptionStatus */
        @MustBeClosed
        suspend fun getSubscriptionStatus(
            params: UserGetSubscriptionStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseSubscriptionStatus>

        /** @see getSubscriptionStatus */
        @MustBeClosed
        suspend fun getSubscriptionStatus(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseSubscriptionStatus> =
            getSubscriptionStatus(userId, UserGetSubscriptionStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/subscription/admin/users/{user_id}/usage`,
         * but is otherwise the same as [UserServiceAsync.getUsageStatistics].
         */
        @MustBeClosed
        suspend fun getUsageStatistics(
            userId: String,
            params: UserGetUsageStatisticsParams = UserGetUsageStatisticsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseUsageStatistics> =
            getUsageStatistics(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getUsageStatistics */
        @MustBeClosed
        suspend fun getUsageStatistics(
            params: UserGetUsageStatisticsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseUsageStatistics>

        /** @see getUsageStatistics */
        @MustBeClosed
        suspend fun getUsageStatistics(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseUsageStatistics> =
            getUsageStatistics(userId, UserGetUsageStatisticsParams.none(), requestOptions)
    }
}
