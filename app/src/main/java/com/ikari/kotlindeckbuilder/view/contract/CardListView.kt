package com.ikari.kotlindeckbuilder.view.contract

import com.ikari.kotlindeckbuilder.model.entity.Card

/**
 * Created by ikari on 26/12/17.
 */
interface CardListView:BasicView {
    val mainview : MainView
    fun loadCards(cards:List<Card>)
    fun goToDetail(card:Card)
}