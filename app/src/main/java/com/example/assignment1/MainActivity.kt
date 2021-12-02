package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickRed=findViewById<TextView>(R.id.redButton)
        val clickBlue=findViewById<TextView>(R.id.blueText)
        val clickGreen=findViewById<TextView>(R.id.greenText)
        val clickResult=findViewById<TextView>(R.id.textResult)

        clickRed.setOnClickListener{
            clickResult.text="Red was Clicked"
        }
        clickBlue.setOnClickListener{
            clickResult.text="Blue was Clicked"
        }
        clickGreen.setOnClickListener{
            clickResult.text="Green was Clicked"
        }
    }
}