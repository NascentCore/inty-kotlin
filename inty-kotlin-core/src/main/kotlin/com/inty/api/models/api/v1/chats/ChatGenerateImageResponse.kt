// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

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
import com.inty.api.core.checkRequired
import com.inty.api.core.getOrThrow
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

class ChatGenerateImageResponse
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
     * 聊天生图响应
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
         * Returns a mutable builder for constructing an instance of [ChatGenerateImageResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatGenerateImageResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatGenerateImageResponse: ChatGenerateImageResponse) = apply {
            code = chatGenerateImageResponse.code
            data = chatGenerateImageResponse.data
            message = chatGenerateImageResponse.message
            additionalProperties = chatGenerateImageResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 聊天生图响应 */
        fun data(data: Data?) = data(JsonField.ofNullable(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Alias for calling [data] with
         * `Data.ofChatImageGenerationResponse(chatImageGenerationResponse)`.
         */
        fun data(chatImageGenerationResponse: Data.ChatImageGenerationResponse) =
            data(Data.ofChatImageGenerationResponse(chatImageGenerationResponse))

        /** Alias for calling [data] with `Data.ofUsageLimitExceeded(usageLimitExceeded)`. */
        fun data(usageLimitExceeded: Data.UsageLimitExceeded) =
            data(Data.ofUsageLimitExceeded(usageLimitExceeded))

        /** Alias for calling [data] with `Data.ofBizError(bizError)`. */
        fun data(bizError: Data.BizError) = data(Data.ofBizError(bizError))

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
         * Returns an immutable instance of [ChatGenerateImageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatGenerateImageResponse =
            ChatGenerateImageResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ChatGenerateImageResponse = apply {
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

    /** 聊天生图响应 */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val chatImageGenerationResponse: ChatImageGenerationResponse? = null,
        private val usageLimitExceeded: UsageLimitExceeded? = null,
        private val bizError: BizError? = null,
        private val _json: JsonValue? = null,
    ) {

        /** 聊天生图响应 */
        fun chatImageGenerationResponse(): ChatImageGenerationResponse? =
            chatImageGenerationResponse

        fun usageLimitExceeded(): UsageLimitExceeded? = usageLimitExceeded

        /** 业务错误信息模型 */
        fun bizError(): BizError? = bizError

        fun isChatImageGenerationResponse(): Boolean = chatImageGenerationResponse != null

        fun isUsageLimitExceeded(): Boolean = usageLimitExceeded != null

        fun isBizError(): Boolean = bizError != null

        /** 聊天生图响应 */
        fun asChatImageGenerationResponse(): ChatImageGenerationResponse =
            chatImageGenerationResponse.getOrThrow("chatImageGenerationResponse")

        fun asUsageLimitExceeded(): UsageLimitExceeded =
            usageLimitExceeded.getOrThrow("usageLimitExceeded")

        /** 业务错误信息模型 */
        fun asBizError(): BizError = bizError.getOrThrow("bizError")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                chatImageGenerationResponse != null ->
                    visitor.visitChatImageGenerationResponse(chatImageGenerationResponse)
                usageLimitExceeded != null -> visitor.visitUsageLimitExceeded(usageLimitExceeded)
                bizError != null -> visitor.visitBizError(bizError)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitChatImageGenerationResponse(
                        chatImageGenerationResponse: ChatImageGenerationResponse
                    ) {
                        chatImageGenerationResponse.validate()
                    }

                    override fun visitUsageLimitExceeded(usageLimitExceeded: UsageLimitExceeded) {
                        usageLimitExceeded.validate()
                    }

                    override fun visitBizError(bizError: BizError) {
                        bizError.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitChatImageGenerationResponse(
                        chatImageGenerationResponse: ChatImageGenerationResponse
                    ) = chatImageGenerationResponse.validity()

                    override fun visitUsageLimitExceeded(usageLimitExceeded: UsageLimitExceeded) =
                        usageLimitExceeded.validity()

                    override fun visitBizError(bizError: BizError) = bizError.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                chatImageGenerationResponse == other.chatImageGenerationResponse &&
                usageLimitExceeded == other.usageLimitExceeded &&
                bizError == other.bizError
        }

        override fun hashCode(): Int =
            Objects.hash(chatImageGenerationResponse, usageLimitExceeded, bizError)

        override fun toString(): String =
            when {
                chatImageGenerationResponse != null ->
                    "Data{chatImageGenerationResponse=$chatImageGenerationResponse}"
                usageLimitExceeded != null -> "Data{usageLimitExceeded=$usageLimitExceeded}"
                bizError != null -> "Data{bizError=$bizError}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            /** 聊天生图响应 */
            fun ofChatImageGenerationResponse(
                chatImageGenerationResponse: ChatImageGenerationResponse
            ) = Data(chatImageGenerationResponse = chatImageGenerationResponse)

            fun ofUsageLimitExceeded(usageLimitExceeded: UsageLimitExceeded) =
                Data(usageLimitExceeded = usageLimitExceeded)

            /** 业务错误信息模型 */
            fun ofBizError(bizError: BizError) = Data(bizError = bizError)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** 聊天生图响应 */
            fun visitChatImageGenerationResponse(
                chatImageGenerationResponse: ChatImageGenerationResponse
            ): T

            fun visitUsageLimitExceeded(usageLimitExceeded: UsageLimitExceeded): T

            /** 业务错误信息模型 */
            fun visitBizError(bizError: BizError): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws IntyInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw IntyInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ChatImageGenerationResponse>())
                                ?.let { Data(chatImageGenerationResponse = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<UsageLimitExceeded>())?.let {
                                Data(usageLimitExceeded = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BizError>())?.let {
                                Data(bizError = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.chatImageGenerationResponse != null ->
                        generator.writeObject(value.chatImageGenerationResponse)
                    value.usageLimitExceeded != null ->
                        generator.writeObject(value.usageLimitExceeded)
                    value.bizError != null -> generator.writeObject(value.bizError)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        /** 聊天生图响应 */
        class ChatImageGenerationResponse
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val imageMetadata: JsonField<ImageMetadata>,
            private val imageUrl: JsonField<String>,
            private val messageId: JsonField<Long>,
            private val prompt: JsonField<String>,
            private val generationTimeMs: JsonField<Long>,
            private val model: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("image_metadata")
                @ExcludeMissing
                imageMetadata: JsonField<ImageMetadata> = JsonMissing.of(),
                @JsonProperty("image_url")
                @ExcludeMissing
                imageUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message_id")
                @ExcludeMissing
                messageId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("prompt")
                @ExcludeMissing
                prompt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("generation_time_ms")
                @ExcludeMissing
                generationTimeMs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            ) : this(
                imageMetadata,
                imageUrl,
                messageId,
                prompt,
                generationTimeMs,
                model,
                mutableMapOf(),
            )

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun imageMetadata(): ImageMetadata = imageMetadata.getRequired("image_metadata")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun imageUrl(): String = imageUrl.getRequired("image_url")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun messageId(): Long = messageId.getRequired("message_id")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun prompt(): String = prompt.getRequired("prompt")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun generationTimeMs(): Long? = generationTimeMs.getNullable("generation_time_ms")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun model(): String? = model.getNullable("model")

            /**
             * Returns the raw JSON value of [imageMetadata].
             *
             * Unlike [imageMetadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("image_metadata")
            @ExcludeMissing
            fun _imageMetadata(): JsonField<ImageMetadata> = imageMetadata

            /**
             * Returns the raw JSON value of [imageUrl].
             *
             * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

            /**
             * Returns the raw JSON value of [messageId].
             *
             * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("message_id")
            @ExcludeMissing
            fun _messageId(): JsonField<Long> = messageId

            /**
             * Returns the raw JSON value of [prompt].
             *
             * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

            /**
             * Returns the raw JSON value of [generationTimeMs].
             *
             * Unlike [generationTimeMs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("generation_time_ms")
            @ExcludeMissing
            fun _generationTimeMs(): JsonField<Long> = generationTimeMs

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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
                 * [ChatImageGenerationResponse].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .imageMetadata()
                 * .imageUrl()
                 * .messageId()
                 * .prompt()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatImageGenerationResponse]. */
            class Builder internal constructor() {

                private var imageMetadata: JsonField<ImageMetadata>? = null
                private var imageUrl: JsonField<String>? = null
                private var messageId: JsonField<Long>? = null
                private var prompt: JsonField<String>? = null
                private var generationTimeMs: JsonField<Long> = JsonMissing.of()
                private var model: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatImageGenerationResponse: ChatImageGenerationResponse) =
                    apply {
                        imageMetadata = chatImageGenerationResponse.imageMetadata
                        imageUrl = chatImageGenerationResponse.imageUrl
                        messageId = chatImageGenerationResponse.messageId
                        prompt = chatImageGenerationResponse.prompt
                        generationTimeMs = chatImageGenerationResponse.generationTimeMs
                        model = chatImageGenerationResponse.model
                        additionalProperties =
                            chatImageGenerationResponse.additionalProperties.toMutableMap()
                    }

                fun imageMetadata(imageMetadata: ImageMetadata) =
                    imageMetadata(JsonField.of(imageMetadata))

                /**
                 * Sets [Builder.imageMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.imageMetadata] with a well-typed [ImageMetadata]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun imageMetadata(imageMetadata: JsonField<ImageMetadata>) = apply {
                    this.imageMetadata = imageMetadata
                }

                fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                /**
                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.imageUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

                fun messageId(messageId: Long) = messageId(JsonField.of(messageId))

                /**
                 * Sets [Builder.messageId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messageId] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun messageId(messageId: JsonField<Long>) = apply { this.messageId = messageId }

                fun prompt(prompt: String) = prompt(JsonField.of(prompt))

                /**
                 * Sets [Builder.prompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prompt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

                fun generationTimeMs(generationTimeMs: Long?) =
                    generationTimeMs(JsonField.ofNullable(generationTimeMs))

                /**
                 * Alias for [Builder.generationTimeMs].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun generationTimeMs(generationTimeMs: Long) =
                    generationTimeMs(generationTimeMs as Long?)

                /**
                 * Sets [Builder.generationTimeMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.generationTimeMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun generationTimeMs(generationTimeMs: JsonField<Long>) = apply {
                    this.generationTimeMs = generationTimeMs
                }

                fun model(model: String?) = model(JsonField.ofNullable(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

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
                 * Returns an immutable instance of [ChatImageGenerationResponse].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .imageMetadata()
                 * .imageUrl()
                 * .messageId()
                 * .prompt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatImageGenerationResponse =
                    ChatImageGenerationResponse(
                        checkRequired("imageMetadata", imageMetadata),
                        checkRequired("imageUrl", imageUrl),
                        checkRequired("messageId", messageId),
                        checkRequired("prompt", prompt),
                        generationTimeMs,
                        model,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatImageGenerationResponse = apply {
                if (validated) {
                    return@apply
                }

                imageMetadata().validate()
                imageUrl()
                messageId()
                prompt()
                generationTimeMs()
                model()
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
                (imageMetadata.asKnown()?.validity() ?: 0) +
                    (if (imageUrl.asKnown() == null) 0 else 1) +
                    (if (messageId.asKnown() == null) 0 else 1) +
                    (if (prompt.asKnown() == null) 0 else 1) +
                    (if (generationTimeMs.asKnown() == null) 0 else 1) +
                    (if (model.asKnown() == null) 0 else 1)

            class ImageMetadata
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
                     * Returns a mutable builder for constructing an instance of [ImageMetadata].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ImageMetadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(imageMetadata: ImageMetadata) = apply {
                        additionalProperties = imageMetadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [ImageMetadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ImageMetadata = ImageMetadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ImageMetadata = apply {
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

                    return other is ImageMetadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImageMetadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatImageGenerationResponse &&
                    imageMetadata == other.imageMetadata &&
                    imageUrl == other.imageUrl &&
                    messageId == other.messageId &&
                    prompt == other.prompt &&
                    generationTimeMs == other.generationTimeMs &&
                    model == other.model &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    imageMetadata,
                    imageUrl,
                    messageId,
                    prompt,
                    generationTimeMs,
                    model,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatImageGenerationResponse{imageMetadata=$imageMetadata, imageUrl=$imageUrl, messageId=$messageId, prompt=$prompt, generationTimeMs=$generationTimeMs, model=$model, additionalProperties=$additionalProperties}"
        }

        class UsageLimitExceeded
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<Long>,
            private val dailyLimit: JsonField<Long>,
            private val errorCode: JsonField<String>,
            private val message: JsonField<String>,
            private val usedCount: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("daily_limit")
                @ExcludeMissing
                dailyLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("used_count")
                @ExcludeMissing
                usedCount: JsonField<Long> = JsonMissing.of(),
            ) : this(code, dailyLimit, errorCode, message, usedCount, mutableMapOf())

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): Long = code.getRequired("code")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dailyLimit(): Long = dailyLimit.getRequired("daily_limit")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun errorCode(): String = errorCode.getRequired("error_code")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usedCount(): Long = usedCount.getRequired("used_count")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

            /**
             * Returns the raw JSON value of [dailyLimit].
             *
             * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("daily_limit")
            @ExcludeMissing
            fun _dailyLimit(): JsonField<Long> = dailyLimit

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [usedCount].
             *
             * Unlike [usedCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("used_count")
            @ExcludeMissing
            fun _usedCount(): JsonField<Long> = usedCount

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
                 * Returns a mutable builder for constructing an instance of [UsageLimitExceeded].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .code()
                 * .dailyLimit()
                 * .errorCode()
                 * .message()
                 * .usedCount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsageLimitExceeded]. */
            class Builder internal constructor() {

                private var code: JsonField<Long>? = null
                private var dailyLimit: JsonField<Long>? = null
                private var errorCode: JsonField<String>? = null
                private var message: JsonField<String>? = null
                private var usedCount: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usageLimitExceeded: UsageLimitExceeded) = apply {
                    code = usageLimitExceeded.code
                    dailyLimit = usageLimitExceeded.dailyLimit
                    errorCode = usageLimitExceeded.errorCode
                    message = usageLimitExceeded.message
                    usedCount = usageLimitExceeded.usedCount
                    additionalProperties = usageLimitExceeded.additionalProperties.toMutableMap()
                }

                fun code(code: Long) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<Long>) = apply { this.code = code }

                fun dailyLimit(dailyLimit: Long) = dailyLimit(JsonField.of(dailyLimit))

                /**
                 * Sets [Builder.dailyLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dailyLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dailyLimit(dailyLimit: JsonField<Long>) = apply { this.dailyLimit = dailyLimit }

                fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun usedCount(usedCount: Long) = usedCount(JsonField.of(usedCount))

                /**
                 * Sets [Builder.usedCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usedCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usedCount(usedCount: JsonField<Long>) = apply { this.usedCount = usedCount }

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
                 * Returns an immutable instance of [UsageLimitExceeded].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .code()
                 * .dailyLimit()
                 * .errorCode()
                 * .message()
                 * .usedCount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsageLimitExceeded =
                    UsageLimitExceeded(
                        checkRequired("code", code),
                        checkRequired("dailyLimit", dailyLimit),
                        checkRequired("errorCode", errorCode),
                        checkRequired("message", message),
                        checkRequired("usedCount", usedCount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsageLimitExceeded = apply {
                if (validated) {
                    return@apply
                }

                code()
                dailyLimit()
                errorCode()
                message()
                usedCount()
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
                    (if (dailyLimit.asKnown() == null) 0 else 1) +
                    (if (errorCode.asKnown() == null) 0 else 1) +
                    (if (message.asKnown() == null) 0 else 1) +
                    (if (usedCount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsageLimitExceeded &&
                    code == other.code &&
                    dailyLimit == other.dailyLimit &&
                    errorCode == other.errorCode &&
                    message == other.message &&
                    usedCount == other.usedCount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, dailyLimit, errorCode, message, usedCount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageLimitExceeded{code=$code, dailyLimit=$dailyLimit, errorCode=$errorCode, message=$message, usedCount=$usedCount, additionalProperties=$additionalProperties}"
        }

        /** 业务错误信息模型 */
        class BizError
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val code: JsonField<Long>,
            private val errorCode: JsonField<String>,
            private val message: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
            ) : this(code, errorCode, message, mutableMapOf())

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): Long = code.getRequired("code")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun errorCode(): String = errorCode.getRequired("error_code")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

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
                 * Returns a mutable builder for constructing an instance of [BizError].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .code()
                 * .errorCode()
                 * .message()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BizError]. */
            class Builder internal constructor() {

                private var code: JsonField<Long>? = null
                private var errorCode: JsonField<String>? = null
                private var message: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bizError: BizError) = apply {
                    code = bizError.code
                    errorCode = bizError.errorCode
                    message = bizError.message
                    additionalProperties = bizError.additionalProperties.toMutableMap()
                }

                fun code(code: Long) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<Long>) = apply { this.code = code }

                fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

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
                 * Returns an immutable instance of [BizError].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .code()
                 * .errorCode()
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BizError =
                    BizError(
                        checkRequired("code", code),
                        checkRequired("errorCode", errorCode),
                        checkRequired("message", message),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BizError = apply {
                if (validated) {
                    return@apply
                }

                code()
                errorCode()
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
                    (if (errorCode.asKnown() == null) 0 else 1) +
                    (if (message.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BizError &&
                    code == other.code &&
                    errorCode == other.errorCode &&
                    message == other.message &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, errorCode, message, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BizError{code=$code, errorCode=$errorCode, message=$message, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatGenerateImageResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatGenerateImageResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
