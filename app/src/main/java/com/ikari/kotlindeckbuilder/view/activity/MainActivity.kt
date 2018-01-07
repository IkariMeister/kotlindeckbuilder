package com.ikari.kotlindeckbuilder.view.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.presenter.MainPresenter
import com.ikari.kotlindeckbuilder.view.contract.BasicView
import com.ikari.kotlindeckbuilder.view.contract.DetailCardView
import com.ikari.kotlindeckbuilder.view.contract.MainView
import com.ikari.kotlindeckbuilder.view.fragment.CardSpoilListFragment
import kotlinx.coroutines.experimental.runBlocking

class MainActivity : BaseActivity(), MainView {

    override val layoutId = R.layout.main_activity

    private val presenter by lazy { MainPresenter(this) }

    override val defaultView by lazy { CardSpoilListFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking { presenter.init() }

    }

    override fun showView(view: BasicView, parameters: Pair<String, Any>) {
        when (view) {
            is DetailCardView -> {
                view.card = parameters.second as Card
                replaceFragment((view as Fragment), R.id.contentPanel)
            }
            is Fragment ->
                replaceFragment((view as Fragment), R.id.contentPanel)

        }
    }

}
