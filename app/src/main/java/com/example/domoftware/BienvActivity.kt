package com.example.domoftware

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class BienvActivity : AppCompatActivity() {


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_bienv)

    val loginButton = findViewById<Button>(R.id.buttonr)
    loginButton.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
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