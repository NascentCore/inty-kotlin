// File generated from our OpenAPI spec by Stainless.

package com.inty.api.services.blocking

import com.inty.api.core.ClientOptions
import com.inty.api.services.blocking.v2.ChatService
import com.inty.api.services.blocking.v2.ChatServiceImpl

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun chat(): ChatService = chat

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun chat(): ChatService.WithRawResponse = chat
    }
}
