package com.example.task1

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.File.separator

class MainActivity : AppCompatActivity() {

    val list = mutableListOf<String>()
    // just list can't change
    //mutableList - can change

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editTextTextPersonName)
        val addButton: Button = findViewById(R.id.addbutton)
        addButton.setOnClickListener {
            list += editText.text.toString()
            editText.setText("")
        }

        val textView: TextView = findViewById(R.id.textView)
        val buttonShow: Button = findViewById(R.id.showbutton)
        buttonShow.setOnClickListener{
            list.sort()
            textView.text = list.joinToString (separator = "\n")
            list.clear()
        }
    }
}