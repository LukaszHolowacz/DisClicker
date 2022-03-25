package com.example.disclicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

public var wynik = 0.toLong()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val przycisk_podstawowy = findViewById<ImageButton>(R.id.jdbutton)
        val settings_button = findViewById<Button>(R.id.settings)
        val smieszne_ciuszki_button = findViewById<ImageView>(R.id.smieszneciuszki)
        val score_text = findViewById<TextView>(R.id.score_text)

        var ile_dostajesz = 1

        przycisk_podstawowy.setOnClickListener {
            wynik += ile_dostajesz
            score_text.text = wynik.toString()
        }
        settings_button.setOnClickListener {
            val intent = Intent(this,settings_activity::class.java)
            startActivity(intent)
        }
        smieszne_ciuszki_button.setOnClickListener {
            val intent = Intent(this,smieszne_ciuszki_activity::class.java)
            startActivity(intent)
        }
    }
}