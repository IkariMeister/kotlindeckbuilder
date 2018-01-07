package com.ikari.kotlindeckbuilder.presenter

import com.ikari.kotlindeckbuilder.extension.coroutine
import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.repository.CardRepository
import com.ikari.kotlindeckbuilder.repository.JsonInitableRepository
import com.ikari.kotlindeckbuilder.repository.Repository
import com.ikari.kotlindeckbuilder.view.contract.SplashView
import okio.Utf8
import java.nio.charset.Charset

/**
 * Created by ikari on 30/12/17.
 */
class SplashPresenter(
        val view: SplashView,
        val repository: JsonInitableRepository<Card> = CardRepository()
) : Presenter<SplashView> {

    suspend override fun init() {
        view.loading = 0
        coroutine{
            if(!repository.isInit()){
                val data = view.getJsonDataFromAssets()
                view.loading =50
                repository.initFromJson(data)
            }
        }.await()
        view.loading = 100
        view.navigateToMainActivity()
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