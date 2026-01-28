// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.ai.agents

import com.inty.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .agentId("agent_id")
            .addAlternateGreeting("string")
            .avatar("avatar")
            .background("background")
            .backgroundAnimated("background_animated")
            .addBackgroundImage("string")
            .category("category")
            .characterBook(
                AgentUpdateParams.CharacterBook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .characterCardSpec("character_card_spec")
            .characterVersion("character_version")
            .creatorNotes("creator_notes")
            .energyPoints(1L)
            .extensions(
                AgentUpdateParams.Extensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .gender("gender")
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
            .metaData(AgentMetaData.builder().comment("comment").score(0L).build())
            .modePrompt("mode_prompt")
            .name("name")
            .opening("opening")
            .openingAudioUrl("opening_audio_url")
            .personality("personality")
            .addPhoto("string")
            .postHistoryInstructions("post_history_instructions")
            .prompt("prompt")
            .replaceBackgroundImages(true)
            .requestId("request_id")
            .scenario("scenario")
            .settings(
                AgentUpdateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .source(AgentUpdateParams.Source.USER_CREATED)
            .addTag("string")
            .visibility(AgentVisibility.PUBLIC)
            .voiceId("voice_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().agentId("agent_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agent_id")
                .addAlternateGreeting("string")
                .avatar("avatar")
                .background("background")
                .backgroundAnimated("background_animated")
                .addBackgroundImage("string")
                .category("category")
                .characterBook(
                    AgentUpdateParams.CharacterBook.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .characterCardSpec("character_card_spec")
                .characterVersion("character_version")
                .creatorNotes("creator_notes")
                .energyPoints(1L)
                .extensions(
                    AgentUpdateParams.Extensions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .gender("gender")
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
                .metaData(AgentMetaData.builder().comment("comment").score(0L).build())
                .modePrompt("mode_prompt")
                .name("name")
                .opening("opening")
                .openingAudioUrl("opening_audio_url")
                .personality("personality")
                .addPhoto("string")
                .postHistoryInstructions("post_history_instructions")
                .prompt("prompt")
                .replaceBackgroundImages(true)
                .requestId("request_id")
                .scenario("scenario")
                .settings(
                    AgentUpdateParams.Settings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(AgentUpdateParams.Source.USER_CREATED)
                .addTag("string")
                .visibility(AgentVisibility.PUBLIC)
                .voiceId("voice_id")
                .build()

        val body = params._body()

        assertThat(body.alternateGreetings()).containsExactly("string")
        assertThat(body.avatar()).isEqualTo("avatar")
        assertThat(body.background()).isEqualTo("background")
        assertThat(body.backgroundAnimated()).isEqualTo("background_animated")
        assertThat(body.backgroundImages()).containsExactly("string")
        assertThat(body.category()).isEqualTo("category")
        assertThat(body.characterBook())
            .isEqualTo(
                AgentUpdateParams.CharacterBook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.characterCardSpec()).isEqualTo("character_card_spec")
        assertThat(body.characterVersion()).isEqualTo("character_version")
        assertThat(body.creatorNotes()).isEqualTo("creator_notes")
        assertThat(body.energyPoints()).isEqualTo(1L)
        assertThat(body.extensions())
            .isEqualTo(
                AgentUpdateParams.Extensions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.gender()).isEqualTo("gender")
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
        assertThat(body.metaData())
            .isEqualTo(AgentMetaData.builder().comment("comment").score(0L).build())
        assertThat(body.modePrompt()).isEqualTo("mode_prompt")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.opening()).isEqualTo("opening")
        assertThat(body.openingAudioUrl()).isEqualTo("opening_audio_url")
        assertThat(body.personality()).isEqualTo("personality")
        assertThat(body.photos()).containsExactly("string")
        assertThat(body.postHistoryInstructions()).isEqualTo("post_history_instructions")
        assertThat(body.prompt()).isEqualTo("prompt")
        assertThat(body.replaceBackgroundImages()).isEqualTo(true)
        assertThat(body.requestId()).isEqualTo("request_id")
        assertThat(body.scenario()).isEqualTo("scenario")
        assertThat(body.settings())
            .isEqualTo(
                AgentUpdateParams.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.source()).isEqualTo(AgentUpdateParams.Source.USER_CREATED)
        assertThat(body.tags()).containsExactly("string")
        assertThat(body.visibility()).isEqualTo(AgentVisibility.PUBLIC)
        assertThat(body.voiceId()).isEqualTo("voice_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().agentId("agent_id").build()

        val body = params._body()
    }
}
