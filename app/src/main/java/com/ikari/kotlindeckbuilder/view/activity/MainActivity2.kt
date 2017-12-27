package com.ikari.kotlindeckbuilder.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.GONE
import com.ikari.kotlindeckbuilder.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by ikari on 27/12/17.
 */
class MainActivity2 : BaseActivity() {
    override val layoutId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        text.visibility = View.VISIBLE
        contentPanel.visibility = GONE
    }
}