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
import kotlinx.android.synthetic.main.activity_houseki1.*
import kotlinx.android.synthetic.main.activity_tokyo1.*

class houseki1 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_houseki1)

        mUserName = intent.getStringExtra(Quiz7.USER_NAME)

        mQuestionsList = Quiz7.getQuestion()

        setQuestion()

        tv_option_o1.setOnClickListener(this)
        tv_option_t2.setOnClickListener(this)
        tv_option_3.setOnClickListener(this)
        tv_option_4.setOnClickListener(this)
        btn_s.setOnClickListener(this)



    }

    private fun setQuestion(){

        val aCounter: CountDownTimer = object : CountDownTimer(7000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                viewtime.setText("" + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                viewtime.setText("stop")
            }
        }
        aCounter.start()

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_s.text = "FINISH"
        }else{
            btn_s.text = "SUBMIT and PASS"
        }

        progr.progress = mCurrentPosition
        tv_pr.text = "$mCurrentPosition" + "/" + progr.max

        tv_ques.text = question!!.question
        tv_.setImageResource(question.image)
        tv_option_o1.text = question.optionOne
        tv_option_t2.text = question.optionTwo
        tv_option_3.text = question.optionThree
        tv_option_4.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = java.util.ArrayList<TextView>()
        options.add(0,tv_option_o1)
        options.add(1,tv_option_t2)
        options.add(2,tv_option_3)
        options.add(3,tv_option_4)

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
            R.id.tv_option_o1 ->{
                selectedOptionView(tv_option_o1,1)
            }
            R.id.tv_option_t2 ->{
                selectedOptionView(tv_option_t2,2)
            }
            R.id.tv_option_3 ->{
                selectedOptionView(tv_option_3,3)
            }
            R.id.tv_option_4 ->{
                selectedOptionView(tv_option_4,4)
            }
            R.id.btn_s -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++


                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,Score::class.java)
                        intent.putExtra(Quiz7.USER_NAME,mUserName)
                        intent.putExtra(Quiz7.CORRECT_ANSWERS,mCorrectAnswer)
                        intent.putExtra(Quiz7.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                        btn_s.text = "SUBMIT and PASS"
                    }else{
                        btn_s.text = "Go To Next Question"

                    }
                    mSelectedOptionPosition = 0


                }
            }
        }
    }

    private fun answerView(answer:Int,drawableView:Int) {
        when (answer) {
            1 -> {
                tv_option_o1.background = ContextCompat.getDrawable(
                        this,drawableView
                )
            }
            2 ->{
                tv_option_t2.background = ContextCompat.getDrawable(
                        this,drawableView
                )
            }
            3 ->{
                tv_option_3.background = ContextCompat.getDrawable(
                        this,drawableView
                )
            }
            4 ->{
                tv_option_4.background = ContextCompat.getDrawable(
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