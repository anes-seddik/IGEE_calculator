package com.example.gpacalculator

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lo1.*
import java.math.RoundingMode
import java.text.DecimalFormat

class LO1 : AppCompatActivity() {

    private  val df = DecimalFormat("#.##")
    private val zero = 0
    private val zerro = zero.toFloat()

    private lateinit var sharedPrefs1 : SharedPreferences
    private lateinit var sharedPrefs2 : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lo1)
        sharedPrefs1 = getSharedPreferences("spL1S1", Context.MODE_PRIVATE)
        sharedPrefs2 = getSharedPreferences("spL1S2", Context.MODE_PRIVATE)

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
        df.roundingMode = RoundingMode.CEILING
        val avg = (grade1*19 + grade2*17)/36
        val yearavg = df.format(avg).toString()
        yearGrade.setText(yearavg)

    }

    fun gotoL01S1(view: View) {
        val intent = Intent(this,L01_S1::class.java)
        startActivity(intent)
        finish()
    }

    fun gotoL01S2(view: View) {
        val intent = Intent(this,L01_S2::class.java)
        startActivity(intent)
        finish()

    }
    override fun onBackPressed() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()

    }


}