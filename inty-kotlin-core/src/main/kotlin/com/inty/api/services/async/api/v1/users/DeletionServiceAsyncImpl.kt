// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.users

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
import com.inty.api.core.prepareAsync
import com.inty.api.models.api.v1.users.deletion.DeletionCheckEligibilityParams
import com.inty.api.models.api.v1.users.deletion.DeletionCheckEligibilityResponse

class DeletionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeletionServiceAsync {

    private val withRawResponse: DeletionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeletionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeletionServiceAsync =
        DeletionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun checkEligibility(
        params: DeletionCheckEligibilityParams,
        requestOptions: RequestOptions,
    ): DeletionCheckEligibilityResponse =
        // get /api/v1/users/deletion/check
        withRawResponse().checkEligibility(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeletionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeletionServiceAsync.WithRawResponse =
            DeletionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val checkEligibilityHandler: Handler<DeletionCheckEligibilityResponse> =
            jsonHandler<DeletionCheckEligibilityResponse>(clientOptions.jsonMapper)

        override suspend fun checkEligibility(
            params: DeletionCheckEligibilityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeletionCheckEligibilityResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users", "deletion", "check")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
