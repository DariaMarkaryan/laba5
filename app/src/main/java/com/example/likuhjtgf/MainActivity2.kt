package com.example.likuhjtgf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.security.AccessController.getContext

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val mOnNavigationItemSelectedListener = findViewById<BottomNavigationView>(R.id.bottom_nav)

        button1.setOnClickListener{
            finish()
        }

        button2.setOnClickListener{
            startActivityForResult(Intent(getApplicationContext(), MainActivity3::class.java),2)
        }

        mOnNavigationItemSelectedListener.setOnClickListener{
            startActivity(Intent(getApplicationContext(), About::class.java))
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        when(resultCode){
            1->finish()
            }
    }

}