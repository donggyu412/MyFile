package com.example.checkid.view

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.naver.maps.map.MapFragment
import com.example.checkid.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_main.xml 레이아웃을 설정
        setContentView(R.layout.activity_main)

        // 버튼 클릭 이벤트 설정
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            showMap()
        }

        // BottomNavigationView 설정
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_record -> {
                    // Record 페이지 로직
                    true
                }
                R.id.menu_home -> {
                    // Home 페이지 로직
                    true
                }
                R.id.menu_statistics -> {
                    // Statistics 페이지 로직
                    true
                }
                else -> false
            }
        }
    }

    private fun showMap() {
        val fragmentManager: FragmentManager = supportFragmentManager
        var mapFragment = fragmentManager.findFragmentById(R.id.map_fragment) as? MapFragment

        if (mapFragment == null) {
            mapFragment = MapFragment.newInstance()
            fragmentManager.beginTransaction()
                .replace(R.id. mapFragment)
                .commit()
        }

        findViewById<View>(R.id.map_fragment).visibility = View.VISIBLE

        mapFragment.getMapAsync { naverMap ->
            // 필요 시 지도 설정 코드
        }
    }
}
