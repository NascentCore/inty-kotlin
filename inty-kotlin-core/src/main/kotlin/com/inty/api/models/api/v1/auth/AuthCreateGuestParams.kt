// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.Params
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/** 创建游客账号 */
class AuthCreateGuestParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun ageGroup(): String? = body.ageGroup()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun deviceId(): String? = body.deviceId()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun systemLanguage(): String? = body.systemLanguage()

    /**
     * Returns the raw JSON value of [ageGroup].
     *
     * Unlike [ageGroup], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ageGroup(): JsonField<String> = body._ageGroup()

    /**
     * Returns the raw JSON value of [deviceId].
     *
     * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deviceId(): JsonField<String> = body._deviceId()

    /**
     * Returns the raw JSON value of [systemLanguage].
     *
     * Unlike [systemLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _systemLanguage(): JsonField<String> = body._systemLanguage()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): AuthCreateGuestParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuthCreateGuestParams]. */
        fun builder() = Builder()
    }

    /** A builder for [AuthCreateGuestParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(authCreateGuestParams: AuthCreateGuestParams) = apply {
            body = authCreateGuestParams.body.toBuilder()
            additionalHeaders = authCreateGuestParams.additionalHeaders.toBuilder()
            additionalQueryParams = authCreateGuestParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [ageGroup]
         * - [deviceId]
         * - [systemLanguage]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun ageGroup(ageGroup: String?) = apply { body.ageGroup(ageGroup) }

        /**
         * Sets [Builder.ageGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ageGroup] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ageGroup(ageGroup: JsonField<String>) = apply { body.ageGroup(ageGroup) }

        fun deviceId(deviceId: String?) = apply { body.deviceId(deviceId) }

        /**
         * Sets [Builder.deviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deviceId(deviceId: JsonField<String>) = apply { body.deviceId(deviceId) }

        fun systemLanguage(systemLanguage: String?) = apply { body.systemLanguage(systemLanguage) }

        /**
         * Sets [Builder.systemLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun systemLanguage(systemLanguage: JsonField<String>) = apply {
            body.systemLanguage(systemLanguage)
        }

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
         * Returns an immutable instance of [AuthCreateGuestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthCreateGuestParams =
            AuthCreateGuestParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** 游客请求 */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ageGroup: JsonField<String>,
        private val deviceId: JsonField<String>,
        private val systemLanguage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("age_group")
            @ExcludeMissing
            ageGroup: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_id")
            @ExcludeMissing
            deviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("system_language")
            @ExcludeMissing
            systemLanguage: JsonField<String> = JsonMissing.of(),
        ) : this(ageGroup, deviceId, systemLanguage, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ageGroup(): String? = ageGroup.getNullable("age_group")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceId(): String? = deviceId.getNullable("device_id")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun systemLanguage(): String? = systemLanguage.getNullable("system_language")

        /**
         * Returns the raw JSON value of [ageGroup].
         *
         * Unlike [ageGroup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("age_group") @ExcludeMissing fun _ageGroup(): JsonField<String> = ageGroup

        /**
         * Returns the raw JSON value of [deviceId].
         *
         * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

        /**
         * Returns the raw JSON value of [systemLanguage].
         *
         * Unlike [systemLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("system_language")
        @ExcludeMissing
        fun _systemLanguage(): JsonField<String> = systemLanguage

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var ageGroup: JsonField<String> = JsonMissing.of()
            private var deviceId: JsonField<String> = JsonMissing.of()
            private var systemLanguage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                ageGroup = body.ageGroup
                deviceId = body.deviceId
                systemLanguage = body.systemLanguage
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun ageGroup(ageGroup: String?) = ageGroup(JsonField.ofNullable(ageGroup))

            /**
             * Sets [Builder.ageGroup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ageGroup] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ageGroup(ageGroup: JsonField<String>) = apply { this.ageGroup = ageGroup }

            fun deviceId(deviceId: String?) = deviceId(JsonField.ofNullable(deviceId))

            /**
             * Sets [Builder.deviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

            fun systemLanguage(systemLanguage: String?) =
                systemLanguage(JsonField.ofNullable(systemLanguage))

            /**
             * Sets [Builder.systemLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun systemLanguage(systemLanguage: JsonField<String>) = apply {
                this.systemLanguage = systemLanguage
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
             */
            fun build(): Body =
                Body(ageGroup, deviceId, systemLanguage, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ageGroup()
            deviceId()
            systemLanguage()
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
            (if (ageGroup.asKnown() == null) 0 else 1) +
                (if (deviceId.asKnown() == null) 0 else 1) +
                (if (systemLanguage.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                ageGroup == other.ageGroup &&
                deviceId == other.deviceId &&
                systemLanguage == other.systemLanguage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ageGroup, deviceId, systemLanguage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ageGroup=$ageGroup, deviceId=$deviceId, systemLanguage=$systemLanguage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCreateGuestParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthCreateGuestParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
