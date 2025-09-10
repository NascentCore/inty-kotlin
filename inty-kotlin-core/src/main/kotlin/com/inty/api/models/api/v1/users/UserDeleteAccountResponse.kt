// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

class UserDeleteAccountResponse
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
     * 账户删除响应
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
         * Returns a mutable builder for constructing an instance of [UserDeleteAccountResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [UserDeleteAccountResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userDeleteAccountResponse: UserDeleteAccountResponse) = apply {
            code = userDeleteAccountResponse.code
            data = userDeleteAccountResponse.data
            message = userDeleteAccountResponse.message
            additionalProperties = userDeleteAccountResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 账户删除响应 */
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
         * Returns an immutable instance of [UserDeleteAccountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserDeleteAccountResponse =
            UserDeleteAccountResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UserDeleteAccountResponse = apply {
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

    /** 账户删除响应 */
    class Data
    private constructor(
        private val message: JsonField<String>,
        private val success: JsonField<Boolean>,
        private val userId: JsonField<String>,
        private val anonymizedFields: JsonField<List<String>>,
        private val deletionLogId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("anonymized_fields")
            @ExcludeMissing
            anonymizedFields: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("deletion_log_id")
            @ExcludeMissing
            deletionLogId: JsonField<String> = JsonMissing.of(),
        ) : this(message, success, userId, anonymizedFields, deletionLogId, mutableMapOf())

        /**
         * 删除结果消息
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * 是否删除成功
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun success(): Boolean = success.getRequired("success")

        /**
         * 用户 ID
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * 已匿名化的字段列表
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun anonymizedFields(): List<String>? = anonymizedFields.getNullable("anonymized_fields")

        /**
         * 删除日志 ID
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deletionLogId(): String? = deletionLogId.getNullable("deletion_log_id")

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [success].
         *
         * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [anonymizedFields].
         *
         * Unlike [anonymizedFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("anonymized_fields")
        @ExcludeMissing
        fun _anonymizedFields(): JsonField<List<String>> = anonymizedFields

        /**
         * Returns the raw JSON value of [deletionLogId].
         *
         * Unlike [deletionLogId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deletion_log_id")
        @ExcludeMissing
        fun _deletionLogId(): JsonField<String> = deletionLogId

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
             * .message()
             * .success()
             * .userId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var message: JsonField<String>? = null
            private var success: JsonField<Boolean>? = null
            private var userId: JsonField<String>? = null
            private var anonymizedFields: JsonField<MutableList<String>>? = null
            private var deletionLogId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                message = data.message
                success = data.success
                userId = data.userId
                anonymizedFields = data.anonymizedFields.map { it.toMutableList() }
                deletionLogId = data.deletionLogId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** 删除结果消息 */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** 是否删除成功 */
            fun success(success: Boolean) = success(JsonField.of(success))

            /**
             * Sets [Builder.success] to an arbitrary JSON value.
             *
             * You should usually call [Builder.success] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonField<Boolean>) = apply { this.success = success }

            /** 用户 ID */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** 已匿名化的字段列表 */
            fun anonymizedFields(anonymizedFields: List<String>?) =
                anonymizedFields(JsonField.ofNullable(anonymizedFields))

            /**
             * Sets [Builder.anonymizedFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.anonymizedFields] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun anonymizedFields(anonymizedFields: JsonField<List<String>>) = apply {
                this.anonymizedFields = anonymizedFields.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [anonymizedFields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAnonymizedField(anonymizedField: String) = apply {
                anonymizedFields =
                    (anonymizedFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("anonymizedFields", it).add(anonymizedField)
                    }
            }

            /** 删除日志 ID */
            fun deletionLogId(deletionLogId: String?) =
                deletionLogId(JsonField.ofNullable(deletionLogId))

            /**
             * Sets [Builder.deletionLogId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletionLogId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deletionLogId(deletionLogId: JsonField<String>) = apply {
                this.deletionLogId = deletionLogId
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
             * .message()
             * .success()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("message", message),
                    checkRequired("success", success),
                    checkRequired("userId", userId),
                    (anonymizedFields ?: JsonMissing.of()).map { it.toImmutable() },
                    deletionLogId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            message()
            success()
            userId()
            anonymizedFields()
            deletionLogId()
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
            (if (message.asKnown() == null) 0 else 1) +
                (if (success.asKnown() == null) 0 else 1) +
                (if (userId.asKnown() == null) 0 else 1) +
                (anonymizedFields.asKnown()?.size ?: 0) +
                (if (deletionLogId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                message == other.message &&
                success == other.success &&
                userId == other.userId &&
                anonymizedFields == other.anonymizedFields &&
                deletionLogId == other.deletionLogId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                message,
                success,
                userId,
                anonymizedFields,
                deletionLogId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{message=$message, success=$success, userId=$userId, anonymizedFields=$anonymizedFields, deletionLogId=$deletionLogId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserDeleteAccountResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserDeleteAccountResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
