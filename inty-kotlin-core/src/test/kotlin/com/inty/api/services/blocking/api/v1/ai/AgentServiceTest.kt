// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.ai

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.core.JsonValue
import com.inty.api.models.api.v1.ai.agents.AgentCreateParams
import com.inty.api.models.api.v1.ai.agents.AgentFollowingParams
import com.inty.api.models.api.v1.ai.agents.AgentListParams
import com.inty.api.models.api.v1.ai.agents.AgentMetaData
import com.inty.api.models.api.v1.ai.agents.AgentRecommendParams
import com.inty.api.models.api.v1.ai.agents.AgentSearchParams
import com.inty.api.models.api.v1.ai.agents.AgentUpdateParams
import com.inty.api.models.api.v1.ai.agents.AgentVisibility
import com.inty.api.models.api.v1.ai.agents.ModelConfig
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val agent =
            agentService.create(
                AgentCreateParams.builder()
                    .gender("gender")
                    .name("name")
                    .addAlternateGreeting("string")
                    .avatar("avatar")
                    .background("background")
                    .backgroundAnimated("background_animated")
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
                    .metaData(AgentMetaData.builder().comment("comment").score(0L).build())
                    .modePrompt("mode_prompt")
                    .opening("opening")
                    .openingAudioUrl("opening_audio_url")
                    .personality("personality")
                    .addPhoto("string")
                    .postHistoryInstructions("post_history_instructions")
                    .prompt("prompt")
                    .requestId("request_id")
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
            )

        agent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val agent = agentService.retrieve("agent_id")

        agent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val agent =
            agentService.update(
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
                    .requestId("request_id")
                    .scenario("scenario")
                    .settings(
                        AgentUpdateParams.Settings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addTag("string")
                    .visibility(AgentVisibility.PUBLIC)
                    .voiceId("voice_id")
                    .build()
            )

        agent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val agents = agentService.list(AgentListParams.builder().limit(0L).skip(0L).build())

        agents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val apiResponseAgent = agentService.delete("agent_id")

        apiResponseAgent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun followAgent() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val apiResponseDict = agentService.followAgent("agent_id")

        apiResponseDict.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun following() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val apiResponsePaginationDataAgent =
            agentService.following(AgentFollowingParams.builder().page(1L).pageSize(1L).build())

        apiResponsePaginationDataAgent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun recommend() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val apiResponsePaginationDataAgent =
            agentService.recommend(
                AgentRecommendParams.builder()
                    .page(1L)
                    .pageSize(1L)
                    .sort(AgentRecommendParams.Sort.CREATED_ASC)
                    .sortSeed("sort_seed")
                    .build()
            )

        apiResponsePaginationDataAgent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val apiResponsePaginationDataAgent =
            agentService.search(AgentSearchParams.builder().q("q").page(1L).pageSize(1L).build())

        apiResponsePaginationDataAgent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unfollowAgent() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.api().v1().ai().agents()

        val apiResponseDict = agentService.unfollowAgent("agent_id")

        apiResponseDict.validate()
    }
}
