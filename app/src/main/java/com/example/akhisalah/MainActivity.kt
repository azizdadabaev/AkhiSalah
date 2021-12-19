package com.example.akhisalah

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.akhisalah.fragments.FavoritesFragment
import com.example.akhisalah.fragments.HomeFragment
import com.example.akhisalah.fragments.QiblaFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val qiblaFragment = QiblaFragment()
        val favoritesFragment = FavoritesFragment()

        makeCurrentFragment(homeFragment)

        val bottomNavigation = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_compass -> makeCurrentFragment(qiblaFragment)
                R.id.ic_fav -> makeCurrentFragment(favoritesFragment)
            }
            true
        }


    }

    private fun makeCurrentFragment(fragment:Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}