// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.checkRequired
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/** 清除消息响应 */
class AgentClearMessagesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deletedCount: JsonField<Long>,
    private val message: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val cutoffTimestamp: JsonField<String>,
    private val deletedTimeRange: JsonField<DeletedTimeRange>,
    private val targetMessage: JsonField<TargetMessage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deleted_count")
        @ExcludeMissing
        deletedCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cutoff_timestamp")
        @ExcludeMissing
        cutoffTimestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deleted_time_range")
        @ExcludeMissing
        deletedTimeRange: JsonField<DeletedTimeRange> = JsonMissing.of(),
        @JsonProperty("target_message")
        @ExcludeMissing
        targetMessage: JsonField<TargetMessage> = JsonMissing.of(),
    ) : this(
        deletedCount,
        message,
        success,
        cutoffTimestamp,
        deletedTimeRange,
        targetMessage,
        mutableMapOf(),
    )

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deletedCount(): Long = deletedCount.getRequired("deleted_count")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun cutoffTimestamp(): String? = cutoffTimestamp.getNullable("cutoff_timestamp")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun deletedTimeRange(): DeletedTimeRange? = deletedTimeRange.getNullable("deleted_time_range")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun targetMessage(): TargetMessage? = targetMessage.getNullable("target_message")

    /**
     * Returns the raw JSON value of [deletedCount].
     *
     * Unlike [deletedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted_count")
    @ExcludeMissing
    fun _deletedCount(): JsonField<Long> = deletedCount

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
     * Returns the raw JSON value of [cutoffTimestamp].
     *
     * Unlike [cutoffTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cutoff_timestamp")
    @ExcludeMissing
    fun _cutoffTimestamp(): JsonField<String> = cutoffTimestamp

    /**
     * Returns the raw JSON value of [deletedTimeRange].
     *
     * Unlike [deletedTimeRange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deleted_time_range")
    @ExcludeMissing
    fun _deletedTimeRange(): JsonField<DeletedTimeRange> = deletedTimeRange

    /**
     * Returns the raw JSON value of [targetMessage].
     *
     * Unlike [targetMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_message")
    @ExcludeMissing
    fun _targetMessage(): JsonField<TargetMessage> = targetMessage

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
         * Returns a mutable builder for constructing an instance of [AgentClearMessagesResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .deletedCount()
         * .message()
         * .success()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentClearMessagesResponse]. */
    class Builder internal constructor() {

        private var deletedCount: JsonField<Long>? = null
        private var message: JsonField<String>? = null
        private var success: JsonField<Boolean>? = null
        private var cutoffTimestamp: JsonField<String> = JsonMissing.of()
        private var deletedTimeRange: JsonField<DeletedTimeRange> = JsonMissing.of()
        private var targetMessage: JsonField<TargetMessage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentClearMessagesResponse: AgentClearMessagesResponse) = apply {
            deletedCount = agentClearMessagesResponse.deletedCount
            message = agentClearMessagesResponse.message
            success = agentClearMessagesResponse.success
            cutoffTimestamp = agentClearMessagesResponse.cutoffTimestamp
            deletedTimeRange = agentClearMessagesResponse.deletedTimeRange
            targetMessage = agentClearMessagesResponse.targetMessage
            additionalProperties = agentClearMessagesResponse.additionalProperties.toMutableMap()
        }

        fun deletedCount(deletedCount: Long) = deletedCount(JsonField.of(deletedCount))

        /**
         * Sets [Builder.deletedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deletedCount(deletedCount: JsonField<Long>) = apply { this.deletedCount = deletedCount }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun cutoffTimestamp(cutoffTimestamp: String?) =
            cutoffTimestamp(JsonField.ofNullable(cutoffTimestamp))

        /**
         * Sets [Builder.cutoffTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cutoffTimestamp] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cutoffTimestamp(cutoffTimestamp: JsonField<String>) = apply {
            this.cutoffTimestamp = cutoffTimestamp
        }

        fun deletedTimeRange(deletedTimeRange: DeletedTimeRange?) =
            deletedTimeRange(JsonField.ofNullable(deletedTimeRange))

        /**
         * Sets [Builder.deletedTimeRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedTimeRange] with a well-typed [DeletedTimeRange]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deletedTimeRange(deletedTimeRange: JsonField<DeletedTimeRange>) = apply {
            this.deletedTimeRange = deletedTimeRange
        }

        fun targetMessage(targetMessage: TargetMessage?) =
            targetMessage(JsonField.ofNullable(targetMessage))

        /**
         * Sets [Builder.targetMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetMessage] with a well-typed [TargetMessage] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetMessage(targetMessage: JsonField<TargetMessage>) = apply {
            this.targetMessage = targetMessage
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
         * Returns an immutable instance of [AgentClearMessagesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .deletedCount()
         * .message()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentClearMessagesResponse =
            AgentClearMessagesResponse(
                checkRequired("deletedCount", deletedCount),
                checkRequired("message", message),
                checkRequired("success", success),
                cutoffTimestamp,
                deletedTimeRange,
                targetMessage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AgentClearMessagesResponse = apply {
        if (validated) {
            return@apply
        }

        deletedCount()
        message()
        success()
        cutoffTimestamp()
        deletedTimeRange()?.validate()
        targetMessage()?.validate()
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
        (if (deletedCount.asKnown() == null) 0 else 1) +
            (if (message.asKnown() == null) 0 else 1) +
            (if (success.asKnown() == null) 0 else 1) +
            (if (cutoffTimestamp.asKnown() == null) 0 else 1) +
            (deletedTimeRange.asKnown()?.validity() ?: 0) +
            (targetMessage.asKnown()?.validity() ?: 0)

    class DeletedTimeRange
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [DeletedTimeRange]. */
            fun builder() = Builder()
        }

        /** A builder for [DeletedTimeRange]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(deletedTimeRange: DeletedTimeRange) = apply {
                additionalProperties = deletedTimeRange.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DeletedTimeRange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DeletedTimeRange = DeletedTimeRange(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): DeletedTimeRange = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeletedTimeRange && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DeletedTimeRange{additionalProperties=$additionalProperties}"
    }

    class TargetMessage
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [TargetMessage]. */
            fun builder() = Builder()
        }

        /** A builder for [TargetMessage]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(targetMessage: TargetMessage) = apply {
                additionalProperties = targetMessage.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TargetMessage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TargetMessage = TargetMessage(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): TargetMessage = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TargetMessage && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TargetMessage{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentClearMessagesResponse &&
            deletedCount == other.deletedCount &&
            message == other.message &&
            success == other.success &&
            cutoffTimestamp == other.cutoffTimestamp &&
            deletedTimeRange == other.deletedTimeRange &&
            targetMessage == other.targetMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            deletedCount,
            message,
            success,
            cutoffTimestamp,
            deletedTimeRange,
            targetMessage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentClearMessagesResponse{deletedCount=$deletedCount, message=$message, success=$success, cutoffTimestamp=$cutoffTimestamp, deletedTimeRange=$deletedTimeRange, targetMessage=$targetMessage, additionalProperties=$additionalProperties}"
}
