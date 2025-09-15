// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.texttospeech

import com.inty.api.core.Params
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import java.util.Objects

/** 获取 ElevenLabs 可用音色列表，支持搜索和过滤功能 */
class TextToSpeechListVoicesParams
private constructor(
    private val category: String?,
    private val pageSize: Long?,
    private val search: String?,
    private val voiceType: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** 音色分类过滤 (如: premade, cloned) */
    fun category(): String? = category

    /** 每页返回结果数，默认 10，最大 100 */
    fun pageSize(): Long? = pageSize

    /** 搜索音色名称关键词 */
    fun search(): String? = search

    /** 音色类型过滤 (如: personal, community) */
    fun voiceType(): String? = voiceType

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TextToSpeechListVoicesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [TextToSpeechListVoicesParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [TextToSpeechListVoicesParams]. */
    class Builder internal constructor() {

        private var category: String? = null
        private var pageSize: Long? = null
        private var search: String? = null
        private var voiceType: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(textToSpeechListVoicesParams: TextToSpeechListVoicesParams) = apply {
            category = textToSpeechListVoicesParams.category
            pageSize = textToSpeechListVoicesParams.pageSize
            search = textToSpeechListVoicesParams.search
            voiceType = textToSpeechListVoicesParams.voiceType
            additionalHeaders = textToSpeechListVoicesParams.additionalHeaders.toBuilder()
            additionalQueryParams = textToSpeechListVoicesParams.additionalQueryParams.toBuilder()
        }

        /** 音色分类过滤 (如: premade, cloned) */
        fun category(category: String?) = apply { this.category = category }

        /** 每页返回结果数，默认 10，最大 100 */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** 搜索音色名称关键词 */
        fun search(search: String?) = apply { this.search = search }

        /** 音色类型过滤 (如: personal, community) */
        fun voiceType(voiceType: String?) = apply { this.voiceType = voiceType }

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
         * Returns an immutable instance of [TextToSpeechListVoicesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextToSpeechListVoicesParams =
            TextToSpeechListVoicesParams(
                category,
                pageSize,
                search,
                voiceType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                category?.let { put("category", it) }
                pageSize?.let { put("page_size", it.toString()) }
                search?.let { put("search", it) }
                voiceType?.let { put("voice_type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextToSpeechListVoicesParams &&
            category == other.category &&
            pageSize == other.pageSize &&
            search == other.search &&
            voiceType == other.voiceType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            category,
            pageSize,
            search,
            voiceType,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TextToSpeechListVoicesParams{category=$category, pageSize=$pageSize, search=$search, voiceType=$voiceType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
