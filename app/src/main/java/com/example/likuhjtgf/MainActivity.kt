package com.example.likuhjtgf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_main)
        val mOnNavigationItemSelectedListener = findViewById<BottomNavigationView>(R.id.bottom_nav)

        button.setOnClickListener {
            startActivity(Intent(getApplicationContext(), MainActivity2::class.java))
        }

        mOnNavigationItemSelectedListener.setOnClickListener{
            startActivity(Intent(getApplicationContext(), About::class.java))
        }
    }
}