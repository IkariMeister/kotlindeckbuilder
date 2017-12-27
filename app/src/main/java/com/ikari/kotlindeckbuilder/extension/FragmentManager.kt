package com.ikari.kotlindeckbuilder.extension


import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction


/**
 * Created by ikari on 27/12/2017.
 */
inline fun FragmentManager.inTransaction(f: FragmentTransaction.() -> FragmentTransaction) =
        beginTransaction().f().commit()

