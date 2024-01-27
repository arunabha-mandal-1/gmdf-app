package com.example.gmdf.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gmdf.R
import com.example.gmdf.activity.StudentMainActivity
import com.example.gmdf.databinding.FragmentStudentSignupBinding

class StudentSignupFragment : Fragment() {

    private lateinit var binding: FragmentStudentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentSignupBinding.inflate(layoutInflater, container, false)

        // dummy
        binding.apply {
            btnSignUp.setOnClickListener {
                startActivity(Intent(requireContext(), StudentMainActivity::class.java))
                requireActivity().finish()
            }
            ivStudentRegister.setOnClickListener {
                findNavController().navigate(R.id.action_studentSignupFragment_to_studentRegisterFragment)
            }
        }

        return binding.root
    }
}