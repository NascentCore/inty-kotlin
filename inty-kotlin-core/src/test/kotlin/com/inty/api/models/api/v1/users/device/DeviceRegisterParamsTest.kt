// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.device

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceRegisterParamsTest {

    @Test
    fun create() {
        DeviceRegisterParams.builder().token("token").build()
    }

    @Test
    fun body() {
        val params = DeviceRegisterParams.builder().token("token").build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("token")
    }
}
