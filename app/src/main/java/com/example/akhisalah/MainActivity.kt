package com.example.akhisalah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.akhisalah.fragments.FavFragment
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



    }

    private fun makeCurrentFragment(fragment:Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}