package com.example.task2

import android.os.Build
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)

        val text = "${ Build.BRAND} ${Build.MODEL}\n Android ${Build.VERSION.RELEASE} SDK(${Build.VERSION.SDK_INT})"
        val duration = Toast.LENGTH_SHORT

        button.setOnClickListener {
            val toast = Toast.makeText(applicationContext, text,duration)
            toast.show()
        }
    }
}