package com.example.likuhjtgf

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity_task4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_main)
        val mOnNavigationItemSelectedListener = findViewById<BottomNavigationView>(R.id.bottom_nav)

        button.setOnClickListener {
            val intent = Intent(getApplicationContext(), MainActivity2::class.java)
            intent.addFlags(FLAG_ACTIVITY_NEW_TASK and FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        mOnNavigationItemSelectedListener.setOnClickListener{
            startActivity(Intent(getApplicationContext(), About::class.java))
        }
    }
}