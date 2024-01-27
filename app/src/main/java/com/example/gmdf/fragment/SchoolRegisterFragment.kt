package com.example.gmdf.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gmdf.R
import com.example.gmdf.databinding.FragmentSchoolRegisterBinding

class SchoolRegisterFragment : Fragment() {

    private lateinit var binding: FragmentSchoolRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSchoolRegisterBinding.inflate(layoutInflater, container, false)

        // dummy
        binding.apply {
            btnRegister.setOnClickListener {
                findNavController().navigate(R.id.action_schoolRegisterFragment_to_schoolSignupFragment)
            }
            ivSchoolLogin.setOnClickListener {
                findNavController().navigate(R.id.action_schoolRegisterFragment_to_schoolLoginFragment)
            }
        }

        return binding.root
    }

}