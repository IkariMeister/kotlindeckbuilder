package com.ikari.kotlindeckbuilder.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.ikari.kotlindeckbuilder.R

/**
 * Created by ikari on 27/12/17.
 */
class MainActivity2 : AppCompatActivity() {
    //override val layoutId = R.layout.activity_main

    //override fun getLayout() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }
}