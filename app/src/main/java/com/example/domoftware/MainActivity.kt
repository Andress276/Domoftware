package com.example.domoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.button)
        loginButton.setOnClickListener {
            val intent = Intent(this, BienvenidosFragment::class.java)
            startActivity(intent)
        }

        // En el método onCreate de MainActivity
        val registerButton = findViewById<Button>(R.id.button2)
        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}