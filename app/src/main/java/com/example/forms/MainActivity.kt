package com.example.forms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate

class MainActivity : AppCompatActivity() {
    //override fun onCreate(savedInstanceState: Bundle?) {
    //   super.onCreate(savedInstanceState)
    //   setContentView(R.layout.activity_main)
    //}

    private lateinit var binding: ResultProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ResultProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}

class ResultProfileBinding {

}

