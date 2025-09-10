// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.users.device.DeviceRegisterParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeviceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun register() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deviceService = client.api().v1().users().device()

        val apiResponse =
            deviceService.register(DeviceRegisterParams.builder().token("token").build())

        apiResponse.validate()
    }
}
