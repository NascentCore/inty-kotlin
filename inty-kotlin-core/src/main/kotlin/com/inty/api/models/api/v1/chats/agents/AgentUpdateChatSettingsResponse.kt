// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.BaseDeserializer
import com.inty.api.core.BaseSerializer
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.allMaxBy
import com.inty.api.core.getOrThrow
import com.inty.api.errors.IntyInvalidDataException
import com.inty.api.models.api.v1.report.ApiResponseDict
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = AgentUpdateChatSettingsResponse.Deserializer::class)
@JsonSerialize(using = AgentUpdateChatSettingsResponse.Serializer::class)
class AgentUpdateChatSettingsResponse
private constructor(
    private val apiResponseChatSettings: ApiResponseChatSettings? = null,
    private val apiResponseDict: ApiResponseDict? = null,
    private val _json: JsonValue? = null,
) {

    fun apiResponseChatSettings(): ApiResponseChatSettings? = apiResponseChatSettings

    fun apiResponseDict(): ApiResponseDict? = apiResponseDict

    fun isApiResponseChatSettings(): Boolean = apiResponseChatSettings != null

    fun isApiResponseDict(): Boolean = apiResponseDict != null

    fun asApiResponseChatSettings(): ApiResponseChatSettings =
        apiResponseChatSettings.getOrThrow("apiResponseChatSettings")

    fun asApiResponseDict(): ApiResponseDict = apiResponseDict.getOrThrow("apiResponseDict")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            apiResponseChatSettings != null ->
                visitor.visitApiResponseChatSettings(apiResponseChatSettings)
            apiResponseDict != null -> visitor.visitApiResponseDict(apiResponseDict)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): AgentUpdateChatSettingsResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitApiResponseChatSettings(
                    apiResponseChatSettings: ApiResponseChatSettings
                ) {
                    apiResponseChatSettings.validate()
                }

                override fun visitApiResponseDict(apiResponseDict: ApiResponseDict) {
                    apiResponseDict.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitApiResponseChatSettings(
                    apiResponseChatSettings: ApiResponseChatSettings
                ) = apiResponseChatSettings.validity()

                override fun visitApiResponseDict(apiResponseDict: ApiResponseDict) =
                    apiResponseDict.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentUpdateChatSettingsResponse &&
            apiResponseChatSettings == other.apiResponseChatSettings &&
            apiResponseDict == other.apiResponseDict
    }

    override fun hashCode(): Int = Objects.hash(apiResponseChatSettings, apiResponseDict)

    override fun toString(): String =
        when {
            apiResponseChatSettings != null ->
                "AgentUpdateChatSettingsResponse{apiResponseChatSettings=$apiResponseChatSettings}"
            apiResponseDict != null ->
                "AgentUpdateChatSettingsResponse{apiResponseDict=$apiResponseDict}"
            _json != null -> "AgentUpdateChatSettingsResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AgentUpdateChatSettingsResponse")
        }

    companion object {

        fun ofApiResponseChatSettings(apiResponseChatSettings: ApiResponseChatSettings) =
            AgentUpdateChatSettingsResponse(apiResponseChatSettings = apiResponseChatSettings)

        fun ofApiResponseDict(apiResponseDict: ApiResponseDict) =
            AgentUpdateChatSettingsResponse(apiResponseDict = apiResponseDict)
    }

    /**
     * An interface that defines how to map each variant of [AgentUpdateChatSettingsResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitApiResponseChatSettings(apiResponseChatSettings: ApiResponseChatSettings): T

        fun visitApiResponseDict(apiResponseDict: ApiResponseDict): T

        /**
         * Maps an unknown variant of [AgentUpdateChatSettingsResponse] to a value of type [T].
         *
         * An instance of [AgentUpdateChatSettingsResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws IntyInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw IntyInvalidDataException("Unknown AgentUpdateChatSettingsResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<AgentUpdateChatSettingsResponse>(AgentUpdateChatSettingsResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AgentUpdateChatSettingsResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ApiResponseChatSettings>())?.let {
                            AgentUpdateChatSettingsResponse(
                                apiResponseChatSettings = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<ApiResponseDict>())?.let {
                            AgentUpdateChatSettingsResponse(apiResponseDict = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> AgentUpdateChatSettingsResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<AgentUpdateChatSettingsResponse>(AgentUpdateChatSettingsResponse::class) {

        override fun serialize(
            value: AgentUpdateChatSettingsResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.apiResponseChatSettings != null ->
                    generator.writeObject(value.apiResponseChatSettings)
                value.apiResponseDict != null -> generator.writeObject(value.apiResponseDict)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AgentUpdateChatSettingsResponse")
            }
        }
    }

    class ApiResponseChatSettings
    private constructor(
        private val code: JsonField<Long>,
        private val data: JsonField<ChatSettings>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<ChatSettings> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(code, data, message, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Long? = code.getNullable("code")

        /**
         * 聊天设置
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): ChatSettings? = data.getNullable("data")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<ChatSettings> = data

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
             * Returns a mutable builder for constructing an instance of [ApiResponseChatSettings].
             */
            fun builder() = Builder()
        }

        /** A builder for [ApiResponseChatSettings]. */
        class Builder internal constructor() {

            private var code: JsonField<Long> = JsonMissing.of()
            private var data: JsonField<ChatSettings> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(apiResponseChatSettings: ApiResponseChatSettings) = apply {
                code = apiResponseChatSettings.code
                data = apiResponseChatSettings.data
                message = apiResponseChatSettings.message
                additionalProperties = apiResponseChatSettings.additionalProperties.toMutableMap()
            }

            fun code(code: Long) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Long>) = apply { this.code = code }

            /** 聊天设置 */
            fun data(data: ChatSettings?) = data(JsonField.ofNullable(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [ChatSettings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<ChatSettings>) = apply { this.data = data }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [ApiResponseChatSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ApiResponseChatSettings =
                ApiResponseChatSettings(code, data, message, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ApiResponseChatSettings = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (code.asKnown() == null) 0 else 1) +
                (data.asKnown()?.validity() ?: 0) +
                (if (message.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ApiResponseChatSettings &&
                code == other.code &&
                data == other.data &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, data, message, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApiResponseChatSettings{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
    }
}
