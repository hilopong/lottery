package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_splash2.*

class SplashActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        var hander = Handler(Looper.getMainLooper())
        var runable = Runnable {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        hander.postDelayed(runable,3000)

        animaintionView.setOnClickListener{
            hander.removeCallbacks(runable)
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}