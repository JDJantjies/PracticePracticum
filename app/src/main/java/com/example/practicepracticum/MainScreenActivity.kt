package com.example.practicepracticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainScreenActivity : AppCompatActivity() {

    lateinit var NextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        NextButton = findViewById<Button>(R.id.nextPageButton)

        NextButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, DetailedViewActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
    }
}