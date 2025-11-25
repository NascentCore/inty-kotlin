// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.users

import com.inty.api.core.ClientOptions
import com.inty.api.core.RequestOptions
import com.inty.api.core.handlers.errorBodyHandler
import com.inty.api.core.handlers.errorHandler
import com.inty.api.core.handlers.jsonHandler
import com.inty.api.core.http.HttpMethod
import com.inty.api.core.http.HttpRequest
import com.inty.api.core.http.HttpResponse
import com.inty.api.core.http.HttpResponse.Handler
import com.inty.api.core.http.HttpResponseFor
import com.inty.api.core.http.parseable
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.users.deletion.DeletionCheckEligibilityParams
import com.inty.api.models.api.v1.users.deletion.DeletionCheckEligibilityResponse

class DeletionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeletionService {

    private val withRawResponse: DeletionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeletionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeletionService =
        DeletionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override fun checkEligibility(
        params: DeletionCheckEligibilityParams,
        requestOptions: RequestOptions,
    ): DeletionCheckEligibilityResponse =
        // get /api/v1/users/deletion/check
        withRawResponse().checkEligibility(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeletionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeletionService.WithRawResponse =
            DeletionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val checkEligibilityHandler: Handler<DeletionCheckEligibilityResponse> =
            jsonHandler<DeletionCheckEligibilityResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun checkEligibility(
            params: DeletionCheckEligibilityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeletionCheckEligibilityResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users", "deletion", "check")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkEligibilityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
