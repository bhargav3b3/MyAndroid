package com.example.guesstheword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var count : Int = 0
    lateinit var plusBtn :Button
    lateinit var minusBtn : Button
    lateinit var countTv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusBtn = findViewById(R.id.plus_btn)
        minusBtn = findViewById(R.id.minus_btn)
        countTv = findViewById(R.id.count_tv)
    }

    fun IncrementByOne(view: View) {
        count++
        countTv.text = count.toString()
    }
    fun DecrementByOne(view: View) {
        count--
        countTv.text = count.toString()
    }

}