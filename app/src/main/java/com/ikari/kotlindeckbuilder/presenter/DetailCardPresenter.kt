package com.ikari.kotlindeckbuilder.presenter

import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.view.contract.DetailCardView


/**
 * Created by ikari on 28/12/2017.
 */
class DetailCardPresenter(val view : DetailCardView, val card: Card) : Presenter<DetailCardView> {
    suspend override fun init() {
        view.showCard(card)
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
}