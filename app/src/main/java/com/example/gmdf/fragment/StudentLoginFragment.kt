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
import com.example.gmdf.databinding.FragmentStudentLoginBinding

class StudentLoginFragment : Fragment() {

    private lateinit var binding: FragmentStudentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentLoginBinding.inflate(layoutInflater, container, false)

        // dummy
        binding.apply {
            btnLogin.setOnClickListener {
                startActivity(Intent(requireContext(), StudentMainActivity::class.java))
                requireActivity().finish()
            }
            tvRegister.setOnClickListener {
                findNavController().navigate(R.id.action_studentLoginFragment_to_studentRegisterFragment)
            }
        }


        return binding.root
    }
}