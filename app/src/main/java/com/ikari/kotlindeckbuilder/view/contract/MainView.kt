package com.ikari.kotlindeckbuilder.view.contract

/**
 * Created by ikari on 26/12/17.
 */
interface MainView:BasicView {

    val defaultView : BasicView

    fun showView(view:BasicView)
}