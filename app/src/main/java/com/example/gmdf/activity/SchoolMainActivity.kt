package com.example.gmdf.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.gmdf.R
import com.example.gmdf.databinding.ActivitySchoolMainBinding
import com.google.android.material.navigation.NavigationView

class SchoolMainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {

    private lateinit var binding: ActivitySchoolMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySchoolMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivSchoolProfile.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                Toast.makeText(this, "Open Profile!", Toast.LENGTH_SHORT).show()
            }

            R.id.notices -> {
                Toast.makeText(this, "Post Notices!", Toast.LENGTH_SHORT).show()
            }

            R.id.enquire -> {
                Toast.makeText(this, "Enquire to Admin!", Toast.LENGTH_SHORT).show()
            }

            R.id.rateUs -> {
                Toast.makeText(this, "Rate us!", Toast.LENGTH_SHORT).show()
            }

            R.id.shareApp -> {
                Toast.makeText(this, "Share GMDF app!", Toast.LENGTH_SHORT).show()
            }

            R.id.developers -> {
                Toast.makeText(this, "Developers!", Toast.LENGTH_SHORT).show()
            }

            R.id.logOut -> {
                Toast.makeText(this, "Logged Out!", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}