package com.ikari.kotlindeckbuilder.repository.datasource


/**
 * Created by jcgarcia on 28/12/2017.
 */
interface DataSource<A,K> {
    fun getAll():List<out A>
    fun get(key:K):A
    fun save(item:A)
    fun saveAll(itemList:List<out A>)
}