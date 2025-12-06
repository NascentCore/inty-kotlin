// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.async.api.v1.subscription

import com.inty.api.core.ClientOptions
import com.inty.api.services.async.api.v1.subscription.admin.UserServiceAsync
import com.inty.api.services.async.api.v1.subscription.admin.UserServiceAsyncImpl

class AdminServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminServiceAsync {

    private val withRawResponse: AdminServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AdminServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdminServiceAsync =
        AdminServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun users(): UserServiceAsync = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminServiceAsync.WithRawResponse {

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdminServiceAsync.WithRawResponse =
            AdminServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
