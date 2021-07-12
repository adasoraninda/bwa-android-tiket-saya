package com.codetron.tiketsaya.ui.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.codetron.tiketsaya.R
import com.codetron.tiketsaya.ui.auth.MainActivity
import com.codetron.tiketsaya.ui.utils.SPLASH_DELAY
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity(R.layout.activity_splash) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launchWhenStarted {
            delay(SPLASH_DELAY)
            MainActivity.navigate(this@SplashActivity)
            finishAffinity()
        }

    }

}