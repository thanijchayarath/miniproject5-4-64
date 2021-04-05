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
import kotlinx.android.synthetic.main.activity_tokyo1.*
import kotlinx.android.synthetic.main.activity_tokyo1.btn_submit
import kotlinx.android.synthetic.main.activity_tokyo1.progressBar
import kotlinx.android.synthetic.main.activity_tokyo1.tv_image
import kotlinx.android.synthetic.main.activity_tokyo1.tv_option_four
import kotlinx.android.synthetic.main.activity_tokyo1.tv_option_one
import kotlinx.android.synthetic.main.activity_tokyo1.tv_option_three
import kotlinx.android.synthetic.main.activity_tokyo1.tv_option_two
import kotlinx.android.synthetic.main.activity_tokyo1.tv_progress
import kotlinx.android.synthetic.main.activity_tokyo1.tv_question
import kotlinx.android.synthetic.main.activity_tokyo2.*

class tokyo2 : AppCompatActivity(), View.OnClickListener {

        private var mCurrentPosition:Int = 1
        private var mQuestionsList:ArrayList<Quiz>? = null
        private var mSelectedOptionPosition:Int = 0
        private var mCorrectAnswer:Int = 0
        private var mUserName:String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_tokyo2)

            mUserName = intent.getStringExtra(Quiz2.USER_NAME)

            mQuestionsList = Quiz2.getQuestion()

            setQuestion()

            tv_option_on.setOnClickListener(this)
            tv_option_tw.setOnClickListener(this)
            tv_option_thre.setOnClickListener(this)
            tv_option_fou.setOnClickListener(this)
            btn_submi.setOnClickListener(this)



        }

        private fun setQuestion(){

            val aCounter: CountDownTimer = object : CountDownTimer(7000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    view_time.setText("" + millisUntilFinished / 1000)
                }

                override fun onFinish() {
                    view_time.setText("stop")
                }
            }
            aCounter.start()

            val question = mQuestionsList!![mCurrentPosition-1]

            defaultOptionsView()

            if(mCurrentPosition == mQuestionsList!!.size){
                btn_submi.text = "FINISH"
            }else{
                btn_submi.text = "SUBMIT and PASS"
            }

            progressBar.progress = mCurrentPosition
            tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

            tv_questio.text = question!!.question
            tv_imag.setImageResource(question.image)
            tv_option_on.text = question.optionOne
            tv_option_tw.text = question.optionTwo
            tv_option_thre.text = question.optionThree
            tv_option_fou.text = question.optionFour

        }

        private fun defaultOptionsView(){
            val options = java.util.ArrayList<TextView>()
            options.add(0,tv_option_on)
            options.add(1,tv_option_tw)
            options.add(2,tv_option_thre)
            options.add(3,tv_option_fou)

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
                R.id.tv_option_on ->{
                    selectedOptionView(tv_option_on,1)
                }
                R.id.tv_option_tw ->{
                    selectedOptionView(tv_option_tw,2)
                }
                R.id.tv_option_thre ->{
                    selectedOptionView(tv_option_thre,3)
                }
                R.id.tv_option_fou ->{
                    selectedOptionView(tv_option_fou,4)
                }
                R.id.btn_submi -> {
                    if(mSelectedOptionPosition == 0){
                        mCurrentPosition++


                        when{
                            mCurrentPosition <= mQuestionsList!!.size ->{
                                setQuestion()
                            }else ->{
                            val intent = Intent(this,Score::class.java)
                            intent.putExtra(Quiz2.USER_NAME,mUserName)
                            intent.putExtra(Quiz2.CORRECT_ANSWERS,mCorrectAnswer)
                            intent.putExtra(Quiz2.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                            btn_submi.text = "SUBMIT and PASS"
                        }else{
                            btn_submi.text = "Go To Next Question"

                        }
                        mSelectedOptionPosition = 0


                    }
                }
            }
        }

        private fun answerView(answer:Int,drawableView:Int) {
            when (answer) {
                1 -> {
                    tv_option_on.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                2 ->{
                    tv_option_tw.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                3 ->{
                    tv_option_thre.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                4 ->{
                    tv_option_fou.background = ContextCompat.getDrawable(
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