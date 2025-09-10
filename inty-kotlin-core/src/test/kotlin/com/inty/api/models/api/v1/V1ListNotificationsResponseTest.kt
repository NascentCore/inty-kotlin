// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListNotificationsResponseTest {

    @Test
    fun create() {
        val v1ListNotificationsResponse =
            V1ListNotificationsResponse.builder()
                .code(0L)
                .data(
                    V1ListNotificationsResponse.Data.builder()
                        .addItem(
                            V1ListNotificationsResponse.Data.Item.builder()
                                .id("id")
                                .content("content")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addImageUrl("string")
                                .isRead(true)
                                .addLinkUrl("string")
                                .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .templateId(0L)
                                .title("title")
                                .type(0L)
                                .build()
                        )
                        .page(0L)
                        .pageSize(0L)
                        .total(0L)
                        .totalPages(0L)
                        .build()
                )
                .message("message")
                .build()

        assertThat(v1ListNotificationsResponse.code()).isEqualTo(0L)
        assertThat(v1ListNotificationsResponse.data())
            .isEqualTo(
                V1ListNotificationsResponse.Data.builder()
                    .addItem(
                        V1ListNotificationsResponse.Data.Item.builder()
                            .id("id")
                            .content("content")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addImageUrl("string")
                            .isRead(true)
                            .addLinkUrl("string")
                            .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .templateId(0L)
                            .title("title")
                            .type(0L)
                            .build()
                    )
                    .page(0L)
                    .pageSize(0L)
                    .total(0L)
                    .totalPages(0L)
                    .build()
            )
        assertThat(v1ListNotificationsResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListNotificationsResponse =
            V1ListNotificationsResponse.builder()
                .code(0L)
                .data(
                    V1ListNotificationsResponse.Data.builder()
                        .addItem(
                            V1ListNotificationsResponse.Data.Item.builder()
                                .id("id")
                                .content("content")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addImageUrl("string")
                                .isRead(true)
                                .addLinkUrl("string")
                                .readAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .templateId(0L)
                                .title("title")
                                .type(0L)
                                .build()
                        )
                        .page(0L)
                        .pageSize(0L)
                        .total(0L)
                        .totalPages(0L)
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedV1ListNotificationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListNotificationsResponse),
                jacksonTypeRef<V1ListNotificationsResponse>(),
            )

        assertThat(roundtrippedV1ListNotificationsResponse).isEqualTo(v1ListNotificationsResponse)
    }
}
