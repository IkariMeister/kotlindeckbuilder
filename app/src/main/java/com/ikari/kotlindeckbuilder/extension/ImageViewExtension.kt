package com.ikari.kotlindeckbuilder.extension

import android.support.annotation.DimenRes
import android.widget.ImageView
import android.support.annotation.IdRes
import com.ikari.kotlindeckbuilder.R
import com.squareup.picasso.Picasso

/**
 * Created by ikari on 7/5/17.
 */


fun ImageView.loadUrl(url:String, @DimenRes width:Int, @DimenRes height:Int) =
        Picasso.with(context)
                .load(url)
                .resizeDimen(width,height)
                .centerInside()
                .onlyScaleDown()
                .error(R.drawable.error)
                .placeholder(R.drawable.loading_animation)
                .into(this)
