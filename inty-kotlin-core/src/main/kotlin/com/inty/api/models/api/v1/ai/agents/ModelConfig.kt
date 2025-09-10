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

/** AI 模型配置 */
class ModelConfig
private constructor(
    private val apiKey: JsonField<String>,
    private val baseUrl: JsonField<String>,
    private val frequencyPenalty: JsonField<Double>,
    private val maxTokens: JsonField<Long>,
    private val model: JsonField<String>,
    private val presencePenalty: JsonField<Double>,
    private val temperature: JsonField<Double>,
    private val topK: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("base_url") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        frequencyPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_tokens") @ExcludeMissing maxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        presencePenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("top_k") @ExcludeMissing topK: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
    ) : this(
        apiKey,
        baseUrl,
        frequencyPenalty,
        maxTokens,
        model,
        presencePenalty,
        temperature,
        topK,
        topP,
        mutableMapOf(),
    )

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun apiKey(): String? = apiKey.getNullable("api_key")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun baseUrl(): String? = baseUrl.getNullable("base_url")

    /**
     * Frequency penalty
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

    /**
     * Maximum tokens in response
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun model(): String? = model.getNullable("model")

    /**
     * Presence penalty
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

    /**
     * Temperature for response generation
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun temperature(): Double? = temperature.getNullable("temperature")

    /**
     * Top-k sampling parameter
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun topK(): Long? = topK.getNullable("top_k")

    /**
     * Top-p sampling parameter
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun topP(): Double? = topP.getNullable("top_p")

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presence_penalty")
    @ExcludeMissing
    fun _presencePenalty(): JsonField<Double> = presencePenalty

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [topK].
     *
     * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

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

        /** Returns a mutable builder for constructing an instance of [ModelConfig]. */
        fun builder() = Builder()
    }

    /** A builder for [ModelConfig]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String> = JsonMissing.of()
        private var baseUrl: JsonField<String> = JsonMissing.of()
        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var presencePenalty: JsonField<Double> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var topK: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(modelConfig: ModelConfig) = apply {
            apiKey = modelConfig.apiKey
            baseUrl = modelConfig.baseUrl
            frequencyPenalty = modelConfig.frequencyPenalty
            maxTokens = modelConfig.maxTokens
            model = modelConfig.model
            presencePenalty = modelConfig.presencePenalty
            temperature = modelConfig.temperature
            topK = modelConfig.topK
            topP = modelConfig.topP
            additionalProperties = modelConfig.additionalProperties.toMutableMap()
        }

        fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun baseUrl(baseUrl: String?) = baseUrl(JsonField.ofNullable(baseUrl))

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

        /** Frequency penalty */
        fun frequencyPenalty(frequencyPenalty: Double?) =
            frequencyPenalty(JsonField.ofNullable(frequencyPenalty))

        /**
         * Alias for [Builder.frequencyPenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun frequencyPenalty(frequencyPenalty: Double) =
            frequencyPenalty(frequencyPenalty as Double?)

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            this.frequencyPenalty = frequencyPenalty
        }

        /** Maximum tokens in response */
        fun maxTokens(maxTokens: Long?) = maxTokens(JsonField.ofNullable(maxTokens))

        /**
         * Alias for [Builder.maxTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun model(model: String?) = model(JsonField.ofNullable(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** Presence penalty */
        fun presencePenalty(presencePenalty: Double?) =
            presencePenalty(JsonField.ofNullable(presencePenalty))

        /**
         * Alias for [Builder.presencePenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun presencePenalty(presencePenalty: Double) = presencePenalty(presencePenalty as Double?)

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            this.presencePenalty = presencePenalty
        }

        /** Temperature for response generation */
        fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /** Top-k sampling parameter */
        fun topK(topK: Long?) = topK(JsonField.ofNullable(topK))

        /**
         * Alias for [Builder.topK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topK(topK: Long) = topK(topK as Long?)

        /**
         * Sets [Builder.topK] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

        /** Top-p sampling parameter */
        fun topP(topP: Double?) = topP(JsonField.ofNullable(topP))

        /**
         * Alias for [Builder.topP].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topP(topP: Double) = topP(topP as Double?)

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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
         * Returns an immutable instance of [ModelConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelConfig =
            ModelConfig(
                apiKey,
                baseUrl,
                frequencyPenalty,
                maxTokens,
                model,
                presencePenalty,
                temperature,
                topK,
                topP,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ModelConfig = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        baseUrl()
        frequencyPenalty()
        maxTokens()
        model()
        presencePenalty()
        temperature()
        topK()
        topP()
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
        (if (apiKey.asKnown() == null) 0 else 1) +
            (if (baseUrl.asKnown() == null) 0 else 1) +
            (if (frequencyPenalty.asKnown() == null) 0 else 1) +
            (if (maxTokens.asKnown() == null) 0 else 1) +
            (if (model.asKnown() == null) 0 else 1) +
            (if (presencePenalty.asKnown() == null) 0 else 1) +
            (if (temperature.asKnown() == null) 0 else 1) +
            (if (topK.asKnown() == null) 0 else 1) +
            (if (topP.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelConfig &&
            apiKey == other.apiKey &&
            baseUrl == other.baseUrl &&
            frequencyPenalty == other.frequencyPenalty &&
            maxTokens == other.maxTokens &&
            model == other.model &&
            presencePenalty == other.presencePenalty &&
            temperature == other.temperature &&
            topK == other.topK &&
            topP == other.topP &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            baseUrl,
            frequencyPenalty,
            maxTokens,
            model,
            presencePenalty,
            temperature,
            topK,
            topP,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelConfig{apiKey=$apiKey, baseUrl=$baseUrl, frequencyPenalty=$frequencyPenalty, maxTokens=$maxTokens, model=$model, presencePenalty=$presencePenalty, temperature=$temperature, topK=$topK, topP=$topP, additionalProperties=$additionalProperties}"
}
