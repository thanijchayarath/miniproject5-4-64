package com.example.appgame

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_random1.*
import kotlinx.android.synthetic.main.activity_tokyo1.*
import java.util.*

class random1 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_random1)

            mUserName = intent.getStringExtra(Quiz9.USER_NAME)

            mQuestionsList = Quiz9.getQuestion()

            setQuestion()

            tv_option_ones.setOnClickListener(this)
            tv_option_twos.setOnClickListener(this)
            tv_option_threes.setOnClickListener(this)
            tv_option_fours.setOnClickListener(this)
            btn_submits.setOnClickListener(this)



        }

        private fun setQuestion(){

            val aCounter: CountDownTimer = object : CountDownTimer(7000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    viewti.setText("" + millisUntilFinished / 1000)
                }

                override fun onFinish() {
                    viewti.setText("stop")
                }
            }
            aCounter.start()

            val question = mQuestionsList!![mCurrentPosition-1]

            defaultOptionsView()

            if(mCurrentPosition == mQuestionsList!!.size){
                btn_submits.text = "FINISH"
            }else{
                btn_submits.text = "SUBMIT and PASS"
            }

            progressBars.progress = mCurrentPosition
            tvprogress.text = "$mCurrentPosition" + "/" + progressBars.max

            tvquestions.text = question!!.question
            tvimages.setImageResource(question.image)
            tv_option_ones.text = question.optionOne
            tv_option_twos.text = question.optionTwo
            tv_option_threes.text = question.optionThree
            tv_option_fours.text = question.optionFour

        }

        private fun defaultOptionsView(){
            val options = java.util.ArrayList<TextView>()
            options.add(0,tv_option_ones)
            options.add(1,tv_option_twos)
            options.add(2,tv_option_threes)
            options.add(3,tv_option_fours)

            for (option in options){
                option.setTextColor(Color.parseColor("#7A8089"))
                option.typeface = Typeface.DEFAULT
                option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.dg

                )
            }

        }

        override fun onClick(v: View?) {
            when(v?.id){
                R.id.tv_option_ones ->{
                    selectedOptionView(tv_option_ones,1)
                }
                R.id.tv_option_twos ->{
                    selectedOptionView(tv_option_twos,2)
                }
                R.id.tv_option_threes ->{
                    selectedOptionView(tv_option_threes,3)
                }
                R.id.tv_option_fours ->{
                    selectedOptionView(tv_option_fours,4)
                }
                R.id.btn_submits -> {
                    if(mSelectedOptionPosition == 0){
                        mCurrentPosition++


                        when{
                            mCurrentPosition <= mQuestionsList!!.size ->{
                                setQuestion()
                            }else ->{
                            val intent = Intent(this,Score::class.java)
                            intent.putExtra(Quiz9.USER_NAME,mUserName)
                            intent.putExtra(Quiz9.CORRECT_ANSWERS,mCorrectAnswer)
                            intent.putExtra(Quiz9.TOTAL_QUESTIONS,mQuestionsList!!.size)
                            startActivity(intent)

                            finish()
                        }
                        }
                    }else{

                        val question = mQuestionsList?.get(mCurrentPosition -1)
                        if(question!!.correctAnswer != mSelectedOptionPosition){
                            answerView(mSelectedOptionPosition,R.drawable.bgg)
                        }else{
                            answerView(mSelectedOptionPosition,R.drawable.bgg1)
                            mCorrectAnswer++
                        }

                        if(mCurrentPosition == mQuestionsList!!.size){
                            btn_submits.text = "SUBMIT and PASS"
                        }else{
                            btn_submits.text = "Go To Next Question"

                        }
                        mSelectedOptionPosition = 0


                    }
                }
            }
        }

        private fun answerView(answer:Int,drawableView:Int) {
            when (answer) {
                1 -> {
                    tv_option_ones.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                2 ->{
                    tv_option_twos.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                3 ->{
                    tv_option_threes.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                4 ->{
                    tv_option_fours.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
            }
        }

        private fun selectedOptionView(tv: TextView, selectedOptionNum:Int){
            defaultOptionsView()
            mSelectedOptionPosition = selectedOptionNum

            tv.setTextColor(Color.parseColor("#363A43"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.bg
            )


    }
}