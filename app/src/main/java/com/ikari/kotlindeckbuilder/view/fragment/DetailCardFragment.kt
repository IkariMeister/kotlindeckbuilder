package com.ikari.kotlindeckbuilder.view.fragment

import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.view.contract.DetailCardView

class DetailCardFragment : BasicFragment(), DetailCardView {
    override val layoutId = R.layout.detail_card_fragment

    override fun showCard(card: Card) {
        TODO("not implemented")
    }

    override fun showSet(card: Card) {
        TODO("not implemented")
    }
}
