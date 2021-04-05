package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_score.*

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val username = intent.getStringExtra(Quiz1.USER_NAME)
        tv_name.text = username

        val total = intent.getIntExtra(Quiz1.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Quiz1.CORRECT_ANSWERS,0)

        tv_score.text = "Your Score is $correctAnswer out of $total"

        btn_finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }


    }
}