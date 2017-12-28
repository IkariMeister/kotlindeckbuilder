package com.ikari.kotlindeckbuilder.repository

import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.repository.datasource.DataSource
import com.ikari.kotlindeckbuilder.repository.datasource.FakeCardDataSource

/**
 * Created by ikari on 26/12/17.
 */
class CardRepository(val datasource: DataSource<Card,Int> = FakeCardDataSource()):Repository<Card> {
    override fun get(id: Int): Card {
        return datasource.get(id)
    }

    override fun getAll(): List<Card> {
        return datasource.getAll()
    }
}