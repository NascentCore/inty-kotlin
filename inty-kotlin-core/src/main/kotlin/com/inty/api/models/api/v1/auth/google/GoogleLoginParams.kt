// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth.google

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.Params
import com.inty.api.core.checkRequired
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import com.inty.api.errors.IntyInvalidDataException
import com.inty.api.models.api.v1.users.profile.Gender
import java.util.Collections
import java.util.Objects

/** Google登录 */
class GoogleLoginParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idToken(): String = body.idToken()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun requestId(): String? = body.requestId()

    /**
     * 用户信息
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun userInfo(): UserInfo? = body.userInfo()

    /**
     * Returns the raw JSON value of [idToken].
     *
     * Unlike [idToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idToken(): JsonField<String> = body._idToken()

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestId(): JsonField<String> = body._requestId()

    /**
     * Returns the raw JSON value of [userInfo].
     *
     * Unlike [userInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userInfo(): JsonField<UserInfo> = body._userInfo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GoogleLoginParams].
         *
         * The following fields are required:
         * ```kotlin
         * .idToken()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [GoogleLoginParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(googleLoginParams: GoogleLoginParams) = apply {
            body = googleLoginParams.body.toBuilder()
            additionalHeaders = googleLoginParams.additionalHeaders.toBuilder()
            additionalQueryParams = googleLoginParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [idToken]
         * - [requestId]
         * - [userInfo]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun idToken(idToken: String) = apply { body.idToken(idToken) }

        /**
         * Sets [Builder.idToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idToken] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idToken(idToken: JsonField<String>) = apply { body.idToken(idToken) }

        fun requestId(requestId: String?) = apply { body.requestId(requestId) }

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { body.requestId(requestId) }

        /** 用户信息 */
        fun userInfo(userInfo: UserInfo?) = apply { body.userInfo(userInfo) }

        /**
         * Sets [Builder.userInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userInfo] with a well-typed [UserInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userInfo(userInfo: JsonField<UserInfo>) = apply { body.userInfo(userInfo) }

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
         * Returns an immutable instance of [GoogleLoginParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .idToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GoogleLoginParams =
            GoogleLoginParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Google认证请求 */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val idToken: JsonField<String>,
        private val requestId: JsonField<String>,
        private val userInfo: JsonField<UserInfo>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id_token") @ExcludeMissing idToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_info")
            @ExcludeMissing
            userInfo: JsonField<UserInfo> = JsonMissing.of(),
        ) : this(idToken, requestId, userInfo, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun idToken(): String = idToken.getRequired("id_token")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

        /**
         * 用户信息
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userInfo(): UserInfo? = userInfo.getNullable("user_info")

        /**
         * Returns the raw JSON value of [idToken].
         *
         * Unlike [idToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id_token") @ExcludeMissing fun _idToken(): JsonField<String> = idToken

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

        /**
         * Returns the raw JSON value of [userInfo].
         *
         * Unlike [userInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_info") @ExcludeMissing fun _userInfo(): JsonField<UserInfo> = userInfo

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
             * .idToken()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var idToken: JsonField<String>? = null
            private var requestId: JsonField<String> = JsonMissing.of()
            private var userInfo: JsonField<UserInfo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                idToken = body.idToken
                requestId = body.requestId
                userInfo = body.userInfo
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun idToken(idToken: String) = idToken(JsonField.of(idToken))

            /**
             * Sets [Builder.idToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idToken] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idToken(idToken: JsonField<String>) = apply { this.idToken = idToken }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            /** 用户信息 */
            fun userInfo(userInfo: UserInfo?) = userInfo(JsonField.ofNullable(userInfo))

            /**
             * Sets [Builder.userInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userInfo] with a well-typed [UserInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userInfo(userInfo: JsonField<UserInfo>) = apply { this.userInfo = userInfo }

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
             * .idToken()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("idToken", idToken),
                    requestId,
                    userInfo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            idToken()
            requestId()
            userInfo()?.validate()
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
            (if (idToken.asKnown() == null) 0 else 1) +
                (if (requestId.asKnown() == null) 0 else 1) +
                (userInfo.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                idToken == other.idToken &&
                requestId == other.requestId &&
                userInfo == other.userInfo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(idToken, requestId, userInfo, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{idToken=$idToken, requestId=$requestId, userInfo=$userInfo, additionalProperties=$additionalProperties}"
    }

    /** 用户信息 */
    class UserInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ageGroup: JsonField<String>,
        private val gender: JsonField<Gender>,
        private val systemLanguage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("age_group")
            @ExcludeMissing
            ageGroup: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<Gender> = JsonMissing.of(),
            @JsonProperty("system_language")
            @ExcludeMissing
            systemLanguage: JsonField<String> = JsonMissing.of(),
        ) : this(ageGroup, gender, systemLanguage, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ageGroup(): String = ageGroup.getRequired("age_group")

        /**
         * 性别
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gender(): Gender = gender.getRequired("gender")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun systemLanguage(): String = systemLanguage.getRequired("system_language")

        /**
         * Returns the raw JSON value of [ageGroup].
         *
         * Unlike [ageGroup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("age_group") @ExcludeMissing fun _ageGroup(): JsonField<String> = ageGroup

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

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

            /**
             * Returns a mutable builder for constructing an instance of [UserInfo].
             *
             * The following fields are required:
             * ```kotlin
             * .ageGroup()
             * .gender()
             * .systemLanguage()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UserInfo]. */
        class Builder internal constructor() {

            private var ageGroup: JsonField<String>? = null
            private var gender: JsonField<Gender>? = null
            private var systemLanguage: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(userInfo: UserInfo) = apply {
                ageGroup = userInfo.ageGroup
                gender = userInfo.gender
                systemLanguage = userInfo.systemLanguage
                additionalProperties = userInfo.additionalProperties.toMutableMap()
            }

            fun ageGroup(ageGroup: String) = ageGroup(JsonField.of(ageGroup))

            /**
             * Sets [Builder.ageGroup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ageGroup] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ageGroup(ageGroup: JsonField<String>) = apply { this.ageGroup = ageGroup }

            /** 性别 */
            fun gender(gender: Gender) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [Gender] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

            fun systemLanguage(systemLanguage: String) =
                systemLanguage(JsonField.of(systemLanguage))

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
             * Returns an immutable instance of [UserInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .ageGroup()
             * .gender()
             * .systemLanguage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UserInfo =
                UserInfo(
                    checkRequired("ageGroup", ageGroup),
                    checkRequired("gender", gender),
                    checkRequired("systemLanguage", systemLanguage),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UserInfo = apply {
            if (validated) {
                return@apply
            }

            ageGroup()
            gender().validate()
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
                (gender.asKnown()?.validity() ?: 0) +
                (if (systemLanguage.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UserInfo &&
                ageGroup == other.ageGroup &&
                gender == other.gender &&
                systemLanguage == other.systemLanguage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ageGroup, gender, systemLanguage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UserInfo{ageGroup=$ageGroup, gender=$gender, systemLanguage=$systemLanguage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GoogleLoginParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GoogleLoginParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
