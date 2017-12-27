package com.ikari.kotlindeckbuilder.view.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.ikari.kotlindeckbuilder.extension.inTransaction

/**
 * Created by ikari on 26/12/17.
 */
abstract class BaseActivity : AppCompatActivity() {
    abstract val layoutId: Int
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(layoutId)
    }

    fun replaceFragment(fragment: Fragment, frameId: Int) =
            supportFragmentManager.inTransaction { replace(frameId, fragment) }

    fun addFragment(fragment: Fragment, frameId: Int) =
            supportFragmentManager.inTransaction { add(frameId, fragment) }

}