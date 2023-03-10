package com.example.gprstimes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class screen1Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        supportActionBar?.hide()
        val skipbutton = findViewById<Button>(R.id.skipped)

        skipbutton.setOnClickListener {

            val intent = Intent(this,screen2Activity::class.java)
            startActivity(intent)
        }
    }
}