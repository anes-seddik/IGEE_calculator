package com.nox.gpacalculator

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculate.*

class arrangeFunctions : AppCompatActivity(){

     fun L1S1() {

        mod1.setText("Calculus")
        mod2.setText("Chemistry")
        mod3.setText("Physics")
        mod4.setText("Physics Lab")
        mod5.setText("EST")
        mod6.setText("Grammar")
        mod7.setText("LS")
        mod8.setText("RW")
        mod9.setText("C prog")

        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 3
        Calculate().coeff4 = 1
        Calculate().coeff5 = 2.toFloat()
        Calculate().coeff6 = 2.toFloat()
        Calculate().coeff7 = 2.toFloat()
        Calculate().coeff8 = 2.toFloat()
        Calculate().coeff9 = 1







    }

     fun L1S2() {

        mod1.setText("Calculus")
        mod2.setText("Algebra")
        mod3.setText("Chemistry")
        mod4.setText("Physics")
        mod5.setText("C prog")
        mod6.setText("Physics lab")
        mod7.setText("LS")
        mod8.setText("RW")
        mod9.setText("Electricity")


        Calculate().coeff1 = 2
        Calculate().coeff2 = 3
        Calculate().coeff3 = 2
        Calculate().coeff4 = 3
        Calculate().coeff5 = 2.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 1.toFloat()
        Calculate().coeff9 = 2

    }



     fun L2S1() {
        mod1.setText("Diff equations")
        mod2.setText("Physics")
        mod3.setText("Active Dev")
        mod4.setText("Digital Sys")
        mod5.setText("electricity")
        mod6.setText("Active Dev lab")
        mod7.setText("Digital Sys Lab")
        mod8.setText("electricity lab")
        mod9.setText("Eng Economics")

        Calculate().coeff1 = 2
        Calculate().coeff2 = 3
        Calculate().coeff3 = 3
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 1.toFloat()
        Calculate().coeff9 = 1
    }

     fun L2S2() {
        mod1.setText("Electromag")
        mod2.setText("Linear Sys")
        mod3.setText("Active Dev")
        mod4.setText("Digital Sys")
        mod5.setText("Elec Machines")
        mod6.setText("Active Dev Lab")
        mod7.setText("Digital Sys Lab")
        mod8.setText("Elec Machines Lab")

        modRow9.visibility = View.GONE

        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 3
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 1.toFloat()

    }



     fun L3S1() {
        mod1.setText("comp arch")
        mod2.setText("C.P")
        mod3.setText("M.S.D")
        mod4.setText("Power Electro")
        mod5.setText("Linear Sys")
        mod6.setText("Process Cont")
        mod7.setText("C.P  Lab")
        mod8.setText("Power Electro Lab")
        mod9.setText("M.S.D  Lab")

        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 3
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 3.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 1.toFloat()
        Calculate().coeff9 = 1
    }

     fun L3S2() {

        mod1.setText("C.C")
        mod2.setText("Energy Sys")
        mod3.setText("L.C.S")
        mod4.setText("C.C  Lab")
        mod5.setText("L.C.S Lab")
        mod6.setText("Licence Project")
        mod7.setText("Eng Management")

        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 3
        Calculate().coeff4 = 1
        Calculate().coeff5 = 1.toFloat()
        Calculate().coeff6 = 4.toFloat()
        Calculate().coeff7 = 2.toFloat()

    }



     fun L4PS1() {



        mod1.setText("Probab and Stats")
        mod2.setText("Adv Diff Equations")
        mod3.setText("Complex Variable")
        mod4.setText("Digital Control")
        mod5.setText("Power Eng")
        mod6.setText("C & S")


        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 2.toFloat()


    }

     fun L4PS2() {

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



        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 4
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 3.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 2.toFloat()
        Calculate().coeff9 = 1
        Calculate().coeff10 = 1

    }

     fun L4TS1() {

        mod1.setText("Probab & Stats")
        mod2.setText("Adv Diff Equations")
        mod3.setText("Complex Variable")
        mod4.setText("Adv E.F.T")
        mod5.setText("Microwave Eng")
        mod6.setText("Radio Wave")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 2.toFloat()

    }

     fun L4TS2() {

        mod1.setText("Num Methods")
        mod2.setText("D.S.P")
        mod3.setText("Adv Commun..")
        mod4.setText("Antennas")
        mod5.setText("O.F.C Sys")
        mod6.setText("Electrical Networks")
        mod7.setText("Num Methods Lab")
        mod8.setText("Antennas Lab")





        modRow9.visibility = View.GONE

        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 3
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 4.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 2.toFloat()
    }

     fun L4CS1() {


        mod1.setText("P.S.P")
        mod2.setText("Adv Maths")
        mod3.setText("Complex Variable")
        mod4.setText("Digital cont sys")
        mod5.setText("D.C.I")
        mod6.setText("Scientific Comput")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 2.toFloat()
        Calculate().coeff6 = 2.toFloat()


    }

     fun L4CS2() {



        mod1.setText("Num Methods")
        mod2.setText("D.S.P")
        mod3.setText("Industrial Auto")
        mod4.setText("Multivar Cont sys")
        mod5.setText("D.S & algo")
        mod6.setText("Num Methods Lab")
        mod7.setText("Indust Auto Lab")
        mod8.setText("D.S & algo Lab")



        modRow9.visibility = View.GONE

        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 4.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 1.5.toFloat()
        Calculate().coeff8 = 1.5.toFloat()

    }

     fun L4ES1() {

        mod1.setText("Probab & Stats")
        mod2.setText("Adv Maths")
        mod3.setText("Adv Prog")
        mod4.setText("A.D.S")
        mod5.setText("Adv prog Lab")
        mod6.setText("A.D.S Lab")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 2.toFloat()
        Calculate().coeff6 = 2.toFloat()

    }

     fun L4ES2() {

        mod1.setText("Adv IC's")
        mod2.setText("Num Methods")
        mod3.setText("D.S & algo")
        mod4.setText("Operating sys")
        mod5.setText("Num Methods Lab")
        mod6.setText("Adv IC's Lab")
        mod7.setText("D.S & algo Lab")
        mod8.setText("Operating sys Lab")





        modRow9.visibility = View.GONE

        Calculate().coeff1 = 4
        Calculate().coeff2 = 3
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 1.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 1.toFloat()

    }



     fun L5PS1() {

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



        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 2.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 1.toFloat()
        Calculate().coeff9 = 1
        Calculate().coeff10 = 1
        Calculate().coeff11 = 2


    }

     fun L5PS2() {

        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 16
        Calculate().coeff2 = 2
        Calculate().coeff3 = 2

    }

     fun L5TS1() {


        mod1.setText("Information Theory")
        mod2.setText("Image Processing")
        mod3.setText("R.F Design")
        mod4.setText("Radar & Satellite..")
        mod5.setText("Networks & Protocols")
        mod6.setText("Image Process Lab")
        mod7.setText("R.F Design Lab")
        mod8.setText("Radar & Sat.. Lab")
        mod9.setText("Networks & Proto.. Lab")



        Calculate().coeff1 = 3
        Calculate().coeff2 = 3
        Calculate().coeff3 = 4
        Calculate().coeff4 = 3
        Calculate().coeff5 = 3.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 2.toFloat()
        Calculate().coeff8 = 1.toFloat()
        Calculate().coeff9 = 2

    }

     fun L5TS2() {

        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 16
        Calculate().coeff2 = 2
        Calculate().coeff3 = 2

    }

     fun L5CS1() {



        mod1.setText("Optimal cont Sys")
        mod2.setText("Nonlinear Sys")
        mod3.setText("S.I")
        mod4.setText("I.I")
        mod5.setText("I.I Lab")
        mod6.setText("F.D & isolation")



        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE


        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 1.5.toFloat()
        Calculate().coeff6 = 1.5.toFloat()

    }

     fun L5CS2() {

        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 16
        Calculate().coeff2 = 2
        Calculate().coeff3 = 2

    }

     fun L5ES1() {


        mod1.setText("Embedded Sys")
        mod2.setText("D.S.P ")
        mod3.setText("Computer Net")
        mod4.setText("Prog Languages")
        mod5.setText("Embedded Sys Lab")
        mod6.setText("D.S.P Lab")
        mod7.setText("Computer Net Lab")
        mod8.setText("Intro to UML")





        modRow9.visibility = View.GONE

        Calculate().coeff1 = 4
        Calculate().coeff2 = 4
        Calculate().coeff3 = 4
        Calculate().coeff4 = 4
        Calculate().coeff5 = 1.toFloat()
        Calculate().coeff6 = 1.toFloat()
        Calculate().coeff7 = 1.toFloat()
        Calculate().coeff8 = 1.5.toFloat()
    }

     fun L5ES2() {


        mod1.setText("Project")
        mod2.setText("C.S")
        mod3.setText("Management")



        modRow4.visibility = View.GONE
        modRow5.visibility = View.GONE
        modRow6.visibility = View.GONE
        modRow7.visibility = View.GONE
        modRow8.visibility = View.GONE
        modRow9.visibility = View.GONE

        Calculate().coeff1 = 16
        Calculate().coeff2 = 2
        Calculate().coeff3 = 2


    }
}