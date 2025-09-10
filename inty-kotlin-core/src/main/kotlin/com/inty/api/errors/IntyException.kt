package com.inty.api.errors

open class IntyException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
