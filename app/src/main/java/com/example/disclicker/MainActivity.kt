package com.example.disclicker

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


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

        val scale_down = AnimationUtils.loadAnimation(this,R.anim.scale_down)
        val scale_up = AnimationUtils.loadAnimation(this,R.anim.scale_up)
        val rotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val fade = AnimationUtils.loadAnimation(this,R.anim.fade)

        przycisk_podstawowy.setOnClickListener {
            przycisk_podstawowy.startAnimation(scale_up)
            przycisk_podstawowy.startAnimation(scale_down)
            wynik += ile_dostajesz
            score_text.text = wynik.toString()
            /*if(){
                przycisk_podstawowy.startAnimation(rotate)
            }
            else{
                przycisk_podstawowy.startAnimation(scale_up)
                przycisk_podstawowy.startAnimation(scale_down)
            }*/
        }
        settings_button.setOnClickListener {
            settings_button.startAnimation(fade)
            val intent = Intent(this,settings_activity::class.java)
            startActivity(intent)
        }
        smieszne_ciuszki_button.setOnClickListener {
            smieszne_ciuszki_button.startAnimation(rotate)
            val intent = Intent(this,smieszne_ciuszki_activity::class.java)
            startActivity(intent)
        }
    }
}