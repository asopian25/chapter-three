package com.sopian.chapterthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var usernameTextView: TextView
    lateinit var passwordTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent.apply {
            usernameTextView = findViewById(R.id.username_text_view)
            usernameTextView.text = getStringExtra("username")

            passwordTextView = findViewById(R.id.password_text_view)
            passwordTextView.text = getStringExtra("password")
        }
    }
}