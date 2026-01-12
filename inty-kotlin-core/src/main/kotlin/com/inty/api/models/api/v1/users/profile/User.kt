// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.profile

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** 返回给客户端的用户信息 */
class User
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val authType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isActive: JsonField<Boolean>,
    private val readableId: JsonField<String>,
    private val actions: JsonField<List<Action>>,
    private val ageGroup: JsonField<String>,
    private val avatar: JsonField<String>,
    private val connectorCount: JsonField<Long>,
    private val description: JsonField<String>,
    private val email: JsonField<String>,
    private val followersCount: JsonField<Long>,
    private val gender: JsonField<Gender>,
    private val isSuperuser: JsonField<Boolean>,
    private val nickname: JsonField<String>,
    private val phone: JsonField<String>,
    private val publicAgentsCount: JsonField<Long>,
    private val systemLanguage: JsonField<String>,
    private val totalPublicAgentsFollows: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userPhoto: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auth_type") @ExcludeMissing authType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("readable_id")
        @ExcludeMissing
        readableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("age_group") @ExcludeMissing ageGroup: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connector_count")
        @ExcludeMissing
        connectorCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("followers_count")
        @ExcludeMissing
        followersCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("gender") @ExcludeMissing gender: JsonField<Gender> = JsonMissing.of(),
        @JsonProperty("is_superuser")
        @ExcludeMissing
        isSuperuser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("public_agents_count")
        @ExcludeMissing
        publicAgentsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("system_language")
        @ExcludeMissing
        systemLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_public_agents_follows")
        @ExcludeMissing
        totalPublicAgentsFollows: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_photo") @ExcludeMissing userPhoto: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        authType,
        createdAt,
        isActive,
        readableId,
        actions,
        ageGroup,
        avatar,
        connectorCount,
        description,
        email,
        followersCount,
        gender,
        isSuperuser,
        nickname,
        phone,
        publicAgentsCount,
        systemLanguage,
        totalPublicAgentsFollows,
        updatedAt,
        userPhoto,
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
    fun authType(): String = authType.getRequired("auth_type")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("is_active")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readableId(): String = readableId.getRequired("readable_id")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun actions(): List<Action>? = actions.getNullable("actions")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun ageGroup(): String? = ageGroup.getNullable("age_group")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun avatar(): String? = avatar.getNullable("avatar")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun connectorCount(): Long? = connectorCount.getNullable("connector_count")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun followersCount(): Long? = followersCount.getNullable("followers_count")

    /**
     * 性别
     *
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun gender(): Gender? = gender.getNullable("gender")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isSuperuser(): Boolean? = isSuperuser.getNullable("is_superuser")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun nickname(): String? = nickname.getNullable("nickname")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun phone(): String? = phone.getNullable("phone")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun publicAgentsCount(): Long? = publicAgentsCount.getNullable("public_agents_count")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun systemLanguage(): String? = systemLanguage.getNullable("system_language")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun totalPublicAgentsFollows(): Long? =
        totalPublicAgentsFollows.getNullable("total_public_agents_follows")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun userPhoto(): String? = userPhoto.getNullable("user_photo")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [authType].
     *
     * Unlike [authType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_type") @ExcludeMissing fun _authType(): JsonField<String> = authType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [readableId].
     *
     * Unlike [readableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readable_id") @ExcludeMissing fun _readableId(): JsonField<String> = readableId

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [ageGroup].
     *
     * Unlike [ageGroup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("age_group") @ExcludeMissing fun _ageGroup(): JsonField<String> = ageGroup

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<String> = avatar

    /**
     * Returns the raw JSON value of [connectorCount].
     *
     * Unlike [connectorCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connector_count")
    @ExcludeMissing
    fun _connectorCount(): JsonField<Long> = connectorCount

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [followersCount].
     *
     * Unlike [followersCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("followers_count")
    @ExcludeMissing
    fun _followersCount(): JsonField<Long> = followersCount

    /**
     * Returns the raw JSON value of [gender].
     *
     * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

    /**
     * Returns the raw JSON value of [isSuperuser].
     *
     * Unlike [isSuperuser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_superuser")
    @ExcludeMissing
    fun _isSuperuser(): JsonField<Boolean> = isSuperuser

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [publicAgentsCount].
     *
     * Unlike [publicAgentsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("public_agents_count")
    @ExcludeMissing
    fun _publicAgentsCount(): JsonField<Long> = publicAgentsCount

    /**
     * Returns the raw JSON value of [systemLanguage].
     *
     * Unlike [systemLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("system_language")
    @ExcludeMissing
    fun _systemLanguage(): JsonField<String> = systemLanguage

    /**
     * Returns the raw JSON value of [totalPublicAgentsFollows].
     *
     * Unlike [totalPublicAgentsFollows], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("total_public_agents_follows")
    @ExcludeMissing
    fun _totalPublicAgentsFollows(): JsonField<Long> = totalPublicAgentsFollows

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userPhoto].
     *
     * Unlike [userPhoto], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_photo") @ExcludeMissing fun _userPhoto(): JsonField<String> = userPhoto

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
         * Returns a mutable builder for constructing an instance of [User].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .authType()
         * .createdAt()
         * .isActive()
         * .readableId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [User]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var authType: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isActive: JsonField<Boolean>? = null
        private var readableId: JsonField<String>? = null
        private var actions: JsonField<MutableList<Action>>? = null
        private var ageGroup: JsonField<String> = JsonMissing.of()
        private var avatar: JsonField<String> = JsonMissing.of()
        private var connectorCount: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var followersCount: JsonField<Long> = JsonMissing.of()
        private var gender: JsonField<Gender> = JsonMissing.of()
        private var isSuperuser: JsonField<Boolean> = JsonMissing.of()
        private var nickname: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var publicAgentsCount: JsonField<Long> = JsonMissing.of()
        private var systemLanguage: JsonField<String> = JsonMissing.of()
        private var totalPublicAgentsFollows: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userPhoto: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(user: User) = apply {
            id = user.id
            authType = user.authType
            createdAt = user.createdAt
            isActive = user.isActive
            readableId = user.readableId
            actions = user.actions.map { it.toMutableList() }
            ageGroup = user.ageGroup
            avatar = user.avatar
            connectorCount = user.connectorCount
            description = user.description
            email = user.email
            followersCount = user.followersCount
            gender = user.gender
            isSuperuser = user.isSuperuser
            nickname = user.nickname
            phone = user.phone
            publicAgentsCount = user.publicAgentsCount
            systemLanguage = user.systemLanguage
            totalPublicAgentsFollows = user.totalPublicAgentsFollows
            updatedAt = user.updatedAt
            userPhoto = user.userPhoto
            additionalProperties = user.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun authType(authType: String) = authType(JsonField.of(authType))

        /**
         * Sets [Builder.authType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authType(authType: JsonField<String>) = apply { this.authType = authType }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        fun readableId(readableId: String) = readableId(JsonField.of(readableId))

        /**
         * Sets [Builder.readableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readableId(readableId: JsonField<String>) = apply { this.readableId = readableId }

        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        fun ageGroup(ageGroup: String?) = ageGroup(JsonField.ofNullable(ageGroup))

        /**
         * Sets [Builder.ageGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ageGroup] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ageGroup(ageGroup: JsonField<String>) = apply { this.ageGroup = ageGroup }

        fun avatar(avatar: String?) = avatar(JsonField.ofNullable(avatar))

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<String>) = apply { this.avatar = avatar }

        fun connectorCount(connectorCount: Long?) =
            connectorCount(JsonField.ofNullable(connectorCount))

        /**
         * Alias for [Builder.connectorCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun connectorCount(connectorCount: Long) = connectorCount(connectorCount as Long?)

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

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun email(email: String?) = email(JsonField.ofNullable(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun followersCount(followersCount: Long?) =
            followersCount(JsonField.ofNullable(followersCount))

        /**
         * Alias for [Builder.followersCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun followersCount(followersCount: Long) = followersCount(followersCount as Long?)

        /**
         * Sets [Builder.followersCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followersCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun followersCount(followersCount: JsonField<Long>) = apply {
            this.followersCount = followersCount
        }

        /** 性别 */
        fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

        /**
         * Sets [Builder.gender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gender] with a well-typed [Gender] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

        fun isSuperuser(isSuperuser: Boolean) = isSuperuser(JsonField.of(isSuperuser))

        /**
         * Sets [Builder.isSuperuser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSuperuser] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isSuperuser(isSuperuser: JsonField<Boolean>) = apply { this.isSuperuser = isSuperuser }

        fun nickname(nickname: String?) = nickname(JsonField.ofNullable(nickname))

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        fun phone(phone: String?) = phone(JsonField.ofNullable(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        fun publicAgentsCount(publicAgentsCount: Long?) =
            publicAgentsCount(JsonField.ofNullable(publicAgentsCount))

        /**
         * Alias for [Builder.publicAgentsCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun publicAgentsCount(publicAgentsCount: Long) =
            publicAgentsCount(publicAgentsCount as Long?)

        /**
         * Sets [Builder.publicAgentsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicAgentsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publicAgentsCount(publicAgentsCount: JsonField<Long>) = apply {
            this.publicAgentsCount = publicAgentsCount
        }

        fun systemLanguage(systemLanguage: String?) =
            systemLanguage(JsonField.ofNullable(systemLanguage))

        /**
         * Sets [Builder.systemLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun systemLanguage(systemLanguage: JsonField<String>) = apply {
            this.systemLanguage = systemLanguage
        }

        fun totalPublicAgentsFollows(totalPublicAgentsFollows: Long?) =
            totalPublicAgentsFollows(JsonField.ofNullable(totalPublicAgentsFollows))

        /**
         * Alias for [Builder.totalPublicAgentsFollows].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalPublicAgentsFollows(totalPublicAgentsFollows: Long) =
            totalPublicAgentsFollows(totalPublicAgentsFollows as Long?)

        /**
         * Sets [Builder.totalPublicAgentsFollows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPublicAgentsFollows] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalPublicAgentsFollows(totalPublicAgentsFollows: JsonField<Long>) = apply {
            this.totalPublicAgentsFollows = totalPublicAgentsFollows
        }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun userPhoto(userPhoto: String?) = userPhoto(JsonField.ofNullable(userPhoto))

        /**
         * Sets [Builder.userPhoto] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userPhoto] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userPhoto(userPhoto: JsonField<String>) = apply { this.userPhoto = userPhoto }

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
         * Returns an immutable instance of [User].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .authType()
         * .createdAt()
         * .isActive()
         * .readableId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): User =
            User(
                checkRequired("id", id),
                checkRequired("authType", authType),
                checkRequired("createdAt", createdAt),
                checkRequired("isActive", isActive),
                checkRequired("readableId", readableId),
                (actions ?: JsonMissing.of()).map { it.toImmutable() },
                ageGroup,
                avatar,
                connectorCount,
                description,
                email,
                followersCount,
                gender,
                isSuperuser,
                nickname,
                phone,
                publicAgentsCount,
                systemLanguage,
                totalPublicAgentsFollows,
                updatedAt,
                userPhoto,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): User = apply {
        if (validated) {
            return@apply
        }

        id()
        authType()
        createdAt()
        isActive()
        readableId()
        actions()?.forEach { it.validate() }
        ageGroup()
        avatar()
        connectorCount()
        description()
        email()
        followersCount()
        gender()?.validate()
        isSuperuser()
        nickname()
        phone()
        publicAgentsCount()
        systemLanguage()
        totalPublicAgentsFollows()
        updatedAt()
        userPhoto()
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
            (if (authType.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (isActive.asKnown() == null) 0 else 1) +
            (if (readableId.asKnown() == null) 0 else 1) +
            (actions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (ageGroup.asKnown() == null) 0 else 1) +
            (if (avatar.asKnown() == null) 0 else 1) +
            (if (connectorCount.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (followersCount.asKnown() == null) 0 else 1) +
            (gender.asKnown()?.validity() ?: 0) +
            (if (isSuperuser.asKnown() == null) 0 else 1) +
            (if (nickname.asKnown() == null) 0 else 1) +
            (if (phone.asKnown() == null) 0 else 1) +
            (if (publicAgentsCount.asKnown() == null) 0 else 1) +
            (if (systemLanguage.asKnown() == null) 0 else 1) +
            (if (totalPublicAgentsFollows.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (userPhoto.asKnown() == null) 0 else 1)

    /** 用户行动项 */
    class Action
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(enabled, type, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * 用户行动类型枚举
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Action].
             *
             * The following fields are required:
             * ```kotlin
             * .enabled()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Action]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(action: Action) = apply {
                enabled = action.enabled
                type = action.type
                additionalProperties = action.additionalProperties.toMutableMap()
            }

            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /** 用户行动类型枚举 */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Action].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .enabled()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Action =
                Action(
                    checkRequired("enabled", enabled),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            enabled()
            type().validate()
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
            (if (enabled.asKnown() == null) 0 else 1) + (type.asKnown()?.validity() ?: 0)

        /** 用户行动类型枚举 */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val REQUEST_FEEDBACK = of("request_feedback")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                REQUEST_FEEDBACK
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REQUEST_FEEDBACK,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    REQUEST_FEEDBACK -> Value.REQUEST_FEEDBACK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IntyInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    REQUEST_FEEDBACK -> Known.REQUEST_FEEDBACK
                    else -> throw IntyInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IntyInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw IntyInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                enabled == other.enabled &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(enabled, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Action{enabled=$enabled, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is User &&
            id == other.id &&
            authType == other.authType &&
            createdAt == other.createdAt &&
            isActive == other.isActive &&
            readableId == other.readableId &&
            actions == other.actions &&
            ageGroup == other.ageGroup &&
            avatar == other.avatar &&
            connectorCount == other.connectorCount &&
            description == other.description &&
            email == other.email &&
            followersCount == other.followersCount &&
            gender == other.gender &&
            isSuperuser == other.isSuperuser &&
            nickname == other.nickname &&
            phone == other.phone &&
            publicAgentsCount == other.publicAgentsCount &&
            systemLanguage == other.systemLanguage &&
            totalPublicAgentsFollows == other.totalPublicAgentsFollows &&
            updatedAt == other.updatedAt &&
            userPhoto == other.userPhoto &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            authType,
            createdAt,
            isActive,
            readableId,
            actions,
            ageGroup,
            avatar,
            connectorCount,
            description,
            email,
            followersCount,
            gender,
            isSuperuser,
            nickname,
            phone,
            publicAgentsCount,
            systemLanguage,
            totalPublicAgentsFollows,
            updatedAt,
            userPhoto,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "User{id=$id, authType=$authType, createdAt=$createdAt, isActive=$isActive, readableId=$readableId, actions=$actions, ageGroup=$ageGroup, avatar=$avatar, connectorCount=$connectorCount, description=$description, email=$email, followersCount=$followersCount, gender=$gender, isSuperuser=$isSuperuser, nickname=$nickname, phone=$phone, publicAgentsCount=$publicAgentsCount, systemLanguage=$systemLanguage, totalPublicAgentsFollows=$totalPublicAgentsFollows, updatedAt=$updatedAt, userPhoto=$userPhoto, additionalProperties=$additionalProperties}"
}
