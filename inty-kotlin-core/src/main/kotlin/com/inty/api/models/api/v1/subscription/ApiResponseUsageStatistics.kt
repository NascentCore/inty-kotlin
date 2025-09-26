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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ApiResponseUsageStatistics
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
     * 使用统计响应
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
         * Returns a mutable builder for constructing an instance of [ApiResponseUsageStatistics].
         */
        fun builder() = Builder()
    }

    /** A builder for [ApiResponseUsageStatistics]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(apiResponseUsageStatistics: ApiResponseUsageStatistics) = apply {
            code = apiResponseUsageStatistics.code
            data = apiResponseUsageStatistics.data
            message = apiResponseUsageStatistics.message
            additionalProperties = apiResponseUsageStatistics.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 使用统计响应 */
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
         * Returns an immutable instance of [ApiResponseUsageStatistics].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ApiResponseUsageStatistics =
            ApiResponseUsageStatistics(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ApiResponseUsageStatistics = apply {
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

    /** 使用统计响应 */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentCount: JsonField<Long>,
        private val agentLimit: JsonField<Long>,
        private val chat24hCount: JsonField<Long>,
        private val chat24hLimit: JsonField<Long>,
        private val todayChatCount: JsonField<Long>,
        private val todayLimit: JsonField<Long>,
        private val totalChatCount: JsonField<Long>,
        private val totalChatLimit: JsonField<Long>,
        private val usageHistory: JsonField<List<UsageHistory>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_count")
            @ExcludeMissing
            agentCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("agent_limit")
            @ExcludeMissing
            agentLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chat_24h_count")
            @ExcludeMissing
            chat24hCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("chat_24h_limit")
            @ExcludeMissing
            chat24hLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("today_chat_count")
            @ExcludeMissing
            todayChatCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("today_limit")
            @ExcludeMissing
            todayLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_chat_count")
            @ExcludeMissing
            totalChatCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_chat_limit")
            @ExcludeMissing
            totalChatLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("usage_history")
            @ExcludeMissing
            usageHistory: JsonField<List<UsageHistory>> = JsonMissing.of(),
        ) : this(
            agentCount,
            agentLimit,
            chat24hCount,
            chat24hLimit,
            todayChatCount,
            todayLimit,
            totalChatCount,
            totalChatLimit,
            usageHistory,
            mutableMapOf(),
        )

        /**
         * 创建的Agent数量
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentCount(): Long? = agentCount.getNullable("agent_count")

        /**
         * Agent创建限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentLimit(): Long? = agentLimit.getNullable("agent_limit")

        /**
         * 24小时内聊天次数（免费用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chat24hCount(): Long? = chat24hCount.getNullable("chat_24h_count")

        /**
         * 24小时内聊天次数限制（免费用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chat24hLimit(): Long? = chat24hLimit.getNullable("chat_24h_limit")

        /**
         * 今日聊天次数
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun todayChatCount(): Long? = todayChatCount.getNullable("today_chat_count")

        /**
         * 今日限制
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun todayLimit(): Long? = todayLimit.getNullable("today_limit")

        /**
         * 总聊天次数（免费用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalChatCount(): Long? = totalChatCount.getNullable("total_chat_count")

        /**
         * 总聊天次数限制（免费用户）
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalChatLimit(): Long? = totalChatLimit.getNullable("total_chat_limit")

        /**
         * 使用历史
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageHistory(): List<UsageHistory>? = usageHistory.getNullable("usage_history")

        /**
         * Returns the raw JSON value of [agentCount].
         *
         * Unlike [agentCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_count") @ExcludeMissing fun _agentCount(): JsonField<Long> = agentCount

        /**
         * Returns the raw JSON value of [agentLimit].
         *
         * Unlike [agentLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_limit") @ExcludeMissing fun _agentLimit(): JsonField<Long> = agentLimit

        /**
         * Returns the raw JSON value of [chat24hCount].
         *
         * Unlike [chat24hCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chat_24h_count")
        @ExcludeMissing
        fun _chat24hCount(): JsonField<Long> = chat24hCount

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
         * Returns the raw JSON value of [todayChatCount].
         *
         * Unlike [todayChatCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("today_chat_count")
        @ExcludeMissing
        fun _todayChatCount(): JsonField<Long> = todayChatCount

        /**
         * Returns the raw JSON value of [todayLimit].
         *
         * Unlike [todayLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("today_limit") @ExcludeMissing fun _todayLimit(): JsonField<Long> = todayLimit

        /**
         * Returns the raw JSON value of [totalChatCount].
         *
         * Unlike [totalChatCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_chat_count")
        @ExcludeMissing
        fun _totalChatCount(): JsonField<Long> = totalChatCount

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
         * Returns the raw JSON value of [usageHistory].
         *
         * Unlike [usageHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_history")
        @ExcludeMissing
        fun _usageHistory(): JsonField<List<UsageHistory>> = usageHistory

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var agentCount: JsonField<Long> = JsonMissing.of()
            private var agentLimit: JsonField<Long> = JsonMissing.of()
            private var chat24hCount: JsonField<Long> = JsonMissing.of()
            private var chat24hLimit: JsonField<Long> = JsonMissing.of()
            private var todayChatCount: JsonField<Long> = JsonMissing.of()
            private var todayLimit: JsonField<Long> = JsonMissing.of()
            private var totalChatCount: JsonField<Long> = JsonMissing.of()
            private var totalChatLimit: JsonField<Long> = JsonMissing.of()
            private var usageHistory: JsonField<MutableList<UsageHistory>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                agentCount = data.agentCount
                agentLimit = data.agentLimit
                chat24hCount = data.chat24hCount
                chat24hLimit = data.chat24hLimit
                todayChatCount = data.todayChatCount
                todayLimit = data.todayLimit
                totalChatCount = data.totalChatCount
                totalChatLimit = data.totalChatLimit
                usageHistory = data.usageHistory.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** 创建的Agent数量 */
            fun agentCount(agentCount: Long) = agentCount(JsonField.of(agentCount))

            /**
             * Sets [Builder.agentCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentCount(agentCount: JsonField<Long>) = apply { this.agentCount = agentCount }

            /** Agent创建限制 */
            fun agentLimit(agentLimit: Long) = agentLimit(JsonField.of(agentLimit))

            /**
             * Sets [Builder.agentLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentLimit(agentLimit: JsonField<Long>) = apply { this.agentLimit = agentLimit }

            /** 24小时内聊天次数（免费用户） */
            fun chat24hCount(chat24hCount: Long?) = chat24hCount(JsonField.ofNullable(chat24hCount))

            /**
             * Alias for [Builder.chat24hCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun chat24hCount(chat24hCount: Long) = chat24hCount(chat24hCount as Long?)

            /**
             * Sets [Builder.chat24hCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chat24hCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chat24hCount(chat24hCount: JsonField<Long>) = apply {
                this.chat24hCount = chat24hCount
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

            /** 今日聊天次数 */
            fun todayChatCount(todayChatCount: Long) = todayChatCount(JsonField.of(todayChatCount))

            /**
             * Sets [Builder.todayChatCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.todayChatCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun todayChatCount(todayChatCount: JsonField<Long>) = apply {
                this.todayChatCount = todayChatCount
            }

            /** 今日限制 */
            fun todayLimit(todayLimit: Long) = todayLimit(JsonField.of(todayLimit))

            /**
             * Sets [Builder.todayLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.todayLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun todayLimit(todayLimit: JsonField<Long>) = apply { this.todayLimit = todayLimit }

            /** 总聊天次数（免费用户） */
            fun totalChatCount(totalChatCount: Long?) =
                totalChatCount(JsonField.ofNullable(totalChatCount))

            /**
             * Alias for [Builder.totalChatCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalChatCount(totalChatCount: Long) = totalChatCount(totalChatCount as Long?)

            /**
             * Sets [Builder.totalChatCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalChatCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalChatCount(totalChatCount: JsonField<Long>) = apply {
                this.totalChatCount = totalChatCount
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

            /** 使用历史 */
            fun usageHistory(usageHistory: List<UsageHistory>) =
                usageHistory(JsonField.of(usageHistory))

            /**
             * Sets [Builder.usageHistory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageHistory] with a well-typed `List<UsageHistory>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usageHistory(usageHistory: JsonField<List<UsageHistory>>) = apply {
                this.usageHistory = usageHistory.map { it.toMutableList() }
            }

            /**
             * Adds a single [UsageHistory] to [Builder.usageHistory].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsageHistory(usageHistory: UsageHistory) = apply {
                this.usageHistory =
                    (this.usageHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageHistory", it).add(usageHistory)
                    }
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
             */
            fun build(): Data =
                Data(
                    agentCount,
                    agentLimit,
                    chat24hCount,
                    chat24hLimit,
                    todayChatCount,
                    todayLimit,
                    totalChatCount,
                    totalChatLimit,
                    (usageHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            agentCount()
            agentLimit()
            chat24hCount()
            chat24hLimit()
            todayChatCount()
            todayLimit()
            totalChatCount()
            totalChatLimit()
            usageHistory()?.forEach { it.validate() }
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
            (if (agentCount.asKnown() == null) 0 else 1) +
                (if (agentLimit.asKnown() == null) 0 else 1) +
                (if (chat24hCount.asKnown() == null) 0 else 1) +
                (if (chat24hLimit.asKnown() == null) 0 else 1) +
                (if (todayChatCount.asKnown() == null) 0 else 1) +
                (if (todayLimit.asKnown() == null) 0 else 1) +
                (if (totalChatCount.asKnown() == null) 0 else 1) +
                (if (totalChatLimit.asKnown() == null) 0 else 1) +
                (usageHistory.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        /** 订阅使用响应模型 */
        class UsageHistory
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val usageDate: JsonField<OffsetDateTime>,
            private val usageType: JsonField<String>,
            private val userId: JsonField<String>,
            private val extraData: JsonField<ExtraData>,
            private val subscriptionId: JsonField<String>,
            private val usageCount: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usage_date")
                @ExcludeMissing
                usageDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usage_type")
                @ExcludeMissing
                usageType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("extra_data")
                @ExcludeMissing
                extraData: JsonField<ExtraData> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage_count")
                @ExcludeMissing
                usageCount: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                usageDate,
                usageType,
                userId,
                extraData,
                subscriptionId,
                usageCount,
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
             * 使用日期
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageDate(): OffsetDateTime = usageDate.getRequired("usage_date")

            /**
             * 使用类型
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageType(): String = usageType.getRequired("usage_type")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun userId(): String = userId.getRequired("user_id")

            /**
             * 额外元数据
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun extraData(): ExtraData? = extraData.getNullable("extra_data")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * 使用次数
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun usageCount(): Long? = usageCount.getNullable("usage_count")

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
             * Returns the raw JSON value of [usageDate].
             *
             * Unlike [usageDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_date")
            @ExcludeMissing
            fun _usageDate(): JsonField<OffsetDateTime> = usageDate

            /**
             * Returns the raw JSON value of [usageType].
             *
             * Unlike [usageType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_type")
            @ExcludeMissing
            fun _usageType(): JsonField<String> = usageType

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [extraData].
             *
             * Unlike [extraData], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("extra_data")
            @ExcludeMissing
            fun _extraData(): JsonField<ExtraData> = extraData

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [usageCount].
             *
             * Unlike [usageCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_count")
            @ExcludeMissing
            fun _usageCount(): JsonField<Long> = usageCount

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
                 * Returns a mutable builder for constructing an instance of [UsageHistory].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .createdAt()
                 * .usageDate()
                 * .usageType()
                 * .userId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsageHistory]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var usageDate: JsonField<OffsetDateTime>? = null
                private var usageType: JsonField<String>? = null
                private var userId: JsonField<String>? = null
                private var extraData: JsonField<ExtraData> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var usageCount: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usageHistory: UsageHistory) = apply {
                    id = usageHistory.id
                    createdAt = usageHistory.createdAt
                    usageDate = usageHistory.usageDate
                    usageType = usageHistory.usageType
                    userId = usageHistory.userId
                    extraData = usageHistory.extraData
                    subscriptionId = usageHistory.subscriptionId
                    usageCount = usageHistory.usageCount
                    additionalProperties = usageHistory.additionalProperties.toMutableMap()
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

                /** 使用日期 */
                fun usageDate(usageDate: OffsetDateTime) = usageDate(JsonField.of(usageDate))

                /**
                 * Sets [Builder.usageDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usageDate(usageDate: JsonField<OffsetDateTime>) = apply {
                    this.usageDate = usageDate
                }

                /** 使用类型 */
                fun usageType(usageType: String) = usageType(JsonField.of(usageType))

                /**
                 * Sets [Builder.usageType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageType(usageType: JsonField<String>) = apply { this.usageType = usageType }

                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                /** 额外元数据 */
                fun extraData(extraData: ExtraData?) = extraData(JsonField.ofNullable(extraData))

                /**
                 * Sets [Builder.extraData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extraData] with a well-typed [ExtraData] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun extraData(extraData: JsonField<ExtraData>) = apply {
                    this.extraData = extraData
                }

                fun subscriptionId(subscriptionId: String?) =
                    subscriptionId(JsonField.ofNullable(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /** 使用次数 */
                fun usageCount(usageCount: Long) = usageCount(JsonField.of(usageCount))

                /**
                 * Sets [Builder.usageCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageCount(usageCount: JsonField<Long>) = apply { this.usageCount = usageCount }

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
                 * Returns an immutable instance of [UsageHistory].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .createdAt()
                 * .usageDate()
                 * .usageType()
                 * .userId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsageHistory =
                    UsageHistory(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("usageDate", usageDate),
                        checkRequired("usageType", usageType),
                        checkRequired("userId", userId),
                        extraData,
                        subscriptionId,
                        usageCount,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsageHistory = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                usageDate()
                usageType()
                userId()
                extraData()?.validate()
                subscriptionId()
                usageCount()
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
                    (if (usageDate.asKnown() == null) 0 else 1) +
                    (if (usageType.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1) +
                    (extraData.asKnown()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (usageCount.asKnown() == null) 0 else 1)

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsageHistory &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    usageDate == other.usageDate &&
                    usageType == other.usageType &&
                    userId == other.userId &&
                    extraData == other.extraData &&
                    subscriptionId == other.subscriptionId &&
                    usageCount == other.usageCount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    usageDate,
                    usageType,
                    userId,
                    extraData,
                    subscriptionId,
                    usageCount,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageHistory{id=$id, createdAt=$createdAt, usageDate=$usageDate, usageType=$usageType, userId=$userId, extraData=$extraData, subscriptionId=$subscriptionId, usageCount=$usageCount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                agentCount == other.agentCount &&
                agentLimit == other.agentLimit &&
                chat24hCount == other.chat24hCount &&
                chat24hLimit == other.chat24hLimit &&
                todayChatCount == other.todayChatCount &&
                todayLimit == other.todayLimit &&
                totalChatCount == other.totalChatCount &&
                totalChatLimit == other.totalChatLimit &&
                usageHistory == other.usageHistory &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agentCount,
                agentLimit,
                chat24hCount,
                chat24hLimit,
                todayChatCount,
                todayLimit,
                totalChatCount,
                totalChatLimit,
                usageHistory,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{agentCount=$agentCount, agentLimit=$agentLimit, chat24hCount=$chat24hCount, chat24hLimit=$chat24hLimit, todayChatCount=$todayChatCount, todayLimit=$todayLimit, totalChatCount=$totalChatCount, totalChatLimit=$totalChatLimit, usageHistory=$usageHistory, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiResponseUsageStatistics &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiResponseUsageStatistics{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
