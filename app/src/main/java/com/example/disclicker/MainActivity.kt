package com.example.disclicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

var wynik = 0.toLong()
var ile_dostajesz = 1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val przycisk_podstawowy = findViewById<ImageButton>(R.id.jdbutton)
        val settings_button = findViewById<Button>(R.id.settings)
        val smieszne_ciuszki_button = findViewById<ImageView>(R.id.smieszneciuszki)
        val score_text = findViewById<TextView>(R.id.score_text)

        val scaleup = AnimationUtils.loadAnimation(this,R.anim.scale_up)
        val scaledown = AnimationUtils.loadAnimation(this,R.anim.scale_down)
        val rotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val fade = AnimationUtils.loadAnimation(this,R.anim.fade)

        var ile_dostajesz = 1

        przycisk_podstawowy.setOnClickListener {
            wynik += ile_dostajesz
            score_text.text = wynik.toString()
            if(wynik.mod(69) == 0){
                przycisk_podstawowy.startAnimation(rotate)
            }
            else{
                przycisk_podstawowy.startAnimation(scaleup)
                przycisk_podstawowy.startAnimation(scaledown)
            }
        }
        settings_button.setOnClickListener {
            val intent = Intent(this,settings_activity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_to_right, R.anim.slide_to_left)
        }
        smieszne_ciuszki_button.setOnClickListener {
            val intent = Intent(this,smieszne_ciuszki_activity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
        }
    }
}