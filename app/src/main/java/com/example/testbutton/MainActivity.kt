package com.example.testbutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun scienceMy(view: View) {
        val ScienceIntent = Intent(this, SecondActivity::class.java)
        startActivity(ScienceIntent)

    }
    fun starMy(view: View) {
        val myStar = Toast.makeText(applicationContext, "Space Stars", Toast.LENGTH_SHORT)

        myStar.show()
    }


}


