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
import kotlinx.android.synthetic.main.activity_houseki2.*
import kotlinx.android.synthetic.main.activity_tokyo1.*

class houseki2 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_houseki2)

        mUserName = intent.getStringExtra(Quiz8.USER_NAME)

        mQuestionsList = Quiz8.getQuestion()

        setQuestion()

        tv_option_o11.setOnClickListener(this)
        tv_option_t22.setOnClickListener(this)
        tv_option_t3.setOnClickListener(this)
        tv_option_f4.setOnClickListener(this)
        btn_sm.setOnClickListener(this)



    }

    private fun setQuestion(){

        val aCounter: CountDownTimer = object : CountDownTimer(7000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                viewtim.setText("" + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                viewtim.setText("stop")
            }
        }
        aCounter.start()

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_sm.text = "FINISH"
        }else{
            btn_sm.text = "SUBMIT and PASS"
        }

        prog.progress = mCurrentPosition
        tv_p.text = "$mCurrentPosition" + "/" + prog.max

        tv_qu.text = question!!.question
        tv.setImageResource(question.image)
        tv_option_o11.text = question.optionOne
        tv_option_t22.text = question.optionTwo
        tv_option_t3.text = question.optionThree
        tv_option_f4.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = java.util.ArrayList<TextView>()
        options.add(0,tv_option_o11)
        options.add(1,tv_option_t22)
        options.add(2,tv_option_t3)
        options.add(3,tv_option_f4)

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
            R.id.tv_option_o11 ->{
                selectedOptionView(tv_option_o11,1)
            }
            R.id.tv_option_t22 ->{
                selectedOptionView(tv_option_t22,2)
            }
            R.id.tv_option_t3 ->{
                selectedOptionView(tv_option_t3,3)
            }
            R.id.tv_option_f4 ->{
                selectedOptionView(tv_option_f4,4)
            }
            R.id.btn_sm -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++


                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,Score::class.java)
                        intent.putExtra(Quiz8.USER_NAME,mUserName)
                        intent.putExtra(Quiz8.CORRECT_ANSWERS,mCorrectAnswer)
                        intent.putExtra(Quiz8.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                        btn_sm.text = "SUBMIT and PASS"
                    }else{
                        btn_sm.text = "Go To Next Question"

                    }
                    mSelectedOptionPosition = 0


                }
            }
        }
    }

    private fun answerView(answer:Int,drawableView:Int) {
        when (answer) {
            1 -> {
                tv_option_o11.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 ->{
                tv_option_t22.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                tv_option_t3.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 ->{
                tv_option_f4.background = ContextCompat.getDrawable(
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