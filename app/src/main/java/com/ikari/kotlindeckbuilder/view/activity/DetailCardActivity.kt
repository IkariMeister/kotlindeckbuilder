package com.ikari.kotlindeckbuilder.view.activity

import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.view.activity.BaseActivity
import com.ikari.kotlindeckbuilder.view.contract.DetailCardView

class DetailCardActivity : BaseActivity(), DetailCardView {
    override lateinit var card: Card
    override val layoutId = R.layout.detail_card_fragment

    override fun showCard(card: Card) {
        TODO("not implemented")
    }

    override fun showSet(card: Card) {
        TODO("not implemented")
    }
}
