package com.example.intro_to_world

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

//This Kotlin file will handle our user interaction
class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //User can tap a button to change the text color of the label
        // 1. Add a button to layout

        //Get a reference to button
        //2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // 1. Handles button tap
            // 2. Change the color of the text
            Log.i("Rahma", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set up the color of the text view

            //Get a reference to background view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.gold))
            }

            findViewById<Button>(R.id.button2).setOnClickListener {
                Log.i("Rahma", "Changed background view")
                findViewById<View>(R.id.backgroundView).setBackgroundColor(R.color.blue_200)
            }
        }


    }
