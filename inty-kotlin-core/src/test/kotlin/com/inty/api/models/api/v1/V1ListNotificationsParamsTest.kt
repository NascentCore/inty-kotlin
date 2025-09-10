// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1

import com.inty.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListNotificationsParamsTest {

    @Test
    fun create() {
        V1ListNotificationsParams.builder().isRead(true).page(0L).pageSize(0L).build()
    }

    @Test
    fun queryParams() {
        val params = V1ListNotificationsParams.builder().isRead(true).page(0L).pageSize(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("is_read", "true")
                    .put("page", "0")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ListNotificationsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
