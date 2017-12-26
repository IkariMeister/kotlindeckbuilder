package com.ikari.kotlindeckbuilder.presenter

import com.ikari.kotlindeckbuilder.view.contract.BasicView

/**
 * Created by ikari on 8/5/17.
 */
interface Presenter<T:BasicView> {
    suspend fun init()
    suspend fun stop()
    suspend fun resume()
    suspend fun destroy()
}