// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1

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
import com.inty.api.core.http.json
import com.inty.api.core.http.parseable
import com.inty.api.core.prepareAsync
import com.inty.api.models.api.v1.report.ReportCreateParams
import com.inty.api.models.api.v1.users.device.ApiResponse

class ReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportServiceAsync {

    private val withRawResponse: ReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportServiceAsync =
        ReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: ReportCreateParams,
        requestOptions: RequestOptions,
    ): ApiResponse =
        // post /api/v1/report/
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportServiceAsync.WithRawResponse =
            ReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ApiResponse> =
            jsonHandler<ApiResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: ReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "report", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
