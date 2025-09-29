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
import com.inty.api.core.Params
import com.inty.api.core.checkKnown
import com.inty.api.core.checkRequired
import com.inty.api.core.http.Headers
import com.inty.api.core.http.QueryParams
import com.inty.api.core.toImmutable
import com.inty.api.errors.IntyInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create new AI agent, used by app and inty-eval */
class AgentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun gender(): String = body.gender()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun alternateGreetings(): List<String>? = body.alternateGreetings()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun avatar(): String? = body.avatar()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun background(): String? = body.background()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun backgroundImages(): List<String>? = body.backgroundImages()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun category(): String? = body.category()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun characterBook(): CharacterBook? = body.characterBook()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun characterCardSpec(): String? = body.characterCardSpec()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun characterVersion(): String? = body.characterVersion()

    /**
     * 创作者备注
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun creatorNotes(): String? = body.creatorNotes()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun extensions(): Extensions? = body.extensions()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun intro(): String? = body.intro()

    /**
     * AI模型配置
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun llmConfig(): ModelConfig? = body.llmConfig()

    /**
     * 主提示词 - 作为第一个system message，覆盖全局默认主提示词
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun mainPrompt(): String? = body.mainPrompt()

    /**
     * 对话示例
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun messageExample(): String? = body.messageExample()

    /**
     * Agent 元数据模型
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metaData(): MetaData? = body.metaData()

    /**
     * 模式提示词 - 放在角色卡提示词后面，覆盖全局默认模式提示词
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun modePrompt(): String? = body.modePrompt()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun opening(): String? = body.opening()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun openingAudioUrl(): String? = body.openingAudioUrl()

    /**
     * 角色性格特点 (推荐)
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun personality(): String? = body.personality()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun photos(): List<String>? = body.photos()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun postHistoryInstructions(): String? = body.postHistoryInstructions()

    /**
     * 已废弃 - 请使用personality字段代替
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun prompt(): String? = body.prompt()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun requestId(): String? = body.requestId()

    /**
     * 背景设定 (推荐)
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun scenario(): String? = body.scenario()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun settings(): Settings? = body.settings()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun tags(): List<String>? = body.tags()

    /**
     * AI 角色可见性
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun visibility(): AgentVisibility? = body.visibility()

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voiceId(): String? = body.voiceId()

    /**
     * Returns the raw JSON value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gender(): JsonField<String> = body._gender()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [alternateGreetings].
     *
     * Unlike [alternateGreetings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _alternateGreetings(): JsonField<List<String>> = body._alternateGreetings()

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avatar(): JsonField<String> = body._avatar()

    /**
     * Returns the raw JSON value of [background].
     *
     * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _background(): JsonField<String> = body._background()

    /**
     * Returns the raw JSON value of [backgroundImages].
     *
     * Unlike [backgroundImages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _backgroundImages(): JsonField<List<String>> = body._backgroundImages()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<String> = body._category()

    /**
     * Returns the raw JSON value of [characterBook].
     *
     * Unlike [characterBook], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _characterBook(): JsonField<CharacterBook> = body._characterBook()

    /**
     * Returns the raw JSON value of [characterCardSpec].
     *
     * Unlike [characterCardSpec], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _characterCardSpec(): JsonField<String> = body._characterCardSpec()

    /**
     * Returns the raw JSON value of [characterVersion].
     *
     * Unlike [characterVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _characterVersion(): JsonField<String> = body._characterVersion()

    /**
     * Returns the raw JSON value of [creatorNotes].
     *
     * Unlike [creatorNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creatorNotes(): JsonField<String> = body._creatorNotes()

    /**
     * Returns the raw JSON value of [extensions].
     *
     * Unlike [extensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extensions(): JsonField<Extensions> = body._extensions()

    /**
     * Returns the raw JSON value of [intro].
     *
     * Unlike [intro], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _intro(): JsonField<String> = body._intro()

    /**
     * Returns the raw JSON value of [llmConfig].
     *
     * Unlike [llmConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmConfig(): JsonField<ModelConfig> = body._llmConfig()

    /**
     * Returns the raw JSON value of [mainPrompt].
     *
     * Unlike [mainPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mainPrompt(): JsonField<String> = body._mainPrompt()

    /**
     * Returns the raw JSON value of [messageExample].
     *
     * Unlike [messageExample], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageExample(): JsonField<String> = body._messageExample()

    /**
     * Returns the raw JSON value of [metaData].
     *
     * Unlike [metaData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metaData(): JsonField<MetaData> = body._metaData()

    /**
     * Returns the raw JSON value of [modePrompt].
     *
     * Unlike [modePrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modePrompt(): JsonField<String> = body._modePrompt()

    /**
     * Returns the raw JSON value of [opening].
     *
     * Unlike [opening], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _opening(): JsonField<String> = body._opening()

    /**
     * Returns the raw JSON value of [openingAudioUrl].
     *
     * Unlike [openingAudioUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _openingAudioUrl(): JsonField<String> = body._openingAudioUrl()

    /**
     * Returns the raw JSON value of [personality].
     *
     * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _personality(): JsonField<String> = body._personality()

    /**
     * Returns the raw JSON value of [photos].
     *
     * Unlike [photos], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _photos(): JsonField<List<String>> = body._photos()

    /**
     * Returns the raw JSON value of [postHistoryInstructions].
     *
     * Unlike [postHistoryInstructions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _postHistoryInstructions(): JsonField<String> = body._postHistoryInstructions()

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _prompt(): JsonField<String> = body._prompt()

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestId(): JsonField<String> = body._requestId()

    /**
     * Returns the raw JSON value of [scenario].
     *
     * Unlike [scenario], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scenario(): JsonField<String> = body._scenario()

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _settings(): JsonField<Settings> = body._settings()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [visibility].
     *
     * Unlike [visibility], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _visibility(): JsonField<AgentVisibility> = body._visibility()

    /**
     * Returns the raw JSON value of [voiceId].
     *
     * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceId(): JsonField<String> = body._voiceId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .gender()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(agentCreateParams: AgentCreateParams) = apply {
            body = agentCreateParams.body.toBuilder()
            additionalHeaders = agentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [gender]
         * - [name]
         * - [alternateGreetings]
         * - [avatar]
         * - [background]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun gender(gender: String) = apply { body.gender(gender) }

        /**
         * Sets [Builder.gender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gender] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: JsonField<String>) = apply { body.gender(gender) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun alternateGreetings(alternateGreetings: List<String>?) = apply {
            body.alternateGreetings(alternateGreetings)
        }

        /**
         * Sets [Builder.alternateGreetings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alternateGreetings] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun alternateGreetings(alternateGreetings: JsonField<List<String>>) = apply {
            body.alternateGreetings(alternateGreetings)
        }

        /**
         * Adds a single [String] to [alternateGreetings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlternateGreeting(alternateGreeting: String) = apply {
            body.addAlternateGreeting(alternateGreeting)
        }

        fun avatar(avatar: String?) = apply { body.avatar(avatar) }

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { body.avatar(avatar) }

        fun background(background: String?) = apply { body.background(background) }

        /**
         * Sets [Builder.background] to an arbitrary JSON value.
         *
         * You should usually call [Builder.background] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun background(background: JsonField<String>) = apply { body.background(background) }

        fun backgroundImages(backgroundImages: List<String>?) = apply {
            body.backgroundImages(backgroundImages)
        }

        /**
         * Sets [Builder.backgroundImages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backgroundImages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backgroundImages(backgroundImages: JsonField<List<String>>) = apply {
            body.backgroundImages(backgroundImages)
        }

        /**
         * Adds a single [String] to [backgroundImages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBackgroundImage(backgroundImage: String) = apply {
            body.addBackgroundImage(backgroundImage)
        }

        fun category(category: String?) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { body.category(category) }

        fun characterBook(characterBook: CharacterBook?) = apply {
            body.characterBook(characterBook)
        }

        /**
         * Sets [Builder.characterBook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterBook] with a well-typed [CharacterBook] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterBook(characterBook: JsonField<CharacterBook>) = apply {
            body.characterBook(characterBook)
        }

        fun characterCardSpec(characterCardSpec: String?) = apply {
            body.characterCardSpec(characterCardSpec)
        }

        /**
         * Sets [Builder.characterCardSpec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterCardSpec] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterCardSpec(characterCardSpec: JsonField<String>) = apply {
            body.characterCardSpec(characterCardSpec)
        }

        fun characterVersion(characterVersion: String?) = apply {
            body.characterVersion(characterVersion)
        }

        /**
         * Sets [Builder.characterVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterVersion(characterVersion: JsonField<String>) = apply {
            body.characterVersion(characterVersion)
        }

        /** 创作者备注 */
        fun creatorNotes(creatorNotes: String?) = apply { body.creatorNotes(creatorNotes) }

        /**
         * Sets [Builder.creatorNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creatorNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creatorNotes(creatorNotes: JsonField<String>) = apply {
            body.creatorNotes(creatorNotes)
        }

        fun extensions(extensions: Extensions?) = apply { body.extensions(extensions) }

        /**
         * Sets [Builder.extensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensions] with a well-typed [Extensions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extensions(extensions: JsonField<Extensions>) = apply { body.extensions(extensions) }

        fun intro(intro: String?) = apply { body.intro(intro) }

        /**
         * Sets [Builder.intro] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intro] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun intro(intro: JsonField<String>) = apply { body.intro(intro) }

        /** AI模型配置 */
        fun llmConfig(llmConfig: ModelConfig?) = apply { body.llmConfig(llmConfig) }

        /**
         * Sets [Builder.llmConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmConfig] with a well-typed [ModelConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmConfig(llmConfig: JsonField<ModelConfig>) = apply { body.llmConfig(llmConfig) }

        /** 主提示词 - 作为第一个system message，覆盖全局默认主提示词 */
        fun mainPrompt(mainPrompt: String?) = apply { body.mainPrompt(mainPrompt) }

        /**
         * Sets [Builder.mainPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mainPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mainPrompt(mainPrompt: JsonField<String>) = apply { body.mainPrompt(mainPrompt) }

        /** 对话示例 */
        fun messageExample(messageExample: String?) = apply { body.messageExample(messageExample) }

        /**
         * Sets [Builder.messageExample] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageExample] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageExample(messageExample: JsonField<String>) = apply {
            body.messageExample(messageExample)
        }

        /** Agent 元数据模型 */
        fun metaData(metaData: MetaData?) = apply { body.metaData(metaData) }

        /**
         * Sets [Builder.metaData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaData] with a well-typed [MetaData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metaData(metaData: JsonField<MetaData>) = apply { body.metaData(metaData) }

        /** 模式提示词 - 放在角色卡提示词后面，覆盖全局默认模式提示词 */
        fun modePrompt(modePrompt: String?) = apply { body.modePrompt(modePrompt) }

        /**
         * Sets [Builder.modePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modePrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modePrompt(modePrompt: JsonField<String>) = apply { body.modePrompt(modePrompt) }

        fun opening(opening: String?) = apply { body.opening(opening) }

        /**
         * Sets [Builder.opening] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opening] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opening(opening: JsonField<String>) = apply { body.opening(opening) }

        fun openingAudioUrl(openingAudioUrl: String?) = apply {
            body.openingAudioUrl(openingAudioUrl)
        }

        /**
         * Sets [Builder.openingAudioUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openingAudioUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openingAudioUrl(openingAudioUrl: JsonField<String>) = apply {
            body.openingAudioUrl(openingAudioUrl)
        }

        /** 角色性格特点 (推荐) */
        fun personality(personality: String?) = apply { body.personality(personality) }

        /**
         * Sets [Builder.personality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personality] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun personality(personality: JsonField<String>) = apply { body.personality(personality) }

        fun photos(photos: List<String>?) = apply { body.photos(photos) }

        /**
         * Sets [Builder.photos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photos] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun photos(photos: JsonField<List<String>>) = apply { body.photos(photos) }

        /**
         * Adds a single [String] to [photos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoto(photo: String) = apply { body.addPhoto(photo) }

        fun postHistoryInstructions(postHistoryInstructions: String?) = apply {
            body.postHistoryInstructions(postHistoryInstructions)
        }

        /**
         * Sets [Builder.postHistoryInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postHistoryInstructions] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun postHistoryInstructions(postHistoryInstructions: JsonField<String>) = apply {
            body.postHistoryInstructions(postHistoryInstructions)
        }

        /** 已废弃 - 请使用personality字段代替 */
        @Deprecated("deprecated") fun prompt(prompt: String?) = apply { body.prompt(prompt) }

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun prompt(prompt: JsonField<String>) = apply { body.prompt(prompt) }

        fun requestId(requestId: String?) = apply { body.requestId(requestId) }

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { body.requestId(requestId) }

        /** 背景设定 (推荐) */
        fun scenario(scenario: String?) = apply { body.scenario(scenario) }

        /**
         * Sets [Builder.scenario] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scenario] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scenario(scenario: JsonField<String>) = apply { body.scenario(scenario) }

        fun settings(settings: Settings?) = apply { body.settings(settings) }

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [Settings] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settings(settings: JsonField<Settings>) = apply { body.settings(settings) }

        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        /** AI 角色可见性 */
        fun visibility(visibility: AgentVisibility) = apply { body.visibility(visibility) }

        /**
         * Sets [Builder.visibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visibility] with a well-typed [AgentVisibility] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun visibility(visibility: JsonField<AgentVisibility>) = apply {
            body.visibility(visibility)
        }

        fun voiceId(voiceId: String?) = apply { body.voiceId(voiceId) }

        /**
         * Sets [Builder.voiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voiceId(voiceId: JsonField<String>) = apply { body.voiceId(voiceId) }

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
         * Returns an immutable instance of [AgentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .gender()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentCreateParams =
            AgentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * 创建AI角色
     *
     * 推荐使用方式：
     * 1. 使用personality + scenario字段构建角色
     * 2. 添加first_message作为开场白
     * 3. 可选添加message_example展示对话风格
     *
     * 兼容性说明：
     * - 仍支持使用prompt字段 (legacy模式)
     * - 优先级：角色卡字段 > prompt字段
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val gender: JsonField<String>,
        private val name: JsonField<String>,
        private val alternateGreetings: JsonField<List<String>>,
        private val avatar: JsonField<String>,
        private val background: JsonField<String>,
        private val backgroundImages: JsonField<List<String>>,
        private val category: JsonField<String>,
        private val characterBook: JsonField<CharacterBook>,
        private val characterCardSpec: JsonField<String>,
        private val characterVersion: JsonField<String>,
        private val creatorNotes: JsonField<String>,
        private val extensions: JsonField<Extensions>,
        private val intro: JsonField<String>,
        private val llmConfig: JsonField<ModelConfig>,
        private val mainPrompt: JsonField<String>,
        private val messageExample: JsonField<String>,
        private val metaData: JsonField<MetaData>,
        private val modePrompt: JsonField<String>,
        private val opening: JsonField<String>,
        private val openingAudioUrl: JsonField<String>,
        private val personality: JsonField<String>,
        private val photos: JsonField<List<String>>,
        private val postHistoryInstructions: JsonField<String>,
        private val prompt: JsonField<String>,
        private val requestId: JsonField<String>,
        private val scenario: JsonField<String>,
        private val settings: JsonField<Settings>,
        private val tags: JsonField<List<String>>,
        private val visibility: JsonField<AgentVisibility>,
        private val voiceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("gender") @ExcludeMissing gender: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("character_book")
            @ExcludeMissing
            characterBook: JsonField<CharacterBook> = JsonMissing.of(),
            @JsonProperty("character_card_spec")
            @ExcludeMissing
            characterCardSpec: JsonField<String> = JsonMissing.of(),
            @JsonProperty("character_version")
            @ExcludeMissing
            characterVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creator_notes")
            @ExcludeMissing
            creatorNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extensions")
            @ExcludeMissing
            extensions: JsonField<Extensions> = JsonMissing.of(),
            @JsonProperty("intro") @ExcludeMissing intro: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_config")
            @ExcludeMissing
            llmConfig: JsonField<ModelConfig> = JsonMissing.of(),
            @JsonProperty("main_prompt")
            @ExcludeMissing
            mainPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message_example")
            @ExcludeMissing
            messageExample: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meta_data")
            @ExcludeMissing
            metaData: JsonField<MetaData> = JsonMissing.of(),
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
            @JsonProperty("photos")
            @ExcludeMissing
            photos: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("post_history_instructions")
            @ExcludeMissing
            postHistoryInstructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scenario")
            @ExcludeMissing
            scenario: JsonField<String> = JsonMissing.of(),
            @JsonProperty("settings")
            @ExcludeMissing
            settings: JsonField<Settings> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("visibility")
            @ExcludeMissing
            visibility: JsonField<AgentVisibility> = JsonMissing.of(),
            @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            gender,
            name,
            alternateGreetings,
            avatar,
            background,
            backgroundImages,
            category,
            characterBook,
            characterCardSpec,
            characterVersion,
            creatorNotes,
            extensions,
            intro,
            llmConfig,
            mainPrompt,
            messageExample,
            metaData,
            modePrompt,
            opening,
            openingAudioUrl,
            personality,
            photos,
            postHistoryInstructions,
            prompt,
            requestId,
            scenario,
            settings,
            tags,
            visibility,
            voiceId,
            mutableMapOf(),
        )

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gender(): String = gender.getRequired("gender")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alternateGreetings(): List<String>? =
            alternateGreetings.getNullable("alternate_greetings")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun avatar(): String? = avatar.getNullable("avatar")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun background(): String? = background.getNullable("background")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun backgroundImages(): List<String>? = backgroundImages.getNullable("background_images")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): String? = category.getNullable("category")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun characterBook(): CharacterBook? = characterBook.getNullable("character_book")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun characterCardSpec(): String? = characterCardSpec.getNullable("character_card_spec")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun characterVersion(): String? = characterVersion.getNullable("character_version")

        /**
         * 创作者备注
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creatorNotes(): String? = creatorNotes.getNullable("creator_notes")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extensions(): Extensions? = extensions.getNullable("extensions")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun intro(): String? = intro.getNullable("intro")

        /**
         * AI模型配置
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmConfig(): ModelConfig? = llmConfig.getNullable("llm_config")

        /**
         * 主提示词 - 作为第一个system message，覆盖全局默认主提示词
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mainPrompt(): String? = mainPrompt.getNullable("main_prompt")

        /**
         * 对话示例
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageExample(): String? = messageExample.getNullable("message_example")

        /**
         * Agent 元数据模型
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metaData(): MetaData? = metaData.getNullable("meta_data")

        /**
         * 模式提示词 - 放在角色卡提示词后面，覆盖全局默认模式提示词
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modePrompt(): String? = modePrompt.getNullable("mode_prompt")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun opening(): String? = opening.getNullable("opening")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun openingAudioUrl(): String? = openingAudioUrl.getNullable("opening_audio_url")

        /**
         * 角色性格特点 (推荐)
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun personality(): String? = personality.getNullable("personality")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun photos(): List<String>? = photos.getNullable("photos")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postHistoryInstructions(): String? =
            postHistoryInstructions.getNullable("post_history_instructions")

        /**
         * 已废弃 - 请使用personality字段代替
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun prompt(): String? = prompt.getNullable("prompt")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

        /**
         * 背景设定 (推荐)
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scenario(): String? = scenario.getNullable("scenario")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun settings(): Settings? = settings.getNullable("settings")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): List<String>? = tags.getNullable("tags")

        /**
         * AI 角色可见性
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun visibility(): AgentVisibility? = visibility.getNullable("visibility")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceId(): String? = voiceId.getNullable("voice_id")

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
         * Returns the raw JSON value of [alternateGreetings].
         *
         * Unlike [alternateGreetings], this method doesn't throw if the JSON field has an
         * unexpected type.
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
        @JsonProperty("background")
        @ExcludeMissing
        fun _background(): JsonField<String> = background

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
         * Unlike [characterBook], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [creatorNotes].
         *
         * Unlike [creatorNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creator_notes")
        @ExcludeMissing
        fun _creatorNotes(): JsonField<String> = creatorNotes

        /**
         * Returns the raw JSON value of [extensions].
         *
         * Unlike [extensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extensions")
        @ExcludeMissing
        fun _extensions(): JsonField<Extensions> = extensions

        /**
         * Returns the raw JSON value of [intro].
         *
         * Unlike [intro], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("intro") @ExcludeMissing fun _intro(): JsonField<String> = intro

        /**
         * Returns the raw JSON value of [llmConfig].
         *
         * Unlike [llmConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("llm_config")
        @ExcludeMissing
        fun _llmConfig(): JsonField<ModelConfig> = llmConfig

        /**
         * Returns the raw JSON value of [mainPrompt].
         *
         * Unlike [mainPrompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("main_prompt")
        @ExcludeMissing
        fun _mainPrompt(): JsonField<String> = mainPrompt

        /**
         * Returns the raw JSON value of [messageExample].
         *
         * Unlike [messageExample], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("message_example")
        @ExcludeMissing
        fun _messageExample(): JsonField<String> = messageExample

        /**
         * Returns the raw JSON value of [metaData].
         *
         * Unlike [metaData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonField<MetaData> = metaData

        /**
         * Returns the raw JSON value of [modePrompt].
         *
         * Unlike [modePrompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode_prompt")
        @ExcludeMissing
        fun _modePrompt(): JsonField<String> = modePrompt

        /**
         * Returns the raw JSON value of [opening].
         *
         * Unlike [opening], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("opening") @ExcludeMissing fun _opening(): JsonField<String> = opening

        /**
         * Returns the raw JSON value of [openingAudioUrl].
         *
         * Unlike [openingAudioUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("opening_audio_url")
        @ExcludeMissing
        fun _openingAudioUrl(): JsonField<String> = openingAudioUrl

        /**
         * Returns the raw JSON value of [personality].
         *
         * Unlike [personality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("personality")
        @ExcludeMissing
        fun _personality(): JsonField<String> = personality

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
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .gender()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var gender: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var alternateGreetings: JsonField<MutableList<String>>? = null
            private var avatar: JsonField<String> = JsonMissing.of()
            private var background: JsonField<String> = JsonMissing.of()
            private var backgroundImages: JsonField<MutableList<String>>? = null
            private var category: JsonField<String> = JsonMissing.of()
            private var characterBook: JsonField<CharacterBook> = JsonMissing.of()
            private var characterCardSpec: JsonField<String> = JsonMissing.of()
            private var characterVersion: JsonField<String> = JsonMissing.of()
            private var creatorNotes: JsonField<String> = JsonMissing.of()
            private var extensions: JsonField<Extensions> = JsonMissing.of()
            private var intro: JsonField<String> = JsonMissing.of()
            private var llmConfig: JsonField<ModelConfig> = JsonMissing.of()
            private var mainPrompt: JsonField<String> = JsonMissing.of()
            private var messageExample: JsonField<String> = JsonMissing.of()
            private var metaData: JsonField<MetaData> = JsonMissing.of()
            private var modePrompt: JsonField<String> = JsonMissing.of()
            private var opening: JsonField<String> = JsonMissing.of()
            private var openingAudioUrl: JsonField<String> = JsonMissing.of()
            private var personality: JsonField<String> = JsonMissing.of()
            private var photos: JsonField<MutableList<String>>? = null
            private var postHistoryInstructions: JsonField<String> = JsonMissing.of()
            private var prompt: JsonField<String> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var scenario: JsonField<String> = JsonMissing.of()
            private var settings: JsonField<Settings> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var visibility: JsonField<AgentVisibility> = JsonMissing.of()
            private var voiceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                gender = body.gender
                name = body.name
                alternateGreetings = body.alternateGreetings.map { it.toMutableList() }
                avatar = body.avatar
                background = body.background
                backgroundImages = body.backgroundImages.map { it.toMutableList() }
                category = body.category
                characterBook = body.characterBook
                characterCardSpec = body.characterCardSpec
                characterVersion = body.characterVersion
                creatorNotes = body.creatorNotes
                extensions = body.extensions
                intro = body.intro
                llmConfig = body.llmConfig
                mainPrompt = body.mainPrompt
                messageExample = body.messageExample
                metaData = body.metaData
                modePrompt = body.modePrompt
                opening = body.opening
                openingAudioUrl = body.openingAudioUrl
                personality = body.personality
                photos = body.photos.map { it.toMutableList() }
                postHistoryInstructions = body.postHistoryInstructions
                prompt = body.prompt
                requestId = body.requestId
                scenario = body.scenario
                settings = body.settings
                tags = body.tags.map { it.toMutableList() }
                visibility = body.visibility
                voiceId = body.voiceId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun gender(gender: String) = gender(JsonField.of(gender))

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<String>) = apply { this.gender = gender }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun alternateGreetings(alternateGreetings: List<String>?) =
                alternateGreetings(JsonField.ofNullable(alternateGreetings))

            /**
             * Sets [Builder.alternateGreetings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alternateGreetings] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.avatar] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

            fun background(background: String?) = background(JsonField.ofNullable(background))

            /**
             * Sets [Builder.background] to an arbitrary JSON value.
             *
             * You should usually call [Builder.background] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun background(background: JsonField<String>) = apply { this.background = background }

            fun backgroundImages(backgroundImages: List<String>?) =
                backgroundImages(JsonField.ofNullable(backgroundImages))

            /**
             * Sets [Builder.backgroundImages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backgroundImages] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            fun characterBook(characterBook: CharacterBook?) =
                characterBook(JsonField.ofNullable(characterBook))

            /**
             * Sets [Builder.characterBook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.characterBook] with a well-typed [CharacterBook]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** 创作者备注 */
            fun creatorNotes(creatorNotes: String?) =
                creatorNotes(JsonField.ofNullable(creatorNotes))

            /**
             * Sets [Builder.creatorNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creatorNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creatorNotes(creatorNotes: JsonField<String>) = apply {
                this.creatorNotes = creatorNotes
            }

            fun extensions(extensions: Extensions?) = extensions(JsonField.ofNullable(extensions))

            /**
             * Sets [Builder.extensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extensions] with a well-typed [Extensions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extensions(extensions: JsonField<Extensions>) = apply {
                this.extensions = extensions
            }

            fun intro(intro: String?) = intro(JsonField.ofNullable(intro))

            /**
             * Sets [Builder.intro] to an arbitrary JSON value.
             *
             * You should usually call [Builder.intro] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun intro(intro: JsonField<String>) = apply { this.intro = intro }

            /** AI模型配置 */
            fun llmConfig(llmConfig: ModelConfig?) = llmConfig(JsonField.ofNullable(llmConfig))

            /**
             * Sets [Builder.llmConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmConfig] with a well-typed [ModelConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmConfig(llmConfig: JsonField<ModelConfig>) = apply { this.llmConfig = llmConfig }

            /** 主提示词 - 作为第一个system message，覆盖全局默认主提示词 */
            fun mainPrompt(mainPrompt: String?) = mainPrompt(JsonField.ofNullable(mainPrompt))

            /**
             * Sets [Builder.mainPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mainPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Agent 元数据模型 */
            fun metaData(metaData: MetaData?) = metaData(JsonField.ofNullable(metaData))

            /**
             * Sets [Builder.metaData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metaData] with a well-typed [MetaData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metaData(metaData: JsonField<MetaData>) = apply { this.metaData = metaData }

            /** 模式提示词 - 放在角色卡提示词后面，覆盖全局默认模式提示词 */
            fun modePrompt(modePrompt: String?) = modePrompt(JsonField.ofNullable(modePrompt))

            /**
             * Sets [Builder.modePrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modePrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modePrompt(modePrompt: JsonField<String>) = apply { this.modePrompt = modePrompt }

            fun opening(opening: String?) = opening(JsonField.ofNullable(opening))

            /**
             * Sets [Builder.opening] to an arbitrary JSON value.
             *
             * You should usually call [Builder.opening] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.personality] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personality(personality: JsonField<String>) = apply {
                this.personality = personality
            }

            fun photos(photos: List<String>?) = photos(JsonField.ofNullable(photos))

            /**
             * Sets [Builder.photos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.photos] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postHistoryInstructions(postHistoryInstructions: JsonField<String>) = apply {
                this.postHistoryInstructions = postHistoryInstructions
            }

            /** 已废弃 - 请使用personality字段代替 */
            @Deprecated("deprecated")
            fun prompt(prompt: String?) = prompt(JsonField.ofNullable(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            /** 背景设定 (推荐) */
            fun scenario(scenario: String?) = scenario(JsonField.ofNullable(scenario))

            /**
             * Sets [Builder.scenario] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenario] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenario(scenario: JsonField<String>) = apply { this.scenario = scenario }

            fun settings(settings: Settings?) = settings(JsonField.ofNullable(settings))

            /**
             * Sets [Builder.settings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settings] with a well-typed [Settings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settings(settings: JsonField<Settings>) = apply { this.settings = settings }

            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** AI 角色可见性 */
            fun visibility(visibility: AgentVisibility) = visibility(JsonField.of(visibility))

            /**
             * Sets [Builder.visibility] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visibility] with a well-typed [AgentVisibility]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun visibility(visibility: JsonField<AgentVisibility>) = apply {
                this.visibility = visibility
            }

            fun voiceId(voiceId: String?) = voiceId(JsonField.ofNullable(voiceId))

            /**
             * Sets [Builder.voiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .gender()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("gender", gender),
                    checkRequired("name", name),
                    (alternateGreetings ?: JsonMissing.of()).map { it.toImmutable() },
                    avatar,
                    background,
                    (backgroundImages ?: JsonMissing.of()).map { it.toImmutable() },
                    category,
                    characterBook,
                    characterCardSpec,
                    characterVersion,
                    creatorNotes,
                    extensions,
                    intro,
                    llmConfig,
                    mainPrompt,
                    messageExample,
                    metaData,
                    modePrompt,
                    opening,
                    openingAudioUrl,
                    personality,
                    (photos ?: JsonMissing.of()).map { it.toImmutable() },
                    postHistoryInstructions,
                    prompt,
                    requestId,
                    scenario,
                    settings,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    visibility,
                    voiceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            gender()
            name()
            alternateGreetings()
            avatar()
            background()
            backgroundImages()
            category()
            characterBook()?.validate()
            characterCardSpec()
            characterVersion()
            creatorNotes()
            extensions()?.validate()
            intro()
            llmConfig()?.validate()
            mainPrompt()
            messageExample()
            metaData()?.validate()
            modePrompt()
            opening()
            openingAudioUrl()
            personality()
            photos()
            postHistoryInstructions()
            prompt()
            requestId()
            scenario()
            settings()?.validate()
            tags()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (gender.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (alternateGreetings.asKnown()?.size ?: 0) +
                (if (avatar.asKnown() == null) 0 else 1) +
                (if (background.asKnown() == null) 0 else 1) +
                (backgroundImages.asKnown()?.size ?: 0) +
                (if (category.asKnown() == null) 0 else 1) +
                (characterBook.asKnown()?.validity() ?: 0) +
                (if (characterCardSpec.asKnown() == null) 0 else 1) +
                (if (characterVersion.asKnown() == null) 0 else 1) +
                (if (creatorNotes.asKnown() == null) 0 else 1) +
                (extensions.asKnown()?.validity() ?: 0) +
                (if (intro.asKnown() == null) 0 else 1) +
                (llmConfig.asKnown()?.validity() ?: 0) +
                (if (mainPrompt.asKnown() == null) 0 else 1) +
                (if (messageExample.asKnown() == null) 0 else 1) +
                (metaData.asKnown()?.validity() ?: 0) +
                (if (modePrompt.asKnown() == null) 0 else 1) +
                (if (opening.asKnown() == null) 0 else 1) +
                (if (openingAudioUrl.asKnown() == null) 0 else 1) +
                (if (personality.asKnown() == null) 0 else 1) +
                (photos.asKnown()?.size ?: 0) +
                (if (postHistoryInstructions.asKnown() == null) 0 else 1) +
                (if (prompt.asKnown() == null) 0 else 1) +
                (if (requestId.asKnown() == null) 0 else 1) +
                (if (scenario.asKnown() == null) 0 else 1) +
                (settings.asKnown()?.validity() ?: 0) +
                (tags.asKnown()?.size ?: 0) +
                (visibility.asKnown()?.validity() ?: 0) +
                (if (voiceId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                gender == other.gender &&
                name == other.name &&
                alternateGreetings == other.alternateGreetings &&
                avatar == other.avatar &&
                background == other.background &&
                backgroundImages == other.backgroundImages &&
                category == other.category &&
                characterBook == other.characterBook &&
                characterCardSpec == other.characterCardSpec &&
                characterVersion == other.characterVersion &&
                creatorNotes == other.creatorNotes &&
                extensions == other.extensions &&
                intro == other.intro &&
                llmConfig == other.llmConfig &&
                mainPrompt == other.mainPrompt &&
                messageExample == other.messageExample &&
                metaData == other.metaData &&
                modePrompt == other.modePrompt &&
                opening == other.opening &&
                openingAudioUrl == other.openingAudioUrl &&
                personality == other.personality &&
                photos == other.photos &&
                postHistoryInstructions == other.postHistoryInstructions &&
                prompt == other.prompt &&
                requestId == other.requestId &&
                scenario == other.scenario &&
                settings == other.settings &&
                tags == other.tags &&
                visibility == other.visibility &&
                voiceId == other.voiceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                gender,
                name,
                alternateGreetings,
                avatar,
                background,
                backgroundImages,
                category,
                characterBook,
                characterCardSpec,
                characterVersion,
                creatorNotes,
                extensions,
                intro,
                llmConfig,
                mainPrompt,
                messageExample,
                metaData,
                modePrompt,
                opening,
                openingAudioUrl,
                personality,
                photos,
                postHistoryInstructions,
                prompt,
                requestId,
                scenario,
                settings,
                tags,
                visibility,
                voiceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{gender=$gender, name=$name, alternateGreetings=$alternateGreetings, avatar=$avatar, background=$background, backgroundImages=$backgroundImages, category=$category, characterBook=$characterBook, characterCardSpec=$characterCardSpec, characterVersion=$characterVersion, creatorNotes=$creatorNotes, extensions=$extensions, intro=$intro, llmConfig=$llmConfig, mainPrompt=$mainPrompt, messageExample=$messageExample, metaData=$metaData, modePrompt=$modePrompt, opening=$opening, openingAudioUrl=$openingAudioUrl, personality=$personality, photos=$photos, postHistoryInstructions=$postHistoryInstructions, prompt=$prompt, requestId=$requestId, scenario=$scenario, settings=$settings, tags=$tags, visibility=$visibility, voiceId=$voiceId, additionalProperties=$additionalProperties}"
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

    /** Agent 元数据模型 */
    class MetaData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val comment: JsonField<String>,
        private val score: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
        ) : this(comment, score, mutableMapOf())

        /**
         * Agent 备注信息
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comment(): String? = comment.getNullable("comment")

        /**
         * Agent 评分
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Long? = score.getNullable("score")

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Long> = score

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

            /** Returns a mutable builder for constructing an instance of [MetaData]. */
            fun builder() = Builder()
        }

        /** A builder for [MetaData]. */
        class Builder internal constructor() {

            private var comment: JsonField<String> = JsonMissing.of()
            private var score: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metaData: MetaData) = apply {
                comment = metaData.comment
                score = metaData.score
                additionalProperties = metaData.additionalProperties.toMutableMap()
            }

            /** Agent 备注信息 */
            fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<String>) = apply { this.comment = comment }

            /** Agent 评分 */
            fun score(score: Long?) = score(JsonField.ofNullable(score))

            /**
             * Alias for [Builder.score].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun score(score: Long) = score(score as Long?)

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun score(score: JsonField<Long>) = apply { this.score = score }

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
             * Returns an immutable instance of [MetaData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MetaData = MetaData(comment, score, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): MetaData = apply {
            if (validated) {
                return@apply
            }

            comment()
            score()
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
            (if (comment.asKnown() == null) 0 else 1) + (if (score.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MetaData &&
                comment == other.comment &&
                score == other.score &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(comment, score, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MetaData{comment=$comment, score=$score, additionalProperties=$additionalProperties}"
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

        return other is AgentCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
