// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.checkRequired
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

class SubscriptionVerifyResponse
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
     * 购买验证响应
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

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionVerifyResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionVerifyResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionVerifyResponse: SubscriptionVerifyResponse) = apply {
            code = subscriptionVerifyResponse.code
            data = subscriptionVerifyResponse.data
            message = subscriptionVerifyResponse.message
            additionalProperties = subscriptionVerifyResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 购买验证响应 */
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
         * Returns an immutable instance of [SubscriptionVerifyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionVerifyResponse =
            SubscriptionVerifyResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionVerifyResponse = apply {
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

    /** 购买验证响应 */
    class Data
    private constructor(
        private val isValid: JsonField<Boolean>,
        private val isVerified: JsonField<Boolean>,
        private val message: JsonField<String>,
        private val errorCode: JsonField<String>,
        private val subscription: JsonField<UserSubscription>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_valid")
            @ExcludeMissing
            isValid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_verified")
            @ExcludeMissing
            isVerified: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_code")
            @ExcludeMissing
            errorCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscription")
            @ExcludeMissing
            subscription: JsonField<UserSubscription> = JsonMissing.of(),
        ) : this(isValid, isVerified, message, errorCode, subscription, mutableMapOf())

        /**
         * 是否有效，使用 is_verified 代替
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun isValid(): Boolean = isValid.getRequired("is_valid")

        /**
         * 是否有效
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isVerified(): Boolean = isVerified.getRequired("is_verified")

        /**
         * 验证消息
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * 错误代码
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorCode(): String? = errorCode.getNullable("error_code")

        /**
         * 用户订阅响应模型
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscription(): UserSubscription? = subscription.getNullable("subscription")

        /**
         * Returns the raw JSON value of [isValid].
         *
         * Unlike [isValid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("is_valid")
        @ExcludeMissing
        fun _isValid(): JsonField<Boolean> = isValid

        /**
         * Returns the raw JSON value of [isVerified].
         *
         * Unlike [isVerified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_verified")
        @ExcludeMissing
        fun _isVerified(): JsonField<Boolean> = isVerified

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [errorCode].
         *
         * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

        /**
         * Returns the raw JSON value of [subscription].
         *
         * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun _subscription(): JsonField<UserSubscription> = subscription

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
             * .isValid()
             * .isVerified()
             * .message()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var isValid: JsonField<Boolean>? = null
            private var isVerified: JsonField<Boolean>? = null
            private var message: JsonField<String>? = null
            private var errorCode: JsonField<String> = JsonMissing.of()
            private var subscription: JsonField<UserSubscription> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                isValid = data.isValid
                isVerified = data.isVerified
                message = data.message
                errorCode = data.errorCode
                subscription = data.subscription
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** 是否有效，使用 is_verified 代替 */
            @Deprecated("deprecated") fun isValid(isValid: Boolean) = isValid(JsonField.of(isValid))

            /**
             * Sets [Builder.isValid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isValid] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun isValid(isValid: JsonField<Boolean>) = apply { this.isValid = isValid }

            /** 是否有效 */
            fun isVerified(isVerified: Boolean) = isVerified(JsonField.of(isVerified))

            /**
             * Sets [Builder.isVerified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isVerified] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isVerified(isVerified: JsonField<Boolean>) = apply { this.isVerified = isVerified }

            /** 验证消息 */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** 错误代码 */
            fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

            /**
             * Sets [Builder.errorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

            /** 用户订阅响应模型 */
            fun subscription(subscription: UserSubscription?) =
                subscription(JsonField.ofNullable(subscription))

            /**
             * Sets [Builder.subscription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscription] with a well-typed [UserSubscription]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscription(subscription: JsonField<UserSubscription>) = apply {
                this.subscription = subscription
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .isValid()
             * .isVerified()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("isValid", isValid),
                    checkRequired("isVerified", isVerified),
                    checkRequired("message", message),
                    errorCode,
                    subscription,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            isValid()
            isVerified()
            message()
            errorCode()
            subscription()?.validate()
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
            (if (isValid.asKnown() == null) 0 else 1) +
                (if (isVerified.asKnown() == null) 0 else 1) +
                (if (message.asKnown() == null) 0 else 1) +
                (if (errorCode.asKnown() == null) 0 else 1) +
                (subscription.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                isValid == other.isValid &&
                isVerified == other.isVerified &&
                message == other.message &&
                errorCode == other.errorCode &&
                subscription == other.subscription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                isValid,
                isVerified,
                message,
                errorCode,
                subscription,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{isValid=$isValid, isVerified=$isVerified, message=$message, errorCode=$errorCode, subscription=$subscription, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionVerifyResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionVerifyResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
