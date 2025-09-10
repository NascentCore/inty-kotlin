// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelConfigTest {

    @Test
    fun create() {
        val modelConfig =
            ModelConfig.builder()
                .apiKey("api_key")
                .baseUrl("base_url")
                .frequencyPenalty(-2.0)
                .maxTokens(1L)
                .model("model")
                .presencePenalty(-2.0)
                .temperature(0.0)
                .topK(1L)
                .topP(0.0)
                .build()

        assertThat(modelConfig.apiKey()).isEqualTo("api_key")
        assertThat(modelConfig.baseUrl()).isEqualTo("base_url")
        assertThat(modelConfig.frequencyPenalty()).isEqualTo(-2.0)
        assertThat(modelConfig.maxTokens()).isEqualTo(1L)
        assertThat(modelConfig.model()).isEqualTo("model")
        assertThat(modelConfig.presencePenalty()).isEqualTo(-2.0)
        assertThat(modelConfig.temperature()).isEqualTo(0.0)
        assertThat(modelConfig.topK()).isEqualTo(1L)
        assertThat(modelConfig.topP()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.builder()
                .apiKey("api_key")
                .baseUrl("base_url")
                .frequencyPenalty(-2.0)
                .maxTokens(1L)
                .model("model")
                .presencePenalty(-2.0)
                .temperature(0.0)
                .topK(1L)
                .topP(0.0)
                .build()

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }
}
