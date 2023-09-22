package com.example.hhs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val login = findViewById<Button>(R.id.button2)
        login.setOnClickListener {
            val i = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(i)
        }
        val register = findViewById<TextView>(R.id.textView5)
        register.setOnClickListener {
            val i = Intent(this@MainActivity2, MainActivity6::class.java)
            startActivity(i)
        }
        val resetpassword = findViewById<TextView>(R.id.textView6)
        resetpassword.setOnClickListener {
            val i = Intent(this@MainActivity2, MainActivity7::class.java)
            startActivity(i)
        }
    }
}