package com.example.disclicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class smieszne_ciuszki_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smieszne_ciuszki)

        val powrot = findViewById<ImageView>(R.id.powrot_smieszneciuszki)
        val shyvana = findViewById<RadioButton>(R.id.shyvana_rbutton)
        val grecja = findViewById<RadioButton>(R.id.grecja_rbutton)
        val karthus = findViewById<RadioButton>(R.id.karthus_rbutton)

        shyvana.isEnabled = false
        grecja.isEnabled = false
        karthus.isEnabled = false

        powrot.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        if(wynik>1000){
            shyvana.isEnabled = true
            if(shyvana.isEnabled == true){

            }
        }
    }
}
