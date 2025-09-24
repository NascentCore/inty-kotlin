// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.subscription.admin.plans

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
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/** 创建订阅计划（管理员接口） */
class PlanCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Google Play产品ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun googlePlayProductId(): String = body.googlePlayProductId()

    /**
     * 计划名称
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * 计划类型
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planType(): SubscriptionPlanType = body.planType()

    /**
     * 价格
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): Double = body.price()

    /**
     * Agent创建数量限制
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentCreationLimit(): Long? = body.agentCreationLimit()

    /**
     * 每日背景图生成次数限制，-1为无限制
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun backgroundGenerationLimitPerDay(): Long? = body.backgroundGenerationLimitPerDay()

    /**
     * 每日聊天次数限制，-1为无限制
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun chatLimitPerDay(): Long? = body.chatLimitPerDay()

    /**
     * 货币
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): String? = body.currency()

    /**
     * 计划描述
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * 价格折扣率，范围0-1，1表示无折扣
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun discountRate(): Double? = body.discountRate()

    /**
     * 功能权益配置
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun features(): Features? = body.features()

    /**
     * 是否激活
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isActive(): Boolean? = body.isActive()

    /**
     * 排序顺序
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun sortOrder(): Long? = body.sortOrder()

    /**
     * Returns the raw JSON value of [googlePlayProductId].
     *
     * Unlike [googlePlayProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _googlePlayProductId(): JsonField<String> = body._googlePlayProductId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [planType].
     *
     * Unlike [planType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planType(): JsonField<SubscriptionPlanType> = body._planType()

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _price(): JsonField<Double> = body._price()

    /**
     * Returns the raw JSON value of [agentCreationLimit].
     *
     * Unlike [agentCreationLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _agentCreationLimit(): JsonField<Long> = body._agentCreationLimit()

    /**
     * Returns the raw JSON value of [backgroundGenerationLimitPerDay].
     *
     * Unlike [backgroundGenerationLimitPerDay], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _backgroundGenerationLimitPerDay(): JsonField<Long> =
        body._backgroundGenerationLimitPerDay()

    /**
     * Returns the raw JSON value of [chatLimitPerDay].
     *
     * Unlike [chatLimitPerDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chatLimitPerDay(): JsonField<Long> = body._chatLimitPerDay()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [discountRate].
     *
     * Unlike [discountRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discountRate(): JsonField<Double> = body._discountRate()

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _features(): JsonField<Features> = body._features()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [sortOrder].
     *
     * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortOrder(): JsonField<Long> = body._sortOrder()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .googlePlayProductId()
         * .name()
         * .planType()
         * .price()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(planCreateParams: PlanCreateParams) = apply {
            body = planCreateParams.body.toBuilder()
            additionalHeaders = planCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [googlePlayProductId]
         * - [name]
         * - [planType]
         * - [price]
         * - [agentCreationLimit]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Google Play产品ID */
        fun googlePlayProductId(googlePlayProductId: String) = apply {
            body.googlePlayProductId(googlePlayProductId)
        }

        /**
         * Sets [Builder.googlePlayProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.googlePlayProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun googlePlayProductId(googlePlayProductId: JsonField<String>) = apply {
            body.googlePlayProductId(googlePlayProductId)
        }

        /** 计划名称 */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** 计划类型 */
        fun planType(planType: SubscriptionPlanType) = apply { body.planType(planType) }

        /**
         * Sets [Builder.planType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planType] with a well-typed [SubscriptionPlanType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planType(planType: JsonField<SubscriptionPlanType>) = apply { body.planType(planType) }

        /** 价格 */
        fun price(price: Double) = apply { body.price(price) }

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Double>) = apply { body.price(price) }

        /** Agent创建数量限制 */
        fun agentCreationLimit(agentCreationLimit: Long) = apply {
            body.agentCreationLimit(agentCreationLimit)
        }

        /**
         * Sets [Builder.agentCreationLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentCreationLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentCreationLimit(agentCreationLimit: JsonField<Long>) = apply {
            body.agentCreationLimit(agentCreationLimit)
        }

        /** 每日背景图生成次数限制，-1为无限制 */
        fun backgroundGenerationLimitPerDay(backgroundGenerationLimitPerDay: Long) = apply {
            body.backgroundGenerationLimitPerDay(backgroundGenerationLimitPerDay)
        }

        /**
         * Sets [Builder.backgroundGenerationLimitPerDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundGenerationLimitPerDay] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun backgroundGenerationLimitPerDay(backgroundGenerationLimitPerDay: JsonField<Long>) =
            apply {
                body.backgroundGenerationLimitPerDay(backgroundGenerationLimitPerDay)
            }

        /** 每日聊天次数限制，-1为无限制 */
        fun chatLimitPerDay(chatLimitPerDay: Long) = apply { body.chatLimitPerDay(chatLimitPerDay) }

        /**
         * Sets [Builder.chatLimitPerDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatLimitPerDay] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chatLimitPerDay(chatLimitPerDay: JsonField<Long>) = apply {
            body.chatLimitPerDay(chatLimitPerDay)
        }

        /** 货币 */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** 计划描述 */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** 价格折扣率，范围0-1，1表示无折扣 */
        fun discountRate(discountRate: Double) = apply { body.discountRate(discountRate) }

        /**
         * Sets [Builder.discountRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountRate(discountRate: JsonField<Double>) = apply {
            body.discountRate(discountRate)
        }

        /** 功能权益配置 */
        fun features(features: Features?) = apply { body.features(features) }

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed [Features] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun features(features: JsonField<Features>) = apply { body.features(features) }

        /** 是否激活 */
        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        /** 排序顺序 */
        fun sortOrder(sortOrder: Long) = apply { body.sortOrder(sortOrder) }

        /**
         * Sets [Builder.sortOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortOrder] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortOrder(sortOrder: JsonField<Long>) = apply { body.sortOrder(sortOrder) }

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
         * Returns an immutable instance of [PlanCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .googlePlayProductId()
         * .name()
         * .planType()
         * .price()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanCreateParams =
            PlanCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** 创建订阅计划 */
    class Body
    private constructor(
        private val googlePlayProductId: JsonField<String>,
        private val name: JsonField<String>,
        private val planType: JsonField<SubscriptionPlanType>,
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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("google_play_product_id")
            @ExcludeMissing
            googlePlayProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_type")
            @ExcludeMissing
            planType: JsonField<SubscriptionPlanType> = JsonMissing.of(),
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
        ) : this(
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
            mutableMapOf(),
        )

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
        fun planType(): SubscriptionPlanType = planType.getRequired("plan_type")

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
        @JsonProperty("plan_type")
        @ExcludeMissing
        fun _planType(): JsonField<SubscriptionPlanType> = planType

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
             * .googlePlayProductId()
             * .name()
             * .planType()
             * .price()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var googlePlayProductId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var planType: JsonField<SubscriptionPlanType>? = null
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                googlePlayProductId = body.googlePlayProductId
                name = body.name
                planType = body.planType
                price = body.price
                agentCreationLimit = body.agentCreationLimit
                backgroundGenerationLimitPerDay = body.backgroundGenerationLimitPerDay
                chatLimitPerDay = body.chatLimitPerDay
                currency = body.currency
                description = body.description
                discountRate = body.discountRate
                features = body.features
                isActive = body.isActive
                sortOrder = body.sortOrder
                additionalProperties = body.additionalProperties.toMutableMap()
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
            fun planType(planType: SubscriptionPlanType) = planType(JsonField.of(planType))

            /**
             * Sets [Builder.planType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planType] with a well-typed [SubscriptionPlanType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun planType(planType: JsonField<SubscriptionPlanType>) = apply {
                this.planType = planType
            }

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
             * .googlePlayProductId()
             * .name()
             * .planType()
             * .price()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

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
                (if (sortOrder.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
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
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{googlePlayProductId=$googlePlayProductId, name=$name, planType=$planType, price=$price, agentCreationLimit=$agentCreationLimit, backgroundGenerationLimitPerDay=$backgroundGenerationLimitPerDay, chatLimitPerDay=$chatLimitPerDay, currency=$currency, description=$description, discountRate=$discountRate, features=$features, isActive=$isActive, sortOrder=$sortOrder, additionalProperties=$additionalProperties}"
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return other is PlanCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
