package com.ikari.kotlindeckbuilder.repository.datasource

import com.ikari.kotlindeckbuilder.db.realm.RealmCard
import com.ikari.kotlindeckbuilder.db.realm.mapper.CardMapper
import com.ikari.kotlindeckbuilder.model.entity.Card
import io.realm.Realm
import io.realm.kotlin.where


/**
 * Created by jcgarcia on 28/12/2017.
 */
class CardRealmDataSource(private val cardMapper: CardMapper = CardMapper()) : DataSource<Card, Int> {
    private val db = Realm.getDefaultInstance()
    override fun getAll(): List<Card> {
        return db.where<RealmCard>().findAll().map { cardMapper.map(it) }
    }

    override fun get(key: Int): Card {
        return cardMapper.map(db.where<RealmCard>().equalTo("id", key).findFirstAsync())
    }

    override fun save(item: Card) {
        db.executeTransaction {
            db.copyToRealm(cardMapper.reverseMap(item))
        }
    }

    override fun saveAll(itemList: List<Card>) {
        itemList.map { save(it) }
    }

    override fun initFromJson(json: String) {
        db.executeTransaction {
            db.createAllFromJson<RealmCard>(RealmCard::class.java,json)
        }
    }
}