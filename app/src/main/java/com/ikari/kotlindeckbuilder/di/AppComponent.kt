package com.ikari.kotlindeckbuilder.di

import com.ikari.kotlindeckbuilder.DeckBuilderApp
import dagger.Component
import javax.inject.Singleton

/**
 * Created by ikari on 29/12/17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app:DeckBuilderApp)
}