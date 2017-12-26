package com.ikari.kotlindeckbuilder.extension

import android.content.Context
import android.widget.Toast

/**
 * Created by ikari on 7/5/17.
 */
fun Context.toast(message:String, length: Int = Toast.LENGTH_LONG){
    Toast.makeText(this,message, length).show()
}