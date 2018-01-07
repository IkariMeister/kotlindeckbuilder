package com.ikari.kotlindeckbuilder.repository

/**
 * Created by ikari on 30/12/17.
 */
interface JsonInitableRepository<out T>: Repository<T> {
    fun initFromJson(json:String)
    fun isInit():Boolean
}