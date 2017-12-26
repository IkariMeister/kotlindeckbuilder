package com.ikari.kotlindeckbuilder.presenter

import com.ikari.kotlindeckbuilder.view.contract.MainView

/**
 * Created by ikari on 26/12/17.
 */
class MainPresenter(val view:MainView):Presenter<MainView>{
    suspend override fun init() {
        view.showView(view.defaultView)
    }

    suspend override fun stop() {
        TODO("not implemented")
    }

    suspend override fun resume() {
        TODO("not implemented")
    }

    suspend override fun destroy() {
        TODO("not implemented")
    }
}