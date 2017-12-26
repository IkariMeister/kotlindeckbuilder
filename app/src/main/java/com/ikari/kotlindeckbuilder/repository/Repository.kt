package com.ikari.kotlindeckbuilder.repository

/**
 * Created by ikari on 26/12/17.
 */
interface Repository<out T> {
    fun get(id:Int):T
    fun getAll():List<T>
}