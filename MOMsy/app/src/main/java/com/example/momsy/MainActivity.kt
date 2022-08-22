 package com.example.momsy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //show layout file: activity main
        setContentView(R.layout.activity_main)

        //display customized to show ' hell from {name}
        //1 add button to layout

        //get a reference to button
        //2 set up logic to know when user taps on button
        findViewById<Button>(R.id.button).setOnClickListener {




            //change color of text
            Log.i("Mosunmola","Tapped on button")
            //get a reference to text view
            //set color of text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
    }
}