package com.example.forms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.example.forms.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.submit.setOnClickListener {
            if (binding.nameInput.textfield.isEmpty() || binding.firstnameInput.text.isEmpty()) {
                val myToast = Toast.makeText(applicationContext, "Ce champ est vide", Toast.LENGTH_SHORT)
                myToast.setGravity(Gravity.LEFT, 200, 200)
                myToast.show()
            } else {
                val activity2 = Intent(this, MainActivity2::class.java)
                activity2.putExtra("firstname", binding.firstnameInput.text)
                activity2.putExtra("name", binding.nameInput.text)
                startActivity(activity2)
            }

        }

    }
}

