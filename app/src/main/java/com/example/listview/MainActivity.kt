package com.tutorialkart.androidlistview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.R
import com.example.listview.R.layout.listview_item
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {


    var array = arrayListOf(
        "Toronto",
        "Helsinki",
        "Hamburg",
        "Munich",
        "Wakanda",
        "Sydney",
        "Paris",
        "Cape Town",
        "Barcelona",
        "London",
        "Bangkok",
        "NY"
        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(
            this,

            R.layout.listview_item, array
        )

        val listView: ListView = findViewById(R.id.listview_item)
        listView.setAdapter(adapter)

        val ref= FirebaseDatabase.getInstance().getReference("ListView")

    }
}