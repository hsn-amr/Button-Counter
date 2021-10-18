package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv)
        val increase = findViewById<Button>(R.id.btnIncrease)
        val decrease = findViewById<Button>(R.id.btnDecrease)

        increase.setOnClickListener {
            tv.text = "${tv.text.toString().toInt() + 1}"
        }
        decrease.setOnClickListener {
            tv.text = "${tv.text.toString().toInt() - 1}"
        }
    }
}