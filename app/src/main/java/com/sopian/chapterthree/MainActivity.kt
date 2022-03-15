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

        // Bundle
        val bundle = intent.extras
        val username = bundle?.getString("username")
        val password = bundle?.getString("password")

        with(binding) {
            usernameTextView.text = username
            passwordTextView.text = password
        }
    }
}