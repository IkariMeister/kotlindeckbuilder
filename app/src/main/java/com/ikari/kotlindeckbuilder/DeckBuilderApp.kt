package com.ikari.kotlindeckbuilder

import android.app.Application
import com.ikari.kotlindeckbuilder.di.AppComponent
import com.ikari.kotlindeckbuilder.di.AppModule
import com.ikari.kotlindeckbuilder.di.DaggerAppComponent
import io.realm.Realm

/**
 * Created by ikari on 29/12/17.
 */
class DeckBuilderApp : Application() {
    val component : AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
        Realm.init(this)
    }
}