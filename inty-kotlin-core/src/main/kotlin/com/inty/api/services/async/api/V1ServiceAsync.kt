// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.V1ListNotificationsParams
import com.inty.api.models.api.v1.V1ListNotificationsResponse
import com.inty.api.models.api.v1.V1UploadImageParams
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.async.api.v1.AiServiceAsync
import com.inty.api.services.async.api.v1.AuthServiceAsync
import com.inty.api.services.async.api.v1.ChatServiceAsync
import com.inty.api.services.async.api.v1.ReportServiceAsync
import com.inty.api.services.async.api.v1.SettingServiceAsync
import com.inty.api.services.async.api.v1.SubscriptionServiceAsync
import com.inty.api.services.async.api.v1.TextToSpeechServiceAsync
import com.inty.api.services.async.api.v1.UserServiceAsync
import com.inty.api.services.async.api.v1.VersionServiceAsync

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V1ServiceAsync

    fun auth(): AuthServiceAsync

    fun users(): UserServiceAsync

    fun report(): ReportServiceAsync

    fun ai(): AiServiceAsync

    fun settings(): SettingServiceAsync

    fun subscription(): SubscriptionServiceAsync

    fun version(): VersionServiceAsync

    fun chats(): ChatServiceAsync

    fun textToSpeech(): TextToSpeechServiceAsync

    /** 分页查询用户的消息列表；返回用户收到的通知。 */
    suspend fun listNotifications(
        params: V1ListNotificationsParams = V1ListNotificationsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListNotificationsResponse

    /** @see listNotifications */
    suspend fun listNotifications(requestOptions: RequestOptions): V1ListNotificationsResponse =
        listNotifications(V1ListNotificationsParams.none(), requestOptions)

    /** Upload image file with validation, compression, and GCS storage */
    suspend fun uploadImage(
        params: V1UploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V1ServiceAsync.WithRawResponse

        fun auth(): AuthServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun report(): ReportServiceAsync.WithRawResponse

        fun ai(): AiServiceAsync.WithRawResponse

        fun settings(): SettingServiceAsync.WithRawResponse

        fun subscription(): SubscriptionServiceAsync.WithRawResponse

        fun version(): VersionServiceAsync.WithRawResponse

        fun chats(): ChatServiceAsync.WithRawResponse

        fun textToSpeech(): TextToSpeechServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/notifications/`, but is otherwise the same
         * as [V1ServiceAsync.listNotifications].
         */
        @MustBeClosed
        suspend fun listNotifications(
            params: V1ListNotificationsParams = V1ListNotificationsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListNotificationsResponse>

        /** @see listNotifications */
        @MustBeClosed
        suspend fun listNotifications(
            requestOptions: RequestOptions
        ): HttpResponseFor<V1ListNotificationsResponse> =
            listNotifications(V1ListNotificationsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/images`, but is otherwise the same as
         * [V1ServiceAsync.uploadImage].
         */
        @MustBeClosed
        suspend fun uploadImage(
            params: V1UploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>
    }
}
