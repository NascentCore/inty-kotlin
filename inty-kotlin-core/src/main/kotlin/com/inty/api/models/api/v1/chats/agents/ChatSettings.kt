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
import com.inty.api.core.checkRequired
import com.inty.api.errors.IntyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** 聊天设置 */
class ChatSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agentId: JsonField<String>,
    private val chatId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val language: JsonField<String>,
    private val premiumMode: JsonField<Boolean>,
    private val stylePrompt: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val voiceEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("premium_mode")
        @ExcludeMissing
        premiumMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("style_prompt")
        @ExcludeMissing
        stylePrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("voice_enabled")
        @ExcludeMissing
        voiceEnabled: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        agentId,
        chatId,
        createdAt,
        userId,
        language,
        premiumMode,
        stylePrompt,
        updatedAt,
        voiceEnabled,
        mutableMapOf(),
    )

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agent_id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chatId(): String = chatId.getRequired("chat_id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun language(): String? = language.getNullable("language")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun premiumMode(): Boolean? = premiumMode.getNullable("premium_mode")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun stylePrompt(): String? = stylePrompt.getNullable("style_prompt")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voiceEnabled(): Boolean? = voiceEnabled.getNullable("voice_enabled")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [chatId].
     *
     * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
     * Returns the raw JSON value of [stylePrompt].
     *
     * Unlike [stylePrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("style_prompt")
    @ExcludeMissing
    fun _stylePrompt(): JsonField<String> = stylePrompt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [voiceEnabled].
     *
     * Unlike [voiceEnabled], this method doesn't throw if the JSON field has an unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of [ChatSettings].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .agentId()
         * .chatId()
         * .createdAt()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatSettings]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var agentId: JsonField<String>? = null
        private var chatId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var language: JsonField<String> = JsonMissing.of()
        private var premiumMode: JsonField<Boolean> = JsonMissing.of()
        private var stylePrompt: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var voiceEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatSettings: ChatSettings) = apply {
            id = chatSettings.id
            agentId = chatSettings.agentId
            chatId = chatSettings.chatId
            createdAt = chatSettings.createdAt
            userId = chatSettings.userId
            language = chatSettings.language
            premiumMode = chatSettings.premiumMode
            stylePrompt = chatSettings.stylePrompt
            updatedAt = chatSettings.updatedAt
            voiceEnabled = chatSettings.voiceEnabled
            additionalProperties = chatSettings.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        fun chatId(chatId: String) = chatId(JsonField.of(chatId))

        /**
         * Sets [Builder.chatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        fun premiumMode(premiumMode: Boolean) = premiumMode(JsonField.of(premiumMode))

        /**
         * Sets [Builder.premiumMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.premiumMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun premiumMode(premiumMode: JsonField<Boolean>) = apply { this.premiumMode = premiumMode }

        fun stylePrompt(stylePrompt: String?) = stylePrompt(JsonField.ofNullable(stylePrompt))

        /**
         * Sets [Builder.stylePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stylePrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stylePrompt(stylePrompt: JsonField<String>) = apply { this.stylePrompt = stylePrompt }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun voiceEnabled(voiceEnabled: Boolean) = voiceEnabled(JsonField.of(voiceEnabled))

        /**
         * Sets [Builder.voiceEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [ChatSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .agentId()
         * .chatId()
         * .createdAt()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatSettings =
            ChatSettings(
                checkRequired("id", id),
                checkRequired("agentId", agentId),
                checkRequired("chatId", chatId),
                checkRequired("createdAt", createdAt),
                checkRequired("userId", userId),
                language,
                premiumMode,
                stylePrompt,
                updatedAt,
                voiceEnabled,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChatSettings = apply {
        if (validated) {
            return@apply
        }

        id()
        agentId()
        chatId()
        createdAt()
        userId()
        language()
        premiumMode()
        stylePrompt()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (agentId.asKnown() == null) 0 else 1) +
            (if (chatId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (if (language.asKnown() == null) 0 else 1) +
            (if (premiumMode.asKnown() == null) 0 else 1) +
            (if (stylePrompt.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (voiceEnabled.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatSettings &&
            id == other.id &&
            agentId == other.agentId &&
            chatId == other.chatId &&
            createdAt == other.createdAt &&
            userId == other.userId &&
            language == other.language &&
            premiumMode == other.premiumMode &&
            stylePrompt == other.stylePrompt &&
            updatedAt == other.updatedAt &&
            voiceEnabled == other.voiceEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentId,
            chatId,
            createdAt,
            userId,
            language,
            premiumMode,
            stylePrompt,
            updatedAt,
            voiceEnabled,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatSettings{id=$id, agentId=$agentId, chatId=$chatId, createdAt=$createdAt, userId=$userId, language=$language, premiumMode=$premiumMode, stylePrompt=$stylePrompt, updatedAt=$updatedAt, voiceEnabled=$voiceEnabled, additionalProperties=$additionalProperties}"
}
