package com.nox.gpacalculator

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_calculate.*

import kotlin.math.roundToInt

class Calculate : AppCompatActivity() {
    private  var yearNum = 0
    private  var major = 0

    private  var testPercentage1 = 0.00; private  var examPercentage1 = 0.00
    private  var testPercentage2 = 0.00 ; private  var examPercentage2 = 0.00
    private  var testPercentage3 = 0.00 ; private  var examPercentage3 = 0.00
    private  var testPercentage4 = 0.00 ; private  var examPercentage4 = 0.00
    private  var testPercentage5 = 0.00 ; private  var examPercentage5 = 0.00
    private  var testPercentage6 = 0.00 ; private  var examPercentage6 = 0.00
    private  var testPercentage7 = 0.00 ; private  var examPercentage7 = 0.00
    private  var testPercentage8 = 0.00 ; private  var examPercentage8 = 0.00
    private  var testPercentage9 = 0.00 ; private  var examPercentage9 = 0.00
    private  var testPercentage10 = 0.00 ; private  var examPercentage10 = 0.00
    private  var testPercentage11 = 0.00 ; private  var examPercentage11 = 0.00



    private  var semester = 0

//    private  val df = DecimalFormat("#.##")



    private val zero = 0
    private val zerro = zero.toFloat()
    private var error = arrayListOf<Boolean>()
    private lateinit var sharedPrefs : SharedPreferences

    var coeff1 = 0
    var coeff2 = 0
    var coeff3 = 0
    var coeff4 = 0
    var coeff5 = 0.toFloat()
    var coeff6 = 0.toFloat()
    var coeff7 = 0.toFloat()
    var coeff8 = 0.toFloat()
    var coeff9 = 0
    var coeff10 = 0
    var coeff11 = 0


    private var stored =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        yearNum = intent.getIntExtra("year",0)
        major = intent.getIntExtra("major",0)
        semester = intent.getIntExtra("semester",0)

        if (major == 0){
            sharedPrefs = getSharedPreferences("spL${yearNum}S$semester",Context.MODE_PRIVATE)

        }
        else {
            sharedPrefs = getSharedPreferences("spL${yearNum}${major}S$semester",Context.MODE_PRIVATE)

        }


        var majortext = ""
        if (major != 0){
            when(major){
                R.id.SP1 -> majortext = "( Power )"
                R.id.SP2 -> majortext = "( Telecom )"
                R.id.SP3 -> majortext = "( Control )"
                R.id.SP4 -> majortext = "( computer eng )"


            }

            pageTitle.text = "M${yearNum - 3} - S$semester    $majortext"

        }
        else {
            pageTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP,22.toFloat())
            pageTitle.text = "L$yearNum - S$semester"


        }

        normalPercentage()

        arrangeGrid()

        stored = sharedPrefs.getBoolean("stored",false)
        if (stored){
            fillModules()
        }

    }

    private fun arrangeGrid() {

        when(yearNum){
            1 -> {
                if (semester == 1)
                    L1S1()
                else if (semester == 2)
                    L1S2()
            }
            2 -> {
                if (semester == 1)
                    L2S1()
                else if (semester == 2)
                    L2S2()
            }
            3 -> {
                if (semester == 1)
                    L3S1()
                else if (semester == 2)
                    L3S2()
            }

            4 -> {
                when(major){
                    R.id.SP1 -> {
                        if (semester == 1)
                            L4PS1()
                        else if (semester == 2)
                            L4PS2()
                    }
                    R.id.SP2 -> {
                        if (semester == 1)
                            L4TS1()
                        else if (semester == 2)
                            L4TS2()
                    }
                    R.id.SP3 -> {
                        if (semester == 1)
                            L4CS1()
                        else if (semester == 2)
                            L4CS2()
                    }
                    R.id.SP4 -> {
                        if (semester == 1)
                            L4ES1()
                        else if (semester == 2)
                            L4ES2()
                    }
                }

            }

            5 -> {
                when(major){
                    R.id.SP1 -> {
                        if (semester == 1)
                            L5PS1()
                        else if (semester == 2)
                            L5PS2()
                    }
                    R.id.SP2 -> {
                        if (semester == 1)
                            L5TS1()
                        else if (semester == 2)
                            L5TS2()
                    }
                    R.id.SP3 -> {
                        if (semester == 1)
                            L5CS1()
                        else if (semester == 2)
                            L5CS2()
                    }
                    R.id.SP4 -> {
                        if (semester == 1)
                            L5ES1()
                        else if (semester == 2)
                            L5ES2()
                    }
                }

            }

        }

        writeCoeffs()
    }


    private fun L1S1() {

        mod1.setText("Calculus")
        mod2.setText("Chemistry")
        mod3.setText("Physics")
        mod4.setText("Physics Lab")
        mod5.setText("EST")
        mod6.setText("Grammar")
        mod7.setText("LS")
        mod8.setText("RW")
        mod9.setText("C prog")

        coeff1 = 3
        coeff2 = 3
        coeff3 = 3
        coeff4 = 1
        coeff5 = 2.toFloat()
        coeff6 = 2.toFloat()
        coeff7 = 2.toFloat()
        coeff8 = 2.toFloat()
        coeff9 = 1






    }




    private fun L1S2() {

        mod1.setText("Calculus")
        mod2.setText("Algebra")
        mod3.setText("Chemistry")
        mod4.setText("Physics")
        mod5.setText("C prog")
        mod6.setText("Physics lab")
        mod7.setText("LS")
        mod8.setText("RW")
        mod9.setText("Electricity")

        coeff1 = 2
        coeff2 = 3
        coeff3 = 2
        coeff4 = 3
        coeff5 = 2.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 1.toFloat()
        coeff9 = 2


    }



    private fun L2S1() {
        mod1.setText("Diff equations")
        mod2.setText("Physics")
        mod3.setText("Active Dev")
        mod4.setText("Digital Sys")
        mod5.setText("electricity")
        mod6.setText("Active Dev lab")
        mod7.setText("Digital Sys Lab")
        mod8.setText("electricity lab")
        mod9.setText("Eng Economics")

        coeff1 = 2
        coeff2 = 3
        coeff3 = 3
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 1.toFloat()
        coeff9 = 1

    }

    private fun L2S2() {
        mod1.setText("Electromag")
        mod2.setText("Linear Sys")
        mod3.setText("Active Dev")
        mod4.setText("Digital Sys")
        mod5.setText("Elec Machines")
        mod6.setText("Active Dev Lab")
        mod7.setText("Digital Sys Lab")
        mod8.setText("Elec Machines Lab")

        modRow9.visibility = View.GONE

        coeff1 = 3
        coeff2 = 3
        coeff3 = 3
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 1.toFloat()



    }



    private fun L3S1() {
        mod1.setText("comp arch")
        mod2.setText("C.P")
        mod3.setText("M.S.D")
        mod4.setText("Power Electro")
        mod5.setText("Linear Sys")
        mod6.setText("Process Cont")
        mod7.setText("C.P  Lab")
        mod8.setText("Power Electro Lab")
        mod9.setText("M.S.D  Lab")

        coeff1 = 3
        coeff2 = 3
        coeff3 = 3
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 3.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 1.toFloat()
        coeff9 = 1


    }

    private fun L3S2() {

        mod1.setText("C.C")
        mod2.setText("Energy Sys")
        mod3.setText("L.C.S")
        mod4.setText("C.C  Lab")
        mod5.setText("L.C.S Lab")
        mod6.setText("Licence Project")
        mod7.setText("Eng Management")

        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 3
        coeff2 = 3
        coeff3 = 3
        coeff4 = 1
        coeff5 = 1.toFloat()
        coeff6 = 4.toFloat()
        coeff7 = 2.toFloat()



    }



    private fun L4PS1() {



        mod1.setText("Probab & Stats")
        mod2.setText("Adv Diff Equations")
        mod3.setText("Complex Variable")
        mod4.setText("Digital Control")
        mod5.setText("Power Eng")
        mod6.setText("C & S")


        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 4
        coeff5 = 3.toFloat()
        coeff6 = 2.toFloat()


        testPercentage5 = 0.3 ; examPercentage5 = 0.7


    }

    private fun L4PS2() {

        modRow10.visibility = View.VISIBLE


        mod1.setText("D.S.P")
        mod2.setText("Num Methods")
        mod3.setText("Elec Machines")
        mod4.setText("P.S.A")
        mod5.setText("Power Electro")
        mod6.setText("Network Analysis")
        mod7.setText("Num Methods Lab")
        mod8.setText("P.S.A Lab")
        mod9.setText("Elec Machines Lab")
        mod10.setText("Power Electro Lab")



        coeff1 = 3
        coeff2 = 3
        coeff3 = 4
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 3.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 2.toFloat()
        coeff9 = 1
        coeff10 = 1


        testPercentage1 = 0.4 ; examPercentage1 = 0.6
        testPercentage2 = 0.3 ; examPercentage2 = 0.7
        testPercentage3 = 0.3 ; examPercentage3 = 0.7
        testPercentage4 = 0.3 ; examPercentage4 = 0.7
        testPercentage5 = 0.3 ; examPercentage5 = 0.7
        testPercentage6 = 0.4 ; examPercentage6 = 0.6
        testPercentage7 = 0.25 ; examPercentage7 = 0.75
        testPercentage8 = 0.25 ; examPercentage8 = 0.75
        testPercentage9 = 0.25 ; examPercentage9 = 0.75
        testPercentage10 = 0.25 ; examPercentage10 = 0.75
        testPercentage11 = 0.4 ; examPercentage11 = 0.6

    }

    private fun L4TS1() {

        mod1.setText("Probab & Stats")
        mod2.setText("Adv Diff Equations")
        mod3.setText("Complex Variable")
        mod4.setText("Adv E.F.T")
        mod5.setText("Microwave Eng")
        mod6.setText("Radio Wave")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 4
        coeff5 = 3.toFloat()
        coeff6 = 2.toFloat()


        testPercentage5 = 0.3 ; examPercentage5 = 0.7
        testPercentage6 = 0.3 ; examPercentage6 = 0.7


    }

    private fun L4TS2() {

        mod1.setText("Num Methods")
        mod2.setText("D.S.P")
        mod3.setText("Adv Commun..")
        mod4.setText("Antennas")
        mod5.setText("O.F.C Sys")
        mod6.setText("Electrical Networks")
        mod7.setText("Num Methods Lab")
        mod8.setText("Antennas Lab")





        modRow9.visibility = View.GONE

        coeff1 = 3
        coeff2 = 3
        coeff3 = 3
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 4.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 2.toFloat()


        testPercentage1 = 0.3 ; examPercentage1 = 0.7
        testPercentage2 = 0.3 ; examPercentage2 = 0.7
        testPercentage3 = 0.3 ; examPercentage3 = 0.7
        testPercentage4 = 0.3 ; examPercentage4 = 0.7
        testPercentage5 = 0.3 ; examPercentage5 = 0.7
        testPercentage6 = 0.4 ; examPercentage6 = 0.6

    }

    private fun L4CS1() {


        mod1.setText("P.S.P")
        mod2.setText("Adv Maths")
        mod3.setText("Complex Variable")
        mod4.setText("Digital cont sys")
        mod5.setText("D.C.I")
        mod6.setText("Scientific Comput")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 4
        coeff5 = 2.toFloat()
        coeff6 = 2.toFloat()


    }

    private fun L4CS2() {



        mod1.setText("Num Methods")
        mod2.setText("D.S.P")
        mod3.setText("Industrial Auto")
        mod4.setText("Multivar Cont sys")
        mod5.setText("D.S & algo")
        mod6.setText("Num Methods Lab")
        mod7.setText("Indust Auto Lab")
        mod8.setText("D.S & algo Lab")



        modRow9.visibility = View.GONE

        coeff1 = 3
        coeff2 = 3
        coeff3 = 4
        coeff4 = 4
        coeff5 = 4.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 1.5.toFloat()
        coeff8 = 1.5.toFloat()

    }

    private fun L4ES1() {

        mod1.setText("Probab & Stats")
        mod2.setText("Adv Maths")
        mod3.setText("Adv Prog")
        mod4.setText("A.D.S")
        mod5.setText("Adv prog Lab")
        mod6.setText("A.D.S Lab")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 4
        coeff5 = 2.toFloat()
        coeff6 = 2.toFloat()

    }

    private fun L4ES2() {

        mod1.setText("Adv IC's")
        mod2.setText("Num Methods")
        mod3.setText("D.S & algo")
        mod4.setText("Operating sys")
        mod5.setText("Num Methods Lab")
        mod6.setText("Adv IC's Lab")
        mod7.setText("D.S & algo Lab")
        mod8.setText("Operating sys Lab")





        modRow9.visibility = View.GONE

        coeff1 = 4
        coeff2 = 3
        coeff3 = 4
        coeff4 = 4
        coeff5 = 1.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 1.toFloat()

    }



    private fun L5PS1() {

        modRow10.visibility = View.VISIBLE
        modRow11.visibility = View.VISIBLE


        mod1.setText("P.S.C")
        mod2.setText("Machines & Drives")
        mod3.setText("Protective Systems")
        mod4.setText("R.A.M & Security")
        mod5.setText("Programmable Dev")
        mod6.setText("I.P.N")
        mod7.setText("P.S.C Lab")
        mod8.setText("Machines & Drives Lab")
        mod9.setText("Programmable Dev Lab")
        mod10.setText("I.P.N Lab")
        mod11.setText("Renewable energy")



        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 2.toFloat()
        coeff10 = 1
        coeff11 = 2

        testPercentage1 = 0.3 ; examPercentage1 = 0.7
        testPercentage2 = 0.3 ; examPercentage2 = 0.7
        testPercentage3 = 0.3 ; examPercentage3 = 0.7
        testPercentage4 = 0.3 ; examPercentage4 = 0.7
        testPercentage5 = 0.3 ; examPercentage5 = 0.7
        testPercentage6 = 0.4 ; examPercentage6 = 0.6
        testPercentage7 = 0.25 ; examPercentage7 = 0.75
        testPercentage8 = 0.25 ; examPercentage8 = 0.75
        testPercentage9 = 0.25 ; examPercentage9 = 0.75
        testPercentage10 = 0.25 ; examPercentage10 = 0.75
        testPercentage11 = 0.4 ; examPercentage11 = 0.6


    }

    private fun L5PS2() {

        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 16
        coeff2 = 2
        coeff3 = 2

    }

    private fun L5TS1() {


        mod1.setText("Information Theory")
        mod2.setText("Image Processing")
        mod3.setText("R.F Design")
        mod4.setText("Radar & Satellite..")
        mod5.setText("Networks & Protocols")
        mod6.setText("Image Process Lab")
        mod7.setText("R.F Design Lab")
        mod8.setText("Radar & Sat.. Lab")
        mod9.setText("Networks & Proto.. Lab")



        coeff1 = 3
        coeff2 = 3
        coeff3 = 4
        coeff4 = 3
        coeff5 = 3.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 2.toFloat()
        coeff8 = 1.toFloat()
        coeff9 = 2


        testPercentage1 = 0.3 ; examPercentage1 = 0.7
        testPercentage2 = 0.3 ; examPercentage2 = 0.7
        testPercentage3 = 0.4 ; examPercentage3 = 0.6
        testPercentage4 = 0.3 ; examPercentage4 = 0.7
        testPercentage5 = 0.3 ; examPercentage5 = 0.7


    }

    private fun L5TS2() {

        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 16
        coeff2 = 2
        coeff3 = 2

    }

    private fun L5CS1() {



        mod1.setText("Optimal cont Sys")
        mod2.setText("Nonlinear Sys")
        mod3.setText("S.I")
        mod4.setText("I.I")
        mod5.setText("I.I Lab")
        mod6.setText("F.D & isolation")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE


        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 4
        coeff5 = 1.5.toFloat()
        coeff6 = 1.5.toFloat()

    }

    private fun L5CS2() {

        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 16
        coeff2 = 2
        coeff3 = 2

    }

    private fun L5ES1() {


        mod1.setText("Embedded Sys")
        mod2.setText("D.S.P ")
        mod3.setText("Computer Net")
        mod4.setText("Prog Languages")
        mod5.setText("Embedded Sys Lab")
        mod6.setText("D.S.P Lab")
        mod7.setText("Computer Net Lab")
        mod8.setText("Intro to UML")





        modRow9.visibility = View.GONE

        coeff1 = 4
        coeff2 = 4
        coeff3 = 4
        coeff4 = 4
        coeff5 = 1.toFloat()
        coeff6 = 1.toFloat()
        coeff7 = 1.toFloat()
        coeff8 = 1.5.toFloat()
    }

    private fun L5ES2() {


        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        coeff1 = 16
        coeff2 = 2
        coeff3 = 2


    }


    private fun writeCoeffs() {
        xml_coeff1.text = coeff1.toString()
        xml_coeff2.text = coeff2.toString()
        xml_coeff3.text = coeff3.toString()
        xml_coeff4.text = coeff4.toString()

        if (coeff5.toInt() < coeff5){
            xml_coeff5.text = coeff5.toString()

        }
        else xml_coeff5.text = coeff5.toInt().toString()

        if (coeff6.toInt() < coeff6){
            xml_coeff6.text = coeff6.toString()

        }
        else xml_coeff6.text = coeff6.toInt().toString()

        if (coeff7.toInt() < coeff7){
            xml_coeff7.text = coeff7.toString()

        }
        else xml_coeff7.text = coeff7.toInt().toString()

        if (coeff8.toInt() < coeff8){
            xml_coeff8.text = coeff8.toString()

        }
        else xml_coeff8.text = coeff8.toInt().toString()


        xml_coeff9.text = coeff9.toString()
        xml_coeff10.text = coeff10.toString()
        xml_coeff11.text = coeff11.toString()





    }



    private fun normalPercentage() {


        testPercentage1 = 0.4 ; examPercentage1 = 0.6
        testPercentage2 = 0.4 ; examPercentage2 = 0.6
        testPercentage3 = 0.4 ; examPercentage3 = 0.6
        testPercentage4 = 0.4 ; examPercentage4 = 0.6
        testPercentage5 = 0.4 ; examPercentage5 = 0.6
        testPercentage6 = 0.4 ; examPercentage6 = 0.6
        testPercentage7 = 0.4 ; examPercentage7 = 0.6
        testPercentage8 = 0.4 ; examPercentage8 = 0.6
        testPercentage9 = 0.4 ; examPercentage9 = 0.6
        testPercentage10 = 0.4 ; examPercentage10 = 0.6
        testPercentage11 = 0.4 ; examPercentage11 = 0.6


    }


    override fun onBackPressed() {
        val intent = Intent(this,SEMESTERS::class.java)
        intent.putExtra("year",yearNum)
        intent.putExtra("major",major)

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
        cont10.setText((sharedPrefs.getFloat("cont10",zerro)).toString())
        cont11.setText((sharedPrefs.getFloat("cont11",zerro)).toString())

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
        exam10.setText((sharedPrefs.getFloat("exam10",zerro)).toString())
        exam11.setText((sharedPrefs.getFloat("exam11",zerro)).toString())


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
        avg10.setText((sharedPrefs.getFloat("avrg10",zerro)).toString())
        avg11.setText((sharedPrefs.getFloat("avrg11",zerro)).toString())


        //GRADE

        gradeBTN.setText(sharedPrefs.getFloat("grade",zerro).toString())
    }

    fun calculateFinal(view: View) {
        error.clear()

        val editor = sharedPrefs.edit()


        val cont1 = getvalue(cont1,1);val exam1 =getvalue(exam1, 1)
        val cont2 = getvalue(cont2,2);val exam2 =getvalue(exam2, 2)
        val cont3 = getvalue(cont3,3);val exam3 =getvalue(exam3, 3)
        val cont4 = getvalue(cont4,4);val exam4 =getvalue(exam4, 4)
        val cont5 = getvalue(cont5,5);val exam5 =getvalue(exam5, 5)
        val cont6 = getvalue(cont6,6);val exam6 =getvalue(exam6, 6)
        val cont7 = getvalue(cont7,7);val exam7 =getvalue(exam7, 7)
        val cont8 = getvalue(cont8,8);val exam8 =getvalue(exam8, 8)
        val cont9 = getvalue(cont9,9);val exam9 =getvalue(exam9, 9)
        val cont10 = getvalue(cont10,10);val exam10 =getvalue(exam10, 10)
        val cont11 = getvalue(cont11,11);val exam11 =getvalue(exam11, 11)







        if (error.contains(true)){
            showDialog2()
        }
        else if (!(error.contains(true))){
            /// sttoring grades
            storeConts(cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10,cont11)
            storeexams(exam1,exam2,exam3,exam4,exam5,exam6,exam7,exam8,exam9,exam10,exam11)

            //averages:
            val avrg1 = calcAverages(cont1,exam1,1)
            val avrg2 = calcAverages(cont2, exam2, 2)
            val avrg3 = calcAverages(cont3, exam3, 3)
            val avrg4 = calcAverages(cont4, exam4, 4)
            val avrg5 = calcAverages(cont5, exam5, 5)
            val avrg6 = calcAverages(cont6, exam6, 6)
            val avrg7 = calcAverages(cont7, exam7, 7)
            val avrg8 = calcAverages(cont8, exam8, 8)
            val avrg9 = calcAverages(cont9, exam9, 9)
            val avrg10 = calcAverages(cont10, exam10, 10)
            val avrg11 = calcAverages(cont11, exam11, 11)




            storeavrgs(avrg1,avrg2,avrg3,avrg4,avrg5,avrg6,avrg7,avrg8,avrg9,avrg10,avrg11)

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
            avg10.setText(avrg10.toString())
            avg11.setText(avrg11.toString())


            stored = true
            editor.putBoolean("stored",stored)


            // calculate totals

            val total1= total(avrg1, coeff1.toFloat())
            val total2= total(avrg2, coeff2.toFloat())
            val total3= total(avrg3, coeff3.toFloat())
            val total4= total(avrg4, coeff4.toFloat())
            val total5= total(avrg5, coeff5 )
            val total6= total(avrg6, coeff6 )
            val total7= total(avrg7, coeff7 )
            val total8= total(avrg8, coeff8 )
            val total9= total(avrg9, coeff9.toFloat())
            val total10= total(avrg10, coeff10.toFloat() )
            val total11= total(avrg11, coeff11.toFloat() )


            // TOTAL
            val TOTAL = total1+total2+total3+total4+total5+total6+total7+total8+total9+total10+total11
            val coeff_total = coeff1+coeff2+coeff3+coeff4+coeff5+coeff6+coeff7+coeff8+coeff9+coeff10+coeff11

            val SEMESTER_AVRG = TOTAL/coeff_total

            val grade = ((SEMESTER_AVRG * 100.0).roundToInt() /100.0).toFloat()

            if (grade < 9 && grade> 8 ){
                Toast.makeText(this, "Congrats my friend!! YOU ARE DUMB!", Toast.LENGTH_SHORT).show()
            }
            else if (grade<8){

                Toast.makeText(this, "Keep it up! you'll be homeless in no time !", Toast.LENGTH_SHORT).show()


            }
            else if (grade<10.1 && grade> 10){

                Toast.makeText(this, "wow,that was a close call..", Toast.LENGTH_SHORT).show()


            }
            else if (grade> 18){

                Toast.makeText(this, "It's nice to dream !", Toast.LENGTH_SHORT).show()


            }


            editor.putFloat("grade",grade)
            editor.apply()
            gradeBTN.setText(grade.toString())
        }

    }



    private fun getvalue(spot: TextInputEditText, i: Int): Float {
        val zero = 0
        val visible = checkVisibility(i)
        if (visible){
            val text1 = spot.text.toString()

            if (text1.isNotEmpty() && text1.toFloat() <= 20){
                error.add(false)
                return text1.toFloat()
            }
            else if(text1.isEmpty()) {
                error.add(true)
                return zero.toFloat()
            }
            else {
                error.add(true)
                return zero.toFloat()
            }
        }
        else{
            error.add(false)
            return zero.toFloat()
        }



    }

    private fun checkVisibility(i: Int): Boolean {

        var visible = true

        when(i){
            1 -> {if (modRow1.visibility == View.GONE)  visible = false}
            2 -> {if (modRow2.visibility == View.GONE)  visible = false}
            3 -> {if (modRow3.visibility == View.GONE)  visible = false}
            4 -> {if (modRow4.visibility == View.GONE)  visible = false}
            5 -> {if (modRow5.visibility == View.GONE)  visible = false}
            6 -> {if (modRow6.visibility == View.GONE)  visible = false}
            7 -> {if (modRow7.visibility == View.GONE)  visible = false}
            8 -> {if (modRow8.visibility == View.GONE)  visible = false}
            9 -> {if (modRow9.visibility == View.GONE)  visible = false}
            10 -> {if (modRow10.visibility == View.GONE)  visible = false}
            11 -> {if (modRow11.visibility == View.GONE)  visible = false}


        }
        return visible
    }

    /// edit this one ///////
//    private fun chackforSpecialCases() {
//
//        if (yearNum== 3 && semester==2){
//            error[14] = false
//            error[15] = false
//            error[16] = false
//            error[17] = false
//            error[18] = false
//            error[19] = false
//            error[20] = false
//            error[21] = false
//        }
//        if (yearNum== 2 && semester==2){
//            error[16] = false
//            error[17] = false
//            error[18] = false
//            error[19] = false
//            error[20] = false
//            error[21] = false
//        }
//
//
//    }

    private fun storeavrgs(
        avrg1: Float,
        avrg2: Float,
        avrg3: Float,
        avrg4: Float,
        avrg5: Float,
        avrg6: Float,
        avrg7: Float,
        avrg8: Float,
        avrg9: Float,
        avrg10: Float,
        avrg11: Float
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
        editor.putFloat("avrg10",avrg10)
        editor.putFloat("avrg11",avrg11)


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
        exam9: Float,
        exam10: Float,
        exam11: Float
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
        editor.putFloat("exam10",exam10)
        editor.putFloat("exam11",exam11)



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
        cont9: Float,
        cont10: Float,
        cont11: Float
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
        editor.putFloat("cont10",cont10)
        editor.putFloat("cont11",cont11)




        editor.apply()
    }



    private fun showDialog2() {
        val  mDialogView = LayoutInflater.from(this).inflate(R.layout.error_dialog,null)
        val mBuilder = AlertDialog.Builder(this)
        mBuilder.setView(mDialogView)
        val mDialog = mBuilder.create()
        mDialog.show()
        mDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)


    }




    private fun calcAverages(cont: Float, exam: Float, i: Int): Float {
        var avrg = 0.00

        when(i){
            1 -> avrg = testPercentage1 * cont + examPercentage1 * exam
            2 -> avrg = testPercentage2 * cont + examPercentage2 * exam
            3 -> avrg = testPercentage3 * cont + examPercentage3 * exam
            4 -> avrg = testPercentage4 * cont + examPercentage4 * exam
            5 -> avrg = testPercentage5 * cont + examPercentage5 * exam
            6 -> avrg = testPercentage6 * cont + examPercentage6 * exam
            7 -> avrg = testPercentage7 * cont + examPercentage7 * exam
            8 -> avrg = testPercentage8 * cont + examPercentage8 * exam
            9 -> avrg = testPercentage9 * cont + examPercentage9 * exam
            10 -> avrg = testPercentage10 * cont + examPercentage10 * exam
            11 -> avrg = testPercentage11 * cont + examPercentage11 * exam

        }

//        df.roundingMode = RoundingMode.CEILING
//
        val avg = ((avrg * 100.0).roundToInt() /100.0).toFloat()
        return avg
    }

    private fun total(avrg: Float, coeff: Float): Float {

        return avrg*coeff
    }

    fun clearAll(view: View) {

        // Clear Controls

        cont1.setText("")
        cont2.setText("")
        cont3.setText("")
        cont4.setText("")
        cont5.setText("")
        cont6.setText("")
        cont7.setText("")
        cont8.setText("")
        cont9.setText("")
        cont10.setText("")
        cont11.setText("")



        // Cleae Exams

        exam1.setText("")
        exam2.setText("")
        exam3.setText("")
        exam4.setText("")
        exam5.setText("")
        exam6.setText("")
        exam7.setText("")
        exam8.setText("")
        exam9.setText("")
        exam10.setText("")
        exam11.setText("")

        // Clear Averages

        avg1.setText("")
        avg2.setText("")
        avg3.setText("")
        avg4.setText("")
        avg5.setText("")
        avg6.setText("")
        avg7.setText("")
        avg8.setText("")
        avg9.setText("")
        avg10.setText("")
        avg11.setText("")


        // CLEAR GRADE

        gradeBTN.setText("")

        Toast.makeText(this, "all field are cleared.", Toast.LENGTH_SHORT).show()

    }

    fun toastModule(view: View) {

        var text = ""
        when(view){

            mod1 -> text = getFromMap(1)
            mod2 -> text = getFromMap(2)
            mod3 -> text = getFromMap(3)
            mod4 -> text = getFromMap(4)
            mod5 -> text = getFromMap(5)
            mod6 -> text = getFromMap(6)
            mod7 -> text = getFromMap(7)
            mod8 -> text = getFromMap(8)
            mod9 -> text = getFromMap(9)
            mod10-> text = getFromMap(10)
            mod11-> text = getFromMap(11)


        }
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

    }

    private fun getFromMap(int: Int): String {
        var KEY = ""
        var text = ""
        when(int){
            1 -> KEY = mod1.text.toString()
            2 -> KEY = mod2.text.toString()
            3 -> KEY = mod3.text.toString()
            4 -> KEY = mod4.text.toString()
            5 -> KEY = mod5.text.toString()
            6 -> KEY = mod6.text.toString()
            7 -> KEY = mod7.text.toString()
            8 -> KEY = mod8.text.toString()
            9 -> KEY = mod9.text.toString()
            10 -> KEY = mod10.text.toString()
            11 -> KEY = mod11.text.toString()

        }

        if ( MapClass().moduleMap.containsKey(KEY) ){
            text = MapClass().moduleMap[KEY].toString()
        }else text = KEY


        return text }



}