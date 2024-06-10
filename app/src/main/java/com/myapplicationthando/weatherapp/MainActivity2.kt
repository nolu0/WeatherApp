package com.myapplicationthando.weatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast




}

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val dateTime = findViewById<TextView>(R.id.Date)
        val amTimeTv = findViewById<TextView>(R.id.txtTimeAm)
        val pmTimeTv = findViewById<TextView>(R.id.txtTimepm)
        val NotesTv = findViewById<TextView>(R.id.Notes)

        //Initialize them
        var i: Int = 0// stores number of entries
        var display: String = ""// display  blank first in array
        val maxEntries = 7 // on;y allow 7 array entries

        var averageAm: Int = 0
        var averagePm: Int = 0
        var averageTotal: Int = 0
        var displayAverage: String = ""

        // Create arrays
        val day = Array(maxEntries) { "" }
        val morningTime = Array(maxEntries) { 0 }
        val afternoonTime = Array(maxEntries) { 0 }
        val Notes = Array(maxEntries) { 0 }

        val btnInsert: Button = findViewById<Button>(R.id.btnInsert)
        val btnDetails: Button = findViewById<Button>(R.id.btnDeatails)
        val btnClear: Button = findViewById<Button>(R.id.btnClear)

        btnInsert.setOnClickListener {
            // check if there`s enough entries
            if (i < maxEntries) {
                //convert to display types
                day[i] = dateTime.text.toString()
                morningTime[i] =
                    amTimeTv.text.toString().toIntOrNull()!!
                afternoonTime[i] =
                    pmTimeTv.text.toString().toIntOrNull()!!
                Notes[i] = NotesTv.text.toString().
                i++ // Increment entry number

                Toast.makeText(this, "Entry added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Maximum Entries reached", Toast.LENGTH_SHORT).show()
            }
        }
        // clear the text views
        btnClear.setOnClickListener {
            dateTime.text = ""
            amTimeTv.text = ""
            pmTimeTv.text = ""
            NotesTv.text = ""


        }
        //Button to navigate to details View
        btnDetails.setOnClickListener {
            display = ""
            for (counter in 0 until 1) {
                display += "Date: ${day[counter]}\nAm Time ; $" { morningTime[counter] }\nPm Time: ${ afternoonTime[counter] }
                averageAm += morningTime[counter]
                averagePm += afternoonTime[counter]
                averageTotal += morningTime[counter] + afternoonTime[counter]

            }
            averageTotal /= i
            averageAm /= i
            averagePm /= i

            displayAverage = "AverageTime (Am):"
            display += displayAverage
            //pass the date to DetailedViewActivity
            val DetailedViewActivity = null
            val intent = Intent(this, DetailedViewActivity)
            intent.putExtra("Display DATA", displayAverage)
            intent.putExtra("DISPLAY _DATA_AVG", display)
            startActivity(Intent)
        }
    }

        }


