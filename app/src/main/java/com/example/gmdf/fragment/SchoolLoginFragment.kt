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
import com.example.gmdf.databinding.FragmentSchoolLoginBinding

class SchoolLoginFragment : Fragment() {

    private lateinit var binding: FragmentSchoolLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSchoolLoginBinding.inflate(layoutInflater, container, false)

        // dummy
        binding.apply {
            btnLogin.setOnClickListener {
                startActivity(Intent(requireContext(), SchoolMainActivity::class.java))
                requireActivity().finish()
            }
            tvRegister.setOnClickListener {
                findNavController().navigate(R.id.action_schoolLoginFragment_to_schoolRegisterFragment)
            }
        }

        return binding.root
    }

}