package com.ikari.kotlindeckbuilder.presenter

import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.model.entity.Objective
import com.ikari.kotlindeckbuilder.model.entity.Units
import com.ikari.kotlindeckbuilder.repository.CardRepository
import com.ikari.kotlindeckbuilder.view.contract.CardListView
import com.nhaarman.mockito_kotlin.anyArray
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

/**
 * Created by jcgarcia on 27/12/2017.
 */
class CardListPresenterTest{

    val leiaCard = Units(id=1,name="Leia Organa",side="Light",affiliation = "Rebel Alliance",text="Some text")
    val fleeingCard = Objective(id=2,name="Fleeing the Empire",side="Light",affiliation = "Rebel Alliance",text="Some other text")

    @Mock lateinit var mockview:CardListView
    @Mock lateinit var mockrepo:CardRepository
    lateinit var presenter : CardListPresenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        presenter = CardListPresenter(mockview,mockrepo)
    }

    fun givenARepo(){
        whenever(mockrepo.getAll()).thenReturn(listOf(leiaCard,fleeingCard))
        whenever(mockrepo.get(1)).thenReturn(leiaCard)
        whenever(mockrepo.get(2)).thenReturn(fleeingCard)

    }

    @Test
    fun `When presenter inits should ask repository for data`(){
        givenARepo()
        runBlocking {
            presenter.init()
        }
        verify(mockrepo, times(1)).getAll()
    }
}