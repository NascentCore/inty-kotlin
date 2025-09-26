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
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reasonIds(): List<Long> = body.reasonIds()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetId(): String = body.targetId()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetType(): TargetType = body.targetType()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun imageUrls(): List<String>? = body.imageUrls()

    /**
     * Returns the raw JSON value of [reasonIds].
     *
     * Unlike [reasonIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reasonIds(): JsonField<List<Long>> = body._reasonIds()

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
         * .reasonIds()
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
         * - [reasonIds]
         * - [targetId]
         * - [targetType]
         * - [description]
         * - [imageUrls]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun reasonIds(reasonIds: List<Long>) = apply { body.reasonIds(reasonIds) }

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

        fun targetId(targetId: String) = apply { body.targetId(targetId) }

        /**
         * Sets [Builder.targetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun targetId(targetId: JsonField<String>) = apply { body.targetId(targetId) }

        fun targetType(targetType: TargetType) = apply { body.targetType(targetType) }

        /**
         * Sets [Builder.targetType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetType] with a well-typed [TargetType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetType(targetType: JsonField<TargetType>) = apply { body.targetType(targetType) }

        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

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
         * .reasonIds()
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reasonIds: JsonField<List<Long>>,
        private val targetId: JsonField<String>,
        private val targetType: JsonField<TargetType>,
        private val description: JsonField<String>,
        private val imageUrls: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason_ids")
            @ExcludeMissing
            reasonIds: JsonField<List<Long>> = JsonMissing.of(),
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
        ) : this(reasonIds, targetId, targetType, description, imageUrls, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reasonIds(): List<Long> = reasonIds.getRequired("reason_ids")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetId(): String = targetId.getRequired("target_id")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetType(): TargetType = targetType.getRequired("target_type")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imageUrls(): List<String>? = imageUrls.getNullable("image_urls")

        /**
         * Returns the raw JSON value of [reasonIds].
         *
         * Unlike [reasonIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason_ids")
        @ExcludeMissing
        fun _reasonIds(): JsonField<List<Long>> = reasonIds

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
             * .reasonIds()
             * .targetId()
             * .targetType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var reasonIds: JsonField<MutableList<Long>>? = null
            private var targetId: JsonField<String>? = null
            private var targetType: JsonField<TargetType>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var imageUrls: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                reasonIds = body.reasonIds.map { it.toMutableList() }
                targetId = body.targetId
                targetType = body.targetType
                description = body.description
                imageUrls = body.imageUrls.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun reasonIds(reasonIds: List<Long>) = reasonIds(JsonField.of(reasonIds))

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

            fun targetId(targetId: String) = targetId(JsonField.of(targetId))

            /**
             * Sets [Builder.targetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

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
             * .reasonIds()
             * .targetId()
             * .targetType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("reasonIds", reasonIds).map { it.toImmutable() },
                    checkRequired("targetId", targetId),
                    checkRequired("targetType", targetType),
                    description,
                    (imageUrls ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            reasonIds()
            targetId()
            targetType().validate()
            description()
            imageUrls()
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
            (reasonIds.asKnown()?.size ?: 0) +
                (if (targetId.asKnown() == null) 0 else 1) +
                (targetType.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (imageUrls.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                reasonIds == other.reasonIds &&
                targetId == other.targetId &&
                targetType == other.targetType &&
                description == other.description &&
                imageUrls == other.imageUrls &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                reasonIds,
                targetId,
                targetType,
                description,
                imageUrls,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{reasonIds=$reasonIds, targetId=$targetId, targetType=$targetType, description=$description, imageUrls=$imageUrls, additionalProperties=$additionalProperties}"
    }

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
