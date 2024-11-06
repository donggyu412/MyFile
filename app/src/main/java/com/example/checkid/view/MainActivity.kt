package com.example.checkid.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.checkid.R
import com.example.checkid.databinding.ActivityMainBinding
import com.example.checkid.view.fragment.EmptyFragment
import com.example.checkid.view.fragment.NotificationFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.activity_main_FragmentContainerView, EmptyFragment())
            .commit()

        binding.bottomNavigationView.setOnItemSelectedListener {
            item -> when (item.itemId) {
                R.id.page_home -> {
                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.activity_main_FragmentContainerView, EmptyFragment())
                        .commit()

                    true
                }

                R.id.page_statistics -> {
                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.activity_main_FragmentContainerView, EmptyFragment())
                        .commit()

                    true
                }

                R.id.page_notification -> {
                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.activity_main_FragmentContainerView, NotificationFragment())
                        .commit()

                    true
                }

                R.id.page_setting -> {
                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.activity_main_FragmentContainerView, EmptyFragment())
                        .commit()

                    true
                }

                else -> false
            }
        }
    }
}