package com.example.gmdf.fragment

import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gmdf.R
import com.example.gmdf.databinding.FragmentStudentHomeBinding

class StudentHomeFragment : Fragment() {

    private lateinit var binding: FragmentStudentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStudentHomeBinding.inflate(layoutInflater, container, false)

        binding.mcvNotes.setOnClickListener {
            findNavController().navigate(R.id.action_studentHomeFragment_to_studentNotesFragment)
        }

        return binding.root
    }
}