// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClientAsync
import com.inty.api.models.api.v1.report.ReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            IntyOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportServiceAsync = client.api().v1().report()

        val apiResponse =
            reportServiceAsync.create(
                ReportCreateParams.builder()
                    .addReasonId(0L)
                    .targetId("target_id")
                    .targetType(ReportCreateParams.TargetType.USER)
                    .description("description")
                    .addImageUrl("string")
                    .build()
            )

        apiResponse.validate()
    }
}
