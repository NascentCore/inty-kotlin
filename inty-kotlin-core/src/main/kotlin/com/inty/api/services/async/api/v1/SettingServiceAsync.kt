// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.settings.SettingRetrieveParams
import com.inty.api.models.api.v1.settings.SettingUpdateParams
import com.inty.api.models.api.v1.settings.Settings

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SettingServiceAsync

    /** Get current user settings */
    suspend fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Settings

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): Settings =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /** Update current user settings */
    suspend fun update(
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Settings

    /** @see update */
    suspend fun update(requestOptions: RequestOptions): Settings =
        update(SettingUpdateParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/settings/`, but is otherwise the same as
         * [SettingServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Settings>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Settings> =
            retrieve(SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/settings/`, but is otherwise the same as
         * [SettingServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Settings>

        /** @see update */
        @MustBeClosed
        suspend fun update(requestOptions: RequestOptions): HttpResponseFor<Settings> =
            update(SettingUpdateParams.none(), requestOptions)
    }
}
