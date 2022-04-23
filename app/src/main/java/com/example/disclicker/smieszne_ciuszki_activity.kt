package com.example.disclicker

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class smieszne_ciuszki_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smieszne_ciuszki)

        val back = findViewById<Button>(R.id.back)
        val powrot = findViewById<ImageView>(R.id.powrot_smieszneciuszki)
        val shyvana = findViewById<Button>(R.id.shyvana_button)
        val karthus = findViewById<Button>(R.id.karthus_button)
        val grecja = findViewById<Button>(R.id.grecja_button)
        val strona_text = findViewById<TextView>(R.id.strona)

        val shyvana_dostepnosc_text = findViewById<TextView>(R.id.dostepnosc_shyvana)
        val karthus_dostepnosc_text = findViewById<TextView>(R.id.dostepnosc_karthus)
        val grecja_dostepnosc_text = findViewById<TextView>(R.id.dostepnosc_grecja)
        val score = findViewById<TextView>(R.id.score_text2)

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val wynik = sharedPreferences.getLong("wynik_key", 0)
        var ile_sp: Int
        val editor = sharedPreferences.edit()
        val nrStrony = 1

        editor.apply{
            putInt("nrStrony_key", nrStrony)
        }.apply()

        strona_text.text = nrStrony.toString()

        shyvana.isEnabled = false
        karthus.isEnabled = false
        grecja.isEnabled = false

        score.text = wynik.toString()

        back.setOnClickListener {
            Toast.makeText(applicationContext, "Jesteś aktualnie na pierwszej stronie!", Toast.LENGTH_LONG).show()
        }
        powrot.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
        }
        //Wszystko Shyvana
        shyvana.setOnClickListener {
            if(wynik<1000){
                Toast.makeText(applicationContext,"Musisz posiadać 1000 DisPointsów",Toast.LENGTH_SHORT).show()

            }
            else{
                ile_sp = 2
                editor.apply{
                    putInt("ile_key", ile_sp)
                }.apply()
                shyvana_dostepnosc_text.text = getString(R.string.uzywane)
            }
        }
        if(wynik>=1000){
            shyvana.isEnabled = true
            if(shyvana.isEnabled == true){
                shyvana_dostepnosc_text.text = getString(R.string.dostepne)
                shyvana.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
        //Wszystko Karthus
        karthus.setOnClickListener {
            if(wynik<5000){
                Toast.makeText(applicationContext,"Musisz posiadać 1000 DisPointsów",Toast.LENGTH_SHORT).show()
            }
            else{
                ile_sp = 3
                editor.apply{
                    putInt("ile_key", ile_sp)
                }.apply()
            }
        }
        if(wynik>=5000){
            karthus.isEnabled = true
            if(karthus.isEnabled == true){
                karthus_dostepnosc_text.text = getString(R.string.dostepne)
                karthus.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
        //Wszystko Grecja
        grecja.setOnClickListener {
            if(wynik<10000){
                Toast.makeText(applicationContext,"Musisz posiadać 10000 DisPointsów",Toast.LENGTH_SHORT).show()

            }
            else{
                ile_sp = 5
                editor.apply{
                    putInt("ile_key", ile_sp)
                }.apply()
                grecja_dostepnosc_text.text = getString(R.string.uzywane)
            }
        }
        if(wynik>=10000){
            grecja.isEnabled = true
            if(grecja.isEnabled == true){
                grecja_dostepnosc_text.text = getString(R.string.dostepne)
                grecja.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
    }
}
