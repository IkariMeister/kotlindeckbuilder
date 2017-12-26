package com.ikari.kotlindeckbuilder.extension

import android.support.v7.widget.RecyclerView
import android.widget.Toast

/**
 * Created by ikari on 7/5/17.
 */
fun RecyclerView.ViewHolder.toast(message: String, length : Int = Toast.LENGTH_SHORT)
        = this.itemView.context.toast(message,length)