package com.inty.api.errors

class IntyIoException(message: String? = null, cause: Throwable? = null) :
    IntyException(message, cause)
