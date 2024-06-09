package com.example.practicepracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var ProceedButton: Button
    lateinit var ExitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ProceedButton = findViewById<Button>(R.id.proceedButton)
        ExitButton = findViewById<Button>(R.id.exitButton)

        ProceedButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MainScreenActivity::class.java)

            // start your next activity
            startActivity(intent)

            ExitButton.setOnClickListener {
                // exit the application
            }
        }
    }
}