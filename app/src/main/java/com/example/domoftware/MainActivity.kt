package com.example.domoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerlayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId) {

                R.id.nav_home -> {
                    val intent = Intent (this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_message -> {
                    val intent = Intent (this,contactActivity::class.java)
                startActivity(intent)}

                R.id.nav_sync -> {
                    val intent = Intent (this, SincrActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_settings -> {
                    val intent =Intent (this,ConfigActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_login -> {
                    val intent = Intent(this, BienvActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_share -> {
                    val intent = Intent (this,CompaActivity::class.java)
                    startActivity(intent)
                }
                R.id.nav_rate_us -> {
                    val intent = Intent (this,CalifiActivity::class.java)
                    startActivity(intent)
                }

            }

            true
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        // Habilita el botón de hamburguesa en la barra de herramientas
        toggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
