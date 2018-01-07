package com.ikari.kotlindeckbuilder.di

import com.ikari.kotlindeckbuilder.DeckBuilderApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by ikari on 29/12/17.
 */
@Module
class AppModule(val app: DeckBuilderApp) {
    @Provides @Singleton fun provideApp() = app
}