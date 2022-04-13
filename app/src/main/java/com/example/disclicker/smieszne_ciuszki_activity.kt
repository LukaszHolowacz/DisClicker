package com.example.disclicker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class smieszne_ciuszki_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smieszne_ciuszki)

        val powrot = findViewById<ImageView>(R.id.powrot_smieszneciuszki)
        val shyvana = findViewById<Button>(R.id.shyvana_button)
        val karthus = findViewById<Button>(R.id.karthus_button)

        val shyvana_dostepnosc_text = findViewById<TextView>(R.id.dostepnosc_shyvana)
        val karthus_dostepnosc_text = findViewById<TextView>(R.id.dostepnosc_karthus)

        val score = findViewById<TextView>(R.id.score_text2)

        shyvana.isEnabled = false
        karthus.isEnabled = false

        score.text = wynik.toString()

        powrot.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        if(wynik>=10){
            shyvana.isEnabled = true
            if(shyvana.isEnabled == true){
                shyvana_dostepnosc_text.text = getString(R.string.dostepne)
                shyvana.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
        if(wynik>=20){
            karthus.isEnabled = true
            if(karthus.isEnabled == true){
                karthus_dostepnosc_text.text = getString(R.string.dostepne)
                karthus.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
        shyvana.setOnClickListener {
            if(wynik<10){
                Toast.makeText(applicationContext,"Musisz posiadać 1000 DisPointsów",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
