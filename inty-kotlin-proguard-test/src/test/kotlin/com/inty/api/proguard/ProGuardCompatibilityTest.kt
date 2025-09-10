// File generated from our OpenAPI spec by Stainless.

package com.inty.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.core.jsonMapper
import com.inty.api.models.api.v1.auth.AuthCreateGuestResponse
import com.inty.api.models.api.v1.chats.agents.AgentUpdateChatSettingsResponse
import com.inty.api.models.api.v1.chats.agents.ChatSettings
import com.inty.api.models.api.v1.users.profile.Gender
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/inty-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = IntyOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.api()).isNotNull()
    }

    @Test
    fun authCreateGuestResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val authCreateGuestResponse =
            AuthCreateGuestResponse.builder()
                .code(0L)
                .data(
                    AuthCreateGuestResponse.Data.builder()
                        .token("token")
                        .guestId("guest_id")
                        .isNewGuest(true)
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedAuthCreateGuestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCreateGuestResponse),
                jacksonTypeRef<AuthCreateGuestResponse>(),
            )

        assertThat(roundtrippedAuthCreateGuestResponse).isEqualTo(authCreateGuestResponse)
    }

    @Test
    fun agentUpdateChatSettingsResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val agentUpdateChatSettingsResponse =
            AgentUpdateChatSettingsResponse.ofApiResponseChatSettings(
                AgentUpdateChatSettingsResponse.ApiResponseChatSettings.builder()
                    .code(0L)
                    .data(
                        ChatSettings.builder()
                            .id("id")
                            .agentId("agent_id")
                            .chatId("chat_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("user_id")
                            .language("language")
                            .premiumMode(true)
                            .stylePrompt("style_prompt")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .voiceEnabled(true)
                            .build()
                    )
                    .message("message")
                    .build()
            )

        val roundtrippedAgentUpdateChatSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdateChatSettingsResponse),
                jacksonTypeRef<AgentUpdateChatSettingsResponse>(),
            )

        assertThat(roundtrippedAgentUpdateChatSettingsResponse)
            .isEqualTo(agentUpdateChatSettingsResponse)
    }

    @Test
    fun genderRoundtrip() {
        val jsonMapper = jsonMapper()
        val gender = Gender.MALE

        val roundtrippedGender =
            jsonMapper.readValue(jsonMapper.writeValueAsString(gender), jacksonTypeRef<Gender>())

        assertThat(roundtrippedGender).isEqualTo(gender)
    }
}
