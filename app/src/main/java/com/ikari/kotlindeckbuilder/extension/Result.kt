package com.ikari.kotlindeckbuilder.extension

/**
 * Created by ikari on 26/12/17.
 */
sealed class Result<out A,out E>

data class Success<out A, out E>(val value:A):Result<A,E>()
data class Fail<out A,out E>(val error:E):Result<A,E>()

fun <A, E, B> Result<A, E>.map(transform: (A) -> B): Result<B, E> =
        flatMap { transform(it).let { Success<B, E>(it) } }

fun <A, E, B> Result<A, E>.flatMap(transform: (A) -> Result<B, E>): Result<B, E> = when(this) {
    is Success -> transform(value)
    is Fail -> Fail(error)
}

fun <A, E> Result<A, E>.ifSuccess(execute: (A) -> Unit) {
    if (this is Success) execute(this.value)
}