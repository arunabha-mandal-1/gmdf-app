package com.example.gmdf.adapter

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmdf.databinding.NotesItemBinding
import com.example.gmdf.model.Notes

class StudentNotesAdapter(
    private val context: Context,
    private var list: List<Notes>
) : RecyclerView.Adapter<StudentNotesAdapter.NoteViewHolder>() {
    inner class NoteViewHolder(val binding: NotesItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = NotesItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return NoteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.binding.tvNoteTitle.text = list[position].title
        holder.binding.tvTeacher.text = list[position].teacher
        holder.binding.tvSubject.text = list[position].subject

        val day = list[position].date?.day.toString()
        val month = list[position].date?.month.toString()
        val year = list[position].date?.year.toString()
        val dateString = "$day/$month/$year"

        holder.binding.tvDate.text = dateString
    }
}