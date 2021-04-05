package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random_m.*

class random_m : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_m)

        btncharacters.setOnClickListener {
            startActivity(Intent(this,random1::class.java))
        }
        btnlocations.setOnClickListener {
            startActivity(Intent(this,random2::class.java))
        }

        btngoback.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}