package com.nox.gpacalculator

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_semesters.*

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

class SEMESTERS : AppCompatActivity() {
    private  var yearNum = 0
    private  var major = 0

    private val zero = 0
    private val zerro = zero.toFloat()
    private var first_S = 1.0
    private var second_S = 1.0



    private lateinit var sharedPrefs1 : SharedPreferences
    private lateinit var sharedPrefs2 : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semesters)
        yearNum = intent.getIntExtra("year",0)
        major = intent.getIntExtra("major",0)

        if (major == 0){
            sharedPrefs1 = getSharedPreferences("spL${yearNum}S1", Context.MODE_PRIVATE)
            sharedPrefs2 = getSharedPreferences("spL${yearNum}S2", Context.MODE_PRIVATE)

            majortxt.visibility = View.GONE

            S1.text = "L$yearNum - S1"
            S2.text = "L$yearNum - S2"
        }
        else{
            sharedPrefs1 = getSharedPreferences("spL${yearNum}${major}S1", Context.MODE_PRIVATE)
            sharedPrefs2 = getSharedPreferences("spL${yearNum}${major}S2", Context.MODE_PRIVATE)

            majortxt.visibility = View.VISIBLE

            S1.text = "M${yearNum - 3} - S1"
            S2.text = "M${yearNum - 3} - S2"

            when(major){
                R.id.SP1 -> majortxt.text = "( Power )"
                R.id.SP2 -> majortxt.text = "( Telecom )"
                R.id.SP3 -> majortxt.text = "( Control )"
                R.id.SP4 -> majortxt.text = "( computer eng )"


            }
        }



//        S1.text = "L0$yearNum - S1"
//        S2.text = "L0$yearNum - S2"
//        if (major !=0){
//            majortxt.visibility = View.VISIBLE
//            when(major){
//                R.id.SP1 -> majortxt.text = "( Power )"
//                R.id.SP2 -> majortxt.text = "( Telecom )"
//                R.id.SP3 -> majortxt.text = "( Control )"
//                R.id.SP4 -> majortxt.text = "( computer eng )"
//
//
//            }
//        }else majortxt.visibility = View.GONE

        when(yearNum){
            1 -> {first_S = 19.0
            second_S = 17.0}

            2 -> {first_S = 18.0
                second_S = 18.0}

            3 -> {first_S = 21.0
                second_S = 17.0}

            4 -> {
                when(major){
                    R.id.SP1 -> {first_S = 21.0 ; second_S = 24.0}
                    R.id.SP2 -> {first_S = 21.0 ; second_S = 22.0}
                    R.id.SP3 -> {first_S = 20.0 ; second_S = 22.0}
                    R.id.SP4 -> {first_S = 20.0 ; second_S = 20.0}

                }
            }

            5 -> {
                when(major){
                    R.id.SP1 -> {first_S = 26.0 ; second_S = 20.0}
                    R.id.SP2 -> {first_S = 22.0 ; second_S = 20.0}
                    R.id.SP3 -> {first_S = 19.0 ; second_S = 20.0}
                    R.id.SP4 -> {first_S = 20.5 ; second_S = 20.0}

                }
            }
        }


        val stored1 = sharedPrefs1.getBoolean("stored",false)
        val stored2 = sharedPrefs2.getBoolean("stored",false)
        // checking if we calculated the average before and displaying it
        if (stored1){
            val s1grade = sharedPrefs1.getFloat("grade",zerro).toString()
            S1Grade.setText(s1grade)
        }

        if (stored2){
            val s2grade = sharedPrefs2.getFloat("grade",zerro).toString()
            S2Grade.setText(s2grade)
        }
        if (S1Grade.text.isNotEmpty() && S2Grade.text.isNotEmpty()){
            yearavg()
        }



    }

    private fun yearavg() {
        val grade1 = S1Grade.text.toString().toFloat()
        val grade2 = S2Grade.text.toString().toFloat()
        val avg = (grade1*first_S + grade2*second_S)/(first_S + second_S)
        val yearavg = ((avg * 100.0).roundToInt() /100.0).toString()
        yearGrade.setText(yearavg)

    }

    fun gotoCalculate(view: View) {
        val intent = Intent(this,Calculate::class.java)
        when(view){
            S1layout -> intent.putExtra("semester",1)
            S2layout -> intent.putExtra("semester",2)
        }
        intent.putExtra("year",yearNum)
        intent.putExtra("major",major)

        startActivity(intent)
        finish()
    }


    override fun onBackPressed() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()

    }


}