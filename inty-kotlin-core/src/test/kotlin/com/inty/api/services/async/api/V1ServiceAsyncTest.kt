// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.V1ListNotificationsParams
import com.inty.api.models.api.v1.V1UploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listNotifications() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.api().v1()

        val response =
            v1ServiceAsync.listNotifications(
                V1ListNotificationsParams.builder().isRead(true).page(0L).pageSize(0L).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun uploadImage() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.api().v1()

        val apiResponseDict =
            v1ServiceAsync.uploadImage(
                V1UploadImageParams.builder()
                    .file("some content".byteInputStream())
                    .croppingAvatar(true)
                    .build()
            )

        apiResponseDict.validate()
    }
}
