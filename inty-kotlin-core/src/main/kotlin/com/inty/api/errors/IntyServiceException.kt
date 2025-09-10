// File generated from our OpenAPI spec by Stainless.

package com.inty.api.errors

import com.inty.api.core.JsonValue
import com.inty.api.core.http.Headers

abstract class IntyServiceException
protected constructor(message: String, cause: Throwable? = null) : IntyException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
