package com.example.disclicker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

class smieszne_ciuszki_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smieszne_ciuszki)

        val powrot = findViewById<ImageView>(R.id.powrot_smieszneciuszki)
        val shyvana = findViewById<RadioButton>(R.id.shyvana_rbutton)
        val grecja = findViewById<RadioButton>(R.id.grecja_rbutton)
        val karthus = findViewById<RadioButton>(R.id.karthus_rbutton)
        val score = findViewById<TextView>(R.id.score_text2)

        shyvana.isEnabled = false
        grecja.isEnabled = false
        karthus.isEnabled = false

        score.text = wynik.toString()

        powrot.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        if(wynik>10){
            shyvana.isEnabled = true
            if(shyvana.isEnabled == true){
                shyvana.setTextColor(Color.rgb(255, 255, 255))
            }
            if(shyvana.isChecked){
                shyvana.setButtonDrawable(R.drawable.done)
                ile_dostajesz = 2
            }
        }
        if(wynik>20){
            karthus.isEnabled = true
            if(karthus.isEnabled == true){
                karthus.setTextColor(Color.rgb(255, 255, 255))
            }
            if(karthus.isChecked){
                karthus.setButtonDrawable(R.drawable.done)
                ile_dostajesz = 2
            }
        }
        if(wynik>30){
            grecja.isEnabled = true
            if(grecja.isEnabled == true){
                grecja.setTextColor(Color.rgb(255, 255, 255))
            }
            if(grecja.isChecked){
                grecja.setButtonDrawable(R.drawable.done)
                ile_dostajesz = 3
            }
        }
    }
}
