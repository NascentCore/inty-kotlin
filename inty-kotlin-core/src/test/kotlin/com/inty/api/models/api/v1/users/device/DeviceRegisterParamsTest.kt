// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.device

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceRegisterParamsTest {

    @Test
    fun create() {
        DeviceRegisterParams.builder().token("token").requestId("request_id").build()
    }

    @Test
    fun body() {
        val params = DeviceRegisterParams.builder().token("token").requestId("request_id").build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("token")
        assertThat(body.requestId()).isEqualTo("request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DeviceRegisterParams.builder().token("token").build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("token")
    }
}
