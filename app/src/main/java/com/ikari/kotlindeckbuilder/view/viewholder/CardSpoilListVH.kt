package com.ikari.kotlindeckbuilder.view.viewholder

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.extension.loadUrl
import com.ikari.kotlindeckbuilder.extension.toast
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.model.entity.Objective
import kotlinx.android.synthetic.main.gallery_card_viewholder.view.*
import org.jetbrains.anko.dimen


/**
 * Created by jcgarcia on 28/12/2017.
 */
class CardSpoilListVH(itemView: View) : RecyclerViewHolder<Card>(itemView) {
    override fun bind(item: Card) {
        with(itemView) {
            when (item) {
                is Objective -> {
                    image.loadUrl(item.imgURL, R.dimen.img_height_gallery, R.dimen.img_width_gallery)
                }
                else -> {
                    image.loadUrl(item.imgURL, R.dimen.img_width_gallery, R.dimen.img_height_gallery)
                }

            }

            itemView.text.text = item.name
            itemView.setOnClickListener { toast(itemView.text.text.toString()) }
        }
    }
}