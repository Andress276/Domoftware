package com.example.domoftware

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIMEOUT: Long = 2000 // Tiempo en milisegundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed({
            val mainIntent = Intent(this@SplashScreenActivity, MainActivity::class.java) // Reemplaza "MainActivity" con la actividad principal de tu aplicación
            startActivity(mainIntent)
            finish()
        }, SPLASH_TIMEOUT)
    }
}
