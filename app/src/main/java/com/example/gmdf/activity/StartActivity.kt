package com.example.gmdf.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.gmdf.R
import com.example.gmdf.databinding.ActivityStartBinding
import com.example.gmdf.utils.Utils

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // dummy
        val radioGroup = binding.radioGrp
        binding.btnCont.setOnClickListener {
            when (radioGroup.checkedRadioButtonId) {
                R.id.rbSchool -> {
                    startActivity(
                        Intent(this, SchoolAuthMainActivity::class.java)
                    )
                }
                R.id.rbStudent -> {
                    startActivity(
                        Intent(this, StudentAuthMainActivity::class.java)
                    )
                }

                // when none is selected?
            }
        }
    }
}