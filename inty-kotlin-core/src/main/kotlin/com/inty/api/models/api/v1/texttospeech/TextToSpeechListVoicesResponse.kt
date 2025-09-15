// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.texttospeech

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Objects

class TextToSpeechListVoicesResponse
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [TextToSpeechListVoicesResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [TextToSpeechListVoicesResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(textToSpeechListVoicesResponse: TextToSpeechListVoicesResponse) = apply {
            additionalProperties =
                textToSpeechListVoicesResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [TextToSpeechListVoicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TextToSpeechListVoicesResponse =
            TextToSpeechListVoicesResponse(additionalProperties.toImmutable())
    }

    private var validated: Boolean = false

    fun validate(): TextToSpeechListVoicesResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TextToSpeechListVoicesResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TextToSpeechListVoicesResponse{additionalProperties=$additionalProperties}"
}
