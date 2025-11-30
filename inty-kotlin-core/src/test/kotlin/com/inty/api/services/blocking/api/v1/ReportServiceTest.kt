// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

import com.inty.api.TestServerExtension
import com.inty.api.client.okhttp.IntyOkHttpClient
import com.inty.api.models.api.v1.report.ReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            IntyOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.api().v1().report()

        val report =
            reportService.create(
                ReportCreateParams.builder()
                    .targetId("target_id")
                    .targetType(ReportCreateParams.TargetType.USER)
                    .description("description")
                    .addImageUrl("string")
                    .addReasonCode(ReportCreateParams.ReasonCode.SENSITIVE_CONTENT)
                    .addReasonId(0L)
                    .reportType(ReportCreateParams.ReportType.REPORT)
                    .requestId("request_id")
                    .build()
            )

        report.validate()
    }
}
