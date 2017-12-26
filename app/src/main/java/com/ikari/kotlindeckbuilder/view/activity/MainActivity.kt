package com.ikari.kotlindeckbuilder.view.activity

import android.app.Fragment
import android.os.Bundle
import android.os.PersistableBundle
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.presenter.MainPresenter
import com.ikari.kotlindeckbuilder.view.contract.BasicView
import com.ikari.kotlindeckbuilder.view.contract.MainView
import com.ikari.kotlindeckbuilder.view.fragment.CardListFragment
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by ikari on 26/12/17.
 */
class MainActivity : BaseActivity(), MainView {

    override val layoutId = R.layout.activity_main

    private val presenter by lazy { MainPresenter(this) }

    override val defaultView by lazy{ CardListFragment()}

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        runBlocking {
            presenter.init()
        }
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun showView(view: BasicView) {
        when(view){
            is Fragment -> fragmentManager
                    .beginTransaction()
                    .replace(R.id.contentPanel,view,"")
                    .addToBackStack(null)
                    .commitAllowingStateLoss()
            //is Activity -> startActivity()

        }
    }
}