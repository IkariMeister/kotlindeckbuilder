package com.ikari.kotlindeckbuilder.model.entity

/**
 * Created by ikari on 7/5/17.
 */
//sealed class Card(val name: String, val url: String)
//
//class Faction(name: String, url: String, val text: String, val resource: Int, val elite: Boolean,
//              val affiliation: Affiliation) : Card(name, url)
//
//class Objective(name: String, url: String, val text: String = "", val resource: Int = 0,
//                val elite: Boolean = false, val affiliation: Affiliation = Affiliation.LS_NEUTRAL) : Card(name, url)
//
//class Unit(name: String, url: String, val text: String = "", val resource: Int = 0,
//           val elite: Boolean = false, val affiliation: Affiliation = Affiliation.LS_NEUTRAL, val forcePips: Int = 0) : Card(name, url)
//
//class Enhancement(name: String, url: String, val text: String, val resource: Int,
//                  val elite: Boolean, val affiliation: Affiliation, val forcePips: Int = 0) : Card(name, url)
//
//class Fate(name: String, url: String, val text: String, val affiliation: Affiliation, val forcePips: Int = 0) : Card(name, url)
//class Mission(name: String, url: String, val text: String, val resource: Int = 0,
//              val elite: Boolean = false, val affiliation: Affiliation, val forcePips: Int = 0) : Card(name, url)
//
//enum class Affiliation { SITH, NAVY, SCUM, DS_NEUTRAL, JEDI, REBEL, SCOUNDREL, LS_NEUTRAL }
sealed class Card(val id:Int, val name:String,val side:String, val affiliation:String, val text:String, val imgURL:String)
class Objective(id:Int, name:String,side:String, affiliation:String, text:String, imgURL:String):Card(id,name,side,affiliation,text,imgURL)
class Units(id:Int, name:String,side:String, affiliation:String, text:String, imgURL:String):Card(id,name,side,affiliation,text,imgURL)
class Enhancement(id:Int, name:String,side:String, affiliation:String, text:String, imgURL:String):Card(id,name,side,affiliation,text,imgURL)
class Event(id:Int, name:String,side:String, affiliation:String, text:String, imgURL:String):Card(id,name,side,affiliation,text,imgURL)
class Fate(id:Int, name:String,side:String, affiliation:String, text:String, imgURL:String):Card(id,name,side,affiliation,text,imgURL)
