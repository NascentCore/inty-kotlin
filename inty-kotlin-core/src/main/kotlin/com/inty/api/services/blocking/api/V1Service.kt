// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.V1ListNotificationsParams
import com.inty.api.models.api.v1.V1ListNotificationsResponse
import com.inty.api.models.api.v1.V1UploadImageParams
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.services.blocking.api.v1.AiService
import com.inty.api.services.blocking.api.v1.AuthService
import com.inty.api.services.blocking.api.v1.ChatService
import com.inty.api.services.blocking.api.v1.ReportService
import com.inty.api.services.blocking.api.v1.SettingService
import com.inty.api.services.blocking.api.v1.SubscriptionService
import com.inty.api.services.blocking.api.v1.TextToSpeechService
import com.inty.api.services.blocking.api.v1.UserService
import com.inty.api.services.blocking.api.v1.VersionService

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V1Service

    fun auth(): AuthService

    fun users(): UserService

    fun report(): ReportService

    fun ai(): AiService

    fun settings(): SettingService

    fun subscription(): SubscriptionService

    fun version(): VersionService

    fun chats(): ChatService

    fun textToSpeech(): TextToSpeechService

    /** 分页查询用户的消息列表；返回用户收到的通知。 */
    fun listNotifications(
        params: V1ListNotificationsParams = V1ListNotificationsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListNotificationsResponse

    /** @see listNotifications */
    fun listNotifications(requestOptions: RequestOptions): V1ListNotificationsResponse =
        listNotifications(V1ListNotificationsParams.none(), requestOptions)

    /** Upload image file with validation, compression, and GCS storage */
    fun uploadImage(
        params: V1UploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseDict

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V1Service.WithRawResponse

        fun auth(): AuthService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun report(): ReportService.WithRawResponse

        fun ai(): AiService.WithRawResponse

        fun settings(): SettingService.WithRawResponse

        fun subscription(): SubscriptionService.WithRawResponse

        fun version(): VersionService.WithRawResponse

        fun chats(): ChatService.WithRawResponse

        fun textToSpeech(): TextToSpeechService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/notifications/`, but is otherwise the same
         * as [V1Service.listNotifications].
         */
        @MustBeClosed
        fun listNotifications(
            params: V1ListNotificationsParams = V1ListNotificationsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListNotificationsResponse>

        /** @see listNotifications */
        @MustBeClosed
        fun listNotifications(
            requestOptions: RequestOptions
        ): HttpResponseFor<V1ListNotificationsResponse> =
            listNotifications(V1ListNotificationsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/images`, but is otherwise the same as
         * [V1Service.uploadImage].
         */
        @MustBeClosed
        fun uploadImage(
            params: V1UploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseDict>
    }
}
