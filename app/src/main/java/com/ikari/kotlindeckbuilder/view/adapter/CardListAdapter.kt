package com.ikari.kotlindeckbuilder.view.adapter

import android.view.ViewGroup
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.view.viewholder.CardListVH

/**
 * Created by ikari on 8/5/17.
 */
class CardListAdapter(val listener: (Card) -> Unit) : BaseRecyclerAdapter<Card, CardListVH>() {

    override val layoutVHId = R.layout.gallery_card_viewholder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            onCreateViewHolder(parent, viewType) { CardListVH(it) }

}