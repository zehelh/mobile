package com.example.forms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.core.view.isEmpty
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.forms.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)


        supportFragmentManager.commit {
            add<FormsFragment>(R.id.fragmentContainerView)
            setReorderingAllowed(true)
            addToBackStack("name") // name can be null
            addToBackStack("firstname") // firstname can be null

        }

    }
}

