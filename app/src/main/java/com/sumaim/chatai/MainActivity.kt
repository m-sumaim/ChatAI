package com.sumaim.chatai


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.sumaim.chatai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.GenerateImage.setOnClickListener {
            startActivity(Intent(this, ImageGenerateActivity::class.java))
        }

        binding.GenerateImage.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }


    }
}