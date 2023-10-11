package com.example.domoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class SincrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sincr)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerlayoutSinc)
        val navView : NavigationView = findViewById(R.id.nav_viewSinc)


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
                    val intent = Intent (this,ConfigActivity::class.java)
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

}
