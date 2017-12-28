package com.ikari.kotlindeckbuilder.view.contract

import com.ikari.kotlindeckbuilder.model.entity.Card


/**
 * Created by jcgarcia on 28/12/2017.
 */
interface DetailCardView : BasicView {
    fun showCard(card:Card)
    fun showSet(card: Card)
}