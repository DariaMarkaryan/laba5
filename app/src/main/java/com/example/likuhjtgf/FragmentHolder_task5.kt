package com.example.likuhjtgf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentHolder_task5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.for_fragments)
        val mOnNavigationItemSelectedListener = findViewById<BottomNavigationView>(
            R.id.bottomNavigationView
        )
        mOnNavigationItemSelectedListener.setOnClickListener{
            startActivity(Intent(getApplicationContext(), About::class.java))
        }
    }



}