// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.characterthemes

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
import com.inty.api.models.api.v1.ai.agents.Agent
import java.util.Collections
import java.util.Objects

/** 专区中的角色信息 */
class CharacterThemeAgent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentId: JsonField<String>,
    private val orderIndex: JsonField<Long>,
    private val agent: JsonField<Agent>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_index") @ExcludeMissing orderIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("agent") @ExcludeMissing agent: JsonField<Agent> = JsonMissing.of(),
    ) : this(agentId, orderIndex, agent, mutableMapOf())

    /**
     * 角色ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agent_id")

    /**
     * 角色在专区中的顺序（从0开始）
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orderIndex(): Long = orderIndex.getRequired("order_index")

    /**
     * AI角色，在 sqlalchemy 模型基础上添加额外多表查询来的数据
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agent(): Agent? = agent.getNullable("agent")

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [orderIndex].
     *
     * Unlike [orderIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_index") @ExcludeMissing fun _orderIndex(): JsonField<Long> = orderIndex

    /**
     * Returns the raw JSON value of [agent].
     *
     * Unlike [agent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent") @ExcludeMissing fun _agent(): JsonField<Agent> = agent

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
         * Returns a mutable builder for constructing an instance of [CharacterThemeAgent].
         *
         * The following fields are required:
         * ```kotlin
         * .agentId()
         * .orderIndex()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CharacterThemeAgent]. */
    class Builder internal constructor() {

        private var agentId: JsonField<String>? = null
        private var orderIndex: JsonField<Long>? = null
        private var agent: JsonField<Agent> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(characterThemeAgent: CharacterThemeAgent) = apply {
            agentId = characterThemeAgent.agentId
            orderIndex = characterThemeAgent.orderIndex
            agent = characterThemeAgent.agent
            additionalProperties = characterThemeAgent.additionalProperties.toMutableMap()
        }

        /** 角色ID */
        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /** 角色在专区中的顺序（从0开始） */
        fun orderIndex(orderIndex: Long) = orderIndex(JsonField.of(orderIndex))

        /**
         * Sets [Builder.orderIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderIndex(orderIndex: JsonField<Long>) = apply { this.orderIndex = orderIndex }

        /** AI角色，在 sqlalchemy 模型基础上添加额外多表查询来的数据 */
        fun agent(agent: Agent?) = agent(JsonField.ofNullable(agent))

        /**
         * Sets [Builder.agent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agent] with a well-typed [Agent] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agent(agent: JsonField<Agent>) = apply { this.agent = agent }

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
         * Returns an immutable instance of [CharacterThemeAgent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .agentId()
         * .orderIndex()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CharacterThemeAgent =
            CharacterThemeAgent(
                checkRequired("agentId", agentId),
                checkRequired("orderIndex", orderIndex),
                agent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CharacterThemeAgent = apply {
        if (validated) {
            return@apply
        }

        agentId()
        orderIndex()
        agent()?.validate()
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
        (if (agentId.asKnown() == null) 0 else 1) +
            (if (orderIndex.asKnown() == null) 0 else 1) +
            (agent.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterThemeAgent &&
            agentId == other.agentId &&
            orderIndex == other.orderIndex &&
            agent == other.agent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(agentId, orderIndex, agent, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CharacterThemeAgent{agentId=$agentId, orderIndex=$orderIndex, agent=$agent, additionalProperties=$additionalProperties}"
}
