package com.ikari.kotlindeckbuilder.extension

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async

/**
 * Created by ikari on 26/12/17.
 */
fun <T> coroutine(function: () -> T): Deferred<T> {
    return async(CommonPool) { function() }
}