package com.example.kotlinfirstapp

import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var degiskenAdi = 5

        val d1 : Int = 45

        println(degiskenAdi)
        println(d1)



        // kesiirli
        var d2 : Float = 45.5f
        var d3 : Double = 45.6

        println(d2)

        // metinsel
        var d4 : String = "Berkin"
        var d5 : String ="Topaloğlu"
        println(d4)

        var d6 : String = d4 + " " + d5
        println(d6)

        var d7 : Boolean = true

        d7 = 4 > 5
        println(d7)

        // aritmetik operatörler
        var d8 : Int = 45
        var d9 = 56
        var toplam = d8 + d9

        println( toplam)

        // mantıksal operatör
        var d10 : Boolean =3 < 5
        d10 = 3 <= 5
        println(d10)

        // && ,, true && true = true
        var veSonuc = 2 > 1 && d10
        println(veSonuc)

        var d11 : Int = 10
        var d12 = 3
        var toplamSonuc : Float = d11.toFloat() / d12.toFloat()
        println(toplamSonuc)

        var d13 ="174"
        var d14 = d13.toInt()
        println(d14)

        var (a,b) = Pair(1, 3.4)

        var deger : Boolean =  (10 < 10) && ((30 < 40) || (2 == 4) || 5 < 30)
        println(deger
        )

        val eFloat = 2.7182818284f
        println(eFloat)

        var d = 10
        when (d)
        {
            in 1..100 -> println("1-100")
            10 -> println("10")
            !in 1..5 -> println("1-5")
            else -> println("else durumu")
        }
    }
}