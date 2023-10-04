package com.example.domoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BienvenidosFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_bienvenidos)
    }

    /**fun verHistorial(view: View) {
        val intent = Intent(this, HistorialRiegosActivity::class.java)
        startActivity(intent)
    }**/
}
