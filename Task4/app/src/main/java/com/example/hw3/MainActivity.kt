package com.example.hw3

import android.graphics.drawable.Drawable
import android.icu.text.CaseMap
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3.databinding.ActivityMainBinding
import com.example.hw3.databinding.ListTileBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var adapter:ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(binding.root)

        adapter = ItemAdapter()
        binding.list.adapter = adapter
        binding.list.layoutManager =LinearLayoutManager(this)

        adapter.submitList(listOf(
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", getDrawable(R.drawable.wido)),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", getDrawable(R.drawable.esh)),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
            PlaceholderItem(UUID.randomUUID().toString(),"TTH", "2015", null),
        ))


    }
}