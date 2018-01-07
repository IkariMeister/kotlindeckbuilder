package com.ikari.kotlindeckbuilder.db.realm

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by ikari on 30/12/17.
 */
open class RealmCard():RealmObject(){
    @PrimaryKey var id:Int? = null
    var name:String? = null
    var text:String? = null
    var imgUrl:String? = null
    var type:String? = null
    var side: String? = null
    var affiliation:String? = null
}