package com.example.forms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FormsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forms, container, false)
    }

    binding.button.setOnClickListener {

        var emptyfirstname = binding.nameInput.editText?.text.toString().isEmpty();
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

//    companion object {
//
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            FormsFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}