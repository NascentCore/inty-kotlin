// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

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
import com.inty.api.models.api.v1.chats.agents.ChatSettings
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** 聊天 */
class Chat
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agentId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val agentAvatar: JsonField<String>,
    private val agentBackground: JsonField<String>,
    private val agentIntro: JsonField<String>,
    private val agentIsDeleted: JsonField<Boolean>,
    private val agentName: JsonField<String>,
    private val agentOpening: JsonField<String>,
    private val agentOpeningAudioUrl: JsonField<String>,
    private val lastMessage: JsonField<String>,
    private val lastMessageTime: JsonField<OffsetDateTime>,
    private val settings: JsonField<ChatSettings>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_avatar")
        @ExcludeMissing
        agentAvatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_background")
        @ExcludeMissing
        agentBackground: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_intro")
        @ExcludeMissing
        agentIntro: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_is_deleted")
        @ExcludeMissing
        agentIsDeleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("agent_name") @ExcludeMissing agentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_opening")
        @ExcludeMissing
        agentOpening: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_opening_audio_url")
        @ExcludeMissing
        agentOpeningAudioUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_message")
        @ExcludeMissing
        lastMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_message_time")
        @ExcludeMissing
        lastMessageTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<ChatSettings> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        agentId,
        createdAt,
        userId,
        agentAvatar,
        agentBackground,
        agentIntro,
        agentIsDeleted,
        agentName,
        agentOpening,
        agentOpeningAudioUrl,
        lastMessage,
        lastMessageTime,
        settings,
        updatedAt,
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
    fun agentAvatar(): String? = agentAvatar.getNullable("agent_avatar")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentBackground(): String? = agentBackground.getNullable("agent_background")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentIntro(): String? = agentIntro.getNullable("agent_intro")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentIsDeleted(): Boolean? = agentIsDeleted.getNullable("agent_is_deleted")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentName(): String? = agentName.getNullable("agent_name")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentOpening(): String? = agentOpening.getNullable("agent_opening")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agentOpeningAudioUrl(): String? =
        agentOpeningAudioUrl.getNullable("agent_opening_audio_url")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun lastMessage(): String? = lastMessage.getNullable("last_message")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun lastMessageTime(): OffsetDateTime? = lastMessageTime.getNullable("last_message_time")

    /**
     * 聊天设置
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun settings(): ChatSettings? = settings.getNullable("settings")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

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
     * Returns the raw JSON value of [agentAvatar].
     *
     * Unlike [agentAvatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_avatar")
    @ExcludeMissing
    fun _agentAvatar(): JsonField<String> = agentAvatar

    /**
     * Returns the raw JSON value of [agentBackground].
     *
     * Unlike [agentBackground], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_background")
    @ExcludeMissing
    fun _agentBackground(): JsonField<String> = agentBackground

    /**
     * Returns the raw JSON value of [agentIntro].
     *
     * Unlike [agentIntro], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_intro") @ExcludeMissing fun _agentIntro(): JsonField<String> = agentIntro

    /**
     * Returns the raw JSON value of [agentIsDeleted].
     *
     * Unlike [agentIsDeleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_is_deleted")
    @ExcludeMissing
    fun _agentIsDeleted(): JsonField<Boolean> = agentIsDeleted

    /**
     * Returns the raw JSON value of [agentName].
     *
     * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_name") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

    /**
     * Returns the raw JSON value of [agentOpening].
     *
     * Unlike [agentOpening], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_opening")
    @ExcludeMissing
    fun _agentOpening(): JsonField<String> = agentOpening

    /**
     * Returns the raw JSON value of [agentOpeningAudioUrl].
     *
     * Unlike [agentOpeningAudioUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("agent_opening_audio_url")
    @ExcludeMissing
    fun _agentOpeningAudioUrl(): JsonField<String> = agentOpeningAudioUrl

    /**
     * Returns the raw JSON value of [lastMessage].
     *
     * Unlike [lastMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_message")
    @ExcludeMissing
    fun _lastMessage(): JsonField<String> = lastMessage

    /**
     * Returns the raw JSON value of [lastMessageTime].
     *
     * Unlike [lastMessageTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_message_time")
    @ExcludeMissing
    fun _lastMessageTime(): JsonField<OffsetDateTime> = lastMessageTime

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<ChatSettings> = settings

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Chat].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .agentId()
         * .createdAt()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Chat]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var agentId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var agentAvatar: JsonField<String> = JsonMissing.of()
        private var agentBackground: JsonField<String> = JsonMissing.of()
        private var agentIntro: JsonField<String> = JsonMissing.of()
        private var agentIsDeleted: JsonField<Boolean> = JsonMissing.of()
        private var agentName: JsonField<String> = JsonMissing.of()
        private var agentOpening: JsonField<String> = JsonMissing.of()
        private var agentOpeningAudioUrl: JsonField<String> = JsonMissing.of()
        private var lastMessage: JsonField<String> = JsonMissing.of()
        private var lastMessageTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var settings: JsonField<ChatSettings> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chat: Chat) = apply {
            id = chat.id
            agentId = chat.agentId
            createdAt = chat.createdAt
            userId = chat.userId
            agentAvatar = chat.agentAvatar
            agentBackground = chat.agentBackground
            agentIntro = chat.agentIntro
            agentIsDeleted = chat.agentIsDeleted
            agentName = chat.agentName
            agentOpening = chat.agentOpening
            agentOpeningAudioUrl = chat.agentOpeningAudioUrl
            lastMessage = chat.lastMessage
            lastMessageTime = chat.lastMessageTime
            settings = chat.settings
            updatedAt = chat.updatedAt
            additionalProperties = chat.additionalProperties.toMutableMap()
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

        fun agentAvatar(agentAvatar: String?) = agentAvatar(JsonField.ofNullable(agentAvatar))

        /**
         * Sets [Builder.agentAvatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentAvatar] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentAvatar(agentAvatar: JsonField<String>) = apply { this.agentAvatar = agentAvatar }

        fun agentBackground(agentBackground: String?) =
            agentBackground(JsonField.ofNullable(agentBackground))

        /**
         * Sets [Builder.agentBackground] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentBackground] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentBackground(agentBackground: JsonField<String>) = apply {
            this.agentBackground = agentBackground
        }

        fun agentIntro(agentIntro: String?) = agentIntro(JsonField.ofNullable(agentIntro))

        /**
         * Sets [Builder.agentIntro] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentIntro] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentIntro(agentIntro: JsonField<String>) = apply { this.agentIntro = agentIntro }

        fun agentIsDeleted(agentIsDeleted: Boolean?) =
            agentIsDeleted(JsonField.ofNullable(agentIsDeleted))

        /**
         * Alias for [Builder.agentIsDeleted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun agentIsDeleted(agentIsDeleted: Boolean) = agentIsDeleted(agentIsDeleted as Boolean?)

        /**
         * Sets [Builder.agentIsDeleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentIsDeleted] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentIsDeleted(agentIsDeleted: JsonField<Boolean>) = apply {
            this.agentIsDeleted = agentIsDeleted
        }

        fun agentName(agentName: String?) = agentName(JsonField.ofNullable(agentName))

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

        fun agentOpening(agentOpening: String?) = agentOpening(JsonField.ofNullable(agentOpening))

        /**
         * Sets [Builder.agentOpening] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentOpening] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentOpening(agentOpening: JsonField<String>) = apply {
            this.agentOpening = agentOpening
        }

        fun agentOpeningAudioUrl(agentOpeningAudioUrl: String?) =
            agentOpeningAudioUrl(JsonField.ofNullable(agentOpeningAudioUrl))

        /**
         * Sets [Builder.agentOpeningAudioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentOpeningAudioUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentOpeningAudioUrl(agentOpeningAudioUrl: JsonField<String>) = apply {
            this.agentOpeningAudioUrl = agentOpeningAudioUrl
        }

        fun lastMessage(lastMessage: String?) = lastMessage(JsonField.ofNullable(lastMessage))

        /**
         * Sets [Builder.lastMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastMessage(lastMessage: JsonField<String>) = apply { this.lastMessage = lastMessage }

        fun lastMessageTime(lastMessageTime: OffsetDateTime?) =
            lastMessageTime(JsonField.ofNullable(lastMessageTime))

        /**
         * Sets [Builder.lastMessageTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastMessageTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastMessageTime(lastMessageTime: JsonField<OffsetDateTime>) = apply {
            this.lastMessageTime = lastMessageTime
        }

        /** 聊天设置 */
        fun settings(settings: ChatSettings?) = settings(JsonField.ofNullable(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [ChatSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settings(settings: JsonField<ChatSettings>) = apply { this.settings = settings }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Chat].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .agentId()
         * .createdAt()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Chat =
            Chat(
                checkRequired("id", id),
                checkRequired("agentId", agentId),
                checkRequired("createdAt", createdAt),
                checkRequired("userId", userId),
                agentAvatar,
                agentBackground,
                agentIntro,
                agentIsDeleted,
                agentName,
                agentOpening,
                agentOpeningAudioUrl,
                lastMessage,
                lastMessageTime,
                settings,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Chat = apply {
        if (validated) {
            return@apply
        }

        id()
        agentId()
        createdAt()
        userId()
        agentAvatar()
        agentBackground()
        agentIntro()
        agentIsDeleted()
        agentName()
        agentOpening()
        agentOpeningAudioUrl()
        lastMessage()
        lastMessageTime()
        settings()?.validate()
        updatedAt()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (if (agentAvatar.asKnown() == null) 0 else 1) +
            (if (agentBackground.asKnown() == null) 0 else 1) +
            (if (agentIntro.asKnown() == null) 0 else 1) +
            (if (agentIsDeleted.asKnown() == null) 0 else 1) +
            (if (agentName.asKnown() == null) 0 else 1) +
            (if (agentOpening.asKnown() == null) 0 else 1) +
            (if (agentOpeningAudioUrl.asKnown() == null) 0 else 1) +
            (if (lastMessage.asKnown() == null) 0 else 1) +
            (if (lastMessageTime.asKnown() == null) 0 else 1) +
            (settings.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Chat &&
            id == other.id &&
            agentId == other.agentId &&
            createdAt == other.createdAt &&
            userId == other.userId &&
            agentAvatar == other.agentAvatar &&
            agentBackground == other.agentBackground &&
            agentIntro == other.agentIntro &&
            agentIsDeleted == other.agentIsDeleted &&
            agentName == other.agentName &&
            agentOpening == other.agentOpening &&
            agentOpeningAudioUrl == other.agentOpeningAudioUrl &&
            lastMessage == other.lastMessage &&
            lastMessageTime == other.lastMessageTime &&
            settings == other.settings &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentId,
            createdAt,
            userId,
            agentAvatar,
            agentBackground,
            agentIntro,
            agentIsDeleted,
            agentName,
            agentOpening,
            agentOpeningAudioUrl,
            lastMessage,
            lastMessageTime,
            settings,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Chat{id=$id, agentId=$agentId, createdAt=$createdAt, userId=$userId, agentAvatar=$agentAvatar, agentBackground=$agentBackground, agentIntro=$agentIntro, agentIsDeleted=$agentIsDeleted, agentName=$agentName, agentOpening=$agentOpening, agentOpeningAudioUrl=$agentOpeningAudioUrl, lastMessage=$lastMessage, lastMessageTime=$lastMessageTime, settings=$settings, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
