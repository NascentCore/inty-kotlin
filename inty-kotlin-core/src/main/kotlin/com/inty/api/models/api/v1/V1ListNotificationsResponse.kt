// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1

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

class V1ListNotificationsResponse
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
     * Specific model for a paginated list of notification items.
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
         * Returns a mutable builder for constructing an instance of [V1ListNotificationsResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [V1ListNotificationsResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(v1ListNotificationsResponse: V1ListNotificationsResponse) = apply {
            code = v1ListNotificationsResponse.code
            data = v1ListNotificationsResponse.data
            message = v1ListNotificationsResponse.message
            additionalProperties = v1ListNotificationsResponse.additionalProperties.toMutableMap()
        }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        /** Specific model for a paginated list of notification items. */
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
         * Returns an immutable instance of [V1ListNotificationsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListNotificationsResponse =
            V1ListNotificationsResponse(code, data, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V1ListNotificationsResponse = apply {
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

    /** Specific model for a paginated list of notification items. */
    class Data
    private constructor(
        private val items: JsonField<List<Item>>,
        private val page: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val total: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
        ) : this(items, page, pageSize, total, totalPages, mutableMapOf())

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun items(): List<Item>? = items.getNullable("items")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun page(): Long? = page.getNullable("page")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pageSize(): Long? = pageSize.getNullable("page_size")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Long? = total.getNullable("total")

        /**
         * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalPages(): Long? = totalPages.getNullable("total_pages")

        /**
         * Returns the raw JSON value of [items].
         *
         * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var items: JsonField<MutableList<Item>>? = null
            private var page: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                items = data.items.map { it.toMutableList() }
                page = data.page
                pageSize = data.pageSize
                total = data.total
                totalPages = data.totalPages
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun items(items: List<Item>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<Item>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [Item] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: Item) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
            }

            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

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
             */
            fun build(): Data =
                Data(
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    page,
                    pageSize,
                    total,
                    totalPages,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            items()?.forEach { it.validate() }
            page()
            pageSize()
            total()
            totalPages()
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
            (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (page.asKnown() == null) 0 else 1) +
                (if (pageSize.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (if (totalPages.asKnown() == null) 0 else 1)

        /** 通知项 */
        class Item
        private constructor(
            private val id: JsonField<String>,
            private val content: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val imageUrls: JsonField<List<String>>,
            private val isRead: JsonField<Boolean>,
            private val linkUrls: JsonField<List<String>>,
            private val readAt: JsonField<OffsetDateTime>,
            private val templateId: JsonField<Long>,
            private val title: JsonField<String>,
            private val type: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("image_urls")
                @ExcludeMissing
                imageUrls: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_read")
                @ExcludeMissing
                isRead: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("link_urls")
                @ExcludeMissing
                linkUrls: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("read_at")
                @ExcludeMissing
                readAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("template_id")
                @ExcludeMissing
                templateId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                content,
                createdAt,
                imageUrls,
                isRead,
                linkUrls,
                readAt,
                templateId,
                title,
                type,
                mutableMapOf(),
            )

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): String? = content.getNullable("content")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun imageUrls(): List<String>? = imageUrls.getNullable("image_urls")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isRead(): Boolean = isRead.getRequired("is_read")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun linkUrls(): List<String>? = linkUrls.getNullable("link_urls")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun readAt(): OffsetDateTime? = readAt.getNullable("read_at")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun templateId(): Long? = templateId.getNullable("template_id")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): String? = title.getNullable("title")

            /**
             * @throws IntyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Long = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [imageUrls].
             *
             * Unlike [imageUrls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("image_urls")
            @ExcludeMissing
            fun _imageUrls(): JsonField<List<String>> = imageUrls

            /**
             * Returns the raw JSON value of [isRead].
             *
             * Unlike [isRead], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_read") @ExcludeMissing fun _isRead(): JsonField<Boolean> = isRead

            /**
             * Returns the raw JSON value of [linkUrls].
             *
             * Unlike [linkUrls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("link_urls")
            @ExcludeMissing
            fun _linkUrls(): JsonField<List<String>> = linkUrls

            /**
             * Returns the raw JSON value of [readAt].
             *
             * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("read_at")
            @ExcludeMissing
            fun _readAt(): JsonField<OffsetDateTime> = readAt

            /**
             * Returns the raw JSON value of [templateId].
             *
             * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("template_id")
            @ExcludeMissing
            fun _templateId(): JsonField<Long> = templateId

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Long> = type

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
                 * Returns a mutable builder for constructing an instance of [Item].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .content()
                 * .createdAt()
                 * .imageUrls()
                 * .isRead()
                 * .linkUrls()
                 * .readAt()
                 * .templateId()
                 * .title()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Item]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var content: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var imageUrls: JsonField<MutableList<String>>? = null
                private var isRead: JsonField<Boolean>? = null
                private var linkUrls: JsonField<MutableList<String>>? = null
                private var readAt: JsonField<OffsetDateTime>? = null
                private var templateId: JsonField<Long>? = null
                private var title: JsonField<String>? = null
                private var type: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    id = item.id
                    content = item.content
                    createdAt = item.createdAt
                    imageUrls = item.imageUrls.map { it.toMutableList() }
                    isRead = item.isRead
                    linkUrls = item.linkUrls.map { it.toMutableList() }
                    readAt = item.readAt
                    templateId = item.templateId
                    title = item.title
                    type = item.type
                    additionalProperties = item.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun content(content: String?) = content(JsonField.ofNullable(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun imageUrls(imageUrls: List<String>?) = imageUrls(JsonField.ofNullable(imageUrls))

                /**
                 * Sets [Builder.imageUrls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.imageUrls] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun imageUrls(imageUrls: JsonField<List<String>>) = apply {
                    this.imageUrls = imageUrls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [imageUrls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addImageUrl(imageUrl: String) = apply {
                    imageUrls =
                        (imageUrls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("imageUrls", it).add(imageUrl)
                        }
                }

                fun isRead(isRead: Boolean) = isRead(JsonField.of(isRead))

                /**
                 * Sets [Builder.isRead] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isRead] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isRead(isRead: JsonField<Boolean>) = apply { this.isRead = isRead }

                fun linkUrls(linkUrls: List<String>?) = linkUrls(JsonField.ofNullable(linkUrls))

                /**
                 * Sets [Builder.linkUrls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.linkUrls] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun linkUrls(linkUrls: JsonField<List<String>>) = apply {
                    this.linkUrls = linkUrls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [linkUrls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLinkUrl(linkUrl: String) = apply {
                    linkUrls =
                        (linkUrls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("linkUrls", it).add(linkUrl)
                        }
                }

                fun readAt(readAt: OffsetDateTime?) = readAt(JsonField.ofNullable(readAt))

                /**
                 * Sets [Builder.readAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readAt] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readAt(readAt: JsonField<OffsetDateTime>) = apply { this.readAt = readAt }

                fun templateId(templateId: Long?) = templateId(JsonField.ofNullable(templateId))

                /**
                 * Alias for [Builder.templateId].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun templateId(templateId: Long) = templateId(templateId as Long?)

                /**
                 * Sets [Builder.templateId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.templateId] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun templateId(templateId: JsonField<Long>) = apply { this.templateId = templateId }

                fun title(title: String?) = title(JsonField.ofNullable(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun type(type: Long) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Long>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Item].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .content()
                 * .createdAt()
                 * .imageUrls()
                 * .isRead()
                 * .linkUrls()
                 * .readAt()
                 * .templateId()
                 * .title()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Item =
                    Item(
                        checkRequired("id", id),
                        checkRequired("content", content),
                        checkRequired("createdAt", createdAt),
                        checkRequired("imageUrls", imageUrls).map { it.toImmutable() },
                        checkRequired("isRead", isRead),
                        checkRequired("linkUrls", linkUrls).map { it.toImmutable() },
                        checkRequired("readAt", readAt),
                        checkRequired("templateId", templateId),
                        checkRequired("title", title),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Item = apply {
                if (validated) {
                    return@apply
                }

                id()
                content()
                createdAt()
                imageUrls()
                isRead()
                linkUrls()
                readAt()
                templateId()
                title()
                type()
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
                    (if (content.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (imageUrls.asKnown()?.size ?: 0) +
                    (if (isRead.asKnown() == null) 0 else 1) +
                    (linkUrls.asKnown()?.size ?: 0) +
                    (if (readAt.asKnown() == null) 0 else 1) +
                    (if (templateId.asKnown() == null) 0 else 1) +
                    (if (title.asKnown() == null) 0 else 1) +
                    (if (type.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    id == other.id &&
                    content == other.content &&
                    createdAt == other.createdAt &&
                    imageUrls == other.imageUrls &&
                    isRead == other.isRead &&
                    linkUrls == other.linkUrls &&
                    readAt == other.readAt &&
                    templateId == other.templateId &&
                    title == other.title &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    content,
                    createdAt,
                    imageUrls,
                    isRead,
                    linkUrls,
                    readAt,
                    templateId,
                    title,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Item{id=$id, content=$content, createdAt=$createdAt, imageUrls=$imageUrls, isRead=$isRead, linkUrls=$linkUrls, readAt=$readAt, templateId=$templateId, title=$title, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                items == other.items &&
                page == other.page &&
                pageSize == other.pageSize &&
                total == other.total &&
                totalPages == other.totalPages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(items, page, pageSize, total, totalPages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{items=$items, page=$page, pageSize=$pageSize, total=$total, totalPages=$totalPages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListNotificationsResponse &&
            code == other.code &&
            data == other.data &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, data, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListNotificationsResponse{code=$code, data=$data, message=$message, additionalProperties=$additionalProperties}"
}
