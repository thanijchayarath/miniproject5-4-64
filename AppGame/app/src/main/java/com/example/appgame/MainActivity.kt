package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sa.setOnClickListener {
            startActivity(Intent(this,Game::class.java))
        }

        btn_rd.setOnClickListener {
            startActivity(Intent(this,random_m::class.java))
        }

    }
}