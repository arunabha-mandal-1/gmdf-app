package com.example.gmdf.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gmdf.R
import com.example.gmdf.activity.SchoolMainActivity
import com.example.gmdf.databinding.FragmentSchoolSignupBinding

class SchoolSignupFragment : Fragment() {

    private lateinit var binding: FragmentSchoolSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSchoolSignupBinding.inflate(layoutInflater, container, false)

        // dummy
        binding.apply {
            btnSignUp.setOnClickListener {
                startActivity(Intent(requireContext(), SchoolMainActivity::class.java))
                requireActivity().finish()
            }
            ivSchoolRegister.setOnClickListener {
                findNavController().navigate(R.id.action_schoolSignupFragment_to_schoolRegisterFragment)
            }
        }

        return binding.root
    }

}