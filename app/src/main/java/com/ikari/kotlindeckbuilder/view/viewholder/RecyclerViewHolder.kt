package com.ikari.kotlindeckbuilder.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View


/**
 * Created by ikari on 28/12/2017.
 */
abstract class RecyclerViewHolder<in A>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: A)
}