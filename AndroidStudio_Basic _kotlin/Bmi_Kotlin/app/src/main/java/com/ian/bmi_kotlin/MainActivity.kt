package com.ian.bmi_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bmi(view : View){
        val w = editTextWeight.text.toString().toFloat()
        val h = editTextHeight.text.toString().toFloat()
        print("weight : $w")
        Log.d("MainActivity " ,"weight" + w)
        Log.d("MainActivity " ,"height" + h)
        var  bmi = w/(h*h)
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("Bmi",bmi)
        startActivity(intent)



    }
}
