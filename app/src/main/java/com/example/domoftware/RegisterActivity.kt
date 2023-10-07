package com.example.domoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // En el método onCreate de RegisterActivity
        val loginButton = findViewById<Button>(R.id.button)
        loginButton.setOnClickListener {
            val intent = Intent(this, BienvActivity::class.java)
            startActivity(intent)
        }


    }
}