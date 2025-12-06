// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking.api.v1.subscription

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.api.v1.subscription.admin.UserService
import com.inty.api.services.blocking.api.v1.subscription.admin.UserServiceImpl

class AdminServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminService {

    private val withRawResponse: AdminService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): AdminService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AdminService =
        AdminServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun users(): UserService = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminService.WithRawResponse {

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AdminService.WithRawResponse =
            AdminServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun users(): UserService.WithRawResponse = users
    }
}
