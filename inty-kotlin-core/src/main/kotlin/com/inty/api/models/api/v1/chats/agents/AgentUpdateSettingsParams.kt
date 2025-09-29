// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.Params
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * We do not use chat_id to get settings, because we only support 1 chat per agent.TODO: We should
 * switch to /chats/{chat_id}/settings
 */
class AgentUpdateSettingsParams
private constructor(
    private val agentId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun agentId(): String? = agentId

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun language(): String? = body.language()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun premiumMode(): Boolean? = body.premiumMode()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun requestId(): String? = body.requestId()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun stylePrompt(): String? = body.stylePrompt()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voiceEnabled(): Boolean? = body.voiceEnabled()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [premiumMode].
     *
     * Unlike [premiumMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _premiumMode(): JsonField<Boolean> = body._premiumMode()

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestId(): JsonField<String> = body._requestId()

    /**
     * Returns the raw JSON value of [stylePrompt].
     *
     * Unlike [stylePrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stylePrompt(): JsonField<String> = body._stylePrompt()

    /**
     * Returns the raw JSON value of [voiceEnabled].
     *
     * Unlike [voiceEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceEnabled(): JsonField<Boolean> = body._voiceEnabled()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): AgentUpdateSettingsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [AgentUpdateSettingsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentUpdateSettingsParams]. */
    class Builder internal constructor() {

        private var agentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentUpdateSettingsParams: AgentUpdateSettingsParams) = apply {
            agentId = agentUpdateSettingsParams.agentId
            body = agentUpdateSettingsParams.body.toBuilder()
            additionalHeaders = agentUpdateSettingsParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentUpdateSettingsParams.additionalQueryParams.toBuilder()
        }

        fun agentId(agentId: String?) = apply { this.agentId = agentId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [language]
         * - [premiumMode]
         * - [requestId]
         * - [stylePrompt]
         * - [voiceEnabled]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun language(language: String?) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        fun premiumMode(premiumMode: Boolean?) = apply { body.premiumMode(premiumMode) }

        /**
         * Alias for [Builder.premiumMode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun premiumMode(premiumMode: Boolean) = premiumMode(premiumMode as Boolean?)

        /**
         * Sets [Builder.premiumMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.premiumMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun premiumMode(premiumMode: JsonField<Boolean>) = apply { body.premiumMode(premiumMode) }

        fun requestId(requestId: String?) = apply { body.requestId(requestId) }

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { body.requestId(requestId) }

        fun stylePrompt(stylePrompt: String?) = apply { body.stylePrompt(stylePrompt) }

        /**
         * Sets [Builder.stylePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stylePrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stylePrompt(stylePrompt: JsonField<String>) = apply { body.stylePrompt(stylePrompt) }

        fun voiceEnabled(voiceEnabled: Boolean?) = apply { body.voiceEnabled(voiceEnabled) }

        /**
         * Alias for [Builder.voiceEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun voiceEnabled(voiceEnabled: Boolean) = voiceEnabled(voiceEnabled as Boolean?)

        /**
         * Sets [Builder.voiceEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceEnabled(voiceEnabled: JsonField<Boolean>) = apply {
            body.voiceEnabled(voiceEnabled)
        }

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
         * Returns an immutable instance of [AgentUpdateSettingsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentUpdateSettingsParams =
            AgentUpdateSettingsParams(
                agentId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> agentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** 更新聊天设置 */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val language: JsonField<String>,
        private val premiumMode: JsonField<Boolean>,
        private val requestId: JsonField<String>,
        private val stylePrompt: JsonField<String>,
        private val voiceEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("premium_mode")
            @ExcludeMissing
            premiumMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("style_prompt")
            @ExcludeMissing
            stylePrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_enabled")
            @ExcludeMissing
            voiceEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(language, premiumMode, requestId, stylePrompt, voiceEnabled, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): String? = language.getNullable("language")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun premiumMode(): Boolean? = premiumMode.getNullable("premium_mode")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stylePrompt(): String? = stylePrompt.getNullable("style_prompt")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceEnabled(): Boolean? = voiceEnabled.getNullable("voice_enabled")

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [premiumMode].
         *
         * Unlike [premiumMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("premium_mode")
        @ExcludeMissing
        fun _premiumMode(): JsonField<Boolean> = premiumMode

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

        /**
         * Returns the raw JSON value of [stylePrompt].
         *
         * Unlike [stylePrompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("style_prompt")
        @ExcludeMissing
        fun _stylePrompt(): JsonField<String> = stylePrompt

        /**
         * Returns the raw JSON value of [voiceEnabled].
         *
         * Unlike [voiceEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voice_enabled")
        @ExcludeMissing
        fun _voiceEnabled(): JsonField<Boolean> = voiceEnabled

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var language: JsonField<String> = JsonMissing.of()
            private var premiumMode: JsonField<Boolean> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var stylePrompt: JsonField<String> = JsonMissing.of()
            private var voiceEnabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                language = body.language
                premiumMode = body.premiumMode
                requestId = body.requestId
                stylePrompt = body.stylePrompt
                voiceEnabled = body.voiceEnabled
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun language(language: String?) = language(JsonField.ofNullable(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            fun premiumMode(premiumMode: Boolean?) = premiumMode(JsonField.ofNullable(premiumMode))

            /**
             * Alias for [Builder.premiumMode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun premiumMode(premiumMode: Boolean) = premiumMode(premiumMode as Boolean?)

            /**
             * Sets [Builder.premiumMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.premiumMode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun premiumMode(premiumMode: JsonField<Boolean>) = apply {
                this.premiumMode = premiumMode
            }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            fun stylePrompt(stylePrompt: String?) = stylePrompt(JsonField.ofNullable(stylePrompt))

            /**
             * Sets [Builder.stylePrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stylePrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stylePrompt(stylePrompt: JsonField<String>) = apply {
                this.stylePrompt = stylePrompt
            }

            fun voiceEnabled(voiceEnabled: Boolean?) =
                voiceEnabled(JsonField.ofNullable(voiceEnabled))

            /**
             * Alias for [Builder.voiceEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun voiceEnabled(voiceEnabled: Boolean) = voiceEnabled(voiceEnabled as Boolean?)

            /**
             * Sets [Builder.voiceEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceEnabled(voiceEnabled: JsonField<Boolean>) = apply {
                this.voiceEnabled = voiceEnabled
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    language,
                    premiumMode,
                    requestId,
                    stylePrompt,
                    voiceEnabled,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            language()
            premiumMode()
            requestId()
            stylePrompt()
            voiceEnabled()
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
            (if (language.asKnown() == null) 0 else 1) +
                (if (premiumMode.asKnown() == null) 0 else 1) +
                (if (requestId.asKnown() == null) 0 else 1) +
                (if (stylePrompt.asKnown() == null) 0 else 1) +
                (if (voiceEnabled.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                language == other.language &&
                premiumMode == other.premiumMode &&
                requestId == other.requestId &&
                stylePrompt == other.stylePrompt &&
                voiceEnabled == other.voiceEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                language,
                premiumMode,
                requestId,
                stylePrompt,
                voiceEnabled,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{language=$language, premiumMode=$premiumMode, requestId=$requestId, stylePrompt=$stylePrompt, voiceEnabled=$voiceEnabled, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentUpdateSettingsParams &&
            agentId == other.agentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(agentId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentUpdateSettingsParams{agentId=$agentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
