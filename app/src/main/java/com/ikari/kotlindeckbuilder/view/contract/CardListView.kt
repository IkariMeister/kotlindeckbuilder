package com.ikari.kotlindeckbuilder.view.contract

import com.ikari.kotlindeckbuilder.model.entity.Card

/**
 * Created by ikari on 26/12/17.
 */
interface CardListView:BasicView {
    fun loadCards(cards:List<Card>)
}