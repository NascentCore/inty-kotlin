// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.inty.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .gender("gender")
            .name("name")
            .addAlternateGreeting("string")
            .avatar("avatar")
            .background("background")
            .addBackgroundImage("string")
            .category("category")
            .characterBook(
                AgentCreateParams.CharacterBook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .characterCardSpec("character_card_spec")
            .characterVersion("character_version")
            .creatorNotes("creator_notes")
            .extensions(
                AgentCreateParams.Extensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .intro("intro")
            .llmConfig(
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
            )
            .mainPrompt("main_prompt")
            .messageExample("message_example")
            .modePrompt("mode_prompt")
            .opening("opening")
            .personality("personality")
            .addPhoto("string")
            .postHistoryInstructions("post_history_instructions")
            .prompt("prompt")
            .scenario("scenario")
            .settings(
                AgentCreateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addTag("string")
            .visibility(AgentVisibility.PUBLIC)
            .voiceId("voice_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentCreateParams.builder()
                .gender("gender")
                .name("name")
                .addAlternateGreeting("string")
                .avatar("avatar")
                .background("background")
                .addBackgroundImage("string")
                .category("category")
                .characterBook(
                    AgentCreateParams.CharacterBook.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .characterCardSpec("character_card_spec")
                .characterVersion("character_version")
                .creatorNotes("creator_notes")
                .extensions(
                    AgentCreateParams.Extensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .intro("intro")
                .llmConfig(
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
                )
                .mainPrompt("main_prompt")
                .messageExample("message_example")
                .modePrompt("mode_prompt")
                .opening("opening")
                .personality("personality")
                .addPhoto("string")
                .postHistoryInstructions("post_history_instructions")
                .prompt("prompt")
                .scenario("scenario")
                .settings(
                    AgentCreateParams.Settings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag("string")
                .visibility(AgentVisibility.PUBLIC)
                .voiceId("voice_id")
                .build()

        val body = params._body()

        assertThat(body.gender()).isEqualTo("gender")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.alternateGreetings()).containsExactly("string")
        assertThat(body.avatar()).isEqualTo("avatar")
        assertThat(body.background()).isEqualTo("background")
        assertThat(body.backgroundImages()).containsExactly("string")
        assertThat(body.category()).isEqualTo("category")
        assertThat(body.characterBook())
            .isEqualTo(
                AgentCreateParams.CharacterBook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.characterCardSpec()).isEqualTo("character_card_spec")
        assertThat(body.characterVersion()).isEqualTo("character_version")
        assertThat(body.creatorNotes()).isEqualTo("creator_notes")
        assertThat(body.extensions())
            .isEqualTo(
                AgentCreateParams.Extensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.intro()).isEqualTo("intro")
        assertThat(body.llmConfig())
            .isEqualTo(
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
            )
        assertThat(body.mainPrompt()).isEqualTo("main_prompt")
        assertThat(body.messageExample()).isEqualTo("message_example")
        assertThat(body.modePrompt()).isEqualTo("mode_prompt")
        assertThat(body.opening()).isEqualTo("opening")
        assertThat(body.personality()).isEqualTo("personality")
        assertThat(body.photos()).containsExactly("string")
        assertThat(body.postHistoryInstructions()).isEqualTo("post_history_instructions")
        assertThat(body.prompt()).isEqualTo("prompt")
        assertThat(body.scenario()).isEqualTo("scenario")
        assertThat(body.settings())
            .isEqualTo(
                AgentCreateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.tags()).containsExactly("string")
        assertThat(body.visibility()).isEqualTo(AgentVisibility.PUBLIC)
        assertThat(body.voiceId()).isEqualTo("voice_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentCreateParams.builder().gender("gender").name("name").build()

        val body = params._body()

        assertThat(body.gender()).isEqualTo("gender")
        assertThat(body.name()).isEqualTo("name")
    }
}
