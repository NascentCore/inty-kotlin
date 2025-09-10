package com.inty.api.errors

class IntyInvalidDataException(message: String? = null, cause: Throwable? = null) :
    IntyException(message, cause)
