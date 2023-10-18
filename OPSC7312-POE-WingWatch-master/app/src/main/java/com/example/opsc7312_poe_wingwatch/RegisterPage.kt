package com.example.opsc7312_poe_wingwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        val Registerbtn = findViewById<Button>(R.id.Registerbtn)
        val Backbtn = findViewById<Button>(R.id.backbtn)

        Registerbtn.setOnClickListener()
        {
            register()
        }
        Backbtn.setOnClickListener()
        {
            startActivity(Intent(this@RegisterPage, StartPage::class.java))
        }

    }
    private fun register()
    {
        //register Logic
        startActivity(Intent(this@RegisterPage, StartPage::class.java))
    }
}