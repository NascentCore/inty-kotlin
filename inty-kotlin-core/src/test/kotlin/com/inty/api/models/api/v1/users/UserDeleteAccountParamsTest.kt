// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDeleteAccountParamsTest {

    @Test
    fun create() {
        UserDeleteAccountParams.builder().reason("隐私关注").build()
    }

    @Test
    fun body() {
        val params = UserDeleteAccountParams.builder().reason("隐私关注").build()

        val body = params._body()

        assertThat(body.reason()).isEqualTo("隐私关注")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserDeleteAccountParams.builder().build()

        val body = params._body()
    }
}
