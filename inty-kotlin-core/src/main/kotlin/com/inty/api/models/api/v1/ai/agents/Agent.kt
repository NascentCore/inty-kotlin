// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.inty.api.core.Enum
import com.inty.api.core.ExcludeMissing
import com.inty.api.core.JsonField
import com.inty.api.core.JsonMissing
import com.inty.api.core.JsonValue
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import com.inty.api.models.api.v1.users.profile.User
import java.util.Collections
import java.util.Objects

/** AI 角色 */
class Agent
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val gender: JsonField<String>,
    private val name: JsonField<String>,
    private val readableId: JsonField<String>,
    private val status: JsonField<Status>,
    private val alternateGreetings: JsonField<List<String>>,
    private val avatar: JsonField<String>,
    private val background: JsonField<String>,
    private val backgroundImages: JsonField<List<String>>,
    private val category: JsonField<String>,
    private val characterBook: JsonField<CharacterBook>,
    private val characterCardSpec: JsonField<String>,
    private val characterVersion: JsonField<String>,
    private val connectorCount: JsonField<Long>,
    private val creator: JsonField<User>,
    private val creatorId: JsonField<String>,
    private val creatorNotes: JsonField<String>,
    private val deletedAt: JsonField<Long>,
    private val extensions: JsonField<Extensions>,
    private val followerCount: JsonField<Long>,
    private val intro: JsonField<String>,
    private val isFollowed: JsonField<Boolean>,
    private val llmConfig: JsonField<ModelConfig>,
    private val mainPrompt: JsonField<String>,
    private val messageExample: JsonField<String>,
    private val modePrompt: JsonField<String>,
    private val opening: JsonField<String>,
    private val openingAudioUrl: JsonField<String>,
    private val personality: JsonField<String>,
    private val photos: JsonField<List<String>>,
    private val postHistoryInstructions: JsonField<String>,
    private val prompt: JsonField<String>,
    private val scenario: JsonField<String>,
    private val settings: JsonField<Settings>,
    private val tags: JsonField<List<String>>,
    private val updatedAt: JsonField<Long>,
    private val visibility: JsonField<AgentVisibility>,
    private val voiceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("readable_id")
        @ExcludeMissing
        readableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("alternate_greetings")
        @ExcludeMissing
        alternateGreetings: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background")
        @ExcludeMissing
        background: JsonField<String> = JsonMissing.of(),
        @JsonProperty("background_images")
        @ExcludeMissing
        backgroundImages: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("character_book")
        @ExcludeMissing
        characterBook: JsonField<CharacterBook> = JsonMissing.of(),
        @JsonProperty("character_card_spec")
        @ExcludeMissing
        characterCardSpec: JsonField<String> = JsonMissing.of(),
        @JsonProperty("character_version")
        @ExcludeMissing
        characterVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connector_count")
        @ExcludeMissing
        connectorCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<User> = JsonMissing.of(),
        @JsonProperty("creator_id") @ExcludeMissing creatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creator_notes")
        @ExcludeMissing
        creatorNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deleted_at") @ExcludeMissing deletedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("extensions")
        @ExcludeMissing
        extensions: JsonField<Extensions> = JsonMissing.of(),
        @JsonProperty("follower_count")
        @ExcludeMissing
        followerCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("intro") @ExcludeMissing intro: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_followed")
        @ExcludeMissing
        isFollowed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("llm_config")
        @ExcludeMissing
        llmConfig: JsonField<ModelConfig> = JsonMissing.of(),
        @JsonProperty("main_prompt")
        @ExcludeMissing
        mainPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_example")
        @ExcludeMissing
        messageExample: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode_prompt")
        @ExcludeMissing
        modePrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opening") @ExcludeMissing opening: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opening_audio_url")
        @ExcludeMissing
        openingAudioUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("personality")
        @ExcludeMissing
        personality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("photos") @ExcludeMissing photos: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("post_history_instructions")
        @ExcludeMissing
        postHistoryInstructions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scenario") @ExcludeMissing scenario: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings") @ExcludeMissing settings: JsonField<Settings> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("visibility")
        @ExcludeMissing
        visibility: JsonField<AgentVisibility> = JsonMissing.of(),
        @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        gender,
        name,
        readableId,
        status,
        alternateGreetings,
        avatar,
        background,
        backgroundImages,
        category,
        characterBook,
        characterCardSpec,
        characterVersion,
        connectorCount,
        creator,
        creatorId,
        creatorNotes,
        deletedAt,
        extensions,
        followerCount,
        intro,
        isFollowed,
        llmConfig,
        mainPrompt,
        messageExample,
        modePrompt,
        opening,
        openingAudioUrl,
        personality,
        photos,
        postHistoryInstructions,
        prompt,
        scenario,
        settings,
        tags,
        updatedAt,
        visibility,
        voiceId,
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
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun gender(): String = gender.getRequired("gender")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readableId(): String = readableId.getRequired("readable_id")

    /**
     * AI 角色状态
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun alternateGreetings(): List<String>? = alternateGreetings.getNullable("alternate_greetings")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun avatar(): String? = avatar.getNullable("avatar")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun background(): String? = background.getNullable("background")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun backgroundImages(): List<String>? = backgroundImages.getNullable("background_images")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun category(): String? = category.getNullable("category")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun characterBook(): CharacterBook? = characterBook.getNullable("character_book")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun characterCardSpec(): String? = characterCardSpec.getNullable("character_card_spec")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun characterVersion(): String? = characterVersion.getNullable("character_version")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun connectorCount(): Long? = connectorCount.getNullable("connector_count")

    /**
     * 返回给客户端的用户信息
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun creator(): User? = creator.getNullable("creator")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun creatorId(): String? = creatorId.getNullable("creator_id")

    /**
     * 创作者备注
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun creatorNotes(): String? = creatorNotes.getNullable("creator_notes")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun deletedAt(): Long? = deletedAt.getNullable("deleted_at")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun extensions(): Extensions? = extensions.getNullable("extensions")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun followerCount(): Long? = followerCount.getNullable("follower_count")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun intro(): String? = intro.getNullable("intro")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isFollowed(): Boolean? = isFollowed.getNullable("is_followed")

    /**
     * AI 模型配置
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun llmConfig(): ModelConfig? = llmConfig.getNullable("llm_config")

    /**
     * 主提示词 - 作为第一个 system message，覆盖全局默认主提示词
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun mainPrompt(): String? = mainPrompt.getNullable("main_prompt")

    /**
     * 对话示例
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun messageExample(): String? = messageExample.getNullable("message_example")

    /**
     * 模式提示词 - 放在角色卡提示词后面，覆盖全局默认模式提示词
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun modePrompt(): String? = modePrompt.getNullable("mode_prompt")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun opening(): String? = opening.getNullable("opening")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun openingAudioUrl(): String? = openingAudioUrl.getNullable("opening_audio_url")

    /**
     * 角色性格特点 (推荐)
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun personality(): String? = personality.getNullable("personality")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun photos(): List<String>? = photos.getNullable("photos")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun postHistoryInstructions(): String? =
        postHistoryInstructions.getNullable("post_history_instructions")

    /**
     * 已废弃 - 请使用 personality 字段代替
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun prompt(): String? = prompt.getNullable("prompt")

    /**
     * 背景设定 (推荐)
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun scenario(): String? = scenario.getNullable("scenario")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun settings(): Settings? = settings.getNullable("settings")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun tags(): List<String>? = tags.getNullable("tags")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun updatedAt(): Long? = updatedAt.getNullable("updated_at")

    /**
     * AI 角色可见性
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun visibility(): AgentVisibility? = visibility.getNullable("visibility")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voiceId(): String? = voiceId.getNullable("voice_id")

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
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [readableId].
     *
     * Unlike [readableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readable_id") @ExcludeMissing fun _readableId(): JsonField<String> = readableId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [alternateGreetings].
     *
     * Unlike [alternateGreetings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("alternate_greetings")
    @ExcludeMissing
    fun _alternateGreetings(): JsonField<List<String>> = alternateGreetings

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<String> = avatar

    /**
     * Returns the raw JSON value of [background].
     *
     * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("background") @ExcludeMissing fun _background(): JsonField<String> = background

    /**
     * Returns the raw JSON value of [backgroundImages].
     *
     * Unlike [backgroundImages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("background_images")
    @ExcludeMissing
    fun _backgroundImages(): JsonField<List<String>> = backgroundImages

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [characterBook].
     *
     * Unlike [characterBook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("character_book")
    @ExcludeMissing
    fun _characterBook(): JsonField<CharacterBook> = characterBook

    /**
     * Returns the raw JSON value of [characterCardSpec].
     *
     * Unlike [characterCardSpec], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("character_card_spec")
    @ExcludeMissing
    fun _characterCardSpec(): JsonField<String> = characterCardSpec

    /**
     * Returns the raw JSON value of [characterVersion].
     *
     * Unlike [characterVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("character_version")
    @ExcludeMissing
    fun _characterVersion(): JsonField<String> = characterVersion

    /**
     * Returns the raw JSON value of [connectorCount].
     *
     * Unlike [connectorCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connector_count")
    @ExcludeMissing
    fun _connectorCount(): JsonField<Long> = connectorCount

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<User> = creator

    /**
     * Returns the raw JSON value of [creatorId].
     *
     * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator_id") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

    /**
     * Returns the raw JSON value of [creatorNotes].
     *
     * Unlike [creatorNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator_notes")
    @ExcludeMissing
    fun _creatorNotes(): JsonField<String> = creatorNotes

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt(): JsonField<Long> = deletedAt

    /**
     * Returns the raw JSON value of [extensions].
     *
     * Unlike [extensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extensions")
    @ExcludeMissing
    fun _extensions(): JsonField<Extensions> = extensions

    /**
     * Returns the raw JSON value of [followerCount].
     *
     * Unlike [followerCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("follower_count")
    @ExcludeMissing
    fun _followerCount(): JsonField<Long> = followerCount

    /**
     * Returns the raw JSON value of [intro].
     *
     * Unlike [intro], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intro") @ExcludeMissing fun _intro(): JsonField<String> = intro

    /**
     * Returns the raw JSON value of [isFollowed].
     *
     * Unlike [isFollowed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_followed") @ExcludeMissing fun _isFollowed(): JsonField<Boolean> = isFollowed

    /**
     * Returns the raw JSON value of [llmConfig].
     *
     * Unlike [llmConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_config") @ExcludeMissing fun _llmConfig(): JsonField<ModelConfig> = llmConfig

    /**
     * Returns the raw JSON value of [mainPrompt].
     *
     * Unlike [mainPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("main_prompt") @ExcludeMissing fun _mainPrompt(): JsonField<String> = mainPrompt

    /**
     * Returns the raw JSON value of [messageExample].
     *
     * Unlike [messageExample], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_example")
    @ExcludeMissing
    fun _messageExample(): JsonField<String> = messageExample

    /**
     * Returns the raw JSON value of [modePrompt].
     *
     * Unlike [modePrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode_prompt") @ExcludeMissing fun _modePrompt(): JsonField<String> = modePrompt

    /**
     * Returns the raw JSON value of [opening].
     *
     * Unlike [opening], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opening") @ExcludeMissing fun _opening(): JsonField<String> = opening

    /**
     * Returns the raw JSON value of [openingAudioUrl].
     *
     * Unlike [openingAudioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opening_audio_url")
    @ExcludeMissing
    fun _openingAudioUrl(): JsonField<String> = openingAudioUrl

    /**
     * Returns the raw JSON value of [personality].
     *
     * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("personality") @ExcludeMissing fun _personality(): JsonField<String> = personality

    /**
     * Returns the raw JSON value of [photos].
     *
     * Unlike [photos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("photos") @ExcludeMissing fun _photos(): JsonField<List<String>> = photos

    /**
     * Returns the raw JSON value of [postHistoryInstructions].
     *
     * Unlike [postHistoryInstructions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("post_history_instructions")
    @ExcludeMissing
    fun _postHistoryInstructions(): JsonField<String> = postHistoryInstructions

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("prompt")
    @ExcludeMissing
    fun _prompt(): JsonField<String> = prompt

    /**
     * Returns the raw JSON value of [scenario].
     *
     * Unlike [scenario], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scenario") @ExcludeMissing fun _scenario(): JsonField<String> = scenario

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<Settings> = settings

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visibility")
    @ExcludeMissing
    fun _visibility(): JsonField<AgentVisibility> = visibility

    /**
     * Returns the raw JSON value of [voiceId].
     *
     * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice_id") @ExcludeMissing fun _voiceId(): JsonField<String> = voiceId

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
         * Returns a mutable builder for constructing an instance of [Agent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .gender()
         * .name()
         * .readableId()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Agent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Long>? = null
        private var gender: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var readableId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var alternateGreetings: JsonField<MutableList<String>>? = null
        private var avatar: JsonField<String> = JsonMissing.of()
        private var background: JsonField<String> = JsonMissing.of()
        private var backgroundImages: JsonField<MutableList<String>>? = null
        private var category: JsonField<String> = JsonMissing.of()
        private var characterBook: JsonField<CharacterBook> = JsonMissing.of()
        private var characterCardSpec: JsonField<String> = JsonMissing.of()
        private var characterVersion: JsonField<String> = JsonMissing.of()
        private var connectorCount: JsonField<Long> = JsonMissing.of()
        private var creator: JsonField<User> = JsonMissing.of()
        private var creatorId: JsonField<String> = JsonMissing.of()
        private var creatorNotes: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<Long> = JsonMissing.of()
        private var extensions: JsonField<Extensions> = JsonMissing.of()
        private var followerCount: JsonField<Long> = JsonMissing.of()
        private var intro: JsonField<String> = JsonMissing.of()
        private var isFollowed: JsonField<Boolean> = JsonMissing.of()
        private var llmConfig: JsonField<ModelConfig> = JsonMissing.of()
        private var mainPrompt: JsonField<String> = JsonMissing.of()
        private var messageExample: JsonField<String> = JsonMissing.of()
        private var modePrompt: JsonField<String> = JsonMissing.of()
        private var opening: JsonField<String> = JsonMissing.of()
        private var openingAudioUrl: JsonField<String> = JsonMissing.of()
        private var personality: JsonField<String> = JsonMissing.of()
        private var photos: JsonField<MutableList<String>>? = null
        private var postHistoryInstructions: JsonField<String> = JsonMissing.of()
        private var prompt: JsonField<String> = JsonMissing.of()
        private var scenario: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<Settings> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var visibility: JsonField<AgentVisibility> = JsonMissing.of()
        private var voiceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agent: Agent) = apply {
            id = agent.id
            createdAt = agent.createdAt
            gender = agent.gender
            name = agent.name
            readableId = agent.readableId
            status = agent.status
            alternateGreetings = agent.alternateGreetings.map { it.toMutableList() }
            avatar = agent.avatar
            background = agent.background
            backgroundImages = agent.backgroundImages.map { it.toMutableList() }
            category = agent.category
            characterBook = agent.characterBook
            characterCardSpec = agent.characterCardSpec
            characterVersion = agent.characterVersion
            connectorCount = agent.connectorCount
            creator = agent.creator
            creatorId = agent.creatorId
            creatorNotes = agent.creatorNotes
            deletedAt = agent.deletedAt
            extensions = agent.extensions
            followerCount = agent.followerCount
            intro = agent.intro
            isFollowed = agent.isFollowed
            llmConfig = agent.llmConfig
            mainPrompt = agent.mainPrompt
            messageExample = agent.messageExample
            modePrompt = agent.modePrompt
            opening = agent.opening
            openingAudioUrl = agent.openingAudioUrl
            personality = agent.personality
            photos = agent.photos.map { it.toMutableList() }
            postHistoryInstructions = agent.postHistoryInstructions
            prompt = agent.prompt
            scenario = agent.scenario
            settings = agent.settings
            tags = agent.tags.map { it.toMutableList() }
            updatedAt = agent.updatedAt
            visibility = agent.visibility
            voiceId = agent.voiceId
            additionalProperties = agent.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun gender(gender: String) = gender(JsonField.of(gender))

        /**
         * Sets [Builder.gender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gender] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: JsonField<String>) = apply { this.gender = gender }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun readableId(readableId: String) = readableId(JsonField.of(readableId))

        /**
         * Sets [Builder.readableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readableId(readableId: JsonField<String>) = apply { this.readableId = readableId }

        /** AI 角色状态 */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun alternateGreetings(alternateGreetings: List<String>?) =
            alternateGreetings(JsonField.ofNullable(alternateGreetings))

        /**
         * Sets [Builder.alternateGreetings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alternateGreetings] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun alternateGreetings(alternateGreetings: JsonField<List<String>>) = apply {
            this.alternateGreetings = alternateGreetings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [alternateGreetings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlternateGreeting(alternateGreeting: String) = apply {
            alternateGreetings =
                (alternateGreetings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("alternateGreetings", it).add(alternateGreeting)
                }
        }

        fun avatar(avatar: String?) = avatar(JsonField.ofNullable(avatar))

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

        fun background(background: String?) = background(JsonField.ofNullable(background))

        /**
         * Sets [Builder.background] to an arbitrary JSON value.
         *
         * You should usually call [Builder.background] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun background(background: JsonField<String>) = apply { this.background = background }

        fun backgroundImages(backgroundImages: List<String>?) =
            backgroundImages(JsonField.ofNullable(backgroundImages))

        /**
         * Sets [Builder.backgroundImages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImages(backgroundImages: JsonField<List<String>>) = apply {
            this.backgroundImages = backgroundImages.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [backgroundImages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBackgroundImage(backgroundImage: String) = apply {
            backgroundImages =
                (backgroundImages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("backgroundImages", it).add(backgroundImage)
                }
        }

        fun category(category: String?) = category(JsonField.ofNullable(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        fun characterBook(characterBook: CharacterBook?) =
            characterBook(JsonField.ofNullable(characterBook))

        /**
         * Sets [Builder.characterBook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterBook] with a well-typed [CharacterBook] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterBook(characterBook: JsonField<CharacterBook>) = apply {
            this.characterBook = characterBook
        }

        fun characterCardSpec(characterCardSpec: String?) =
            characterCardSpec(JsonField.ofNullable(characterCardSpec))

        /**
         * Sets [Builder.characterCardSpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterCardSpec] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterCardSpec(characterCardSpec: JsonField<String>) = apply {
            this.characterCardSpec = characterCardSpec
        }

        fun characterVersion(characterVersion: String?) =
            characterVersion(JsonField.ofNullable(characterVersion))

        /**
         * Sets [Builder.characterVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterVersion(characterVersion: JsonField<String>) = apply {
            this.characterVersion = characterVersion
        }

        fun connectorCount(connectorCount: Long) = connectorCount(JsonField.of(connectorCount))

        /**
         * Sets [Builder.connectorCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectorCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectorCount(connectorCount: JsonField<Long>) = apply {
            this.connectorCount = connectorCount
        }

        /** 返回给客户端的用户信息 */
        fun creator(creator: User?) = creator(JsonField.ofNullable(creator))

        /**
         * Sets [Builder.creator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creator] with a well-typed [User] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creator(creator: JsonField<User>) = apply { this.creator = creator }

        fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

        /**
         * Sets [Builder.creatorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creatorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

        /** 创作者备注 */
        fun creatorNotes(creatorNotes: String?) = creatorNotes(JsonField.ofNullable(creatorNotes))

        /**
         * Sets [Builder.creatorNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creatorNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creatorNotes(creatorNotes: JsonField<String>) = apply {
            this.creatorNotes = creatorNotes
        }

        fun deletedAt(deletedAt: Long?) = deletedAt(JsonField.ofNullable(deletedAt))

        /**
         * Alias for [Builder.deletedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun deletedAt(deletedAt: Long) = deletedAt(deletedAt as Long?)

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deletedAt(deletedAt: JsonField<Long>) = apply { this.deletedAt = deletedAt }

        fun extensions(extensions: Extensions?) = extensions(JsonField.ofNullable(extensions))

        /**
         * Sets [Builder.extensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensions] with a well-typed [Extensions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extensions(extensions: JsonField<Extensions>) = apply { this.extensions = extensions }

        fun followerCount(followerCount: Long) = followerCount(JsonField.of(followerCount))

        /**
         * Sets [Builder.followerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followerCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun followerCount(followerCount: JsonField<Long>) = apply {
            this.followerCount = followerCount
        }

        fun intro(intro: String?) = intro(JsonField.ofNullable(intro))

        /**
         * Sets [Builder.intro] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intro] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun intro(intro: JsonField<String>) = apply { this.intro = intro }

        fun isFollowed(isFollowed: Boolean) = isFollowed(JsonField.of(isFollowed))

        /**
         * Sets [Builder.isFollowed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFollowed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isFollowed(isFollowed: JsonField<Boolean>) = apply { this.isFollowed = isFollowed }

        /** AI 模型配置 */
        fun llmConfig(llmConfig: ModelConfig?) = llmConfig(JsonField.ofNullable(llmConfig))

        /**
         * Sets [Builder.llmConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmConfig] with a well-typed [ModelConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmConfig(llmConfig: JsonField<ModelConfig>) = apply { this.llmConfig = llmConfig }

        /** 主提示词 - 作为第一个 system message，覆盖全局默认主提示词 */
        fun mainPrompt(mainPrompt: String?) = mainPrompt(JsonField.ofNullable(mainPrompt))

        /**
         * Sets [Builder.mainPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mainPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mainPrompt(mainPrompt: JsonField<String>) = apply { this.mainPrompt = mainPrompt }

        /** 对话示例 */
        fun messageExample(messageExample: String?) =
            messageExample(JsonField.ofNullable(messageExample))

        /**
         * Sets [Builder.messageExample] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageExample] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageExample(messageExample: JsonField<String>) = apply {
            this.messageExample = messageExample
        }

        /** 模式提示词 - 放在角色卡提示词后面，覆盖全局默认模式提示词 */
        fun modePrompt(modePrompt: String?) = modePrompt(JsonField.ofNullable(modePrompt))

        /**
         * Sets [Builder.modePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modePrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modePrompt(modePrompt: JsonField<String>) = apply { this.modePrompt = modePrompt }

        fun opening(opening: String?) = opening(JsonField.ofNullable(opening))

        /**
         * Sets [Builder.opening] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opening] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opening(opening: JsonField<String>) = apply { this.opening = opening }

        fun openingAudioUrl(openingAudioUrl: String?) =
            openingAudioUrl(JsonField.ofNullable(openingAudioUrl))

        /**
         * Sets [Builder.openingAudioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openingAudioUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openingAudioUrl(openingAudioUrl: JsonField<String>) = apply {
            this.openingAudioUrl = openingAudioUrl
        }

        /** 角色性格特点 (推荐) */
        fun personality(personality: String?) = personality(JsonField.ofNullable(personality))

        /**
         * Sets [Builder.personality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personality] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun personality(personality: JsonField<String>) = apply { this.personality = personality }

        fun photos(photos: List<String>?) = photos(JsonField.ofNullable(photos))

        /**
         * Sets [Builder.photos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photos] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun photos(photos: JsonField<List<String>>) = apply {
            this.photos = photos.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [photos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoto(photo: String) = apply {
            photos =
                (photos ?: JsonField.of(mutableListOf())).also {
                    checkKnown("photos", it).add(photo)
                }
        }

        fun postHistoryInstructions(postHistoryInstructions: String?) =
            postHistoryInstructions(JsonField.ofNullable(postHistoryInstructions))

        /**
         * Sets [Builder.postHistoryInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postHistoryInstructions] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun postHistoryInstructions(postHistoryInstructions: JsonField<String>) = apply {
            this.postHistoryInstructions = postHistoryInstructions
        }

        /** 已废弃 - 请使用 personality 字段代替 */
        @Deprecated("deprecated") fun prompt(prompt: String?) = prompt(JsonField.ofNullable(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

        /** 背景设定 (推荐) */
        fun scenario(scenario: String?) = scenario(JsonField.ofNullable(scenario))

        /**
         * Sets [Builder.scenario] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenario] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scenario(scenario: JsonField<String>) = apply { this.scenario = scenario }

        fun settings(settings: Settings?) = settings(JsonField.ofNullable(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [Settings] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settings(settings: JsonField<Settings>) = apply { this.settings = settings }

        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun updatedAt(updatedAt: Long?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Alias for [Builder.updatedAt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun updatedAt(updatedAt: Long) = updatedAt(updatedAt as Long?)

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

        /** AI 角色可见性 */
        fun visibility(visibility: AgentVisibility) = visibility(JsonField.of(visibility))

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [AgentVisibility] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun visibility(visibility: JsonField<AgentVisibility>) = apply {
            this.visibility = visibility
        }

        fun voiceId(voiceId: String?) = voiceId(JsonField.ofNullable(voiceId))

        /**
         * Sets [Builder.voiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voiceId(voiceId: JsonField<String>) = apply { this.voiceId = voiceId }

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
         * Returns an immutable instance of [Agent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .gender()
         * .name()
         * .readableId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Agent =
            Agent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("gender", gender),
                checkRequired("name", name),
                checkRequired("readableId", readableId),
                checkRequired("status", status),
                (alternateGreetings ?: JsonMissing.of()).map { it.toImmutable() },
                avatar,
                background,
                (backgroundImages ?: JsonMissing.of()).map { it.toImmutable() },
                category,
                characterBook,
                characterCardSpec,
                characterVersion,
                connectorCount,
                creator,
                creatorId,
                creatorNotes,
                deletedAt,
                extensions,
                followerCount,
                intro,
                isFollowed,
                llmConfig,
                mainPrompt,
                messageExample,
                modePrompt,
                opening,
                openingAudioUrl,
                personality,
                (photos ?: JsonMissing.of()).map { it.toImmutable() },
                postHistoryInstructions,
                prompt,
                scenario,
                settings,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                visibility,
                voiceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Agent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        gender()
        name()
        readableId()
        status().validate()
        alternateGreetings()
        avatar()
        background()
        backgroundImages()
        category()
        characterBook()?.validate()
        characterCardSpec()
        characterVersion()
        connectorCount()
        creator()?.validate()
        creatorId()
        creatorNotes()
        deletedAt()
        extensions()?.validate()
        followerCount()
        intro()
        isFollowed()
        llmConfig()?.validate()
        mainPrompt()
        messageExample()
        modePrompt()
        opening()
        openingAudioUrl()
        personality()
        photos()
        postHistoryInstructions()
        prompt()
        scenario()
        settings()?.validate()
        tags()
        updatedAt()
        visibility()?.validate()
        voiceId()
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
            (if (gender.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (readableId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (alternateGreetings.asKnown()?.size ?: 0) +
            (if (avatar.asKnown() == null) 0 else 1) +
            (if (background.asKnown() == null) 0 else 1) +
            (backgroundImages.asKnown()?.size ?: 0) +
            (if (category.asKnown() == null) 0 else 1) +
            (characterBook.asKnown()?.validity() ?: 0) +
            (if (characterCardSpec.asKnown() == null) 0 else 1) +
            (if (characterVersion.asKnown() == null) 0 else 1) +
            (if (connectorCount.asKnown() == null) 0 else 1) +
            (creator.asKnown()?.validity() ?: 0) +
            (if (creatorId.asKnown() == null) 0 else 1) +
            (if (creatorNotes.asKnown() == null) 0 else 1) +
            (if (deletedAt.asKnown() == null) 0 else 1) +
            (extensions.asKnown()?.validity() ?: 0) +
            (if (followerCount.asKnown() == null) 0 else 1) +
            (if (intro.asKnown() == null) 0 else 1) +
            (if (isFollowed.asKnown() == null) 0 else 1) +
            (llmConfig.asKnown()?.validity() ?: 0) +
            (if (mainPrompt.asKnown() == null) 0 else 1) +
            (if (messageExample.asKnown() == null) 0 else 1) +
            (if (modePrompt.asKnown() == null) 0 else 1) +
            (if (opening.asKnown() == null) 0 else 1) +
            (if (openingAudioUrl.asKnown() == null) 0 else 1) +
            (if (personality.asKnown() == null) 0 else 1) +
            (photos.asKnown()?.size ?: 0) +
            (if (postHistoryInstructions.asKnown() == null) 0 else 1) +
            (if (prompt.asKnown() == null) 0 else 1) +
            (if (scenario.asKnown() == null) 0 else 1) +
            (settings.asKnown()?.validity() ?: 0) +
            (tags.asKnown()?.size ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (visibility.asKnown()?.validity() ?: 0) +
            (if (voiceId.asKnown() == null) 0 else 1)

    /** AI 角色状态 */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("PENDING")

            val APPROVED = of("APPROVED")

            val REJECTED = of("REJECTED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            APPROVED,
            REJECTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            APPROVED,
            REJECTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IntyInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                else -> throw IntyInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IntyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CharacterBook
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

            /** Returns a mutable builder for constructing an instance of [CharacterBook]. */
            fun builder() = Builder()
        }

        /** A builder for [CharacterBook]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(characterBook: CharacterBook) = apply {
                additionalProperties = characterBook.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CharacterBook].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CharacterBook = CharacterBook(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CharacterBook = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CharacterBook && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CharacterBook{additionalProperties=$additionalProperties}"
    }

    class Extensions
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

            /** Returns a mutable builder for constructing an instance of [Extensions]. */
            fun builder() = Builder()
        }

        /** A builder for [Extensions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(extensions: Extensions) = apply {
                additionalProperties = extensions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Extensions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Extensions = Extensions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Extensions = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Extensions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Extensions{additionalProperties=$additionalProperties}"
    }

    class Settings
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

            /** Returns a mutable builder for constructing an instance of [Settings]. */
            fun builder() = Builder()
        }

        /** A builder for [Settings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(settings: Settings) = apply {
                additionalProperties = settings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Settings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Settings = Settings(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Settings = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Settings && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Settings{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Agent &&
            id == other.id &&
            createdAt == other.createdAt &&
            gender == other.gender &&
            name == other.name &&
            readableId == other.readableId &&
            status == other.status &&
            alternateGreetings == other.alternateGreetings &&
            avatar == other.avatar &&
            background == other.background &&
            backgroundImages == other.backgroundImages &&
            category == other.category &&
            characterBook == other.characterBook &&
            characterCardSpec == other.characterCardSpec &&
            characterVersion == other.characterVersion &&
            connectorCount == other.connectorCount &&
            creator == other.creator &&
            creatorId == other.creatorId &&
            creatorNotes == other.creatorNotes &&
            deletedAt == other.deletedAt &&
            extensions == other.extensions &&
            followerCount == other.followerCount &&
            intro == other.intro &&
            isFollowed == other.isFollowed &&
            llmConfig == other.llmConfig &&
            mainPrompt == other.mainPrompt &&
            messageExample == other.messageExample &&
            modePrompt == other.modePrompt &&
            opening == other.opening &&
            openingAudioUrl == other.openingAudioUrl &&
            personality == other.personality &&
            photos == other.photos &&
            postHistoryInstructions == other.postHistoryInstructions &&
            prompt == other.prompt &&
            scenario == other.scenario &&
            settings == other.settings &&
            tags == other.tags &&
            updatedAt == other.updatedAt &&
            visibility == other.visibility &&
            voiceId == other.voiceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            gender,
            name,
            readableId,
            status,
            alternateGreetings,
            avatar,
            background,
            backgroundImages,
            category,
            characterBook,
            characterCardSpec,
            characterVersion,
            connectorCount,
            creator,
            creatorId,
            creatorNotes,
            deletedAt,
            extensions,
            followerCount,
            intro,
            isFollowed,
            llmConfig,
            mainPrompt,
            messageExample,
            modePrompt,
            opening,
            openingAudioUrl,
            personality,
            photos,
            postHistoryInstructions,
            prompt,
            scenario,
            settings,
            tags,
            updatedAt,
            visibility,
            voiceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Agent{id=$id, createdAt=$createdAt, gender=$gender, name=$name, readableId=$readableId, status=$status, alternateGreetings=$alternateGreetings, avatar=$avatar, background=$background, backgroundImages=$backgroundImages, category=$category, characterBook=$characterBook, characterCardSpec=$characterCardSpec, characterVersion=$characterVersion, connectorCount=$connectorCount, creator=$creator, creatorId=$creatorId, creatorNotes=$creatorNotes, deletedAt=$deletedAt, extensions=$extensions, followerCount=$followerCount, intro=$intro, isFollowed=$isFollowed, llmConfig=$llmConfig, mainPrompt=$mainPrompt, messageExample=$messageExample, modePrompt=$modePrompt, opening=$opening, openingAudioUrl=$openingAudioUrl, personality=$personality, photos=$photos, postHistoryInstructions=$postHistoryInstructions, prompt=$prompt, scenario=$scenario, settings=$settings, tags=$tags, updatedAt=$updatedAt, visibility=$visibility, voiceId=$voiceId, additionalProperties=$additionalProperties}"
}
