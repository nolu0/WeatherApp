package com.myapplicationthando.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity()

//declares
lateinit var  exitbutton : Button
lateinit var mainbutton : Button

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    // Initialising buttons
    exitbutton = findbyId(R.id.Exitbutton)
    mainbutton = findbyId(R.id.mainbutton)
    startActivity(Intent)

    // enabling buttons to be clicked on
    exitbutton.setOnClickListener {
        mainbutton.setOnClickListener {
            exitProcess(0)

        }


    }
    }

fun setContentView(activityMain: Int) {
    TODO("Not yet implemented")
}

fun findbyId(exitbutton: Int): Button {

    return TODO("Provide the return value")
}
