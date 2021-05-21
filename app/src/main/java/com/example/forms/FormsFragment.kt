package com.example.forms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.forms.databinding.FragmentFormsBinding

class FormsFragment : Fragment() {

    var binding : FragmentFormsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        binding = ResultProfileBinding.inflate(inflater, container, false)

        binding.submit.setOnClickListener {

            val view = binding.root

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

                activity.navigateToResult()
            }

        }

        return inflater.inflate(R.layout.fragment_forms, container, false)
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

private fun FragmentActivity?.navigateToResult() {

    this?.supportFragmentManager?.commit {
        add<FormsFragment>(R.id.fragmentContainerView)
        setReorderingAllowed(true)
        addToBackStack("name") // name can be null
        addToBackStack("firstname") // firstname can be null

    }
}
