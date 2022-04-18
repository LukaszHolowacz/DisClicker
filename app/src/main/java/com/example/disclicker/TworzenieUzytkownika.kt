package com.example.disclicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import java.io.IOException

class TworzenieUzytkownika : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tworzenie_uzytkownika)

        Appconfig.activity=true

        val wiek = findViewById<EditText>(R.id.wiek)
        val nickname = findViewById<EditText>(R.id.nick)
        val sendbt = findViewById<ImageView>(R.id.wyslij_btn)

        val scaleup = AnimationUtils.loadAnimation(this,R.anim.scale_up)
        val scaledown = AnimationUtils.loadAnimation(this,R.anim.scale_down)

        sendbt.setOnClickListener{
            sendbt.startAnimation(scaleup)
            sendbt.startAnimation(scaledown)


            intent.setClass(this, Loading_Activity::class.java)
            startActivity(intent)
        }
    }
}