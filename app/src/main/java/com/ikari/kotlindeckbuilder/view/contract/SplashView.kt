package com.ikari.kotlindeckbuilder.view.contract

/**
 * Created by ikari on 30/12/17.
 */
interface SplashView : BasicView {
    var loading : Int

    fun getJsonDataFromAssets():String

    fun navigateToMainActivity()
}