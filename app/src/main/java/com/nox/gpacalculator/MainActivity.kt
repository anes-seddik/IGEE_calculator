package com.nox.gpacalculator

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.speciality_dialog.*

class MainActivity : AppCompatActivity() {

    private var firsttime = true
    private var major = 0
    private lateinit var sharedPrefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPrefs = getSharedPreferences("firsttime", Context.MODE_PRIVATE)
        firsttime = sharedPrefs.getBoolean("first",true)

        if (firsttime){


            showDLG()
            clearAllSharedprefs()


            sharedPrefs.edit().putBoolean("first",false).apply()
        }




    }

    private fun clearAllSharedprefs() {
        getSharedPreferences("spL1S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL1S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL2S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL2S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL3S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL3S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP1S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP1S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP2S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP2S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP3S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP3S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP4S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL4SP4S2",Context.MODE_PRIVATE).edit().clear().apply()

        getSharedPreferences("spL5SP1S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP1S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP2S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP2S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP3S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP3S2",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP4S1",Context.MODE_PRIVATE).edit().clear().apply()
        getSharedPreferences("spL5SP4S2",Context.MODE_PRIVATE).edit().clear().apply()


        getSharedPreferences("firsttime", Context.MODE_PRIVATE).edit().clear().apply()
    }


    fun showDLG() {
        val  mDialogView = LayoutInflater.from(this).inflate(R.layout.first_time_dialog,null)
        val mBuilder = AlertDialog.Builder(this)

        mBuilder.setView(mDialogView)
        val mDialog = mBuilder.create()
        mDialog.show()
        mDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
    }

    fun gotoSemesters(view: View) {


        if (view == year1 || view == year2 || view == year3){
            val intent = Intent(this,SEMESTERS::class.java)

            when(view){
                year1 -> intent.putExtra("year",1)
                year2 -> intent.putExtra("year",2)
                year3 -> intent.putExtra("year",3)
            }
            startActivity(intent)
            finish()
        }
        else if (view == year4 || view == year5){
            showSPdialog(view)
        }



    }

    private fun gotoActivity(intent: Intent) {


    }


    fun showMenu(view: View) {
        val popup = PopupMenu(this,abouttheapp)
        popup.menu.add(Menu.NONE,0,0,"about the app")

        popup.setOnMenuItemClickListener {
            val intent = Intent(this,about_app::class.java)
            startActivity(intent)
            false

        }
        popup.show()
    }

    private fun showSPdialog(view: View) {
        val intent = Intent(this,SEMESTERS::class.java)

        when(view){
            year4 -> intent.putExtra("year",4)
            year5 -> intent.putExtra("year",5)

        }

        val  mDialogView = LayoutInflater.from(this).inflate(R.layout.speciality_dialog,null)
        val mBuilder = AlertDialog.Builder(this,R.style.WrapContentDialog)

        mBuilder.setView(mDialogView)
        val mDialog = mBuilder.create()
        mDialog.show()
        mDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)



        mDialog.SP1.setOnClickListener {
            major = mDialog.SP1.id
            mDialog.dismiss()

            intent.putExtra("major",major)
            startActivity(intent)
            finish()

        }
        mDialog.SP2.setOnClickListener {
            major = mDialog.SP2.id
            mDialog.dismiss()
            intent.putExtra("major",major)
            startActivity(intent)
            finish()
        }
        mDialog.SP3.setOnClickListener {
            major = mDialog.SP3.id
            mDialog.dismiss()
            intent.putExtra("major",major)
            startActivity(intent)
            finish()
        }
        mDialog.SP4.setOnClickListener {
            major = mDialog.SP4.id

            mDialog.dismiss()
            intent.putExtra("major",major)
            startActivity(intent)
            finish()
        }





    }




}