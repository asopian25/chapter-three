package com.sopian.chapterthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.sopian.chapterthree.databinding.ActivityLoginBinding
import com.sopian.chapterthree.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Parcelable
        val authData = intent.getParcelableExtra<Auth>("auth")
        val username = authData?.username
        val password = authData?.password

        with(binding) {
            usernameTextView.text = username
            passwordTextView.text = password
        }
    }
}