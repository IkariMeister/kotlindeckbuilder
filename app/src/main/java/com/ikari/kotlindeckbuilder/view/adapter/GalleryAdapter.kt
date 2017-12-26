package com.ikari.kotlindeckbuilder.view.adapter

import android.view.View
import android.view.ViewGroup
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.model.entity.Objective
import com.ikari.kotlindeckbuilder.model.entity.Units
import kotlinx.android.synthetic.main.card_viewholder.view.*

/**
 * Created by ikari on 8/5/17.
 */
class GalleryAdapter(val listener: (Card) -> Unit) : BaseRecyclerAdapter<Card, GalleryAdapter.ViewHolder>() {

    override val layoutVHId = R.layout.gallery_card_viewholder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = onCreateViewHolder(parent, viewType) { ViewHolder(it) }

    inner class ViewHolder(itemView: View) : BaseRecyclerAdapter<Card, GalleryAdapter.ViewHolder>.ViewHolder<Card>(itemView) {
        override fun bind(item: Card) {
            when (item) {
                is Objective -> itemView.text.text = "Objective"
                is Units -> itemView.text.text = "Unit"
                else -> itemView.text.text = "Any thing else"

            }
        }
    }
}