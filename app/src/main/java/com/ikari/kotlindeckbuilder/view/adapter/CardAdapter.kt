package com.ikari.kotlindeckbuilder.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.extension.inflate
import kotlin.properties.Delegates

/**
 * Created by ikari on 7/5/17.
 */
class CardAdapter(val listener: (Card) -> Unit) : RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    var data : List<Card> by Delegates.observable(emptyList()){
        _,_,_ -> notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = parent.inflate(R.layout.card_viewholder)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener { listener(data[position]) }
    }


    override fun getItemCount(): Int = data.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Card) = with(itemView){
//            when(item){
//                is Card.Objective -> {
//                    imageview.loadUrl(item.url, R.dimen.img_width, R.dimen.img_height)
//                    textview.text = item.name
//                }
//                is Card.Unit -> {
//                    imageview.loadUrl(item.url, R.dimen.img_width, R.dimen.img_height)
//                    textview.text = item.name
//                }
 //           }
            //itemView.setOnClickListener { toast(itemView.textview.text.toString()) }
        }
    }
}