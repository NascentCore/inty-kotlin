// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.chats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.JsonValue
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatGenerateImageResponseTest {

    @Test
    fun create() {
        val chatGenerateImageResponse =
            ChatGenerateImageResponse.builder()
                .code(0L)
                .data(
                    ChatGenerateImageResponse.Data.ChatImageGenerationResponse.builder()
                        .imageMetadata(
                            ChatGenerateImageResponse.Data.ChatImageGenerationResponse.ImageMetadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .imageUrl("image_url")
                        .messageId(0L)
                        .prompt("prompt")
                        .generationTimeMs(0L)
                        .model("model")
                        .build()
                )
                .message("message")
                .build()

        assertThat(chatGenerateImageResponse.code()).isEqualTo(0L)
        assertThat(chatGenerateImageResponse.data())
            .isEqualTo(
                ChatGenerateImageResponse.Data.ofChatImageGenerationResponse(
                    ChatGenerateImageResponse.Data.ChatImageGenerationResponse.builder()
                        .imageMetadata(
                            ChatGenerateImageResponse.Data.ChatImageGenerationResponse.ImageMetadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .imageUrl("image_url")
                        .messageId(0L)
                        .prompt("prompt")
                        .generationTimeMs(0L)
                        .model("model")
                        .build()
                )
            )
        assertThat(chatGenerateImageResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatGenerateImageResponse =
            ChatGenerateImageResponse.builder()
                .code(0L)
                .data(
                    ChatGenerateImageResponse.Data.ChatImageGenerationResponse.builder()
                        .imageMetadata(
                            ChatGenerateImageResponse.Data.ChatImageGenerationResponse.ImageMetadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .imageUrl("image_url")
                        .messageId(0L)
                        .prompt("prompt")
                        .generationTimeMs(0L)
                        .model("model")
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedChatGenerateImageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatGenerateImageResponse),
                jacksonTypeRef<ChatGenerateImageResponse>(),
            )

        assertThat(roundtrippedChatGenerateImageResponse).isEqualTo(chatGenerateImageResponse)
    }
}
