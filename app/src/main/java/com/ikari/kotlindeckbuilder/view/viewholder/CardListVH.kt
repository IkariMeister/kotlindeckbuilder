package com.ikari.kotlindeckbuilder.view.viewholder

import android.view.View
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.model.entity.Objective
import com.ikari.kotlindeckbuilder.model.entity.Units
import kotlinx.android.synthetic.main.card_viewholder.view.*


/**
 * Created by jcgarcia on 28/12/2017.
 */
class CardListVH(itemView: View) : RecyclerViewHolder<Card>(itemView) {
    override fun bind(item: Card) {
        when (item) {
            is Objective -> itemView.text.text = "Objective"
            is Units -> itemView.text.text = "Unit"
            else -> itemView.text.text = "Any thing else"

        }
    }
}