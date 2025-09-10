// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.V1ListNotificationsParams
import com.inty.api.models.api.v1.V1UploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listNotifications() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.api().v1()

        val response =
            v1Service.listNotifications(
                V1ListNotificationsParams.builder().isRead(true).page(0L).pageSize(0L).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadImage() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.api().v1()

        val apiResponseDict =
            v1Service.uploadImage(
                V1UploadImageParams.builder()
                    .file("some content".byteInputStream())
                    .croppingAvatar(true)
                    .build()
            )

        apiResponseDict.validate()
    }
}
