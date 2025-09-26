// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.auth.google

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.Enum
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.checkRequired
import com.inty.api.errors.IntyInvalidDataException
import com.inty.api.models.api.v1.users.profile.Gender
import java.util.Collections
import java.util.Objects

class GoogleLoginResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<Long>,
    private val data: JsonField<Data>,
    private val message: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
    ) : this(code, data, message, mutableMapOf())

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun code(): Long? = code.getNullable("code")

    /**
     * 登录响应
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun data(): Data? = data.getNullable("data")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun message(): String? = message.getNullable("message")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [GoogleLoginResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [GoogleLoginResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(googleLoginResponse: GoogleLoginResponse) = apply {
            code = googleLoginResponse.code
            data = googleLoginResponse.data
            message = googleLoginResponse.message
            additionalProperties = googleLoginResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 登录响应 */
        fun data(data: Data?) = data(JsonField.ofNullable(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [GoogleLoginResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GoogleLoginResponse =
            GoogleLoginResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): GoogleLoginResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        data()?.validate()
        message()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (code.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (if (message.asKnown() == null) 0 else 1)

    /** 登录响应 */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val user: JsonField<User>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
        ) : this(token, user, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * 登录用户响应
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun user(): User = user.getRequired("user")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .token()
             * .user()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var user: JsonField<User>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                token = data.token
                user = data.user
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** 登录用户响应 */
            fun user(user: User) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [User] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<User>) = apply { this.user = user }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .token()
             * .user()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("token", token),
                    checkRequired("user", user),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            token()
            user().validate()
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
            (if (token.asKnown() == null) 0 else 1) + (user.asKnown()?.validity() ?: 0)

        /** 登录用户响应 */
        class User
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val authType: JsonField<AuthType>,
            private val avatar: JsonField<String>,
            private val email: JsonField<String>,
            private val isNewUser: JsonField<Boolean>,
            private val nickname: JsonField<String>,
            private val ageGroup: JsonField<String>,
            private val gender: JsonField<Gender>,
            private val phone: JsonField<String>,
            private val systemLanguage: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_type")
                @ExcludeMissing
                authType: JsonField<AuthType> = JsonMissing.of(),
                @JsonProperty("avatar")
                @ExcludeMissing
                avatar: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_new_user")
                @ExcludeMissing
                isNewUser: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("nickname")
                @ExcludeMissing
                nickname: JsonField<String> = JsonMissing.of(),
                @JsonProperty("age_group")
                @ExcludeMissing
                ageGroup: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gender")
                @ExcludeMissing
                gender: JsonField<Gender> = JsonMissing.of(),
                @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
                @JsonProperty("system_language")
                @ExcludeMissing
                systemLanguage: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                authType,
                avatar,
                email,
                isNewUser,
                nickname,
                ageGroup,
                gender,
                phone,
                systemLanguage,
                mutableMapOf(),
            )

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * 认证类型
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun authType(): AuthType = authType.getRequired("auth_type")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun avatar(): String = avatar.getRequired("avatar")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isNewUser(): Boolean = isNewUser.getRequired("is_new_user")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nickname(): String = nickname.getRequired("nickname")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ageGroup(): String? = ageGroup.getNullable("age_group")

            /**
             * 性别
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun gender(): Gender? = gender.getNullable("gender")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phone(): String? = phone.getNullable("phone")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun systemLanguage(): String? = systemLanguage.getNullable("system_language")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [authType].
             *
             * Unlike [authType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_type")
            @ExcludeMissing
            fun _authType(): JsonField<AuthType> = authType

            /**
             * Returns the raw JSON value of [avatar].
             *
             * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<String> = avatar

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [isNewUser].
             *
             * Unlike [isNewUser], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_new_user")
            @ExcludeMissing
            fun _isNewUser(): JsonField<Boolean> = isNewUser

            /**
             * Returns the raw JSON value of [nickname].
             *
             * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

            /**
             * Returns the raw JSON value of [ageGroup].
             *
             * Unlike [ageGroup], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("age_group") @ExcludeMissing fun _ageGroup(): JsonField<String> = ageGroup

            /**
             * Returns the raw JSON value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

            /**
             * Returns the raw JSON value of [phone].
             *
             * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

            /**
             * Returns the raw JSON value of [systemLanguage].
             *
             * Unlike [systemLanguage], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .authType()
                 * .avatar()
                 * .email()
                 * .isNewUser()
                 * .nickname()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var authType: JsonField<AuthType>? = null
                private var avatar: JsonField<String>? = null
                private var email: JsonField<String>? = null
                private var isNewUser: JsonField<Boolean>? = null
                private var nickname: JsonField<String>? = null
                private var ageGroup: JsonField<String> = JsonMissing.of()
                private var gender: JsonField<Gender> = JsonMissing.of()
                private var phone: JsonField<String> = JsonMissing.of()
                private var systemLanguage: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(user: User) = apply {
                    id = user.id
                    authType = user.authType
                    avatar = user.avatar
                    email = user.email
                    isNewUser = user.isNewUser
                    nickname = user.nickname
                    ageGroup = user.ageGroup
                    gender = user.gender
                    phone = user.phone
                    systemLanguage = user.systemLanguage
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** 认证类型 */
                fun authType(authType: AuthType) = authType(JsonField.of(authType))

                /**
                 * Sets [Builder.authType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authType] with a well-typed [AuthType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authType(authType: JsonField<AuthType>) = apply { this.authType = authType }

                fun avatar(avatar: String) = avatar(JsonField.of(avatar))

                /**
                 * Sets [Builder.avatar] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.avatar] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun isNewUser(isNewUser: Boolean) = isNewUser(JsonField.of(isNewUser))

                /**
                 * Sets [Builder.isNewUser] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isNewUser] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isNewUser(isNewUser: JsonField<Boolean>) = apply { this.isNewUser = isNewUser }

                fun nickname(nickname: String) = nickname(JsonField.of(nickname))

                /**
                 * Sets [Builder.nickname] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nickname] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

                fun ageGroup(ageGroup: String?) = ageGroup(JsonField.ofNullable(ageGroup))

                /**
                 * Sets [Builder.ageGroup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ageGroup] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ageGroup(ageGroup: JsonField<String>) = apply { this.ageGroup = ageGroup }

                /** 性别 */
                fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

                fun phone(phone: String?) = phone(JsonField.ofNullable(phone))

                /**
                 * Sets [Builder.phone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phone] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                fun systemLanguage(systemLanguage: String?) =
                    systemLanguage(JsonField.ofNullable(systemLanguage))

                /**
                 * Sets [Builder.systemLanguage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.systemLanguage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .authType()
                 * .avatar()
                 * .email()
                 * .isNewUser()
                 * .nickname()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(
                        checkRequired("id", id),
                        checkRequired("authType", authType),
                        checkRequired("avatar", avatar),
                        checkRequired("email", email),
                        checkRequired("isNewUser", isNewUser),
                        checkRequired("nickname", nickname),
                        ageGroup,
                        gender,
                        phone,
                        systemLanguage,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                id()
                authType().validate()
                avatar()
                email()
                isNewUser()
                nickname()
                ageGroup()
                gender()?.validate()
                phone()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (authType.asKnown()?.validity() ?: 0) +
                    (if (avatar.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (if (isNewUser.asKnown() == null) 0 else 1) +
                    (if (nickname.asKnown() == null) 0 else 1) +
                    (if (ageGroup.asKnown() == null) 0 else 1) +
                    (gender.asKnown()?.validity() ?: 0) +
                    (if (phone.asKnown() == null) 0 else 1) +
                    (if (systemLanguage.asKnown() == null) 0 else 1)

            /** 认证类型 */
            class AuthType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PHONE = of("PHONE")

                    val GOOGLE = of("GOOGLE")

                    val GUEST = of("GUEST")

                    fun of(value: String) = AuthType(JsonField.of(value))
                }

                /** An enum containing [AuthType]'s known values. */
                enum class Known {
                    PHONE,
                    GOOGLE,
                    GUEST,
                }

                /**
                 * An enum containing [AuthType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AuthType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PHONE,
                    GOOGLE,
                    GUEST,
                    /**
                     * An enum member indicating that [AuthType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PHONE -> Value.PHONE
                        GOOGLE -> Value.GOOGLE
                        GUEST -> Value.GUEST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IntyInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        PHONE -> Known.PHONE
                        GOOGLE -> Known.GOOGLE
                        GUEST -> Known.GUEST
                        else -> throw IntyInvalidDataException("Unknown AuthType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IntyInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): AuthType = apply {
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

                    return other is AuthType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    id == other.id &&
                    authType == other.authType &&
                    avatar == other.avatar &&
                    email == other.email &&
                    isNewUser == other.isNewUser &&
                    nickname == other.nickname &&
                    ageGroup == other.ageGroup &&
                    gender == other.gender &&
                    phone == other.phone &&
                    systemLanguage == other.systemLanguage &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    authType,
                    avatar,
                    email,
                    isNewUser,
                    nickname,
                    ageGroup,
                    gender,
                    phone,
                    systemLanguage,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{id=$id, authType=$authType, avatar=$avatar, email=$email, isNewUser=$isNewUser, nickname=$nickname, ageGroup=$ageGroup, gender=$gender, phone=$phone, systemLanguage=$systemLanguage, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                token == other.token &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(token, user, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{token=$token, user=$user, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GoogleLoginResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GoogleLoginResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
