package com.example.forms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.forms.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.submit.setOnClickListener {
            val activity2 = Intent(this, MainActivity2::class.java)
            activity2.putExtra("firstname", binding.firstnameInput.text)
            activity2.putExtra("name", binding.nameInput.text)
            startActivity(activity2)
        }

    }
}

