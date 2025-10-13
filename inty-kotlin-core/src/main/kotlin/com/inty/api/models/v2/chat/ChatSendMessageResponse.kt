// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.v2.chat

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
import java.util.Collections
import java.util.Objects

class ChatSendMessageResponse
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
     * OpenAI-style chat completion response model
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

        /** Returns a mutable builder for constructing an instance of [ChatSendMessageResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [ChatSendMessageResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatSendMessageResponse: ChatSendMessageResponse) = apply {
            code = chatSendMessageResponse.code
            data = chatSendMessageResponse.data
            message = chatSendMessageResponse.message
            additionalProperties = chatSendMessageResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** OpenAI-style chat completion response model */
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
         * Returns an immutable instance of [ChatSendMessageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChatSendMessageResponse =
            ChatSendMessageResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ChatSendMessageResponse = apply {
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

    /** OpenAI-style chat completion response model */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val choices: JsonField<List<Choice>>,
        private val created: JsonField<Long>,
        private val model: JsonField<String>,
        private val usage: JsonField<Usage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("choices")
            @ExcludeMissing
            choices: JsonField<List<Choice>> = JsonMissing.of(),
            @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        ) : this(id, choices, created, model, usage, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun choices(): List<Choice> = choices.getRequired("choices")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): Long = created.getRequired("created")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * Token usage model for OpenAI-style responses
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usage(): Usage = usage.getRequired("usage")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [choices].
         *
         * Unlike [choices], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("choices") @ExcludeMissing fun _choices(): JsonField<List<Choice>> = choices

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
             * .id()
             * .choices()
             * .created()
             * .model()
             * .usage()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var choices: JsonField<MutableList<Choice>>? = null
            private var created: JsonField<Long>? = null
            private var model: JsonField<String>? = null
            private var usage: JsonField<Usage>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                choices = data.choices.map { it.toMutableList() }
                created = data.created
                model = data.model
                usage = data.usage
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

            /**
             * Sets [Builder.choices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.choices] with a well-typed `List<Choice>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun choices(choices: JsonField<List<Choice>>) = apply {
                this.choices = choices.map { it.toMutableList() }
            }

            /**
             * Adds a single [Choice] to [choices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChoice(choice: Choice) = apply {
                choices =
                    (choices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("choices", it).add(choice)
                    }
            }

            fun created(created: Long) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<Long>) = apply { this.created = created }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Token usage model for OpenAI-style responses */
            fun usage(usage: Usage) = usage(JsonField.of(usage))

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
             * .id()
             * .choices()
             * .created()
             * .model()
             * .usage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("choices", choices).map { it.toImmutable() },
                    checkRequired("created", created),
                    checkRequired("model", model),
                    checkRequired("usage", usage),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            choices().forEach { it.validate() }
            created()
            model()
            usage().validate()
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
                (choices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (created.asKnown() == null) 0 else 1) +
                (if (model.asKnown() == null) 0 else 1) +
                (usage.asKnown()?.validity() ?: 0)

        /** Chat choice model for OpenAI-style responses */
        class Choice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val finishReason: JsonField<String>,
            private val index: JsonField<Long>,
            private val message: JsonField<Message>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("finish_reason")
                @ExcludeMissing
                finishReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<Message> = JsonMissing.of(),
            ) : this(finishReason, index, message, mutableMapOf())

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun finishReason(): String = finishReason.getRequired("finish_reason")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun index(): Long = index.getRequired("index")

            /**
             * Chat message model for OpenAI-style responses
             *
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): Message = message.getRequired("message")

            /**
             * Returns the raw JSON value of [finishReason].
             *
             * Unlike [finishReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("finish_reason")
            @ExcludeMissing
            fun _finishReason(): JsonField<String> = finishReason

            /**
             * Returns the raw JSON value of [index].
             *
             * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

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
                 * Returns a mutable builder for constructing an instance of [Choice].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .finishReason()
                 * .index()
                 * .message()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Choice]. */
            class Builder internal constructor() {

                private var finishReason: JsonField<String>? = null
                private var index: JsonField<Long>? = null
                private var message: JsonField<Message>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(choice: Choice) = apply {
                    finishReason = choice.finishReason
                    index = choice.index
                    message = choice.message
                    additionalProperties = choice.additionalProperties.toMutableMap()
                }

                fun finishReason(finishReason: String) = finishReason(JsonField.of(finishReason))

                /**
                 * Sets [Builder.finishReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.finishReason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun finishReason(finishReason: JsonField<String>) = apply {
                    this.finishReason = finishReason
                }

                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

                /** Chat message model for OpenAI-style responses */
                fun message(message: Message) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [Message] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<Message>) = apply { this.message = message }

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
                 * Returns an immutable instance of [Choice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .finishReason()
                 * .index()
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Choice =
                    Choice(
                        checkRequired("finishReason", finishReason),
                        checkRequired("index", index),
                        checkRequired("message", message),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Choice = apply {
                if (validated) {
                    return@apply
                }

                finishReason()
                index()
                message().validate()
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
                (if (finishReason.asKnown() == null) 0 else 1) +
                    (if (index.asKnown() == null) 0 else 1) +
                    (message.asKnown()?.validity() ?: 0)

            /** Chat message model for OpenAI-style responses */
            class Message
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val role: JsonField<String>,
                private val id: JsonField<String>,
                private val audioUrl: JsonField<String>,
                private val metaData: JsonField<MetaData>,
                private val timestamp: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role")
                    @ExcludeMissing
                    role: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("audio_url")
                    @ExcludeMissing
                    audioUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("meta_data")
                    @ExcludeMissing
                    metaData: JsonField<MetaData> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, id, audioUrl, metaData, timestamp, mutableMapOf())

                /**
                 * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun role(): String = role.getRequired("role")

                /**
                 * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun audioUrl(): String? = audioUrl.getNullable("audio_url")

                /**
                 * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metaData(): MetaData? = metaData.getNullable("meta_data")

                /**
                 * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun timestamp(): String? = timestamp.getNullable("timestamp")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [audioUrl].
                 *
                 * Unlike [audioUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("audio_url")
                @ExcludeMissing
                fun _audioUrl(): JsonField<String> = audioUrl

                /**
                 * Returns the raw JSON value of [metaData].
                 *
                 * Unlike [metaData], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("meta_data")
                @ExcludeMissing
                fun _metaData(): JsonField<MetaData> = metaData

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<String> = timestamp

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
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var role: JsonField<String>? = null
                    private var id: JsonField<String> = JsonMissing.of()
                    private var audioUrl: JsonField<String> = JsonMissing.of()
                    private var metaData: JsonField<MetaData> = JsonMissing.of()
                    private var timestamp: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        id = message.id
                        audioUrl = message.audioUrl
                        metaData = message.metaData
                        timestamp = message.timestamp
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<String>) = apply { this.role = role }

                    fun id(id: String?) = id(JsonField.ofNullable(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun audioUrl(audioUrl: String?) = audioUrl(JsonField.ofNullable(audioUrl))

                    /**
                     * Sets [Builder.audioUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.audioUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun audioUrl(audioUrl: JsonField<String>) = apply { this.audioUrl = audioUrl }

                    fun metaData(metaData: MetaData?) = metaData(JsonField.ofNullable(metaData))

                    /**
                     * Sets [Builder.metaData] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metaData] with a well-typed [MetaData] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metaData(metaData: JsonField<MetaData>) = apply { this.metaData = metaData }

                    fun timestamp(timestamp: String?) = timestamp(JsonField.ofNullable(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<String>) = apply {
                        this.timestamp = timestamp
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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .content()
                     * .role()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            checkRequired("role", role),
                            id,
                            audioUrl,
                            metaData,
                            timestamp,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    role()
                    id()
                    audioUrl()
                    metaData()?.validate()
                    timestamp()
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
                    (if (content.asKnown() == null) 0 else 1) +
                        (if (role.asKnown() == null) 0 else 1) +
                        (if (id.asKnown() == null) 0 else 1) +
                        (if (audioUrl.asKnown() == null) 0 else 1) +
                        (metaData.asKnown()?.validity() ?: 0) +
                        (if (timestamp.asKnown() == null) 0 else 1)

                class MetaData
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

                        /** Returns a mutable builder for constructing an instance of [MetaData]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [MetaData]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metaData: MetaData) = apply {
                            additionalProperties = metaData.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MetaData].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): MetaData = MetaData(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): MetaData = apply {
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

                        return other is MetaData &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "MetaData{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message &&
                        content == other.content &&
                        role == other.role &&
                        id == other.id &&
                        audioUrl == other.audioUrl &&
                        metaData == other.metaData &&
                        timestamp == other.timestamp &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        content,
                        role,
                        id,
                        audioUrl,
                        metaData,
                        timestamp,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, id=$id, audioUrl=$audioUrl, metaData=$metaData, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Choice &&
                    finishReason == other.finishReason &&
                    index == other.index &&
                    message == other.message &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(finishReason, index, message, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Choice{finishReason=$finishReason, index=$index, message=$message, additionalProperties=$additionalProperties}"
        }

        /** Token usage model for OpenAI-style responses */
        class Usage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val completionTokens: JsonField<Long>,
            private val promptTokens: JsonField<Long>,
            private val totalTokens: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("completion_tokens")
                @ExcludeMissing
                completionTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("prompt_tokens")
                @ExcludeMissing
                promptTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("total_tokens")
                @ExcludeMissing
                totalTokens: JsonField<Long> = JsonMissing.of(),
            ) : this(completionTokens, promptTokens, totalTokens, mutableMapOf())

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun completionTokens(): Long = completionTokens.getRequired("completion_tokens")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun promptTokens(): Long = promptTokens.getRequired("prompt_tokens")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

            /**
             * Returns the raw JSON value of [completionTokens].
             *
             * Unlike [completionTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completion_tokens")
            @ExcludeMissing
            fun _completionTokens(): JsonField<Long> = completionTokens

            /**
             * Returns the raw JSON value of [promptTokens].
             *
             * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            fun _promptTokens(): JsonField<Long> = promptTokens

            /**
             * Returns the raw JSON value of [totalTokens].
             *
             * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_tokens")
            @ExcludeMissing
            fun _totalTokens(): JsonField<Long> = totalTokens

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
                 * Returns a mutable builder for constructing an instance of [Usage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .completionTokens()
                 * .promptTokens()
                 * .totalTokens()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Usage]. */
            class Builder internal constructor() {

                private var completionTokens: JsonField<Long>? = null
                private var promptTokens: JsonField<Long>? = null
                private var totalTokens: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usage: Usage) = apply {
                    completionTokens = usage.completionTokens
                    promptTokens = usage.promptTokens
                    totalTokens = usage.totalTokens
                    additionalProperties = usage.additionalProperties.toMutableMap()
                }

                fun completionTokens(completionTokens: Long) =
                    completionTokens(JsonField.of(completionTokens))

                /**
                 * Sets [Builder.completionTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun completionTokens(completionTokens: JsonField<Long>) = apply {
                    this.completionTokens = completionTokens
                }

                fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

                /**
                 * Sets [Builder.promptTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun promptTokens(promptTokens: JsonField<Long>) = apply {
                    this.promptTokens = promptTokens
                }

                fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

                /**
                 * Sets [Builder.totalTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalTokens(totalTokens: JsonField<Long>) = apply {
                    this.totalTokens = totalTokens
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
                 * Returns an immutable instance of [Usage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .completionTokens()
                 * .promptTokens()
                 * .totalTokens()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Usage =
                    Usage(
                        checkRequired("completionTokens", completionTokens),
                        checkRequired("promptTokens", promptTokens),
                        checkRequired("totalTokens", totalTokens),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Usage = apply {
                if (validated) {
                    return@apply
                }

                completionTokens()
                promptTokens()
                totalTokens()
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
                (if (completionTokens.asKnown() == null) 0 else 1) +
                    (if (promptTokens.asKnown() == null) 0 else 1) +
                    (if (totalTokens.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Usage &&
                    completionTokens == other.completionTokens &&
                    promptTokens == other.promptTokens &&
                    totalTokens == other.totalTokens &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(completionTokens, promptTokens, totalTokens, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Usage{completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                choices == other.choices &&
                created == other.created &&
                model == other.model &&
                usage == other.usage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, choices, created, model, usage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, choices=$choices, created=$created, model=$model, usage=$usage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatSendMessageResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatSendMessageResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
