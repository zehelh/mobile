package com.example.forms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isEmpty
import com.example.forms.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.submit.setOnClickListener {

            var emptyfirstname = binding.firstnameInput.editText?.text.toString().isEmpty();
            var emptyname = binding.nameInput.editText?.text.toString().isEmpty();
            binding.firstnameInput.error = null
            binding.nameInput.error = null
            var validate = true;

            if(emptyfirstname){

                binding.firstnameInput.error = getString(R.string.error)
                validate = false

            }
            if(emptyname){

                binding.nameInput.error = getString(R.string.error)
                validate = false
            }

            if(validate){
                val activity2 = Intent(this, MainActivity2::class.java)
                activity2.putExtra("firstname", binding.firstnameInput.editText?.text.toString())
                activity2.putExtra("name", binding.nameInput.editText?.text.toString())
                startActivity(activity2)
            }

        }

    }
}

