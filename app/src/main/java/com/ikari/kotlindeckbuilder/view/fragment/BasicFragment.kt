package com.ikari.kotlindeckbuilder.view.fragment

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ikari on 26/12/17.
 */
abstract class BasicFragment : Fragment() {
    abstract val layoutId:Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(layoutId,container)
    }
}