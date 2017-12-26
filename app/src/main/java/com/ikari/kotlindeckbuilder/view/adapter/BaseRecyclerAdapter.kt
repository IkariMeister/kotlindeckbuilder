package com.ikari.kotlindeckbuilder.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.ikari.kotlindeckbuilder.extension.inflate
import kotlin.properties.Delegates


/**
 * Created by ikari on 26/12/17.
 */
abstract class BaseRecyclerAdapter<A, B : BaseRecyclerAdapter<A,B>.ViewHolder<A>> : RecyclerView.Adapter<B>() {
    var data: List<A> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    abstract val layoutVHId: Int

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int,f:(View)->B): B {
        val v = parent.inflate(layoutVHId)
        return f(v)
    }

    override fun onBindViewHolder(holder: B, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.count()

    inner abstract class ViewHolder<in A>(itemView: View) : RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: A)
    }
}