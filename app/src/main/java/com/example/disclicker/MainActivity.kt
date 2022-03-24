package com.example.disclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val przycisk_podstawowy = findViewById<ImageView>(R.id.jdpoints)
        val settings_button = findViewById<ImageView>(R.id.settings)
        val smieszne_ciuszki_button = findViewById<ImageView>(R.id.smieszneciuszki)
        val score_text = findViewById<TextView>(R.id.score_text)
        var wynik = 0.toLong()

        var ile_dostajesz = 1

        przycisk_podstawowy.setOnClickListener {
            wynik += ile_dostajesz
            score_text.text = wynik.toString()
        }
        settings_button.setOnClickListener {
            val s_powrot = findViewById<ImageView>(R.id.powrot_settings)

            setContentView(R.layout.settings_activity)

            s_powrot.setOnClickListener {
                setContentView(R.layout.main_activity)
            }
        }
    }
}