package com.example.gmdf.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import com.example.gmdf.R
import com.example.gmdf.databinding.ActivitySchoolMainBinding
import com.example.gmdf.databinding.ActivityStartBinding
import com.example.gmdf.databinding.ActivityStudentMainBinding
import com.example.gmdf.fragment.StudentHomeFragment
import com.example.gmdf.fragment.StudentProfileFragment
import com.google.android.material.navigation.NavigationView

class StudentMainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityStudentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ivStudentProfile.setOnClickListener{
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                findNavController(R.id.fragmentContainerView2).navigate(R.id.action_studentHomeFragment_to_studentProfileFragment)
                binding.drawerLayout.closeDrawer(GravityCompat.START)
            }

            R.id.notices -> {
                Toast.makeText(this, "Notices!", Toast.LENGTH_SHORT).show()
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