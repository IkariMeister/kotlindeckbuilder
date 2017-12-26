package com.ikari.kotlindeckbuilder.extension

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ikari on 7/5/17.
 */
fun ViewGroup.inflate(@LayoutRes id : Int, attach : Boolean = false) : View =
        LayoutInflater.from(this.context).inflate(id,this,attach)