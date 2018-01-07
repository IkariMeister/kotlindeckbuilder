package com.ikari.kotlindeckbuilder.view.fragment

import android.os.Bundle
import android.text.Html
import android.view.View
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.extension.loadUrl
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.presenter.DetailCardPresenter
import com.ikari.kotlindeckbuilder.presenter.Presenter
import com.ikari.kotlindeckbuilder.view.activity.BaseActivity
import com.ikari.kotlindeckbuilder.view.contract.DetailCardView
import kotlinx.android.synthetic.main.detail_card_fragment.*
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by ikari on 5/1/18.
 */
class DetailCardFragment : BasicFragment(), DetailCardView {
    override val layoutId = R.layout.detail_card_fragment

    val presenter : Presenter<DetailCardView> by lazy {
        DetailCardPresenter(this,card)
    }

    override lateinit var card: Card

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        runBlocking {
            presenter.init()
        }
    }

    override fun showCard(card: Card) {
        name.text = card.name
        text.text = Html.fromHtml(card.text)
        image.loadUrl(card.imgURL,R.dimen.img_width,R.dimen.img_height)
    }

    override fun showSet(card: Card) {
        TODO("not implemented")
    }
}