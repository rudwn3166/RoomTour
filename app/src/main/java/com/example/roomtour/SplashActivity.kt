package com.example.roomtour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


//        핸들러의 기능 중 하나인 postDelayed를 사용하여 시간 조정으로 로고 또는 데이터 정리가 필요한 시간벌이용으로 많이 사용

        val splashHandler = Handler(Looper.getMainLooper())

        splashHandler.postDelayed({
                                  val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()

        },2500)

    }
}