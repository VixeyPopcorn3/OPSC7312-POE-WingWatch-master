package com.example.opsc7312_poe_wingwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)

        val LogInbtn = findViewById<Button>(R.id.LogInbtn)
        val Registerbtn = findViewById<Button>(R.id.Registerbtn)

        LogInbtn.setOnClickListener()
        {
            startActivity(Intent(this@StartPage, LogInPage::class.java))
        }
        Registerbtn.setOnClickListener()
        {
            startActivity(Intent(this@StartPage, RegisterPage::class.java))
        }

    }
}