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
import com.inty.api.models.api.v1.subscription.admin.plans.SubscriptionPlan
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** 用户订阅响应模型 */
class UserSubscription
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
    private val plan: JsonField<SubscriptionPlan>,
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
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<SubscriptionPlan> = JsonMissing.of(),
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
     * 订阅计划 ID
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
     * Google Play 订单 ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun googlePlayOrderId(): String? = googlePlayOrderId.getNullable("google_play_order_id")

    /**
     * Google Play 购买令牌
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun googlePlayPurchaseToken(): String? =
        googlePlayPurchaseToken.getNullable("google_play_purchase_token")

    /**
     * Google Play 订阅 ID
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
    fun plan(): SubscriptionPlan? = plan.getNullable("plan")

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
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<SubscriptionPlan> = plan

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
        private var plan: JsonField<SubscriptionPlan> = JsonMissing.of()
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

        /** 订阅计划 ID */
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

        /** Google Play 订单 ID */
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

        /** Google Play 购买令牌 */
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

        /** Google Play 订阅 ID */
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
        fun plan(plan: SubscriptionPlan?) = plan(JsonField.ofNullable(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [SubscriptionPlan] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun plan(plan: JsonField<SubscriptionPlan>) = apply { this.plan = plan }

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
