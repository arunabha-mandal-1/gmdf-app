package com.example.gmdf.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gmdf.R
import com.example.gmdf.databinding.FragmentSchoolHomeBinding

class SchoolHomeFragment : Fragment() {

    private lateinit var binding: FragmentSchoolHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSchoolHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}