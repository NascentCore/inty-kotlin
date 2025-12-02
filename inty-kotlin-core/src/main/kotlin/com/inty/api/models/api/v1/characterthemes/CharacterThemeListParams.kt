// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.characterthemes

import com.inty.api.core.Params
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import java.util.Objects

/** 获取角色主题专区列表。普通用户只能看到可见专区（第一展示、第二展示），管理员可通过 include_hidden 参数查看所有专区 */
class CharacterThemeListParams
private constructor(
    private val includeHidden: Boolean?,
    private val limit: Long?,
    private val skip: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** 是否包含不可见的专区（仅管理员可用） */
    fun includeHidden(): Boolean? = includeHidden

    /** 返回的记录数 */
    fun limit(): Long? = limit

    /** 跳过的记录数 */
    fun skip(): Long? = skip

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CharacterThemeListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CharacterThemeListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CharacterThemeListParams]. */
    class Builder internal constructor() {

        private var includeHidden: Boolean? = null
        private var limit: Long? = null
        private var skip: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(characterThemeListParams: CharacterThemeListParams) = apply {
            includeHidden = characterThemeListParams.includeHidden
            limit = characterThemeListParams.limit
            skip = characterThemeListParams.skip
            additionalHeaders = characterThemeListParams.additionalHeaders.toBuilder()
            additionalQueryParams = characterThemeListParams.additionalQueryParams.toBuilder()
        }

        /** 是否包含不可见的专区（仅管理员可用） */
        fun includeHidden(includeHidden: Boolean?) = apply { this.includeHidden = includeHidden }

        /**
         * Alias for [Builder.includeHidden].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeHidden(includeHidden: Boolean) = includeHidden(includeHidden as Boolean?)

        /** 返回的记录数 */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** 跳过的记录数 */
        fun skip(skip: Long?) = apply { this.skip = skip }

        /**
         * Alias for [Builder.skip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skip(skip: Long) = skip(skip as Long?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CharacterThemeListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CharacterThemeListParams =
            CharacterThemeListParams(
                includeHidden,
                limit,
                skip,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeHidden?.let { put("include_hidden", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterThemeListParams &&
            includeHidden == other.includeHidden &&
            limit == other.limit &&
            skip == other.skip &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(includeHidden, limit, skip, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CharacterThemeListParams{includeHidden=$includeHidden, limit=$limit, skip=$skip, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
