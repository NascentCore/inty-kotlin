// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.users.device.DeviceRegisterParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeviceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun register() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deviceServiceAsync = client.api().v1().users().device()

        val apiResponse =
            deviceServiceAsync.register(
                DeviceRegisterParams.builder().token("token").requestId("request_id").build()
            )

        apiResponse.validate()
    }
}
