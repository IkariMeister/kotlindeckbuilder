package com.ikari.kotlindeckbuilder.extension

import android.app.Fragment
import android.widget.Toast

/**
 * Created by ikari on 4/1/18.
 */
fun Fragment.toast(message:String, length: Int = Toast.LENGTH_LONG){
    Toast.makeText(this.activity,message, length).show()
}