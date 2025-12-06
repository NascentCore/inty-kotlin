// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription

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
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** 用户订阅响应模型 */
class UserSubscription
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val planId: JsonField<String>,
    private val userId: JsonField<String>,
    private val autoRenew: JsonField<Boolean>,
    private val endDate: JsonField<OffsetDateTime>,
    private val extraData: JsonField<ExtraData>,
    private val googlePlayOrderId: JsonField<String>,
    private val googlePlayPurchaseToken: JsonField<String>,
    private val googlePlaySubscriptionId: JsonField<String>,
    private val plan: JsonField<Plan>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val trialEndDate: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auto_renew")
        @ExcludeMissing
        autoRenew: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extra_data")
        @ExcludeMissing
        extraData: JsonField<ExtraData> = JsonMissing.of(),
        @JsonProperty("google_play_order_id")
        @ExcludeMissing
        googlePlayOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("google_play_purchase_token")
        @ExcludeMissing
        googlePlayPurchaseToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("google_play_subscription_id")
        @ExcludeMissing
        googlePlaySubscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("trial_end_date")
        @ExcludeMissing
        trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        planId,
        userId,
        autoRenew,
        endDate,
        extraData,
        googlePlayOrderId,
        googlePlayPurchaseToken,
        googlePlaySubscriptionId,
        plan,
        startDate,
        status,
        trialEndDate,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * 订阅计划ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = planId.getRequired("plan_id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * 是否自动续费
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun autoRenew(): Boolean? = autoRenew.getNullable("auto_renew")

    /**
     * 结束时间
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * 额外元数据
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun extraData(): ExtraData? = extraData.getNullable("extra_data")

    /**
     * Google Play订单ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun googlePlayOrderId(): String? = googlePlayOrderId.getNullable("google_play_order_id")

    /**
     * Google Play购买令牌
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun googlePlayPurchaseToken(): String? =
        googlePlayPurchaseToken.getNullable("google_play_purchase_token")

    /**
     * Google Play订阅ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun googlePlaySubscriptionId(): String? =
        googlePlaySubscriptionId.getNullable("google_play_subscription_id")

    /**
     * 订阅计划响应模型
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun plan(): Plan? = plan.getNullable("plan")

    /**
     * 开始时间
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

    /**
     * 订阅状态
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * 试用结束时间
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun trialEndDate(): OffsetDateTime? = trialEndDate.getNullable("trial_end_date")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [autoRenew].
     *
     * Unlike [autoRenew], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_renew") @ExcludeMissing fun _autoRenew(): JsonField<Boolean> = autoRenew

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [extraData].
     *
     * Unlike [extraData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra_data") @ExcludeMissing fun _extraData(): JsonField<ExtraData> = extraData

    /**
     * Returns the raw JSON value of [googlePlayOrderId].
     *
     * Unlike [googlePlayOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("google_play_order_id")
    @ExcludeMissing
    fun _googlePlayOrderId(): JsonField<String> = googlePlayOrderId

    /**
     * Returns the raw JSON value of [googlePlayPurchaseToken].
     *
     * Unlike [googlePlayPurchaseToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("google_play_purchase_token")
    @ExcludeMissing
    fun _googlePlayPurchaseToken(): JsonField<String> = googlePlayPurchaseToken

    /**
     * Returns the raw JSON value of [googlePlaySubscriptionId].
     *
     * Unlike [googlePlaySubscriptionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("google_play_subscription_id")
    @ExcludeMissing
    fun _googlePlaySubscriptionId(): JsonField<String> = googlePlaySubscriptionId

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [trialEndDate].
     *
     * Unlike [trialEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_end_date")
    @ExcludeMissing
    fun _trialEndDate(): JsonField<OffsetDateTime> = trialEndDate

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [UserSubscription].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .planId()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserSubscription]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var planId: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var autoRenew: JsonField<Boolean> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extraData: JsonField<ExtraData> = JsonMissing.of()
        private var googlePlayOrderId: JsonField<String> = JsonMissing.of()
        private var googlePlayPurchaseToken: JsonField<String> = JsonMissing.of()
        private var googlePlaySubscriptionId: JsonField<String> = JsonMissing.of()
        private var plan: JsonField<Plan> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var trialEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userSubscription: UserSubscription) = apply {
            id = userSubscription.id
            createdAt = userSubscription.createdAt
            planId = userSubscription.planId
            userId = userSubscription.userId
            autoRenew = userSubscription.autoRenew
            endDate = userSubscription.endDate
            extraData = userSubscription.extraData
            googlePlayOrderId = userSubscription.googlePlayOrderId
            googlePlayPurchaseToken = userSubscription.googlePlayPurchaseToken
            googlePlaySubscriptionId = userSubscription.googlePlaySubscriptionId
            plan = userSubscription.plan
            startDate = userSubscription.startDate
            status = userSubscription.status
            trialEndDate = userSubscription.trialEndDate
            updatedAt = userSubscription.updatedAt
            additionalProperties = userSubscription.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** 订阅计划ID */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** 是否自动续费 */
        fun autoRenew(autoRenew: Boolean) = autoRenew(JsonField.of(autoRenew))

        /**
         * Sets [Builder.autoRenew] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoRenew] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoRenew(autoRenew: JsonField<Boolean>) = apply { this.autoRenew = autoRenew }

        /** 结束时间 */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** 额外元数据 */
        fun extraData(extraData: ExtraData?) = extraData(JsonField.ofNullable(extraData))

        /**
         * Sets [Builder.extraData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extraData] with a well-typed [ExtraData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extraData(extraData: JsonField<ExtraData>) = apply { this.extraData = extraData }

        /** Google Play订单ID */
        fun googlePlayOrderId(googlePlayOrderId: String?) =
            googlePlayOrderId(JsonField.ofNullable(googlePlayOrderId))

        /**
         * Sets [Builder.googlePlayOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.googlePlayOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun googlePlayOrderId(googlePlayOrderId: JsonField<String>) = apply {
            this.googlePlayOrderId = googlePlayOrderId
        }

        /** Google Play购买令牌 */
        fun googlePlayPurchaseToken(googlePlayPurchaseToken: String?) =
            googlePlayPurchaseToken(JsonField.ofNullable(googlePlayPurchaseToken))

        /**
         * Sets [Builder.googlePlayPurchaseToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.googlePlayPurchaseToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun googlePlayPurchaseToken(googlePlayPurchaseToken: JsonField<String>) = apply {
            this.googlePlayPurchaseToken = googlePlayPurchaseToken
        }

        /** Google Play订阅ID */
        fun googlePlaySubscriptionId(googlePlaySubscriptionId: String?) =
            googlePlaySubscriptionId(JsonField.ofNullable(googlePlaySubscriptionId))

        /**
         * Sets [Builder.googlePlaySubscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.googlePlaySubscriptionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun googlePlaySubscriptionId(googlePlaySubscriptionId: JsonField<String>) = apply {
            this.googlePlaySubscriptionId = googlePlaySubscriptionId
        }

        /** 订阅计划响应模型 */
        fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** 开始时间 */
        fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** 订阅状态 */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** 试用结束时间 */
        fun trialEndDate(trialEndDate: OffsetDateTime?) =
            trialEndDate(JsonField.ofNullable(trialEndDate))

        /**
         * Sets [Builder.trialEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialEndDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialEndDate(trialEndDate: JsonField<OffsetDateTime>) = apply {
            this.trialEndDate = trialEndDate
        }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [UserSubscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .planId()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserSubscription =
            UserSubscription(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("planId", planId),
                checkRequired("userId", userId),
                autoRenew,
                endDate,
                extraData,
                googlePlayOrderId,
                googlePlayPurchaseToken,
                googlePlaySubscriptionId,
                plan,
                startDate,
                status,
                trialEndDate,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserSubscription = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        planId()
        userId()
        autoRenew()
        endDate()
        extraData()?.validate()
        googlePlayOrderId()
        googlePlayPurchaseToken()
        googlePlaySubscriptionId()
        plan()?.validate()
        startDate()
        status()?.validate()
        trialEndDate()
        updatedAt()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (planId.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (if (autoRenew.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (extraData.asKnown()?.validity() ?: 0) +
            (if (googlePlayOrderId.asKnown() == null) 0 else 1) +
            (if (googlePlayPurchaseToken.asKnown() == null) 0 else 1) +
            (if (googlePlaySubscriptionId.asKnown() == null) 0 else 1) +
            (plan.asKnown()?.validity() ?: 0) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (trialEndDate.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** 额外元数据 */
    class ExtraData
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

            /** Returns a mutable builder for constructing an instance of [ExtraData]. */
            fun builder() = Builder()
        }

        /** A builder for [ExtraData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(extraData: ExtraData) = apply {
                additionalProperties = extraData.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExtraData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtraData = ExtraData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ExtraData = apply {
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

            return other is ExtraData && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtraData{additionalProperties=$additionalProperties}"
    }

    /** 订阅计划响应模型 */
    class Plan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val googlePlayProductId: JsonField<String>,
        private val name: JsonField<String>,
        private val planType: JsonField<PlanType>,
        private val price: JsonField<Double>,
        private val agentCreationLimit: JsonField<Long>,
        private val backgroundGenerationLimitPerDay: JsonField<Long>,
        private val chatLimitPerDay: JsonField<Long>,
        private val currency: JsonField<String>,
        private val description: JsonField<String>,
        private val discountRate: JsonField<Double>,
        private val features: JsonField<Features>,
        private val isActive: JsonField<Boolean>,
        private val sortOrder: JsonField<Long>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("google_play_product_id")
            @ExcludeMissing
            googlePlayProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_type")
            @ExcludeMissing
            planType: JsonField<PlanType> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("agent_creation_limit")
            @ExcludeMissing
            agentCreationLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("background_generation_limit_per_day")
            @ExcludeMissing
            backgroundGenerationLimitPerDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chat_limit_per_day")
            @ExcludeMissing
            chatLimitPerDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_rate")
            @ExcludeMissing
            discountRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<Features> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sort_order")
            @ExcludeMissing
            sortOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            googlePlayProductId,
            name,
            planType,
            price,
            agentCreationLimit,
            backgroundGenerationLimitPerDay,
            chatLimitPerDay,
            currency,
            description,
            discountRate,
            features,
            isActive,
            sortOrder,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Google Play产品ID
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun googlePlayProductId(): String =
            googlePlayProductId.getRequired("google_play_product_id")

        /**
         * 计划名称
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * 计划类型
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planType(): PlanType = planType.getRequired("plan_type")

        /**
         * 价格
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun price(): Double = price.getRequired("price")

        /**
         * Agent创建数量限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentCreationLimit(): Long? = agentCreationLimit.getNullable("agent_creation_limit")

        /**
         * 每日背景图生成次数限制，-1为无限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun backgroundGenerationLimitPerDay(): Long? =
            backgroundGenerationLimitPerDay.getNullable("background_generation_limit_per_day")

        /**
         * 每日聊天次数限制，-1为无限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chatLimitPerDay(): Long? = chatLimitPerDay.getNullable("chat_limit_per_day")

        /**
         * 货币
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * 计划描述
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * 价格折扣率，范围0-1，1表示无折扣
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discountRate(): Double? = discountRate.getNullable("discount_rate")

        /**
         * 功能权益配置
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun features(): Features? = features.getNullable("features")

        /**
         * 是否激活
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Boolean? = isActive.getNullable("is_active")

        /**
         * 排序顺序
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sortOrder(): Long? = sortOrder.getNullable("sort_order")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [googlePlayProductId].
         *
         * Unlike [googlePlayProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("google_play_product_id")
        @ExcludeMissing
        fun _googlePlayProductId(): JsonField<String> = googlePlayProductId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [planType].
         *
         * Unlike [planType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_type") @ExcludeMissing fun _planType(): JsonField<PlanType> = planType

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

        /**
         * Returns the raw JSON value of [agentCreationLimit].
         *
         * Unlike [agentCreationLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("agent_creation_limit")
        @ExcludeMissing
        fun _agentCreationLimit(): JsonField<Long> = agentCreationLimit

        /**
         * Returns the raw JSON value of [backgroundGenerationLimitPerDay].
         *
         * Unlike [backgroundGenerationLimitPerDay], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("background_generation_limit_per_day")
        @ExcludeMissing
        fun _backgroundGenerationLimitPerDay(): JsonField<Long> = backgroundGenerationLimitPerDay

        /**
         * Returns the raw JSON value of [chatLimitPerDay].
         *
         * Unlike [chatLimitPerDay], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chat_limit_per_day")
        @ExcludeMissing
        fun _chatLimitPerDay(): JsonField<Long> = chatLimitPerDay

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [discountRate].
         *
         * Unlike [discountRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_rate")
        @ExcludeMissing
        fun _discountRate(): JsonField<Double> = discountRate

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<Features> = features

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [sortOrder].
         *
         * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort_order") @ExcludeMissing fun _sortOrder(): JsonField<Long> = sortOrder

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Plan].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .googlePlayProductId()
             * .name()
             * .planType()
             * .price()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Plan]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var googlePlayProductId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var planType: JsonField<PlanType>? = null
            private var price: JsonField<Double>? = null
            private var agentCreationLimit: JsonField<Long> = JsonMissing.of()
            private var backgroundGenerationLimitPerDay: JsonField<Long> = JsonMissing.of()
            private var chatLimitPerDay: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var discountRate: JsonField<Double> = JsonMissing.of()
            private var features: JsonField<Features> = JsonMissing.of()
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var sortOrder: JsonField<Long> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(plan: Plan) = apply {
                id = plan.id
                createdAt = plan.createdAt
                googlePlayProductId = plan.googlePlayProductId
                name = plan.name
                planType = plan.planType
                price = plan.price
                agentCreationLimit = plan.agentCreationLimit
                backgroundGenerationLimitPerDay = plan.backgroundGenerationLimitPerDay
                chatLimitPerDay = plan.chatLimitPerDay
                currency = plan.currency
                description = plan.description
                discountRate = plan.discountRate
                features = plan.features
                isActive = plan.isActive
                sortOrder = plan.sortOrder
                updatedAt = plan.updatedAt
                additionalProperties = plan.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Google Play产品ID */
            fun googlePlayProductId(googlePlayProductId: String) =
                googlePlayProductId(JsonField.of(googlePlayProductId))

            /**
             * Sets [Builder.googlePlayProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.googlePlayProductId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun googlePlayProductId(googlePlayProductId: JsonField<String>) = apply {
                this.googlePlayProductId = googlePlayProductId
            }

            /** 计划名称 */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** 计划类型 */
            fun planType(planType: PlanType) = planType(JsonField.of(planType))

            /**
             * Sets [Builder.planType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planType] with a well-typed [PlanType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planType(planType: JsonField<PlanType>) = apply { this.planType = planType }

            /** 价格 */
            fun price(price: Double) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Agent创建数量限制 */
            fun agentCreationLimit(agentCreationLimit: Long) =
                agentCreationLimit(JsonField.of(agentCreationLimit))

            /**
             * Sets [Builder.agentCreationLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentCreationLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentCreationLimit(agentCreationLimit: JsonField<Long>) = apply {
                this.agentCreationLimit = agentCreationLimit
            }

            /** 每日背景图生成次数限制，-1为无限制 */
            fun backgroundGenerationLimitPerDay(backgroundGenerationLimitPerDay: Long) =
                backgroundGenerationLimitPerDay(JsonField.of(backgroundGenerationLimitPerDay))

            /**
             * Sets [Builder.backgroundGenerationLimitPerDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backgroundGenerationLimitPerDay] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun backgroundGenerationLimitPerDay(backgroundGenerationLimitPerDay: JsonField<Long>) =
                apply {
                    this.backgroundGenerationLimitPerDay = backgroundGenerationLimitPerDay
                }

            /** 每日聊天次数限制，-1为无限制 */
            fun chatLimitPerDay(chatLimitPerDay: Long) =
                chatLimitPerDay(JsonField.of(chatLimitPerDay))

            /**
             * Sets [Builder.chatLimitPerDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chatLimitPerDay] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chatLimitPerDay(chatLimitPerDay: JsonField<Long>) = apply {
                this.chatLimitPerDay = chatLimitPerDay
            }

            /** 货币 */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** 计划描述 */
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

            /** 价格折扣率，范围0-1，1表示无折扣 */
            fun discountRate(discountRate: Double) = discountRate(JsonField.of(discountRate))

            /**
             * Sets [Builder.discountRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountRate(discountRate: JsonField<Double>) = apply {
                this.discountRate = discountRate
            }

            /** 功能权益配置 */
            fun features(features: Features?) = features(JsonField.ofNullable(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed [Features] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<Features>) = apply { this.features = features }

            /** 是否激活 */
            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** 排序顺序 */
            fun sortOrder(sortOrder: Long) = sortOrder(JsonField.of(sortOrder))

            /**
             * Sets [Builder.sortOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortOrder] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortOrder(sortOrder: JsonField<Long>) = apply { this.sortOrder = sortOrder }

            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Plan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .googlePlayProductId()
             * .name()
             * .planType()
             * .price()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Plan =
                Plan(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("googlePlayProductId", googlePlayProductId),
                    checkRequired("name", name),
                    checkRequired("planType", planType),
                    checkRequired("price", price),
                    agentCreationLimit,
                    backgroundGenerationLimitPerDay,
                    chatLimitPerDay,
                    currency,
                    description,
                    discountRate,
                    features,
                    isActive,
                    sortOrder,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Plan = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            googlePlayProductId()
            name()
            planType().validate()
            price()
            agentCreationLimit()
            backgroundGenerationLimitPerDay()
            chatLimitPerDay()
            currency()
            description()
            discountRate()
            features()?.validate()
            isActive()
            sortOrder()
            updatedAt()
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
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (googlePlayProductId.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (planType.asKnown()?.validity() ?: 0) +
                (if (price.asKnown() == null) 0 else 1) +
                (if (agentCreationLimit.asKnown() == null) 0 else 1) +
                (if (backgroundGenerationLimitPerDay.asKnown() == null) 0 else 1) +
                (if (chatLimitPerDay.asKnown() == null) 0 else 1) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (discountRate.asKnown() == null) 0 else 1) +
                (features.asKnown()?.validity() ?: 0) +
                (if (isActive.asKnown() == null) 0 else 1) +
                (if (sortOrder.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        /** 计划类型 */
        class PlanType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MONTHLY = of("MONTHLY")

                val QUARTERLY = of("QUARTERLY")

                val YEARLY = of("YEARLY")

                fun of(value: String) = PlanType(JsonField.of(value))
            }

            /** An enum containing [PlanType]'s known values. */
            enum class Known {
                MONTHLY,
                QUARTERLY,
                YEARLY,
            }

            /**
             * An enum containing [PlanType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PlanType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MONTHLY,
                QUARTERLY,
                YEARLY,
                /**
                 * An enum member indicating that [PlanType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    YEARLY -> Value.YEARLY
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
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    YEARLY -> Known.YEARLY
                    else -> throw IntyInvalidDataException("Unknown PlanType: $value")
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

            fun validate(): PlanType = apply {
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

                return other is PlanType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** 功能权益配置 */
        class Features
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

                /** Returns a mutable builder for constructing an instance of [Features]. */
                fun builder() = Builder()
            }

            /** A builder for [Features]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(features: Features) = apply {
                    additionalProperties = features.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Features].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Features = Features(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Features = apply {
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

                return other is Features && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Features{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Plan &&
                id == other.id &&
                createdAt == other.createdAt &&
                googlePlayProductId == other.googlePlayProductId &&
                name == other.name &&
                planType == other.planType &&
                price == other.price &&
                agentCreationLimit == other.agentCreationLimit &&
                backgroundGenerationLimitPerDay == other.backgroundGenerationLimitPerDay &&
                chatLimitPerDay == other.chatLimitPerDay &&
                currency == other.currency &&
                description == other.description &&
                discountRate == other.discountRate &&
                features == other.features &&
                isActive == other.isActive &&
                sortOrder == other.sortOrder &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                googlePlayProductId,
                name,
                planType,
                price,
                agentCreationLimit,
                backgroundGenerationLimitPerDay,
                chatLimitPerDay,
                currency,
                description,
                discountRate,
                features,
                isActive,
                sortOrder,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Plan{id=$id, createdAt=$createdAt, googlePlayProductId=$googlePlayProductId, name=$name, planType=$planType, price=$price, agentCreationLimit=$agentCreationLimit, backgroundGenerationLimitPerDay=$backgroundGenerationLimitPerDay, chatLimitPerDay=$chatLimitPerDay, currency=$currency, description=$description, discountRate=$discountRate, features=$features, isActive=$isActive, sortOrder=$sortOrder, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** 订阅状态 */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACTIVE = of("ACTIVE")

            val EXPIRED = of("EXPIRED")

            val CANCELLED = of("CANCELLED")

            val PENDING = of("PENDING")

            val REFUNDED = of("REFUNDED")

            val GRACE_PERIOD = of("GRACE_PERIOD")

            val PAUSED = of("PAUSED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            EXPIRED,
            CANCELLED,
            PENDING,
            REFUNDED,
            GRACE_PERIOD,
            PAUSED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            EXPIRED,
            CANCELLED,
            PENDING,
            REFUNDED,
            GRACE_PERIOD,
            PAUSED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                EXPIRED -> Value.EXPIRED
                CANCELLED -> Value.CANCELLED
                PENDING -> Value.PENDING
                REFUNDED -> Value.REFUNDED
                GRACE_PERIOD -> Value.GRACE_PERIOD
                PAUSED -> Value.PAUSED
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
                ACTIVE -> Known.ACTIVE
                EXPIRED -> Known.EXPIRED
                CANCELLED -> Known.CANCELLED
                PENDING -> Known.PENDING
                REFUNDED -> Known.REFUNDED
                GRACE_PERIOD -> Known.GRACE_PERIOD
                PAUSED -> Known.PAUSED
                else -> throw IntyInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserSubscription &&
            id == other.id &&
            createdAt == other.createdAt &&
            planId == other.planId &&
            userId == other.userId &&
            autoRenew == other.autoRenew &&
            endDate == other.endDate &&
            extraData == other.extraData &&
            googlePlayOrderId == other.googlePlayOrderId &&
            googlePlayPurchaseToken == other.googlePlayPurchaseToken &&
            googlePlaySubscriptionId == other.googlePlaySubscriptionId &&
            plan == other.plan &&
            startDate == other.startDate &&
            status == other.status &&
            trialEndDate == other.trialEndDate &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            planId,
            userId,
            autoRenew,
            endDate,
            extraData,
            googlePlayOrderId,
            googlePlayPurchaseToken,
            googlePlaySubscriptionId,
            plan,
            startDate,
            status,
            trialEndDate,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserSubscription{id=$id, createdAt=$createdAt, planId=$planId, userId=$userId, autoRenew=$autoRenew, endDate=$endDate, extraData=$extraData, googlePlayOrderId=$googlePlayOrderId, googlePlayPurchaseToken=$googlePlayPurchaseToken, googlePlaySubscriptionId=$googlePlaySubscriptionId, plan=$plan, startDate=$startDate, status=$status, trialEndDate=$trialEndDate, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
