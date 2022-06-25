package com.example.gpacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }

    fun gotoSemesters(view: View) {
        val intent = Intent(this,SEMESTERS::class.java)
        when(view){
            year1 -> intent.putExtra("year",1)
            year2 -> intent.putExtra("year",2)
            year3 -> intent.putExtra("year",3)
        }

        startActivity(intent)
        finish()

    }


}