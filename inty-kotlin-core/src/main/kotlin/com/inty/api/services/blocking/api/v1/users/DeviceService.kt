// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.users.device.ApiResponse
import com.inty.api.models.api.v1.users.device.DeviceRegisterParams

interface DeviceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceService

    /** 注册或更新设备token */
    fun register(
        params: DeviceRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponse

    /** A view of [DeviceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeviceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/users/device/register`, but is otherwise
         * the same as [DeviceService.register].
         */
        @MustBeClosed
        fun register(
            params: DeviceRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponse>
    }
}
