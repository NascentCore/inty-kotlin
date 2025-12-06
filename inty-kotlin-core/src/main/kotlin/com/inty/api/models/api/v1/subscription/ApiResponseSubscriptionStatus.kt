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
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ApiResponseSubscriptionStatus
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
     * 订阅状态响应
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
         * [ApiResponseSubscriptionStatus].
         */
        fun builder() = Builder()
    }

    /** A builder for [ApiResponseSubscriptionStatus]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(apiResponseSubscriptionStatus: ApiResponseSubscriptionStatus) = apply {
            code = apiResponseSubscriptionStatus.code
            data = apiResponseSubscriptionStatus.data
            message = apiResponseSubscriptionStatus.message
            additionalProperties = apiResponseSubscriptionStatus.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 订阅状态响应 */
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
         * Returns an immutable instance of [ApiResponseSubscriptionStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ApiResponseSubscriptionStatus =
            ApiResponseSubscriptionStatus(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ApiResponseSubscriptionStatus = apply {
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

    /** 订阅状态响应 */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isSubscribed: JsonField<Boolean>,
        private val subscriptionStatus: JsonField<String>,
        private val agentCreation24hLimit: JsonField<Long>,
        private val agentCreationLimit: JsonField<Long>,
        private val backgroundGenerationLimitPerDay: JsonField<Long>,
        private val chat24hLimit: JsonField<Long>,
        private val chatLimitPerDay: JsonField<Long>,
        private val featureList: JsonField<List<FeatureList>>,
        private val features: JsonField<Features>,
        private val guestChat24hLimit: JsonField<Long>,
        private val guestVoice24hLimit: JsonField<Long>,
        private val hasEverSubscribed: JsonField<Boolean>,
        private val imageGen24hLimit: JsonField<Long>,
        private val plan: JsonField<Plan>,
        private val remainingDays: JsonField<Long>,
        private val subscription: JsonField<UserSubscription>,
        private val totalChatLimit: JsonField<Long>,
        private val voice24hLimit: JsonField<Long>,
        private val willAutoRenew: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_subscribed")
            @ExcludeMissing
            isSubscribed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscription_status")
            @ExcludeMissing
            subscriptionStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agent_creation_24h_limit")
            @ExcludeMissing
            agentCreation24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent_creation_limit")
            @ExcludeMissing
            agentCreationLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("background_generation_limit_per_day")
            @ExcludeMissing
            backgroundGenerationLimitPerDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chat_24h_limit")
            @ExcludeMissing
            chat24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chat_limit_per_day")
            @ExcludeMissing
            chatLimitPerDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("feature_list")
            @ExcludeMissing
            featureList: JsonField<List<FeatureList>> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<Features> = JsonMissing.of(),
            @JsonProperty("guest_chat_24h_limit")
            @ExcludeMissing
            guestChat24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("guest_voice_24h_limit")
            @ExcludeMissing
            guestVoice24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("has_ever_subscribed")
            @ExcludeMissing
            hasEverSubscribed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("image_gen_24h_limit")
            @ExcludeMissing
            imageGen24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
            @JsonProperty("remaining_days")
            @ExcludeMissing
            remainingDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subscription")
            @ExcludeMissing
            subscription: JsonField<UserSubscription> = JsonMissing.of(),
            @JsonProperty("total_chat_limit")
            @ExcludeMissing
            totalChatLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("voice_24h_limit")
            @ExcludeMissing
            voice24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("will_auto_renew")
            @ExcludeMissing
            willAutoRenew: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            isSubscribed,
            subscriptionStatus,
            agentCreation24hLimit,
            agentCreationLimit,
            backgroundGenerationLimitPerDay,
            chat24hLimit,
            chatLimitPerDay,
            featureList,
            features,
            guestChat24hLimit,
            guestVoice24hLimit,
            hasEverSubscribed,
            imageGen24hLimit,
            plan,
            remainingDays,
            subscription,
            totalChatLimit,
            voice24hLimit,
            willAutoRenew,
            mutableMapOf(),
        )

        /**
         * 是否订阅
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isSubscribed(): Boolean = isSubscribed.getRequired("is_subscribed")

        /**
         * 订阅详细状态：subscribed/subscribed_expiring/unsubscribed
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionStatus(): String = subscriptionStatus.getRequired("subscription_status")

        /**
         * 24小时内Agent创建数量限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentCreation24hLimit(): Long? =
            agentCreation24hLimit.getNullable("agent_creation_24h_limit")

        /**
         * Agent创建数量限制（已废弃，使用agent_creation_24h_limit）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentCreationLimit(): Long? = agentCreationLimit.getNullable("agent_creation_limit")

        /**
         * 每日背景图生成次数限制（已废弃，使用image_gen_24h_limit）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun backgroundGenerationLimitPerDay(): Long? =
            backgroundGenerationLimitPerDay.getNullable("background_generation_limit_per_day")

        /**
         * 24小时内聊天次数限制（免费用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chat24hLimit(): Long? = chat24hLimit.getNullable("chat_24h_limit")

        /**
         * 每日聊天次数限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chatLimitPerDay(): Long? = chatLimitPerDay.getNullable("chat_limit_per_day")

        /**
         * 权益功能列表
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun featureList(): List<FeatureList>? = featureList.getNullable("feature_list")

        /**
         * 功能权益
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun features(): Features? = features.getNullable("features")

        /**
         * 24小时内聊天次数限制（游客用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guestChat24hLimit(): Long? = guestChat24hLimit.getNullable("guest_chat_24h_limit")

        /**
         * 24小时内语音生成次数限制（游客用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guestVoice24hLimit(): Long? = guestVoice24hLimit.getNullable("guest_voice_24h_limit")

        /**
         * 是否曾经有过订阅记录
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasEverSubscribed(): Boolean? = hasEverSubscribed.getNullable("has_ever_subscribed")

        /**
         * 24小时内图片生成次数限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imageGen24hLimit(): Long? = imageGen24hLimit.getNullable("image_gen_24h_limit")

        /**
         * 订阅计划响应模型
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun plan(): Plan? = plan.getNullable("plan")

        /**
         * 剩余天数
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun remainingDays(): Long? = remainingDays.getNullable("remaining_days")

        /**
         * 用户订阅响应模型
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscription(): UserSubscription? = subscription.getNullable("subscription")

        /**
         * 总聊天次数限制（免费用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalChatLimit(): Long? = totalChatLimit.getNullable("total_chat_limit")

        /**
         * 24小时内语音生成次数限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice24hLimit(): Long? = voice24hLimit.getNullable("voice_24h_limit")

        /**
         * 是否会自动续费
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun willAutoRenew(): Boolean? = willAutoRenew.getNullable("will_auto_renew")

        /**
         * Returns the raw JSON value of [isSubscribed].
         *
         * Unlike [isSubscribed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_subscribed")
        @ExcludeMissing
        fun _isSubscribed(): JsonField<Boolean> = isSubscribed

        /**
         * Returns the raw JSON value of [subscriptionStatus].
         *
         * Unlike [subscriptionStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_status")
        @ExcludeMissing
        fun _subscriptionStatus(): JsonField<String> = subscriptionStatus

        /**
         * Returns the raw JSON value of [agentCreation24hLimit].
         *
         * Unlike [agentCreation24hLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("agent_creation_24h_limit")
        @ExcludeMissing
        fun _agentCreation24hLimit(): JsonField<Long> = agentCreation24hLimit

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
         * Returns the raw JSON value of [chat24hLimit].
         *
         * Unlike [chat24hLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chat_24h_limit")
        @ExcludeMissing
        fun _chat24hLimit(): JsonField<Long> = chat24hLimit

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
         * Returns the raw JSON value of [featureList].
         *
         * Unlike [featureList], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feature_list")
        @ExcludeMissing
        fun _featureList(): JsonField<List<FeatureList>> = featureList

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<Features> = features

        /**
         * Returns the raw JSON value of [guestChat24hLimit].
         *
         * Unlike [guestChat24hLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guest_chat_24h_limit")
        @ExcludeMissing
        fun _guestChat24hLimit(): JsonField<Long> = guestChat24hLimit

        /**
         * Returns the raw JSON value of [guestVoice24hLimit].
         *
         * Unlike [guestVoice24hLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("guest_voice_24h_limit")
        @ExcludeMissing
        fun _guestVoice24hLimit(): JsonField<Long> = guestVoice24hLimit

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
         * Returns the raw JSON value of [imageGen24hLimit].
         *
         * Unlike [imageGen24hLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("image_gen_24h_limit")
        @ExcludeMissing
        fun _imageGen24hLimit(): JsonField<Long> = imageGen24hLimit

        /**
         * Returns the raw JSON value of [plan].
         *
         * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

        /**
         * Returns the raw JSON value of [remainingDays].
         *
         * Unlike [remainingDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remaining_days")
        @ExcludeMissing
        fun _remainingDays(): JsonField<Long> = remainingDays

        /**
         * Returns the raw JSON value of [subscription].
         *
         * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun _subscription(): JsonField<UserSubscription> = subscription

        /**
         * Returns the raw JSON value of [totalChatLimit].
         *
         * Unlike [totalChatLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_chat_limit")
        @ExcludeMissing
        fun _totalChatLimit(): JsonField<Long> = totalChatLimit

        /**
         * Returns the raw JSON value of [voice24hLimit].
         *
         * Unlike [voice24hLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voice_24h_limit")
        @ExcludeMissing
        fun _voice24hLimit(): JsonField<Long> = voice24hLimit

        /**
         * Returns the raw JSON value of [willAutoRenew].
         *
         * Unlike [willAutoRenew], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("will_auto_renew")
        @ExcludeMissing
        fun _willAutoRenew(): JsonField<Boolean> = willAutoRenew

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
             * .isSubscribed()
             * .subscriptionStatus()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var isSubscribed: JsonField<Boolean>? = null
            private var subscriptionStatus: JsonField<String>? = null
            private var agentCreation24hLimit: JsonField<Long> = JsonMissing.of()
            private var agentCreationLimit: JsonField<Long> = JsonMissing.of()
            private var backgroundGenerationLimitPerDay: JsonField<Long> = JsonMissing.of()
            private var chat24hLimit: JsonField<Long> = JsonMissing.of()
            private var chatLimitPerDay: JsonField<Long> = JsonMissing.of()
            private var featureList: JsonField<MutableList<FeatureList>>? = null
            private var features: JsonField<Features> = JsonMissing.of()
            private var guestChat24hLimit: JsonField<Long> = JsonMissing.of()
            private var guestVoice24hLimit: JsonField<Long> = JsonMissing.of()
            private var hasEverSubscribed: JsonField<Boolean> = JsonMissing.of()
            private var imageGen24hLimit: JsonField<Long> = JsonMissing.of()
            private var plan: JsonField<Plan> = JsonMissing.of()
            private var remainingDays: JsonField<Long> = JsonMissing.of()
            private var subscription: JsonField<UserSubscription> = JsonMissing.of()
            private var totalChatLimit: JsonField<Long> = JsonMissing.of()
            private var voice24hLimit: JsonField<Long> = JsonMissing.of()
            private var willAutoRenew: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                isSubscribed = data.isSubscribed
                subscriptionStatus = data.subscriptionStatus
                agentCreation24hLimit = data.agentCreation24hLimit
                agentCreationLimit = data.agentCreationLimit
                backgroundGenerationLimitPerDay = data.backgroundGenerationLimitPerDay
                chat24hLimit = data.chat24hLimit
                chatLimitPerDay = data.chatLimitPerDay
                featureList = data.featureList.map { it.toMutableList() }
                features = data.features
                guestChat24hLimit = data.guestChat24hLimit
                guestVoice24hLimit = data.guestVoice24hLimit
                hasEverSubscribed = data.hasEverSubscribed
                imageGen24hLimit = data.imageGen24hLimit
                plan = data.plan
                remainingDays = data.remainingDays
                subscription = data.subscription
                totalChatLimit = data.totalChatLimit
                voice24hLimit = data.voice24hLimit
                willAutoRenew = data.willAutoRenew
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** 是否订阅 */
            fun isSubscribed(isSubscribed: Boolean) = isSubscribed(JsonField.of(isSubscribed))

            /**
             * Sets [Builder.isSubscribed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isSubscribed] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isSubscribed(isSubscribed: JsonField<Boolean>) = apply {
                this.isSubscribed = isSubscribed
            }

            /** 订阅详细状态：subscribed/subscribed_expiring/unsubscribed */
            fun subscriptionStatus(subscriptionStatus: String) =
                subscriptionStatus(JsonField.of(subscriptionStatus))

            /**
             * Sets [Builder.subscriptionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionStatus(subscriptionStatus: JsonField<String>) = apply {
                this.subscriptionStatus = subscriptionStatus
            }

            /** 24小时内Agent创建数量限制 */
            fun agentCreation24hLimit(agentCreation24hLimit: Long?) =
                agentCreation24hLimit(JsonField.ofNullable(agentCreation24hLimit))

            /**
             * Alias for [Builder.agentCreation24hLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun agentCreation24hLimit(agentCreation24hLimit: Long) =
                agentCreation24hLimit(agentCreation24hLimit as Long?)

            /**
             * Sets [Builder.agentCreation24hLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentCreation24hLimit] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun agentCreation24hLimit(agentCreation24hLimit: JsonField<Long>) = apply {
                this.agentCreation24hLimit = agentCreation24hLimit
            }

            /** Agent创建数量限制（已废弃，使用agent_creation_24h_limit） */
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

            /** 每日背景图生成次数限制（已废弃，使用image_gen_24h_limit） */
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

            /** 24小时内聊天次数限制（免费用户） */
            fun chat24hLimit(chat24hLimit: Long?) = chat24hLimit(JsonField.ofNullable(chat24hLimit))

            /**
             * Alias for [Builder.chat24hLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun chat24hLimit(chat24hLimit: Long) = chat24hLimit(chat24hLimit as Long?)

            /**
             * Sets [Builder.chat24hLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chat24hLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chat24hLimit(chat24hLimit: JsonField<Long>) = apply {
                this.chat24hLimit = chat24hLimit
            }

            /** 每日聊天次数限制 */
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

            /** 权益功能列表 */
            fun featureList(featureList: List<FeatureList>) = featureList(JsonField.of(featureList))

            /**
             * Sets [Builder.featureList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureList] with a well-typed `List<FeatureList>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun featureList(featureList: JsonField<List<FeatureList>>) = apply {
                this.featureList = featureList.map { it.toMutableList() }
            }

            /**
             * Adds a single [FeatureList] to [Builder.featureList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeatureList(featureList: FeatureList) = apply {
                this.featureList =
                    (this.featureList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("featureList", it).add(featureList)
                    }
            }

            /** 功能权益 */
            fun features(features: Features) = features(JsonField.of(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed [Features] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<Features>) = apply { this.features = features }

            /** 24小时内聊天次数限制（游客用户） */
            fun guestChat24hLimit(guestChat24hLimit: Long?) =
                guestChat24hLimit(JsonField.ofNullable(guestChat24hLimit))

            /**
             * Alias for [Builder.guestChat24hLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun guestChat24hLimit(guestChat24hLimit: Long) =
                guestChat24hLimit(guestChat24hLimit as Long?)

            /**
             * Sets [Builder.guestChat24hLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guestChat24hLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guestChat24hLimit(guestChat24hLimit: JsonField<Long>) = apply {
                this.guestChat24hLimit = guestChat24hLimit
            }

            /** 24小时内语音生成次数限制（游客用户） */
            fun guestVoice24hLimit(guestVoice24hLimit: Long?) =
                guestVoice24hLimit(JsonField.ofNullable(guestVoice24hLimit))

            /**
             * Alias for [Builder.guestVoice24hLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun guestVoice24hLimit(guestVoice24hLimit: Long) =
                guestVoice24hLimit(guestVoice24hLimit as Long?)

            /**
             * Sets [Builder.guestVoice24hLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guestVoice24hLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guestVoice24hLimit(guestVoice24hLimit: JsonField<Long>) = apply {
                this.guestVoice24hLimit = guestVoice24hLimit
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

            /** 24小时内图片生成次数限制 */
            fun imageGen24hLimit(imageGen24hLimit: Long?) =
                imageGen24hLimit(JsonField.ofNullable(imageGen24hLimit))

            /**
             * Alias for [Builder.imageGen24hLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun imageGen24hLimit(imageGen24hLimit: Long) =
                imageGen24hLimit(imageGen24hLimit as Long?)

            /**
             * Sets [Builder.imageGen24hLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageGen24hLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageGen24hLimit(imageGen24hLimit: JsonField<Long>) = apply {
                this.imageGen24hLimit = imageGen24hLimit
            }

            /** 订阅计划响应模型 */
            fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

            /**
             * Sets [Builder.plan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

            /** 剩余天数 */
            fun remainingDays(remainingDays: Long?) =
                remainingDays(JsonField.ofNullable(remainingDays))

            /**
             * Alias for [Builder.remainingDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun remainingDays(remainingDays: Long) = remainingDays(remainingDays as Long?)

            /**
             * Sets [Builder.remainingDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remainingDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remainingDays(remainingDays: JsonField<Long>) = apply {
                this.remainingDays = remainingDays
            }

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

            /** 总聊天次数限制（免费用户） */
            fun totalChatLimit(totalChatLimit: Long?) =
                totalChatLimit(JsonField.ofNullable(totalChatLimit))

            /**
             * Alias for [Builder.totalChatLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalChatLimit(totalChatLimit: Long) = totalChatLimit(totalChatLimit as Long?)

            /**
             * Sets [Builder.totalChatLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalChatLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalChatLimit(totalChatLimit: JsonField<Long>) = apply {
                this.totalChatLimit = totalChatLimit
            }

            /** 24小时内语音生成次数限制 */
            fun voice24hLimit(voice24hLimit: Long?) =
                voice24hLimit(JsonField.ofNullable(voice24hLimit))

            /**
             * Alias for [Builder.voice24hLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun voice24hLimit(voice24hLimit: Long) = voice24hLimit(voice24hLimit as Long?)

            /**
             * Sets [Builder.voice24hLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice24hLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice24hLimit(voice24hLimit: JsonField<Long>) = apply {
                this.voice24hLimit = voice24hLimit
            }

            /** 是否会自动续费 */
            fun willAutoRenew(willAutoRenew: Boolean) = willAutoRenew(JsonField.of(willAutoRenew))

            /**
             * Sets [Builder.willAutoRenew] to an arbitrary JSON value.
             *
             * You should usually call [Builder.willAutoRenew] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun willAutoRenew(willAutoRenew: JsonField<Boolean>) = apply {
                this.willAutoRenew = willAutoRenew
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
             * .isSubscribed()
             * .subscriptionStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("isSubscribed", isSubscribed),
                    checkRequired("subscriptionStatus", subscriptionStatus),
                    agentCreation24hLimit,
                    agentCreationLimit,
                    backgroundGenerationLimitPerDay,
                    chat24hLimit,
                    chatLimitPerDay,
                    (featureList ?: JsonMissing.of()).map { it.toImmutable() },
                    features,
                    guestChat24hLimit,
                    guestVoice24hLimit,
                    hasEverSubscribed,
                    imageGen24hLimit,
                    plan,
                    remainingDays,
                    subscription,
                    totalChatLimit,
                    voice24hLimit,
                    willAutoRenew,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            isSubscribed()
            subscriptionStatus()
            agentCreation24hLimit()
            agentCreationLimit()
            backgroundGenerationLimitPerDay()
            chat24hLimit()
            chatLimitPerDay()
            featureList()?.forEach { it.validate() }
            features()?.validate()
            guestChat24hLimit()
            guestVoice24hLimit()
            hasEverSubscribed()
            imageGen24hLimit()
            plan()?.validate()
            remainingDays()
            subscription()?.validate()
            totalChatLimit()
            voice24hLimit()
            willAutoRenew()
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
            (if (isSubscribed.asKnown() == null) 0 else 1) +
                (if (subscriptionStatus.asKnown() == null) 0 else 1) +
                (if (agentCreation24hLimit.asKnown() == null) 0 else 1) +
                (if (agentCreationLimit.asKnown() == null) 0 else 1) +
                (if (backgroundGenerationLimitPerDay.asKnown() == null) 0 else 1) +
                (if (chat24hLimit.asKnown() == null) 0 else 1) +
                (if (chatLimitPerDay.asKnown() == null) 0 else 1) +
                (featureList.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (features.asKnown()?.validity() ?: 0) +
                (if (guestChat24hLimit.asKnown() == null) 0 else 1) +
                (if (guestVoice24hLimit.asKnown() == null) 0 else 1) +
                (if (hasEverSubscribed.asKnown() == null) 0 else 1) +
                (if (imageGen24hLimit.asKnown() == null) 0 else 1) +
                (plan.asKnown()?.validity() ?: 0) +
                (if (remainingDays.asKnown() == null) 0 else 1) +
                (subscription.asKnown()?.validity() ?: 0) +
                (if (totalChatLimit.asKnown() == null) 0 else 1) +
                (if (voice24hLimit.asKnown() == null) 0 else 1) +
                (if (willAutoRenew.asKnown() == null) 0 else 1)

        /** 权益功能信息 */
        class FeatureList
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val icon: JsonField<String>,
            private val key: JsonField<String>,
            private val name: JsonField<String>,
            private val order: JsonField<Long>,
            private val type: JsonField<String>,
            private val enabled: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("icon") @ExcludeMissing icon: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
            ) : this(description, icon, key, name, order, type, enabled, mutableMapOf())

            /**
             * 权益描述
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun description(): String = description.getRequired("description")

            /**
             * 权益图标
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun icon(): String = icon.getRequired("icon")

            /**
             * 权益key
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * 权益名称
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * 排序顺序
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun order(): Long = order.getRequired("order")

            /**
             * 权益类型：real/fake
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * 是否启用
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enabled(): Boolean? = enabled.getNullable("enabled")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [icon].
             *
             * Unlike [icon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("icon") @ExcludeMissing fun _icon(): JsonField<String> = icon

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

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
                 * Returns a mutable builder for constructing an instance of [FeatureList].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .description()
                 * .icon()
                 * .key()
                 * .name()
                 * .order()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FeatureList]. */
            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var icon: JsonField<String>? = null
                private var key: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var order: JsonField<Long>? = null
                private var type: JsonField<String>? = null
                private var enabled: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(featureList: FeatureList) = apply {
                    description = featureList.description
                    icon = featureList.icon
                    key = featureList.key
                    name = featureList.name
                    order = featureList.order
                    type = featureList.type
                    enabled = featureList.enabled
                    additionalProperties = featureList.additionalProperties.toMutableMap()
                }

                /** 权益描述 */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** 权益图标 */
                fun icon(icon: String) = icon(JsonField.of(icon))

                /**
                 * Sets [Builder.icon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.icon] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun icon(icon: JsonField<String>) = apply { this.icon = icon }

                /** 权益key */
                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                /** 权益名称 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** 排序顺序 */
                fun order(order: Long) = order(JsonField.of(order))

                /**
                 * Sets [Builder.order] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.order] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun order(order: JsonField<Long>) = apply { this.order = order }

                /** 权益类型：real/fake */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                /** 是否启用 */
                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

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
                 * Returns an immutable instance of [FeatureList].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .description()
                 * .icon()
                 * .key()
                 * .name()
                 * .order()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FeatureList =
                    FeatureList(
                        checkRequired("description", description),
                        checkRequired("icon", icon),
                        checkRequired("key", key),
                        checkRequired("name", name),
                        checkRequired("order", order),
                        checkRequired("type", type),
                        enabled,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FeatureList = apply {
                if (validated) {
                    return@apply
                }

                description()
                icon()
                key()
                name()
                order()
                type()
                enabled()
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
                (if (description.asKnown() == null) 0 else 1) +
                    (if (icon.asKnown() == null) 0 else 1) +
                    (if (key.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (order.asKnown() == null) 0 else 1) +
                    (if (type.asKnown() == null) 0 else 1) +
                    (if (enabled.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FeatureList &&
                    description == other.description &&
                    icon == other.icon &&
                    key == other.key &&
                    name == other.name &&
                    order == other.order &&
                    type == other.type &&
                    enabled == other.enabled &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    description,
                    icon,
                    key,
                    name,
                    order,
                    type,
                    enabled,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FeatureList{description=$description, icon=$icon, key=$key, name=$name, order=$order, type=$type, enabled=$enabled, additionalProperties=$additionalProperties}"
        }

        /** 功能权益 */
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Google Play产品ID
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun googlePlayProductId(): String =
                googlePlayProductId.getRequired("google_play_product_id")

            /**
             * 计划名称
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * 计划类型
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun planType(): PlanType = planType.getRequired("plan_type")

            /**
             * 价格
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun price(): Double = price.getRequired("price")

            /**
             * Agent创建数量限制
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun agentCreationLimit(): Long? = agentCreationLimit.getNullable("agent_creation_limit")

            /**
             * 每日背景图生成次数限制，-1为无限制
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun backgroundGenerationLimitPerDay(): Long? =
                backgroundGenerationLimitPerDay.getNullable("background_generation_limit_per_day")

            /**
             * 每日聊天次数限制，-1为无限制
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun chatLimitPerDay(): Long? = chatLimitPerDay.getNullable("chat_limit_per_day")

            /**
             * 货币
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * 计划描述
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * 价格折扣率，范围0-1，1表示无折扣
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun discountRate(): Double? = discountRate.getNullable("discount_rate")

            /**
             * 功能权益配置
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun features(): Features? = features.getNullable("features")

            /**
             * 是否激活
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isActive(): Boolean? = isActive.getNullable("is_active")

            /**
             * 排序顺序
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sortOrder(): Long? = sortOrder.getNullable("sort_order")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [planType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("plan_type")
            @ExcludeMissing
            fun _planType(): JsonField<PlanType> = planType

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
             * Unlike [backgroundGenerationLimitPerDay], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("background_generation_limit_per_day")
            @ExcludeMissing
            fun _backgroundGenerationLimitPerDay(): JsonField<Long> =
                backgroundGenerationLimitPerDay

            /**
             * Returns the raw JSON value of [chatLimitPerDay].
             *
             * Unlike [chatLimitPerDay], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chat_limit_per_day")
            @ExcludeMissing
            fun _chatLimitPerDay(): JsonField<Long> = chatLimitPerDay

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [features], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("features")
            @ExcludeMissing
            fun _features(): JsonField<Features> = features

            /**
             * Returns the raw JSON value of [isActive].
             *
             * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_active")
            @ExcludeMissing
            fun _isActive(): JsonField<Boolean> = isActive

            /**
             * Returns the raw JSON value of [sortOrder].
             *
             * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sort_order")
            @ExcludeMissing
            fun _sortOrder(): JsonField<Long> = sortOrder

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun googlePlayProductId(googlePlayProductId: JsonField<String>) = apply {
                    this.googlePlayProductId = googlePlayProductId
                }

                /** 计划名称 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** 计划类型 */
                fun planType(planType: PlanType) = planType(JsonField.of(planType))

                /**
                 * Sets [Builder.planType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planType] with a well-typed [PlanType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.agentCreationLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.backgroundGenerationLimitPerDay] with a
                 * well-typed [Long] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun backgroundGenerationLimitPerDay(
                    backgroundGenerationLimitPerDay: JsonField<Long>
                ) = apply { this.backgroundGenerationLimitPerDay = backgroundGenerationLimitPerDay }

                /** 每日聊天次数限制，-1为无限制 */
                fun chatLimitPerDay(chatLimitPerDay: Long) =
                    chatLimitPerDay(JsonField.of(chatLimitPerDay))

                /**
                 * Sets [Builder.chatLimitPerDay] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chatLimitPerDay] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chatLimitPerDay(chatLimitPerDay: JsonField<Long>) = apply {
                    this.chatLimitPerDay = chatLimitPerDay
                }

                /** 货币 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** 计划描述 */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun features(features: JsonField<Features>) = apply { this.features = features }

                /** 是否激活 */
                fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                /**
                 * Sets [Builder.isActive] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isActive] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

                /** 排序顺序 */
                fun sortOrder(sortOrder: Long) = sortOrder(JsonField.of(sortOrder))

                /**
                 * Sets [Builder.sortOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sortOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sortOrder(sortOrder: JsonField<Long>) = apply { this.sortOrder = sortOrder }

                fun updatedAt(updatedAt: OffsetDateTime?) =
                    updatedAt(JsonField.ofNullable(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    QUARTERLY,
                    YEARLY,
                    /**
                     * An enum member indicating that [PlanType] was instantiated with an unknown
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                isSubscribed == other.isSubscribed &&
                subscriptionStatus == other.subscriptionStatus &&
                agentCreation24hLimit == other.agentCreation24hLimit &&
                agentCreationLimit == other.agentCreationLimit &&
                backgroundGenerationLimitPerDay == other.backgroundGenerationLimitPerDay &&
                chat24hLimit == other.chat24hLimit &&
                chatLimitPerDay == other.chatLimitPerDay &&
                featureList == other.featureList &&
                features == other.features &&
                guestChat24hLimit == other.guestChat24hLimit &&
                guestVoice24hLimit == other.guestVoice24hLimit &&
                hasEverSubscribed == other.hasEverSubscribed &&
                imageGen24hLimit == other.imageGen24hLimit &&
                plan == other.plan &&
                remainingDays == other.remainingDays &&
                subscription == other.subscription &&
                totalChatLimit == other.totalChatLimit &&
                voice24hLimit == other.voice24hLimit &&
                willAutoRenew == other.willAutoRenew &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                isSubscribed,
                subscriptionStatus,
                agentCreation24hLimit,
                agentCreationLimit,
                backgroundGenerationLimitPerDay,
                chat24hLimit,
                chatLimitPerDay,
                featureList,
                features,
                guestChat24hLimit,
                guestVoice24hLimit,
                hasEverSubscribed,
                imageGen24hLimit,
                plan,
                remainingDays,
                subscription,
                totalChatLimit,
                voice24hLimit,
                willAutoRenew,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{isSubscribed=$isSubscribed, subscriptionStatus=$subscriptionStatus, agentCreation24hLimit=$agentCreation24hLimit, agentCreationLimit=$agentCreationLimit, backgroundGenerationLimitPerDay=$backgroundGenerationLimitPerDay, chat24hLimit=$chat24hLimit, chatLimitPerDay=$chatLimitPerDay, featureList=$featureList, features=$features, guestChat24hLimit=$guestChat24hLimit, guestVoice24hLimit=$guestVoice24hLimit, hasEverSubscribed=$hasEverSubscribed, imageGen24hLimit=$imageGen24hLimit, plan=$plan, remainingDays=$remainingDays, subscription=$subscription, totalChatLimit=$totalChatLimit, voice24hLimit=$voice24hLimit, willAutoRenew=$willAutoRenew, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiResponseSubscriptionStatus &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiResponseSubscriptionStatus{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
