package com.example.likuhjtgf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3_task3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button1 = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button)
        val mOnNavigationItemSelectedListener = findViewById<BottomNavigationView>(R.id.bottom_nav)


        button2.setOnClickListener{
           finish()
        }

        button1.setOnClickListener{
            val intent = Intent(this, MainActivity_task3::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            }

        mOnNavigationItemSelectedListener.setOnClickListener{
            startActivity(Intent(getApplicationContext(), About::class.java))
        }
    }
}