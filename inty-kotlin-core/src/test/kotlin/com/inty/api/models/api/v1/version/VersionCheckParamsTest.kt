// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.version

import com.inty.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionCheckParamsTest {

    @Test
    fun create() {
        VersionCheckParams.builder().appVersionCode(0L).appVersionName("appVersionName").build()
    }

    @Test
    fun headers() {
        val params =
            VersionCheckParams.builder().appVersionCode(0L).appVersionName("appVersionName").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("appVersionCode", "0")
                    .put("appVersionName", "appVersionName")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = VersionCheckParams.builder().appVersionCode(0L).build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("appVersionCode", "0").build())
    }
}
