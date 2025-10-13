// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.device.ApiResponse
import com.inty.api.models.api.v1.users.device.DeviceRegisterParams

interface DeviceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceServiceAsync

    /** 在用户未打开 app 时向设备推送消息 */
    suspend fun register(
        params: DeviceRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponse

    /**
     * A view of [DeviceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeviceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/users/device/register`, but is otherwise
         * the same as [DeviceServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: DeviceRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponse>
    }
}
