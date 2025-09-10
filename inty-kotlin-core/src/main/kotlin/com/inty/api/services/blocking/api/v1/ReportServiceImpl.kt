// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1

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
import com.inty.api.core.http.multipartFormData
import com.inty.api.core.http.parseable
import com.inty.api.core.prepare
import com.inty.api.models.api.v1.report.ApiResponseDict
import com.inty.api.models.api.v1.report.ReportCreateParams
import com.inty.api.models.api.v1.report.ReportUploadImageParams
import com.inty.api.models.api.v1.users.device.ApiResponse

class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val withRawResponse: ReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReportService =
        ReportServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: ReportCreateParams, requestOptions: RequestOptions): ApiResponse =
        // post /api/v1/report/
        withRawResponse().create(params, requestOptions).parse()

    override fun uploadImage(
        params: ReportUploadImageParams,
        requestOptions: RequestOptions,
    ): ApiResponseDict =
        // post /api/v1/report/upload-image
        withRawResponse().uploadImage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReportService.WithRawResponse =
            ReportServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<ApiResponse> =
            jsonHandler<ApiResponse>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val uploadImageHandler: Handler<ApiResponseDict> =
            jsonHandler<ApiResponseDict>(clientOptions.jsonMapper)

        override fun uploadImage(
            params: ReportUploadImageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiResponseDict> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "report", "upload-image")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadImageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
