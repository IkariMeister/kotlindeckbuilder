package com.ikari.kotlindeckbuilder.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by ikari on 26/12/17.
 */
abstract class BaseActivity : AppCompatActivity() {
    abstract val layoutId:Int
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayout())
    }

    abstract fun getLayout():Int
}