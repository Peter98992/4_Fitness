package com.example.a4fitness_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //OPENS SETTINGS ACTIVITY
    val settingsImageView = findViewById<ImageView>(R.id.image_settings)

        settingsImageView.setOnClickListener{
            val intentForSettings = Intent(this, activity_settings::class.java)
            startActivity(intentForSettings)
        }

    }
}