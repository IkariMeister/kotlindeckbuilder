package com.ikari.kotlindeckbuilder.view.adapter

import android.view.ViewGroup
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.view.viewholder.CardSpoilListVH

/**
 * Created by ikari on 8/5/17.
 */
class CardSpoilListAdapter(listener: (Card) -> Unit) : BaseRecyclerAdapter<Card, CardSpoilListVH>(listener) {

    override val layoutVHId = R.layout.gallery_card_viewholder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            onCreateViewHolder(parent, viewType) { CardSpoilListVH(it) }

}