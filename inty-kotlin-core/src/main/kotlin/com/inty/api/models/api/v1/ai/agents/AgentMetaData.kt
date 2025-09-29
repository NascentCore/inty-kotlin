// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/** Agent 元数据模型 */
class AgentMetaData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val comment: JsonField<String>,
    private val score: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
    ) : this(comment, score, mutableMapOf())

    /**
     * Agent 备注信息
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun comment(): String? = comment.getNullable("comment")

    /**
     * Agent 评分
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun score(): Long? = score.getNullable("score")

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Long> = score

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

        /** Returns a mutable builder for constructing an instance of [AgentMetaData]. */
        fun builder() = Builder()
    }

    /** A builder for [AgentMetaData]. */
    class Builder internal constructor() {

        private var comment: JsonField<String> = JsonMissing.of()
        private var score: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentMetaData: AgentMetaData) = apply {
            comment = agentMetaData.comment
            score = agentMetaData.score
            additionalProperties = agentMetaData.additionalProperties.toMutableMap()
        }

        /** Agent 备注信息 */
        fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /** Agent 评分 */
        fun score(score: Long?) = score(JsonField.ofNullable(score))

        /**
         * Alias for [Builder.score].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun score(score: Long) = score(score as Long?)

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Long>) = apply { this.score = score }

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
         * Returns an immutable instance of [AgentMetaData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentMetaData =
            AgentMetaData(comment, score, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): AgentMetaData = apply {
        if (validated) {
            return@apply
        }

        comment()
        score()
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
        (if (comment.asKnown() == null) 0 else 1) + (if (score.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentMetaData &&
            comment == other.comment &&
            score == other.score &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(comment, score, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentMetaData{comment=$comment, score=$score, additionalProperties=$additionalProperties}"
}
