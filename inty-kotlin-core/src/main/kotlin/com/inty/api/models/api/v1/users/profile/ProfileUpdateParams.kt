// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.profile

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

/** Update current user profile, support avatar update */
class ProfileUpdateParams
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
    fun avatar(): String? = body.avatar()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun email(): String? = body.email()

    /**
     * 性别
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun gender(): Gender? = body.gender()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun nickname(): String? = body.nickname()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun phone(): String? = body.phone()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun requestId(): String? = body.requestId()

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
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avatar(): JsonField<String> = body._avatar()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gender(): JsonField<Gender> = body._gender()

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nickname(): JsonField<String> = body._nickname()

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phone(): JsonField<String> = body._phone()

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestId(): JsonField<String> = body._requestId()

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

        fun none(): ProfileUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProfileUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ProfileUpdateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(profileUpdateParams: ProfileUpdateParams) = apply {
            body = profileUpdateParams.body.toBuilder()
            additionalHeaders = profileUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = profileUpdateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [ageGroup]
         * - [avatar]
         * - [description]
         * - [email]
         * - [gender]
         * - etc.
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

        fun avatar(avatar: String?) = apply { body.avatar(avatar) }

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { body.avatar(avatar) }

        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun email(email: String?) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** 性别 */
        fun gender(gender: Gender?) = apply { body.gender(gender) }

        /**
         * Sets [Builder.gender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gender] with a well-typed [Gender] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: JsonField<Gender>) = apply { body.gender(gender) }

        fun nickname(nickname: String?) = apply { body.nickname(nickname) }

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { body.nickname(nickname) }

        fun phone(phone: String?) = apply { body.phone(phone) }

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { body.phone(phone) }

        fun requestId(requestId: String?) = apply { body.requestId(requestId) }

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { body.requestId(requestId) }

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
         * Returns an immutable instance of [ProfileUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProfileUpdateParams =
            ProfileUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** 更新用户信息 */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ageGroup: JsonField<String>,
        private val avatar: JsonField<String>,
        private val description: JsonField<String>,
        private val email: JsonField<String>,
        private val gender: JsonField<Gender>,
        private val nickname: JsonField<String>,
        private val phone: JsonField<String>,
        private val requestId: JsonField<String>,
        private val systemLanguage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("age_group")
            @ExcludeMissing
            ageGroup: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<Gender> = JsonMissing.of(),
            @JsonProperty("nickname")
            @ExcludeMissing
            nickname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("system_language")
            @ExcludeMissing
            systemLanguage: JsonField<String> = JsonMissing.of(),
        ) : this(
            ageGroup,
            avatar,
            description,
            email,
            gender,
            nickname,
            phone,
            requestId,
            systemLanguage,
            mutableMapOf(),
        )

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ageGroup(): String? = ageGroup.getNullable("age_group")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun avatar(): String? = avatar.getNullable("avatar")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * 性别
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gender(): Gender? = gender.getNullable("gender")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nickname(): String? = nickname.getNullable("nickname")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phone(): String? = phone.getNullable("phone")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

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
         * Returns the raw JSON value of [avatar].
         *
         * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<String> = avatar

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

        /**
         * Returns the raw JSON value of [nickname].
         *
         * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
            private var avatar: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<Gender> = JsonMissing.of()
            private var nickname: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var systemLanguage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                ageGroup = body.ageGroup
                avatar = body.avatar
                description = body.description
                email = body.email
                gender = body.gender
                nickname = body.nickname
                phone = body.phone
                requestId = body.requestId
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

            fun avatar(avatar: String?) = avatar(JsonField.ofNullable(avatar))

            /**
             * Sets [Builder.avatar] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avatar] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

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

            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** 性别 */
            fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [Gender] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

            fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

            /**
             * Sets [Builder.nickname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nickname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

            fun phone(phone: String?) = phone(JsonField.ofNullable(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

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
                Body(
                    ageGroup,
                    avatar,
                    description,
                    email,
                    gender,
                    nickname,
                    phone,
                    requestId,
                    systemLanguage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ageGroup()
            avatar()
            description()
            email()
            gender()?.validate()
            nickname()
            phone()
            requestId()
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
                (if (avatar.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (gender.asKnown()?.validity() ?: 0) +
                (if (nickname.asKnown() == null) 0 else 1) +
                (if (phone.asKnown() == null) 0 else 1) +
                (if (requestId.asKnown() == null) 0 else 1) +
                (if (systemLanguage.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                ageGroup == other.ageGroup &&
                avatar == other.avatar &&
                description == other.description &&
                email == other.email &&
                gender == other.gender &&
                nickname == other.nickname &&
                phone == other.phone &&
                requestId == other.requestId &&
                systemLanguage == other.systemLanguage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                ageGroup,
                avatar,
                description,
                email,
                gender,
                nickname,
                phone,
                requestId,
                systemLanguage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ageGroup=$ageGroup, avatar=$avatar, description=$description, email=$email, gender=$gender, nickname=$nickname, phone=$phone, requestId=$requestId, systemLanguage=$systemLanguage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileUpdateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProfileUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
