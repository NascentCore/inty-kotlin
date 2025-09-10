// File generated from our OpenAPI spec by Stainless.

package com.inty.api.models.api.v1.users.deletion

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.inty.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeletionCheckEligibilityResponseTest {

    @Test
    fun create() {
        val deletionCheckEligibilityResponse =
            DeletionCheckEligibilityResponse.builder()
                .code(0L)
                .data(
                    DeletionCheckEligibilityResponse.Data.builder()
                        .canDelete(false)
                        .activeSubscription(true)
                        .errorMessage("存在活跃订阅，请先取消订阅后再删除账户")
                        .build()
                )
                .message("message")
                .build()

        assertThat(deletionCheckEligibilityResponse.code()).isEqualTo(0L)
        assertThat(deletionCheckEligibilityResponse.data())
            .isEqualTo(
                DeletionCheckEligibilityResponse.Data.builder()
                    .canDelete(false)
                    .activeSubscription(true)
                    .errorMessage("存在活跃订阅，请先取消订阅后再删除账户")
                    .build()
            )
        assertThat(deletionCheckEligibilityResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deletionCheckEligibilityResponse =
            DeletionCheckEligibilityResponse.builder()
                .code(0L)
                .data(
                    DeletionCheckEligibilityResponse.Data.builder()
                        .canDelete(false)
                        .activeSubscription(true)
                        .errorMessage("存在活跃订阅，请先取消订阅后再删除账户")
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedDeletionCheckEligibilityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deletionCheckEligibilityResponse),
                jacksonTypeRef<DeletionCheckEligibilityResponse>(),
            )

        assertThat(roundtrippedDeletionCheckEligibilityResponse)
            .isEqualTo(deletionCheckEligibilityResponse)
    }
}
