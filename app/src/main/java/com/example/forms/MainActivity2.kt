package com.example.forms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.forms.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {


    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val firstname:String = intent.extras?.get("firstname").toString()
        val name:String = intent.extras?.get("name").toString()

        binding.firstnamevalue2.text = firstname
        binding.namevalue2.text = name
    }
}