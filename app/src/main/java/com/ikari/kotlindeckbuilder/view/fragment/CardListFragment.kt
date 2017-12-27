package com.ikari.kotlindeckbuilder.view.fragment

import android.os.Bundle
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.presenter.CardListPresenter
import com.ikari.kotlindeckbuilder.view.adapter.GalleryAdapter
import com.ikari.kotlindeckbuilder.view.contract.CardListView
import kotlinx.android.synthetic.main.card_list_fragment.*
import kotlinx.coroutines.experimental.runBlocking
import org.jetbrains.anko.support.v4.toast


class CardListFragment : BasicFragment(), CardListView {
    override val layoutId = R.layout.card_list_fragment

    val presenter: CardListPresenter by lazy {
        CardListPresenter(this)
    }

    private val adapter = GalleryAdapter {
        toast(it.text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recycler.adapter = adapter
        runBlocking {
            presenter.init()
        }
    }

    override fun loadCards(cards: List<Card>) {
        toast("loaded")
        adapter.data = cards
        adapter.notifyDataSetChanged()
    }


}
