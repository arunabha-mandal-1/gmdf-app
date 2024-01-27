package com.example.gmdf.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gmdf.R
import com.example.gmdf.activity.StudentMainActivity
import com.example.gmdf.databinding.FragmentStudentRegisterBinding

class StudentRegisterFragment : Fragment() {

    private lateinit var binding: FragmentStudentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentRegisterBinding.inflate(layoutInflater, container, false)

        // dummy
        binding.apply {
            btnRegister.setOnClickListener {
                findNavController().navigate(R.id.action_studentRegisterFragment_to_studentSignupFragment)
            }
            ivStudentLogin.setOnClickListener {
                findNavController().navigate(R.id.action_studentRegisterFragment_to_studentLoginFragment)
            }
        }

        // dummy schools
        val schools =
            arrayListOf<String>("School 1", "School 2", "School 3", "School 4", "School 5")
        val schoolAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, schools)
        binding.actSchool.setAdapter(schoolAdapter)

        // not dummy classes
        val classes = arrayListOf<String>(
            "LKG",
            "UKG",
            "PP",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12"
        )
        val classAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, classes)
        binding.actClass.setAdapter(classAdapter)

        return binding.root
    }
}