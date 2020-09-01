package com.ian.androidwebviewdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
//            val gotoUrl = editText.text.toString()   //將ed_name文字轉成String字串
            var gotoUrl = "https://m.sinopac.com/m/m_home.aspx"
            intent.putExtra("gotoUrl", gotoUrl)     //putExtra("Key", value)
            startActivity(intent)
        }

    }
}
