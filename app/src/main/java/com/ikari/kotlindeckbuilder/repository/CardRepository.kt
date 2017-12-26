package com.ikari.kotlindeckbuilder.repository

import com.ikari.kotlindeckbuilder.model.entity.Card
import com.ikari.kotlindeckbuilder.model.entity.Units

/**
 * Created by ikari on 26/12/17.
 */
class CardRepository():Repository<Card> {
    override fun get(id: Int): Card {
        return Units(1,"Leia Organa","Light","Rebel Alliance","If this unit leaves play, it is captured by your opponent at any dark side objective of his choice.<br /><strong class='bbc'>Interrupt:</strong> When this unit leaves play, remove all focus tokens from all cards you control.")
    }

    override fun getAll(): List<Card> {
        return emptyList()
    }
}