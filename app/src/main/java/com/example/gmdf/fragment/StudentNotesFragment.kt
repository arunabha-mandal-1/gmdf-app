package com.example.gmdf.fragment

import android.icu.text.DateFormat
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gmdf.R
import com.example.gmdf.adapter.StudentNotesAdapter
import com.example.gmdf.databinding.FragmentStudentNotesBinding
import com.example.gmdf.model.Notes
import java.util.Date

class StudentNotesFragment : Fragment() {

    private lateinit var binding: FragmentStudentNotesBinding
    private lateinit var notesList: ArrayList<Notes>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStudentNotesBinding.inflate(layoutInflater, container, false)

        val note1 = Notes("Introduction to Mathematics", "S.S", "Math", Date(2021, 10, 7))
        val note2 = Notes("Introduction to Geography", "A.B", "Geography", Date(2022, 12, 13))
        val note3 = Notes("Introduction to Biology", "L.G", "Biology", Date(2020, 12, 1))
        val note4 = Notes("Introduction to Physics", "J.S", "Physics", Date(2019, 5, 5))
        notesList = arrayListOf(note1, note2, note3, note4)
        binding.recyclerView.adapter = StudentNotesAdapter(requireContext(), notesList)

        return binding.root
    }
}