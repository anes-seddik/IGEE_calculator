package com.example.gpacalculator

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_l01_s2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog.*
import java.math.RoundingMode
import java.text.DecimalFormat

class L01_S1 : AppCompatActivity() {

    private  val df = DecimalFormat("#.##")
    private val zero = 0
    private val zerro = zero.toFloat()
    private var error = false
    private lateinit var sharedPrefs : SharedPreferences

    private var stored =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_l01_s1)
        sharedPrefs = getSharedPreferences("spL1S1",Context.MODE_PRIVATE)


        stored = sharedPrefs.getBoolean("stored",false)
        if (stored){
            fillModules()
        }

    }

    override fun onBackPressed() {
        val intent = Intent(this,LO1::class.java)
        startActivity(intent)
        finish()

    }
    private fun fillModules() {
        // CONTROLS
        cont1.setText((sharedPrefs.getFloat("cont1",zerro)).toString())
        cont2.setText((sharedPrefs.getFloat("cont2",zerro)).toString())
        cont3.setText((sharedPrefs.getFloat("cont3",zerro)).toString())
        cont4.setText((sharedPrefs.getFloat("cont4",zerro)).toString())
        cont5.setText((sharedPrefs.getFloat("cont5",zerro)).toString())
        cont6.setText((sharedPrefs.getFloat("cont6",zerro)).toString())
        cont7.setText((sharedPrefs.getFloat("cont7",zerro)).toString())
        cont8.setText((sharedPrefs.getFloat("cont8",zerro)).toString())
        cont9.setText((sharedPrefs.getFloat("cont9",zerro)).toString())
        //EXAMS
        exam1.setText((sharedPrefs.getFloat("exam1",zerro)).toString())
        exam2.setText((sharedPrefs.getFloat("exam2",zerro)).toString())
        exam3.setText((sharedPrefs.getFloat("exam3",zerro)).toString())
        exam4.setText((sharedPrefs.getFloat("exam4",zerro)).toString())
        exam5.setText((sharedPrefs.getFloat("exam5",zerro)).toString())
        exam6.setText((sharedPrefs.getFloat("exam6",zerro)).toString())
        exam7.setText((sharedPrefs.getFloat("exam7",zerro)).toString())
        exam8.setText((sharedPrefs.getFloat("exam8",zerro)).toString())
        exam9.setText((sharedPrefs.getFloat("exam9",zerro)).toString())
        //avrgs
        avg1.setText((sharedPrefs.getFloat("avrg1",zerro)).toString())
        avg2.setText((sharedPrefs.getFloat("avrg2",zerro)).toString())
        avg3.setText((sharedPrefs.getFloat("avrg3",zerro)).toString())
        avg4.setText((sharedPrefs.getFloat("avrg4",zerro)).toString())
        avg5.setText((sharedPrefs.getFloat("avrg5",zerro)).toString())
        avg6.setText((sharedPrefs.getFloat("avrg6",zerro)).toString())
        avg7.setText((sharedPrefs.getFloat("avrg7",zerro)).toString())
        avg8.setText((sharedPrefs.getFloat("avrg8",zerro)).toString())
        avg9.setText((sharedPrefs.getFloat("avrg9",zerro)).toString())
    }

    fun calculateFinal(view: View) {
        error = false
        val editor = sharedPrefs.edit()


        val cont1 = getvalue(cont1);val exam1 =getvalue(exam1)
        val cont2 = getvalue(cont2);val exam2 =getvalue(exam2)
        val cont3 = getvalue(cont3);val exam3 =getvalue(exam3)
        val cont4 = getvalue(cont4);val exam4 =getvalue(exam4)
        val cont5 = getvalue(cont5);val exam5 =getvalue(exam5)
        val cont6 = getvalue(cont6);val exam6 =getvalue(exam6)
        val cont7 = getvalue(cont7);val exam7 =getvalue(exam7)
        val cont8 = getvalue(cont8);val exam8 =getvalue(exam8)
        val cont9 = getvalue(cont9);val exam9 =getvalue(exam9)

        storeConts(cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9)
        storeexams(exam1,exam2,exam3,exam4,exam5,exam6,exam7,exam8,exam9)

        if (error){
            showDialog2()
        }
        else if (!error){
            //averages:
            val avrg1 = calcAverages(cont1,exam1);val coeff1 = 3
            val avrg2 = calcAverages(cont2,exam2);val coeff2 = 3
            val avrg3 = calcAverages(cont3,exam3);val coeff3 = 3
            val avrg4 = calcAverages(cont4,exam4);val coeff4 = 1
            val avrg5 = calcAverages(cont5,exam5);val coeff5 = 2
            val avrg6 = calcAverages(cont6,exam6);val coeff6 = 2
            val avrg7 = calcAverages(cont7,exam7);val coeff7 = 2
            val avrg8 = calcAverages(cont8,exam8);val coeff8 = 2
            val avrg9 = calcAverages(cont9,exam9);val coeff9 = 1


            storeavrgs(avrg1,avrg2,avrg3,avrg4,avrg5,avrg6,avrg7,avrg8,avrg9)

            //set avg in xml

            avg1.setText(avrg1.toString())
            avg2.setText(avrg2.toString())
            avg3.setText(avrg3.toString())
            avg4.setText(avrg4.toString())
            avg5.setText(avrg5.toString())
            avg6.setText(avrg6.toString())
            avg7.setText(avrg7.toString())
            avg8.setText(avrg8.toString())
            avg9.setText(avrg9.toString())

            stored = true
            editor.putBoolean("stored",stored)


            // calculate totals

            val total1= total(avrg1, coeff1 )
            val total2= total(avrg2, coeff2 )
            val total3= total(avrg3, coeff3 )
            val total4= total(avrg4, coeff4 )
            val total5= total(avrg5, coeff5 )
            val total6= total(avrg6, coeff6 )
            val total7= total(avrg7, coeff7 )
            val total8= total(avrg8, coeff8)
            val total9= total(avrg9, coeff9)

            // TOTAL
            val TOTAL = total1+total2+total3+total4+total5+total6+total7+total8+total9
            val coeff_total = coeff1+coeff2+coeff3+coeff4+coeff5+coeff6+coeff7+coeff8+coeff9

            df.roundingMode = RoundingMode.CEILING

            val SEMESTER_AVRG = TOTAL/coeff_total
            val grade = df.format(SEMESTER_AVRG).toFloat()
            editor.putFloat("grade",grade)
            editor.apply()
            showDialog1(grade)
        }





    }

    private fun storeavrgs(
        avrg1: Float,
        avrg2: Float,
        avrg3: Float,
        avrg4: Float,
        avrg5: Float,
        avrg6: Float,
        avrg7: Float,
        avrg8: Float,
        avrg9: Float
    ) {
        val editor = sharedPrefs.edit()

        editor.putFloat("avrg1",avrg1)
        editor.putFloat("avrg2",avrg2)
        editor.putFloat("avrg3",avrg3)
        editor.putFloat("avrg4",avrg4)
        editor.putFloat("avrg5",avrg5)
        editor.putFloat("avrg6",avrg6)
        editor.putFloat("avrg7",avrg7)
        editor.putFloat("avrg8",avrg8)
        editor.putFloat("avrg9",avrg9)

        editor.apply()
    }

    private fun storeexams(
        exam1: Float,
        exam2: Float,
        exam3: Float,
        exam4: Float,
        exam5: Float,
        exam6: Float,
        exam7: Float,
        exam8: Float,
        exam9: Float
    ) {
        val editor = sharedPrefs.edit()
        editor.putFloat("exam1",exam1)
        editor.putFloat("exam2",exam2)
        editor.putFloat("exam3",exam3)
        editor.putFloat("exam4",exam4)
        editor.putFloat("exam5",exam5)
        editor.putFloat("exam6",exam6)
        editor.putFloat("exam7",exam7)
        editor.putFloat("exam8",exam8)
        editor.putFloat("exam9",exam9)

        editor.apply()
    }

    private fun storeConts(
        cont1: Float,
        cont2: Float,
        cont3: Float,
        cont4: Float,
        cont5: Float,
        cont6: Float,
        cont7: Float,
        cont8: Float,
        cont9: Float
    ) {
        val editor = sharedPrefs.edit()
        editor.putFloat("cont1",cont1)
        editor.putFloat("cont2",cont2)
        editor.putFloat("cont3",cont3)
        editor.putFloat("cont4",cont4)
        editor.putFloat("cont5",cont5)
        editor.putFloat("cont6",cont6)
        editor.putFloat("cont7",cont7)
        editor.putFloat("cont8",cont8)
        editor.putFloat("cont9",cont9)

        editor.apply()
    }

    private fun getvalue(spot: TextInputEditText): Float {
        val zero = 0

        val text1 = spot.text.toString()
        if (text1.isNotEmpty() && text1.toFloat() <= 20){

            return text1.toFloat()
        }
        else if(text1.isEmpty()) {
            error = true
            return zero.toFloat()
        }
        else {
            error = true
            return zero.toFloat()
        }
    }

    private fun showDialog1(grade:Float) {
        val  mDialogView = LayoutInflater.from(this).inflate(R.layout.dialog,null)
        val mBuilder = AlertDialog.Builder(this)
        mBuilder.setView(mDialogView)
        val mDialog = mBuilder.create()
        mDialog.show()
        mDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        mDialog.gradeTxt.setText(grade.toString())

    }private fun showDialog2() {
        val  mDialogView = LayoutInflater.from(this).inflate(R.layout.error_dialog,null)
        val mBuilder = AlertDialog.Builder(this)
        mBuilder.setView(mDialogView)
        val mDialog = mBuilder.create()
        mDialog.show()
        mDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)


    }




    private fun calcAverages(cont: Float, exam: Float): Float {
        val avrg = 0.4 * cont + 0.6 * exam

        df.roundingMode = RoundingMode.CEILING

        val avg = df.format(avrg).toFloat()
        return avg
    }

    private fun total(avrg: Float,coeff: Int): Float {

        return avrg*coeff
    }

}