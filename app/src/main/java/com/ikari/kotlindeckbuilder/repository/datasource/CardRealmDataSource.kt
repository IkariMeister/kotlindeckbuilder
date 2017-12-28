package com.ikari.kotlindeckbuilder.repository.datasource

import com.ikari.kotlindeckbuilder.model.entity.Card


/**
 * Created by jcgarcia on 28/12/2017.
 */
class CardRealmDataSource : DataSource<Card,Int> {
    override fun getAll(): List<Card> {
        TODO("not Implemented")
    }

    override fun get(key: Int): Card {
        TODO("not Implemented")
    }

    override fun save(item: Card) {
        TODO("not implemented")
    }

    override fun saveAll(itemList: List<Card>) {
        TODO("not implemented")
    }
}