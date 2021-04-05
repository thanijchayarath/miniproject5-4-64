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
import kotlinx.android.synthetic.main.activity_random2.*
import kotlinx.android.synthetic.main.activity_tokyo1.*

class random2 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random2)

        mUserName = intent.getStringExtra(Quiz10.USER_NAME)

        mQuestionsList = Quiz10.getQuestion()

        setQuestion()

        tv_option_oness.setOnClickListener(this)
        tv_option_twoss.setOnClickListener(this)
        tv_option_threess.setOnClickListener(this)
        tv_option_fourss.setOnClickListener(this)
        btnsubmit.setOnClickListener(this)



        }

        private fun setQuestion(){

            val aCounter: CountDownTimer = object : CountDownTimer(7000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    viewt.setText("" + millisUntilFinished / 1000)
                }

                override fun onFinish() {
                    viewt.setText("stop")
                }
            }
            aCounter.start()

            val question = mQuestionsList!![mCurrentPosition-1]

            defaultOptionsView()

            if(mCurrentPosition == mQuestionsList!!.size){
                btnsubmit.text = "FINISH"
            }else{
                btnsubmit.text = "SUBMIT and PASS"
            }

            progressBarss.progress = mCurrentPosition
            tv_progresses.text = "$mCurrentPosition" + "/" + progressBarss.max

            tv_questions.text = question!!.question
            tv_images.setImageResource(question.image)
            tv_option_oness.text = question.optionOne
            tv_option_twoss.text = question.optionTwo
            tv_option_threess.text = question.optionThree
            tv_option_fourss.text = question.optionFour

        }

        private fun defaultOptionsView(){
            val options = java.util.ArrayList<TextView>()
            options.add(0,tv_option_oness)
            options.add(1,tv_option_twoss)
            options.add(2,tv_option_threess)
            options.add(3,tv_option_fourss)

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
                R.id.tv_option_oness ->{
                    selectedOptionView(tv_option_oness,1)
                }
                R.id.tv_option_twoss ->{
                    selectedOptionView(tv_option_twoss,2)
                }
                R.id.tv_option_threess ->{
                    selectedOptionView(tv_option_threess,3)
                }
                R.id.tv_option_fourss ->{
                    selectedOptionView(tv_option_fourss,4)
                }
                R.id.btnsubmit -> {
                    if(mSelectedOptionPosition == 0){
                        mCurrentPosition++


                        when{
                            mCurrentPosition <= mQuestionsList!!.size ->{
                                setQuestion()
                            }else ->{
                            val intent = Intent(this,Score::class.java)
                            intent.putExtra(Quiz10.USER_NAME,mUserName)
                            intent.putExtra(Quiz10.CORRECT_ANSWERS,mCorrectAnswer)
                            intent.putExtra(Quiz10.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                            btnsubmit.text = "SUBMIT and PASS"
                        }else{
                            btnsubmit.text = "Go To Next Question"

                        }
                        mSelectedOptionPosition = 0


                    }
                }
            }
        }

        private fun answerView(answer:Int,drawableView:Int) {
            when (answer) {
                1 -> {
                    tv_option_oness.background = ContextCompat.getDrawable(
                            this,drawableView
                    )
                }
                2 ->{
                    tv_option_twoss.background = ContextCompat.getDrawable(
                            this,drawableView
                    )
                }
                3 ->{
                    tv_option_threess.background = ContextCompat.getDrawable(
                            this,drawableView
                    )
                }
                4 ->{
                    tv_option_fourss.background = ContextCompat.getDrawable(
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