package com.ikari.kotlindeckbuilder.repository.datasource

import com.ikari.kotlindeckbuilder.model.entity.*


/**
 * Created by jcgarcia on 28/12/2017.
 */
class FakeCardDataSource : DataSource<Card,Int> {
    val data = listOf(
            Units(1,"Leia Organa","Light","Rebel Alliance","If this unit leaves play, it is captured by your opponent at any dark side objective of his choice.<br /><strong class='bbc'>Interrupt:</strong> When this unit leaves play, remove all focus tokens from all cards you control.","http://www.cardgamedb.com/forums/uploads/sw/ffg_leia-organa-core-10-2.png"),
            Objective(132,"Fleeing the Empire","Light","Rebel Alliance","<strong class='bbc'>Reaction:</strong> After you refresh, place 1 shield on a target unit or objective you control.","http://www.cardgamedb.com/forums/uploads/sw/tn_fleeing-the-empire-core-10-1.jpg"),
            Enhancement(133,"Stolen Plans","Light","Rebel Alliance","Enhance an enemy objective.<br /><strong class='bbc'>Reaction:</strong> After enhanced objective generates 1 or more resources, draw 1 card.","http://www.cardgamedb.com/forums/uploads/sw/ffg_stolen-plans-core-10-4.png"),
            Units(134,"Fleet Officer","Light","Rebel Alliance","","http://www.cardgamedb.com/forums/uploads/sw/tn_fleet-officer-core-10-3.jpg"),
            Event(135,"You're My Only Hope","Light","Rebel Alliance","<strong class='bbc'>Action:</strong> Sacrifice a unit to draw 2 cards. Then, your opponent chooses and discards 1 card from his hand, if able.","http://www.cardgamedb.com/forums/uploads/sw/tn_youre-my-only-hope-core-10-5.jpg"),
            Fate(136,"Twist of Fate","Light","Rebel Alliance","Cancel this edge battle and the card effects of all other fate cards just revealed. Discard both edge stacks and start a new edge battle.","http://www.cardgamedb.com/forums/uploads/sw/tn_twist-of-fate-core-10-6.jpg")
    )
    override fun getAll(): List<Card> {
        return data
    }

    override fun get(key: Int): Card {
        return data[0]
    }

    override fun save(item: Card) {
        TODO("not implemented")
    }

    override fun saveAll(itemList: List<Card>) {
        TODO("not implemented")
    }

    override fun initFromJson(json: String) {
        TODO("not implemented")
    }
}