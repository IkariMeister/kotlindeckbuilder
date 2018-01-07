package com.ikari.kotlindeckbuilder.presenter

import com.ikari.kotlindeckbuilder.repository.Repository
import com.ikari.kotlindeckbuilder.view.contract.CardListView
import com.ikari.kotlindeckbuilder.extension.coroutine
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.repository.CardRepository

/**
 * Created by ikari on 26/12/17.
 */
class CardListPresenter(
        val view:CardListView,
        val repository: Repository<Card> = CardRepository()
):Presenter<CardListView>
{
    suspend override fun init() {
        coroutine {
            repository.getAll()
        }.await().let { view.loadCards(it) }
    }

    suspend override fun stop() {
        TODO("not implemented")
    }

    suspend override fun resume() {
        TODO("not implemented")
    }

    suspend override fun destroy() {
        TODO("not implemented")
    }

    fun goToDetail(card:Card){
        view.goToDetail(card)
    }
}