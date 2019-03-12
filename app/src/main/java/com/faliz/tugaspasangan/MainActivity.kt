package com.faliz.tugaspasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { Pasangan() }

    }

    private fun Pasangan() {
        val randomCewek = Random().nextInt(7) + 1
        val randomCowok = Random().nextInt(7) + 1
        val drawableResCewek = when (randomCewek) {
            1 -> R.drawable.ayulest
            2 -> R.drawable.citra
            3 -> R.drawable.lis
            4 -> R.drawable.fuji
            5 -> R.drawable.hanum
            6 -> R.drawable.mela
            else -> R.drawable.umikhotimatuss
        }
        val drawableResCowok = when (randomCowok) {
            1 -> R.drawable.deni
            2 -> R.drawable.b
            3 -> R.drawable.alim
            4 -> R.drawable.edi
            5 -> R.drawable.egi
            6 -> R.drawable.iav
            else -> R.drawable.huda
        }

        ivDadu1.setImageResource(drawableResCewek)
        ivDadu2.setImageResource(drawableResCowok)
    }
}

