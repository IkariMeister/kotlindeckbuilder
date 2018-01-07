package com.ikari.kotlindeckbuilder.view.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.presenter.CardListPresenter
import com.ikari.kotlindeckbuilder.view.adapter.CardSpoilListAdapter
import com.ikari.kotlindeckbuilder.view.contract.CardListView
import kotlinx.android.synthetic.main.card_spoil_list_fragment.*
import kotlinx.coroutines.experimental.runBlocking
import com.ikari.kotlindeckbuilder.extension.toast
import com.ikari.kotlindeckbuilder.view.contract.MainView


class CardSpoilListFragment : BasicFragment(), CardListView {
    override val layoutId = R.layout.card_spoil_list_fragment

    val presenter: CardListPresenter by lazy {
        CardListPresenter(this)
    }

    override val mainview by lazy {
        activity as MainView
    }
    private val adapter = CardSpoilListAdapter {
        presenter.goToDetail(it)
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.adapter = adapter
        runBlocking {
            presenter.init()
        }
    }

    override fun loadCards(cards: List<Card>) {
        adapter.data = cards
        adapter.notifyDataSetChanged()
    }

    override fun goToDetail(card: Card) {
        val detail = DetailCardFragment()
        detail.card = card
        mainview.showView(DetailCardFragment(),"card" to card)
    }
}
