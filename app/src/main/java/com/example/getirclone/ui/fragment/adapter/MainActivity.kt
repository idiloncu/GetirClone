package com.example.getirclone.ui.fragment.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getirclone.R
import com.example.getirclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


    }
}