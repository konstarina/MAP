package com.map.todo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.map.todo.Intro.activity.IntroActivity


class SplashScreenActivity : AppCompatActivity() {

    val mActivity: Activity = this@SplashScreenActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler: Handler = Handler()

        handler.postDelayed({
            startActivity(Intent(mActivity, IntroActivity::class.java))
            finish()
        }, 2000)

    }
}