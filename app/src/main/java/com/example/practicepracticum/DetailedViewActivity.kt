package com.example.practicepracticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    lateinit var BackButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_detailed_view)

        BackButton = findViewById<Button>(R.id.backButton)

        BackButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MainScreenActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
    }
}