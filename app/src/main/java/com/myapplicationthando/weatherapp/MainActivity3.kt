package com.myapplicationthando.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnMainMenu : Button = findViewById<Button>(R.id.btnMainMenu)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val displayData :intent.getStringExtra("DISPLAY_DATA")
        tvDetails.text = displayData

        //val tvAvg = findViewbyId<TextView>(R.id.tvAvg)
            //val displayAverage = intent.getStringExtra("DISPLAY_DATA_AVG)
        //tvAvg.text = displayAverage

        btnMainMenu.setOnClickListener{
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(Intent)
        }
    }
}