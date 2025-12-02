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
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** 角色主题专区完整响应模型 */
class CharacterTheme
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val visibility: JsonField<CharacterThemeVisibility>,
    private val agents: JsonField<List<CharacterThemeAgent>>,
    private val backgroundImageUrl: JsonField<String>,
    private val description: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<CharacterThemeVisibility> = JsonMissing.of(),
        @JsonProperty("agents")
        @ExcludeMissing
        agents: JsonField<List<CharacterThemeAgent>> = JsonMissing.of(),
        @JsonProperty("background_image_url")
        @ExcludeMissing
        backgroundImageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        name,
        visibility,
        agents,
        backgroundImageUrl,
        description,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * 专区ID
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * 创建时间
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * 专区名称
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * 可见性：第一展示、第二展示、不可见
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun visibility(): CharacterThemeVisibility = visibility.getRequired("visibility")

    /**
     * 专区中的角色列表（按顺序）
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun agents(): List<CharacterThemeAgent>? = agents.getNullable("agents")

    /**
     * 背景图URL地址
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun backgroundImageUrl(): String? = backgroundImageUrl.getNullable("background_image_url")

    /**
     * 专区描述
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * 更新时间
     *
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility")
    @ExcludeMissing
    fun _visibility(): JsonField<CharacterThemeVisibility> = visibility

    /**
     * Returns the raw JSON value of [agents].
     *
     * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agents")
    @ExcludeMissing
    fun _agents(): JsonField<List<CharacterThemeAgent>> = agents

    /**
     * Returns the raw JSON value of [backgroundImageUrl].
     *
     * Unlike [backgroundImageUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("background_image_url")
    @ExcludeMissing
    fun _backgroundImageUrl(): JsonField<String> = backgroundImageUrl

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [CharacterTheme].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .name()
         * .visibility()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CharacterTheme]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var visibility: JsonField<CharacterThemeVisibility>? = null
        private var agents: JsonField<MutableList<CharacterThemeAgent>>? = null
        private var backgroundImageUrl: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(characterTheme: CharacterTheme) = apply {
            id = characterTheme.id
            createdAt = characterTheme.createdAt
            name = characterTheme.name
            visibility = characterTheme.visibility
            agents = characterTheme.agents.map { it.toMutableList() }
            backgroundImageUrl = characterTheme.backgroundImageUrl
            description = characterTheme.description
            updatedAt = characterTheme.updatedAt
            additionalProperties = characterTheme.additionalProperties.toMutableMap()
        }

        /** 专区ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** 创建时间 */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** 专区名称 */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** 可见性：第一展示、第二展示、不可见 */
        fun visibility(visibility: CharacterThemeVisibility) = visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [CharacterThemeVisibility]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun visibility(visibility: JsonField<CharacterThemeVisibility>) = apply {
            this.visibility = visibility
        }

        /** 专区中的角色列表（按顺序） */
        fun agents(agents: List<CharacterThemeAgent>) = agents(JsonField.of(agents))

        /**
         * Sets [Builder.agents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agents] with a well-typed `List<CharacterThemeAgent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun agents(agents: JsonField<List<CharacterThemeAgent>>) = apply {
            this.agents = agents.map { it.toMutableList() }
        }

        /**
         * Adds a single [CharacterThemeAgent] to [agents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgent(agent: CharacterThemeAgent) = apply {
            agents =
                (agents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agents", it).add(agent)
                }
        }

        /** 背景图URL地址 */
        fun backgroundImageUrl(backgroundImageUrl: String?) =
            backgroundImageUrl(JsonField.ofNullable(backgroundImageUrl))

        /**
         * Sets [Builder.backgroundImageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImageUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImageUrl(backgroundImageUrl: JsonField<String>) = apply {
            this.backgroundImageUrl = backgroundImageUrl
        }

        /** 专区描述 */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** 更新时间 */
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
         * Returns an immutable instance of [CharacterTheme].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .name()
         * .visibility()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CharacterTheme =
            CharacterTheme(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                checkRequired("visibility", visibility),
                (agents ?: JsonMissing.of()).map { it.toImmutable() },
                backgroundImageUrl,
                description,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CharacterTheme = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        name()
        visibility().validate()
        agents()?.forEach { it.validate() }
        backgroundImageUrl()
        description()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (visibility.asKnown()?.validity() ?: 0) +
            (agents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (backgroundImageUrl.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterTheme &&
            id == other.id &&
            createdAt == other.createdAt &&
            name == other.name &&
            visibility == other.visibility &&
            agents == other.agents &&
            backgroundImageUrl == other.backgroundImageUrl &&
            description == other.description &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            name,
            visibility,
            agents,
            backgroundImageUrl,
            description,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CharacterTheme{id=$id, createdAt=$createdAt, name=$name, visibility=$visibility, agents=$agents, backgroundImageUrl=$backgroundImageUrl, description=$description, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
