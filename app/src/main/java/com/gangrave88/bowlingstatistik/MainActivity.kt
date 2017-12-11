package com.gangrave88.bowlingstatistik

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentThrow: Int = 1
    private var currentFrame: Int = 1
    private lateinit var tableScore:TableScore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tableScore = findViewById(R.id.tableScore)

        buttonTitle()

        strike_spea.setOnClickListener {
            if (currentThrow==1)
                tableScore.setData(currentFrame,currentThrow,10)
            else
                tableScore.setData(currentFrame,currentThrow,)
        }

        gutter.setOnClickListener {

        }

        score.setOnClickListener {

        }

    }

    fun

    fun buttonTitle(){
        when(currentFrame){
            in 1..9 -> {
                when(currentThrow){
                    1 -> strike_spea.text = "STRIKE"
                    2 -> strike_spea.text = "SPEAR"
                }
            }
            10 -> {

            }
        }
    }
}
