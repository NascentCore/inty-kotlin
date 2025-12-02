// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.models.api.v1.characterthemes.ApiResponseListCharacterTheme
import com.inty.api.models.api.v1.characterthemes.CharacterThemeListParams

interface CharacterThemeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CharacterThemeServiceAsync

    /** 获取角色主题专区列表。普通用户只能看到可见专区（第一展示、第二展示），管理员可通过 include_hidden 参数查看所有专区 */
    suspend fun list(
        params: CharacterThemeListParams = CharacterThemeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiResponseListCharacterTheme

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ApiResponseListCharacterTheme =
        list(CharacterThemeListParams.none(), requestOptions)

    /**
     * A view of [CharacterThemeServiceAsync] that provides access to raw HTTP responses for each
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
        ): CharacterThemeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/character-themes/`, but is otherwise the
         * same as [CharacterThemeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CharacterThemeListParams = CharacterThemeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiResponseListCharacterTheme>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ApiResponseListCharacterTheme> =
            list(CharacterThemeListParams.none(), requestOptions)
    }
}
