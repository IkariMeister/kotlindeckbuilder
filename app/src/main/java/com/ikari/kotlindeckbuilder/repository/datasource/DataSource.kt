package com.ikari.kotlindeckbuilder.repository.datasource


/**
 * Created by jcgarcia on 28/12/2017.
 */
interface DataSource<A, in K> {
    val count: Int
        get() = getAll().count()

    fun getAll(): List<out A>
    fun get(key: K): A
    fun save(item: A)
    fun saveAll(itemList: List<out A>)
    fun initFromJson(json: String)
    fun isInit(): Boolean {
        return count >= 0
    }
}