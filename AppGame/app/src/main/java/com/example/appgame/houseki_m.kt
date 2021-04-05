package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_houseki_m.*

class houseki_m : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_houseki_m)

        btnch.setOnClickListener {
            startActivity(Intent(this,houseki1::class.java))
        }
        btnlo.setOnClickListener {
            startActivity(Intent(this,houseki2::class.java))
        }

        btngo.setOnClickListener {
            startActivity(Intent(this,Game::class.java))
        }

    }
}