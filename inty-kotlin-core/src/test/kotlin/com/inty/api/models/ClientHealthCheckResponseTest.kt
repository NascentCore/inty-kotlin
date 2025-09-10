// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientHealthCheckResponseTest {

    @Test
    fun create() {
        val clientHealthCheckResponse = ClientHealthCheckResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientHealthCheckResponse = ClientHealthCheckResponse.builder().build()

        val roundtrippedClientHealthCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientHealthCheckResponse),
                jacksonTypeRef<ClientHealthCheckResponse>(),
            )

        assertThat(roundtrippedClientHealthCheckResponse).isEqualTo(clientHealthCheckResponse)
    }
}
