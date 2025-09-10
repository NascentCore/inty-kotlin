// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.version

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

class VersionCheckResponse
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
     * 版本检查响应模型
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

        /** Returns a mutable builder for constructing an instance of [VersionCheckResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [VersionCheckResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(versionCheckResponse: VersionCheckResponse) = apply {
            code = versionCheckResponse.code
            data = versionCheckResponse.data
            message = versionCheckResponse.message
            additionalProperties = versionCheckResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** 版本检查响应模型 */
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
         * Returns an immutable instance of [VersionCheckResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VersionCheckResponse =
            VersionCheckResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): VersionCheckResponse = apply {
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

    /** 版本检查响应模型 */
    class Data
    private constructor(
        private val currentVersion: JsonField<String>,
        private val downloadUrl: JsonField<String>,
        private val forceUpdate: JsonField<Boolean>,
        private val latestVersion: JsonField<String>,
        private val message: JsonField<String>,
        private val minimumVersion: JsonField<String>,
        private val updateRequired: JsonField<Boolean>,
        private val changelog: JsonField<String>,
        private val error: JsonField<String>,
        private val forceUpdateReasons: JsonField<List<String>>,
        private val latestVersionCode: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current_version")
            @ExcludeMissing
            currentVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("download_url")
            @ExcludeMissing
            downloadUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("force_update")
            @ExcludeMissing
            forceUpdate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("latest_version")
            @ExcludeMissing
            latestVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_version")
            @ExcludeMissing
            minimumVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("update_required")
            @ExcludeMissing
            updateRequired: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("changelog")
            @ExcludeMissing
            changelog: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("force_update_reasons")
            @ExcludeMissing
            forceUpdateReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("latest_version_code")
            @ExcludeMissing
            latestVersionCode: JsonField<Long> = JsonMissing.of(),
        ) : this(
            currentVersion,
            downloadUrl,
            forceUpdate,
            latestVersion,
            message,
            minimumVersion,
            updateRequired,
            changelog,
            error,
            forceUpdateReasons,
            latestVersionCode,
            mutableMapOf(),
        )

        /**
         * 当前客户端版本
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currentVersion(): String = currentVersion.getRequired("current_version")

        /**
         * 下载链接
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun downloadUrl(): String = downloadUrl.getRequired("download_url")

        /**
         * 是否强制更新
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun forceUpdate(): Boolean = forceUpdate.getRequired("force_update")

        /**
         * 最新可用版本
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun latestVersion(): String = latestVersion.getRequired("latest_version")

        /**
         * 状态消息
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * 最低支持版本
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimumVersion(): String = minimumVersion.getRequired("minimum_version")

        /**
         * 是否需要更新
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updateRequired(): Boolean = updateRequired.getRequired("update_required")

        /**
         * 更新日志
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun changelog(): String? = changelog.getNullable("changelog")

        /**
         * 错误信息
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): String? = error.getNullable("error")

        /**
         * 强制更新的具体原因列表
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun forceUpdateReasons(): List<String>? =
            forceUpdateReasons.getNullable("force_update_reasons")

        /**
         * 最新版本代码
         *
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latestVersionCode(): Long? = latestVersionCode.getNullable("latest_version_code")

        /**
         * Returns the raw JSON value of [currentVersion].
         *
         * Unlike [currentVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_version")
        @ExcludeMissing
        fun _currentVersion(): JsonField<String> = currentVersion

        /**
         * Returns the raw JSON value of [downloadUrl].
         *
         * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("download_url")
        @ExcludeMissing
        fun _downloadUrl(): JsonField<String> = downloadUrl

        /**
         * Returns the raw JSON value of [forceUpdate].
         *
         * Unlike [forceUpdate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("force_update")
        @ExcludeMissing
        fun _forceUpdate(): JsonField<Boolean> = forceUpdate

        /**
         * Returns the raw JSON value of [latestVersion].
         *
         * Unlike [latestVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("latest_version")
        @ExcludeMissing
        fun _latestVersion(): JsonField<String> = latestVersion

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [minimumVersion].
         *
         * Unlike [minimumVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_version")
        @ExcludeMissing
        fun _minimumVersion(): JsonField<String> = minimumVersion

        /**
         * Returns the raw JSON value of [updateRequired].
         *
         * Unlike [updateRequired], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("update_required")
        @ExcludeMissing
        fun _updateRequired(): JsonField<Boolean> = updateRequired

        /**
         * Returns the raw JSON value of [changelog].
         *
         * Unlike [changelog], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("changelog") @ExcludeMissing fun _changelog(): JsonField<String> = changelog

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [forceUpdateReasons].
         *
         * Unlike [forceUpdateReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("force_update_reasons")
        @ExcludeMissing
        fun _forceUpdateReasons(): JsonField<List<String>> = forceUpdateReasons

        /**
         * Returns the raw JSON value of [latestVersionCode].
         *
         * Unlike [latestVersionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("latest_version_code")
        @ExcludeMissing
        fun _latestVersionCode(): JsonField<Long> = latestVersionCode

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
             * .currentVersion()
             * .downloadUrl()
             * .forceUpdate()
             * .latestVersion()
             * .message()
             * .minimumVersion()
             * .updateRequired()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var currentVersion: JsonField<String>? = null
            private var downloadUrl: JsonField<String>? = null
            private var forceUpdate: JsonField<Boolean>? = null
            private var latestVersion: JsonField<String>? = null
            private var message: JsonField<String>? = null
            private var minimumVersion: JsonField<String>? = null
            private var updateRequired: JsonField<Boolean>? = null
            private var changelog: JsonField<String> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var forceUpdateReasons: JsonField<MutableList<String>>? = null
            private var latestVersionCode: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                currentVersion = data.currentVersion
                downloadUrl = data.downloadUrl
                forceUpdate = data.forceUpdate
                latestVersion = data.latestVersion
                message = data.message
                minimumVersion = data.minimumVersion
                updateRequired = data.updateRequired
                changelog = data.changelog
                error = data.error
                forceUpdateReasons = data.forceUpdateReasons.map { it.toMutableList() }
                latestVersionCode = data.latestVersionCode
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** 当前客户端版本 */
            fun currentVersion(currentVersion: String) =
                currentVersion(JsonField.of(currentVersion))

            /**
             * Sets [Builder.currentVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentVersion(currentVersion: JsonField<String>) = apply {
                this.currentVersion = currentVersion
            }

            /** 下载链接 */
            fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

            /**
             * Sets [Builder.downloadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.downloadUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun downloadUrl(downloadUrl: JsonField<String>) = apply {
                this.downloadUrl = downloadUrl
            }

            /** 是否强制更新 */
            fun forceUpdate(forceUpdate: Boolean) = forceUpdate(JsonField.of(forceUpdate))

            /**
             * Sets [Builder.forceUpdate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forceUpdate] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forceUpdate(forceUpdate: JsonField<Boolean>) = apply {
                this.forceUpdate = forceUpdate
            }

            /** 最新可用版本 */
            fun latestVersion(latestVersion: String) = latestVersion(JsonField.of(latestVersion))

            /**
             * Sets [Builder.latestVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latestVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latestVersion(latestVersion: JsonField<String>) = apply {
                this.latestVersion = latestVersion
            }

            /** 状态消息 */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** 最低支持版本 */
            fun minimumVersion(minimumVersion: String) =
                minimumVersion(JsonField.of(minimumVersion))

            /**
             * Sets [Builder.minimumVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumVersion(minimumVersion: JsonField<String>) = apply {
                this.minimumVersion = minimumVersion
            }

            /** 是否需要更新 */
            fun updateRequired(updateRequired: Boolean) =
                updateRequired(JsonField.of(updateRequired))

            /**
             * Sets [Builder.updateRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updateRequired] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updateRequired(updateRequired: JsonField<Boolean>) = apply {
                this.updateRequired = updateRequired
            }

            /** 更新日志 */
            fun changelog(changelog: String?) = changelog(JsonField.ofNullable(changelog))

            /**
             * Sets [Builder.changelog] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changelog] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changelog(changelog: JsonField<String>) = apply { this.changelog = changelog }

            /** 错误信息 */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** 强制更新的具体原因列表 */
            fun forceUpdateReasons(forceUpdateReasons: List<String>?) =
                forceUpdateReasons(JsonField.ofNullable(forceUpdateReasons))

            /**
             * Sets [Builder.forceUpdateReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forceUpdateReasons] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun forceUpdateReasons(forceUpdateReasons: JsonField<List<String>>) = apply {
                this.forceUpdateReasons = forceUpdateReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [forceUpdateReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addForceUpdateReason(forceUpdateReason: String) = apply {
                forceUpdateReasons =
                    (forceUpdateReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("forceUpdateReasons", it).add(forceUpdateReason)
                    }
            }

            /** 最新版本代码 */
            fun latestVersionCode(latestVersionCode: Long?) =
                latestVersionCode(JsonField.ofNullable(latestVersionCode))

            /**
             * Alias for [Builder.latestVersionCode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun latestVersionCode(latestVersionCode: Long) =
                latestVersionCode(latestVersionCode as Long?)

            /**
             * Sets [Builder.latestVersionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latestVersionCode] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latestVersionCode(latestVersionCode: JsonField<Long>) = apply {
                this.latestVersionCode = latestVersionCode
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currentVersion()
             * .downloadUrl()
             * .forceUpdate()
             * .latestVersion()
             * .message()
             * .minimumVersion()
             * .updateRequired()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("currentVersion", currentVersion),
                    checkRequired("downloadUrl", downloadUrl),
                    checkRequired("forceUpdate", forceUpdate),
                    checkRequired("latestVersion", latestVersion),
                    checkRequired("message", message),
                    checkRequired("minimumVersion", minimumVersion),
                    checkRequired("updateRequired", updateRequired),
                    changelog,
                    error,
                    (forceUpdateReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    latestVersionCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            currentVersion()
            downloadUrl()
            forceUpdate()
            latestVersion()
            message()
            minimumVersion()
            updateRequired()
            changelog()
            error()
            forceUpdateReasons()
            latestVersionCode()
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
            (if (currentVersion.asKnown() == null) 0 else 1) +
                (if (downloadUrl.asKnown() == null) 0 else 1) +
                (if (forceUpdate.asKnown() == null) 0 else 1) +
                (if (latestVersion.asKnown() == null) 0 else 1) +
                (if (message.asKnown() == null) 0 else 1) +
                (if (minimumVersion.asKnown() == null) 0 else 1) +
                (if (updateRequired.asKnown() == null) 0 else 1) +
                (if (changelog.asKnown() == null) 0 else 1) +
                (if (error.asKnown() == null) 0 else 1) +
                (forceUpdateReasons.asKnown()?.size ?: 0) +
                (if (latestVersionCode.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                currentVersion == other.currentVersion &&
                downloadUrl == other.downloadUrl &&
                forceUpdate == other.forceUpdate &&
                latestVersion == other.latestVersion &&
                message == other.message &&
                minimumVersion == other.minimumVersion &&
                updateRequired == other.updateRequired &&
                changelog == other.changelog &&
                error == other.error &&
                forceUpdateReasons == other.forceUpdateReasons &&
                latestVersionCode == other.latestVersionCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currentVersion,
                downloadUrl,
                forceUpdate,
                latestVersion,
                message,
                minimumVersion,
                updateRequired,
                changelog,
                error,
                forceUpdateReasons,
                latestVersionCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{currentVersion=$currentVersion, downloadUrl=$downloadUrl, forceUpdate=$forceUpdate, latestVersion=$latestVersion, message=$message, minimumVersion=$minimumVersion, updateRequired=$updateRequired, changelog=$changelog, error=$error, forceUpdateReasons=$forceUpdateReasons, latestVersionCode=$latestVersionCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionCheckResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VersionCheckResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
