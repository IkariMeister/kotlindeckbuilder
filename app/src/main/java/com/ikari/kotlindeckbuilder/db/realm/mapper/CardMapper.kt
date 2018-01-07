package com.ikari.kotlindeckbuilder.db.realm.mapper

import com.ikari.kotlindeckbuilder.db.realm.RealmCard
import com.ikari.kotlindeckbuilder.model.entity.*

/**
 * Created by ikari on 30/12/17.
 */
class CardMapper {

    fun map(card: RealmCard): Card = with(card) {
        when (type) {
            "Objective" -> Objective(id?:0, name?:"", side?:"", affiliation?:"", text?:"", imgUrl?:"")
            "Unit" -> Units(id?:0, name?:"", side?:"", affiliation?:"", text?:"", imgUrl?:"")
            "Enhancement" -> Enhancement(id?:0, name?:"", side?:"", affiliation?:"", text?:"", imgUrl?:"")
            "Event" -> Event(id?:0, name?:"", side?:"", affiliation?:"", text?:"", imgUrl?:"")
            "Fate" -> Fate(id?:0, name?:"", side?:"", affiliation?:"", text?:"", imgUrl?:"")
            else -> throw Exception()
        }
    }

    fun reverseMap(card: Card): RealmCard = with(card) {
        val result = RealmCard()
        result.id = id
        result.name = name
        result.text = text
        result.imgUrl = imgURL
        result.side = side
        result.affiliation = affiliation
        when (this) {
            is Objective -> result.type = "Objective"
            is Units -> result.type = "Unit"
            is Event -> result.type = "Event"
            is Enhancement -> result.type = "Enhancement"
            is Fate -> result.type = "Fate"
        }
        return result
    }

}