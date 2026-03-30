package com.example.assignment1timeofday

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var etTime: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnShow: Button
    private lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the components
        etTime = findViewById(R.id.etTime)
        tvResult = findViewById(R.id.tvResult)
        btnShow = findViewById(R.id.btnShow)
        btnReset = findViewById(R.id.btnReset)

        btnShow.setOnClickListener {
            val time = etTime.text.toString().lowercase()

            if (time == "morning") {
                tvResult.text = "Send a Good morning message"
            } else if (time == "mid-morning") {
                tvResult.text = "Send a thank you message to someone"
            } else if (time == "afternoon") {
                tvResult.text = "Share a funny meme with a friend"
            } else if (time == "snack") {
                tvResult.text = "Send a thinking of you message"
            } else if (time == "dinner") {
                tvResult.text = "Call a friend for a short catch up"
            } else if (time == "night") {
                tvResult.text = "Leave a comment on a friend's post"
            } else {
                tvResult.text = "Invalid input. Try morning, afternoon, dinner"
            }
        }

        btnReset.setOnClickListener {
            etTime.text.clear()
            tvResult.text = ""
        }
    }
}