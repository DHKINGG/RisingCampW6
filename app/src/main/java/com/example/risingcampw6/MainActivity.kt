package com.example.risingcampw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.risingcampw6.Fragment.HistoryFragment
import com.example.risingcampw6.Fragment.HomeFragment
import com.example.risingcampw6.Fragment.MyInfoFragment
import com.example.risingcampw6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction().add(binding.flMainHome.id, HomeFragment())
            .commit()
        binding.btnNav.setOnNavigationItemSelectedListener {
            replaceFragment(
                    when (it.itemId) {
                        R.id.menu_home -> HomeFragment()
                        R.id.menu_history -> HistoryFragment()
                        else -> MyInfoFragment()

                    }
                    )
            true
        }

    }


    private fun replaceFragment (fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(binding.flMainHome.id, fragment).commit()
    }
}