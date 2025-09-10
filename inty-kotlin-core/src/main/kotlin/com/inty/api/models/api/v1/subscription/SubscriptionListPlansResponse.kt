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
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import com.inty.api.models.api.v1.subscription.admin.plans.SubscriptionPlan
import java.util.Collections
import java.util.Objects

class SubscriptionListPlansResponse
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
     * 订阅计划列表响应
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
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionListPlansResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionListPlansResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionListPlansResponse: SubscriptionListPlansResponse) = apply {
            code = subscriptionListPlansResponse.code
            data = subscriptionListPlansResponse.data
            message = subscriptionListPlansResponse.message
            additionalProperties = subscriptionListPlansResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 订阅计划列表响应 */
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
         * Returns an immutable instance of [SubscriptionListPlansResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionListPlansResponse =
            SubscriptionListPlansResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionListPlansResponse = apply {
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

    /** 订阅计划列表响应 */
    class Data
    private constructor(
        private val plans: JsonField<List<SubscriptionPlan>>,
        private val currentSubscription: JsonField<UserSubscription>,
        private val hasEverSubscribed: JsonField<Boolean>,
        private val previousPlanId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("plans")
            @ExcludeMissing
            plans: JsonField<List<SubscriptionPlan>> = JsonMissing.of(),
            @JsonProperty("current_subscription")
            @ExcludeMissing
            currentSubscription: JsonField<UserSubscription> = JsonMissing.of(),
            @JsonProperty("has_ever_subscribed")
            @ExcludeMissing
            hasEverSubscribed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("previous_plan_id")
            @ExcludeMissing
            previousPlanId: JsonField<String> = JsonMissing.of(),
        ) : this(plans, currentSubscription, hasEverSubscribed, previousPlanId, mutableMapOf())

        /**
         * 订阅计划列表
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun plans(): List<SubscriptionPlan> = plans.getRequired("plans")

        /**
         * 用户订阅响应模型
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentSubscription(): UserSubscription? =
            currentSubscription.getNullable("current_subscription")

        /**
         * 是否曾经有过订阅记录
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasEverSubscribed(): Boolean? = hasEverSubscribed.getNullable("has_ever_subscribed")

        /**
         * 最新的订阅计划 ID
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previousPlanId(): String? = previousPlanId.getNullable("previous_plan_id")

        /**
         * Returns the raw JSON value of [plans].
         *
         * Unlike [plans], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plans")
        @ExcludeMissing
        fun _plans(): JsonField<List<SubscriptionPlan>> = plans

        /**
         * Returns the raw JSON value of [currentSubscription].
         *
         * Unlike [currentSubscription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_subscription")
        @ExcludeMissing
        fun _currentSubscription(): JsonField<UserSubscription> = currentSubscription

        /**
         * Returns the raw JSON value of [hasEverSubscribed].
         *
         * Unlike [hasEverSubscribed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("has_ever_subscribed")
        @ExcludeMissing
        fun _hasEverSubscribed(): JsonField<Boolean> = hasEverSubscribed

        /**
         * Returns the raw JSON value of [previousPlanId].
         *
         * Unlike [previousPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_plan_id")
        @ExcludeMissing
        fun _previousPlanId(): JsonField<String> = previousPlanId

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
             * .plans()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var plans: JsonField<MutableList<SubscriptionPlan>>? = null
            private var currentSubscription: JsonField<UserSubscription> = JsonMissing.of()
            private var hasEverSubscribed: JsonField<Boolean> = JsonMissing.of()
            private var previousPlanId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                plans = data.plans.map { it.toMutableList() }
                currentSubscription = data.currentSubscription
                hasEverSubscribed = data.hasEverSubscribed
                previousPlanId = data.previousPlanId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** 订阅计划列表 */
            fun plans(plans: List<SubscriptionPlan>) = plans(JsonField.of(plans))

            /**
             * Sets [Builder.plans] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plans] with a well-typed `List<SubscriptionPlan>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plans(plans: JsonField<List<SubscriptionPlan>>) = apply {
                this.plans = plans.map { it.toMutableList() }
            }

            /**
             * Adds a single [SubscriptionPlan] to [plans].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPlan(plan: SubscriptionPlan) = apply {
                plans =
                    (plans ?: JsonField.of(mutableListOf())).also {
                        checkKnown("plans", it).add(plan)
                    }
            }

            /** 用户订阅响应模型 */
            fun currentSubscription(currentSubscription: UserSubscription?) =
                currentSubscription(JsonField.ofNullable(currentSubscription))

            /**
             * Sets [Builder.currentSubscription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentSubscription] with a well-typed
             * [UserSubscription] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun currentSubscription(currentSubscription: JsonField<UserSubscription>) = apply {
                this.currentSubscription = currentSubscription
            }

            /** 是否曾经有过订阅记录 */
            fun hasEverSubscribed(hasEverSubscribed: Boolean) =
                hasEverSubscribed(JsonField.of(hasEverSubscribed))

            /**
             * Sets [Builder.hasEverSubscribed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasEverSubscribed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasEverSubscribed(hasEverSubscribed: JsonField<Boolean>) = apply {
                this.hasEverSubscribed = hasEverSubscribed
            }

            /** 最新的订阅计划 ID */
            fun previousPlanId(previousPlanId: String?) =
                previousPlanId(JsonField.ofNullable(previousPlanId))

            /**
             * Sets [Builder.previousPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousPlanId(previousPlanId: JsonField<String>) = apply {
                this.previousPlanId = previousPlanId
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
             * .plans()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("plans", plans).map { it.toImmutable() },
                    currentSubscription,
                    hasEverSubscribed,
                    previousPlanId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            plans().forEach { it.validate() }
            currentSubscription()?.validate()
            hasEverSubscribed()
            previousPlanId()
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
            (plans.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (currentSubscription.asKnown()?.validity() ?: 0) +
                (if (hasEverSubscribed.asKnown() == null) 0 else 1) +
                (if (previousPlanId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                plans == other.plans &&
                currentSubscription == other.currentSubscription &&
                hasEverSubscribed == other.hasEverSubscribed &&
                previousPlanId == other.previousPlanId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                plans,
                currentSubscription,
                hasEverSubscribed,
                previousPlanId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{plans=$plans, currentSubscription=$currentSubscription, hasEverSubscribed=$hasEverSubscribed, previousPlanId=$previousPlanId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListPlansResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionListPlansResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
