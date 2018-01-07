package com.ikari.kotlindeckbuilder.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ikari.kotlindeckbuilder.R
import com.ikari.kotlindeckbuilder.presenter.SplashPresenter
import com.ikari.kotlindeckbuilder.view.contract.SplashView
import kotlinx.coroutines.experimental.runBlocking
import org.jetbrains.anko.startActivity
import java.nio.charset.Charset

class SplashActivity : BaseActivity(), SplashView {

    override val layoutId = R.layout.activity_splash

    override var loading = 0
    val presenter : SplashPresenter by lazy{ SplashPresenter(this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking { presenter.init() }

    }

    override fun getJsonDataFromAssets(): String {
        val istream = assets.open("card.json")
        val size = istream.available()
        val buffer = ByteArray(size)
        istream.read(buffer)
        istream.close()
        return String(buffer, Charset.forName("UTF8"))
    }

    override fun navigateToMainActivity() {
        startActivity<MainActivity>()
    }
}
