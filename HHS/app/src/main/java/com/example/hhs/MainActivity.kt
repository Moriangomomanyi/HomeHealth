package com.example.hhs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getstarted = findViewById<Button>(R.id.button)
        getstarted.setOnClickListener {
            val i = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(i)
        }
    }
}