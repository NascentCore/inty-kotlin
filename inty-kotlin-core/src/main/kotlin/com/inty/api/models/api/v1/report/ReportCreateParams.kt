// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.report

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.Enum
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.Params
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/** Submit report */
class ReportCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * 举报或者反馈的目标对象的 ID，角色或者用户的 ID。
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetId(): String = body.targetId()

    /**
     * 举报或者反馈的目标对象的类型，角色或者用户。
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetType(): TargetType = body.targetType()

    /**
     * The description of the report.
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * 举报或者反馈附图的链接，该链接来自 /api/v1/images 端点上传图片返回的 gcs URL（可能是 cdn 链接）
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun imageUrls(): List<String>? = body.imageUrls()

    /**
     * 举报或者反馈的原因代码列表。如果未提供且提供了 reason_ids，将从 reason_ids 自动转换
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reasonCodes(): List<ReasonCode>? = body.reasonCodes()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reasonIds(): List<Long>? = body.reasonIds()

    /**
     * 举报或者反馈的类型，为空时默认为 REPORT
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reportType(): ReportType? = body.reportType()

    /**
     * The ID of the request.
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun requestId(): String? = body.requestId()

    /**
     * Returns the raw JSON value of [targetId].
     *
     * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetId(): JsonField<String> = body._targetId()

    /**
     * Returns the raw JSON value of [targetType].
     *
     * Unlike [targetType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetType(): JsonField<TargetType> = body._targetType()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [imageUrls].
     *
     * Unlike [imageUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _imageUrls(): JsonField<List<String>> = body._imageUrls()

    /**
     * Returns the raw JSON value of [reasonCodes].
     *
     * Unlike [reasonCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reasonCodes(): JsonField<List<ReasonCode>> = body._reasonCodes()

    /**
     * Returns the raw JSON value of [reasonIds].
     *
     * Unlike [reasonIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reasonIds(): JsonField<List<Long>> = body._reasonIds()

    /**
     * Returns the raw JSON value of [reportType].
     *
     * Unlike [reportType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportType(): JsonField<ReportType> = body._reportType()

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestId(): JsonField<String> = body._requestId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .targetId()
         * .targetType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ReportCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(reportCreateParams: ReportCreateParams) = apply {
            body = reportCreateParams.body.toBuilder()
            additionalHeaders = reportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = reportCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [targetId]
         * - [targetType]
         * - [description]
         * - [imageUrls]
         * - [reasonCodes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** 举报或者反馈的目标对象的 ID，角色或者用户的 ID。 */
        fun targetId(targetId: String) = apply { body.targetId(targetId) }

        /**
         * Sets [Builder.targetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun targetId(targetId: JsonField<String>) = apply { body.targetId(targetId) }

        /** 举报或者反馈的目标对象的类型，角色或者用户。 */
        fun targetType(targetType: TargetType) = apply { body.targetType(targetType) }

        /**
         * Sets [Builder.targetType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetType] with a well-typed [TargetType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetType(targetType: JsonField<TargetType>) = apply { body.targetType(targetType) }

        /** The description of the report. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** 举报或者反馈附图的链接，该链接来自 /api/v1/images 端点上传图片返回的 gcs URL（可能是 cdn 链接） */
        fun imageUrls(imageUrls: List<String>?) = apply { body.imageUrls(imageUrls) }

        /**
         * Sets [Builder.imageUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun imageUrls(imageUrls: JsonField<List<String>>) = apply { body.imageUrls(imageUrls) }

        /**
         * Adds a single [String] to [imageUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addImageUrl(imageUrl: String) = apply { body.addImageUrl(imageUrl) }

        /** 举报或者反馈的原因代码列表。如果未提供且提供了 reason_ids，将从 reason_ids 自动转换 */
        fun reasonCodes(reasonCodes: List<ReasonCode>?) = apply { body.reasonCodes(reasonCodes) }

        /**
         * Sets [Builder.reasonCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonCodes] with a well-typed `List<ReasonCode>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasonCodes(reasonCodes: JsonField<List<ReasonCode>>) = apply {
            body.reasonCodes(reasonCodes)
        }

        /**
         * Adds a single [ReasonCode] to [reasonCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReasonCode(reasonCode: ReasonCode) = apply { body.addReasonCode(reasonCode) }

        fun reasonIds(reasonIds: List<Long>?) = apply { body.reasonIds(reasonIds) }

        /**
         * Sets [Builder.reasonIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonIds] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reasonIds(reasonIds: JsonField<List<Long>>) = apply { body.reasonIds(reasonIds) }

        /**
         * Adds a single [Long] to [reasonIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReasonId(reasonId: Long) = apply { body.addReasonId(reasonId) }

        /** 举报或者反馈的类型，为空时默认为 REPORT */
        fun reportType(reportType: ReportType?) = apply { body.reportType(reportType) }

        /**
         * Sets [Builder.reportType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportType] with a well-typed [ReportType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportType(reportType: JsonField<ReportType>) = apply { body.reportType(reportType) }

        /** The ID of the request. */
        fun requestId(requestId: String?) = apply { body.requestId(requestId) }

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { body.requestId(requestId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [ReportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .targetId()
         * .targetType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportCreateParams =
            ReportCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Report API 端点的请求数据结构。 */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val targetId: JsonField<String>,
        private val targetType: JsonField<TargetType>,
        private val description: JsonField<String>,
        private val imageUrls: JsonField<List<String>>,
        private val reasonCodes: JsonField<List<ReasonCode>>,
        private val reasonIds: JsonField<List<Long>>,
        private val reportType: JsonField<ReportType>,
        private val requestId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("target_id")
            @ExcludeMissing
            targetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_type")
            @ExcludeMissing
            targetType: JsonField<TargetType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("image_urls")
            @ExcludeMissing
            imageUrls: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("reason_codes")
            @ExcludeMissing
            reasonCodes: JsonField<List<ReasonCode>> = JsonMissing.of(),
            @JsonProperty("reason_ids")
            @ExcludeMissing
            reasonIds: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("report_type")
            @ExcludeMissing
            reportType: JsonField<ReportType> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
        ) : this(
            targetId,
            targetType,
            description,
            imageUrls,
            reasonCodes,
            reasonIds,
            reportType,
            requestId,
            mutableMapOf(),
        )

        /**
         * 举报或者反馈的目标对象的 ID，角色或者用户的 ID。
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetId(): String = targetId.getRequired("target_id")

        /**
         * 举报或者反馈的目标对象的类型，角色或者用户。
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetType(): TargetType = targetType.getRequired("target_type")

        /**
         * The description of the report.
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * 举报或者反馈附图的链接，该链接来自 /api/v1/images 端点上传图片返回的 gcs URL（可能是 cdn 链接）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imageUrls(): List<String>? = imageUrls.getNullable("image_urls")

        /**
         * 举报或者反馈的原因代码列表。如果未提供且提供了 reason_ids，将从 reason_ids 自动转换
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reasonCodes(): List<ReasonCode>? = reasonCodes.getNullable("reason_codes")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reasonIds(): List<Long>? = reasonIds.getNullable("reason_ids")

        /**
         * 举报或者反馈的类型，为空时默认为 REPORT
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportType(): ReportType? = reportType.getNullable("report_type")

        /**
         * The ID of the request.
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

        /**
         * Returns the raw JSON value of [targetId].
         *
         * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_id") @ExcludeMissing fun _targetId(): JsonField<String> = targetId

        /**
         * Returns the raw JSON value of [targetType].
         *
         * Unlike [targetType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_type")
        @ExcludeMissing
        fun _targetType(): JsonField<TargetType> = targetType

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [imageUrls].
         *
         * Unlike [imageUrls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_urls")
        @ExcludeMissing
        fun _imageUrls(): JsonField<List<String>> = imageUrls

        /**
         * Returns the raw JSON value of [reasonCodes].
         *
         * Unlike [reasonCodes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason_codes")
        @ExcludeMissing
        fun _reasonCodes(): JsonField<List<ReasonCode>> = reasonCodes

        /**
         * Returns the raw JSON value of [reasonIds].
         *
         * Unlike [reasonIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason_ids")
        @ExcludeMissing
        fun _reasonIds(): JsonField<List<Long>> = reasonIds

        /**
         * Returns the raw JSON value of [reportType].
         *
         * Unlike [reportType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("report_type")
        @ExcludeMissing
        fun _reportType(): JsonField<ReportType> = reportType

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .targetId()
             * .targetType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var targetId: JsonField<String>? = null
            private var targetType: JsonField<TargetType>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var imageUrls: JsonField<MutableList<String>>? = null
            private var reasonCodes: JsonField<MutableList<ReasonCode>>? = null
            private var reasonIds: JsonField<MutableList<Long>>? = null
            private var reportType: JsonField<ReportType> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                targetId = body.targetId
                targetType = body.targetType
                description = body.description
                imageUrls = body.imageUrls.map { it.toMutableList() }
                reasonCodes = body.reasonCodes.map { it.toMutableList() }
                reasonIds = body.reasonIds.map { it.toMutableList() }
                reportType = body.reportType
                requestId = body.requestId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** 举报或者反馈的目标对象的 ID，角色或者用户的 ID。 */
            fun targetId(targetId: String) = targetId(JsonField.of(targetId))

            /**
             * Sets [Builder.targetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

            /** 举报或者反馈的目标对象的类型，角色或者用户。 */
            fun targetType(targetType: TargetType) = targetType(JsonField.of(targetType))

            /**
             * Sets [Builder.targetType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetType] with a well-typed [TargetType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetType(targetType: JsonField<TargetType>) = apply {
                this.targetType = targetType
            }

            /** The description of the report. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** 举报或者反馈附图的链接，该链接来自 /api/v1/images 端点上传图片返回的 gcs URL（可能是 cdn 链接） */
            fun imageUrls(imageUrls: List<String>?) = imageUrls(JsonField.ofNullable(imageUrls))

            /**
             * Sets [Builder.imageUrls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageUrls] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageUrls(imageUrls: JsonField<List<String>>) = apply {
                this.imageUrls = imageUrls.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [imageUrls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addImageUrl(imageUrl: String) = apply {
                imageUrls =
                    (imageUrls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("imageUrls", it).add(imageUrl)
                    }
            }

            /** 举报或者反馈的原因代码列表。如果未提供且提供了 reason_ids，将从 reason_ids 自动转换 */
            fun reasonCodes(reasonCodes: List<ReasonCode>?) =
                reasonCodes(JsonField.ofNullable(reasonCodes))

            /**
             * Sets [Builder.reasonCodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasonCodes] with a well-typed `List<ReasonCode>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reasonCodes(reasonCodes: JsonField<List<ReasonCode>>) = apply {
                this.reasonCodes = reasonCodes.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReasonCode] to [reasonCodes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReasonCode(reasonCode: ReasonCode) = apply {
                reasonCodes =
                    (reasonCodes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reasonCodes", it).add(reasonCode)
                    }
            }

            fun reasonIds(reasonIds: List<Long>?) = reasonIds(JsonField.ofNullable(reasonIds))

            /**
             * Sets [Builder.reasonIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasonIds] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasonIds(reasonIds: JsonField<List<Long>>) = apply {
                this.reasonIds = reasonIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [reasonIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReasonId(reasonId: Long) = apply {
                reasonIds =
                    (reasonIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reasonIds", it).add(reasonId)
                    }
            }

            /** 举报或者反馈的类型，为空时默认为 REPORT */
            fun reportType(reportType: ReportType?) = reportType(JsonField.ofNullable(reportType))

            /**
             * Sets [Builder.reportType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportType] with a well-typed [ReportType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportType(reportType: JsonField<ReportType>) = apply {
                this.reportType = reportType
            }

            /** The ID of the request. */
            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .targetId()
             * .targetType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("targetId", targetId),
                    checkRequired("targetType", targetType),
                    description,
                    (imageUrls ?: JsonMissing.of()).map { it.toImmutable() },
                    (reasonCodes ?: JsonMissing.of()).map { it.toImmutable() },
                    (reasonIds ?: JsonMissing.of()).map { it.toImmutable() },
                    reportType,
                    requestId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            targetId()
            targetType().validate()
            description()
            imageUrls()
            reasonCodes()?.forEach { it.validate() }
            reasonIds()
            reportType()?.validate()
            requestId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IntyInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (targetId.asKnown() == null) 0 else 1) +
                (targetType.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (imageUrls.asKnown()?.size ?: 0) +
                (reasonCodes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (reasonIds.asKnown()?.size ?: 0) +
                (reportType.asKnown()?.validity() ?: 0) +
                (if (requestId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                targetId == other.targetId &&
                targetType == other.targetType &&
                description == other.description &&
                imageUrls == other.imageUrls &&
                reasonCodes == other.reasonCodes &&
                reasonIds == other.reasonIds &&
                reportType == other.reportType &&
                requestId == other.requestId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                targetId,
                targetType,
                description,
                imageUrls,
                reasonCodes,
                reasonIds,
                reportType,
                requestId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{targetId=$targetId, targetType=$targetType, description=$description, imageUrls=$imageUrls, reasonCodes=$reasonCodes, reasonIds=$reasonIds, reportType=$reportType, requestId=$requestId, additionalProperties=$additionalProperties}"
    }

    /** 举报或者反馈的目标对象的类型，角色或者用户。 */
    class TargetType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val USER = of("USER")

            val AGENT = of("AGENT")

            fun of(value: String) = TargetType(JsonField.of(value))
        }

        /** An enum containing [TargetType]'s known values. */
        enum class Known {
            USER,
            AGENT,
        }

        /**
         * An enum containing [TargetType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TargetType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USER,
            AGENT,
            /**
             * An enum member indicating that [TargetType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                USER -> Value.USER
                AGENT -> Value.AGENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IntyInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                USER -> Known.USER
                AGENT -> Known.AGENT
                else -> throw IntyInvalidDataException("Unknown TargetType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IntyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): TargetType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IntyInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TargetType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** 原因代码枚举，包含 Report 和 Feedback 的所有可能值 */
    class ReasonCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SENSITIVE_CONTENT = of("SENSITIVE_CONTENT")

            val MISINFORMATION = of("MISINFORMATION")

            val FRAUD_SCAMS = of("FRAUD_SCAMS")

            val PRIVACY_VIOLATION = of("PRIVACY_VIOLATION")

            val HARMFUL_MINORS = of("HARMFUL_MINORS")

            val IP_VIOLATION = of("IP_VIOLATION")

            val OTHER = of("OTHER")

            val CHAT_NOT_NATURAL = of("CHAT_NOT_NATURAL")

            val CHARACTER_MISMATCH = of("CHARACTER_MISMATCH")

            val APP_SLOW = of("APP_SLOW")

            val FEATURE_HARD_TO_FIND = of("FEATURE_HARD_TO_FIND")

            val UI_INCONVENIENT = of("UI_INCONVENIENT")

            val NEW_FEATURE = of("NEW_FEATURE")

            fun of(value: String) = ReasonCode(JsonField.of(value))
        }

        /** An enum containing [ReasonCode]'s known values. */
        enum class Known {
            SENSITIVE_CONTENT,
            MISINFORMATION,
            FRAUD_SCAMS,
            PRIVACY_VIOLATION,
            HARMFUL_MINORS,
            IP_VIOLATION,
            OTHER,
            CHAT_NOT_NATURAL,
            CHARACTER_MISMATCH,
            APP_SLOW,
            FEATURE_HARD_TO_FIND,
            UI_INCONVENIENT,
            NEW_FEATURE,
        }

        /**
         * An enum containing [ReasonCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReasonCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SENSITIVE_CONTENT,
            MISINFORMATION,
            FRAUD_SCAMS,
            PRIVACY_VIOLATION,
            HARMFUL_MINORS,
            IP_VIOLATION,
            OTHER,
            CHAT_NOT_NATURAL,
            CHARACTER_MISMATCH,
            APP_SLOW,
            FEATURE_HARD_TO_FIND,
            UI_INCONVENIENT,
            NEW_FEATURE,
            /**
             * An enum member indicating that [ReasonCode] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SENSITIVE_CONTENT -> Value.SENSITIVE_CONTENT
                MISINFORMATION -> Value.MISINFORMATION
                FRAUD_SCAMS -> Value.FRAUD_SCAMS
                PRIVACY_VIOLATION -> Value.PRIVACY_VIOLATION
                HARMFUL_MINORS -> Value.HARMFUL_MINORS
                IP_VIOLATION -> Value.IP_VIOLATION
                OTHER -> Value.OTHER
                CHAT_NOT_NATURAL -> Value.CHAT_NOT_NATURAL
                CHARACTER_MISMATCH -> Value.CHARACTER_MISMATCH
                APP_SLOW -> Value.APP_SLOW
                FEATURE_HARD_TO_FIND -> Value.FEATURE_HARD_TO_FIND
                UI_INCONVENIENT -> Value.UI_INCONVENIENT
                NEW_FEATURE -> Value.NEW_FEATURE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IntyInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                SENSITIVE_CONTENT -> Known.SENSITIVE_CONTENT
                MISINFORMATION -> Known.MISINFORMATION
                FRAUD_SCAMS -> Known.FRAUD_SCAMS
                PRIVACY_VIOLATION -> Known.PRIVACY_VIOLATION
                HARMFUL_MINORS -> Known.HARMFUL_MINORS
                IP_VIOLATION -> Known.IP_VIOLATION
                OTHER -> Known.OTHER
                CHAT_NOT_NATURAL -> Known.CHAT_NOT_NATURAL
                CHARACTER_MISMATCH -> Known.CHARACTER_MISMATCH
                APP_SLOW -> Known.APP_SLOW
                FEATURE_HARD_TO_FIND -> Known.FEATURE_HARD_TO_FIND
                UI_INCONVENIENT -> Known.UI_INCONVENIENT
                NEW_FEATURE -> Known.NEW_FEATURE
                else -> throw IntyInvalidDataException("Unknown ReasonCode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IntyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ReasonCode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IntyInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReasonCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** 举报或者反馈的类型，为空时默认为 REPORT */
    class ReportType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val REPORT = of("REPORT")

            val FEEDBACK = of("FEEDBACK")

            fun of(value: String) = ReportType(JsonField.of(value))
        }

        /** An enum containing [ReportType]'s known values. */
        enum class Known {
            REPORT,
            FEEDBACK,
        }

        /**
         * An enum containing [ReportType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReportType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REPORT,
            FEEDBACK,
            /**
             * An enum member indicating that [ReportType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REPORT -> Value.REPORT
                FEEDBACK -> Value.FEEDBACK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IntyInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                REPORT -> Known.REPORT
                FEEDBACK -> Known.FEEDBACK
                else -> throw IntyInvalidDataException("Unknown ReportType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IntyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ReportType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IntyInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReportType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
