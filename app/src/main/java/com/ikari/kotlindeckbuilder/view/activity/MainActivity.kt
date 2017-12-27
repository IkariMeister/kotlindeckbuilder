package com.ikari.kotlindeckbuilder.view.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.presenter.MainPresenter
import com.ikari.kotlindeckbuilder.view.contract.BasicView
import com.ikari.kotlindeckbuilder.view.contract.MainView
import com.ikari.kotlindeckbuilder.view.fragment.CardListFragment

import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.coroutines.experimental.runBlocking

class MainActivity : BaseActivity(), MainView {

    override val layoutId = R.layout.main_activity

    private val presenter by lazy { MainPresenter(this) }

    override val defaultView by lazy { CardListFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking { presenter.init() }

    }

    override fun showView(view: BasicView) {
        when (view) {
            is Fragment -> replaceFragment((view as Fragment), R.id.contentPanel)
        //is Activity -> startActivity()

        }
    }
}
