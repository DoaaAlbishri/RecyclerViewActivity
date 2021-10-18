package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    val arrayList = ArrayList<String>()
    lateinit var myRv : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        myRv = findViewById(R.id.myRV)
        val intent = intent
        val name = intent.getStringExtra("name")
        val loc = intent.getStringExtra("loc")
        val mobile = intent.getStringExtra("mobile")
        val email = intent.getStringExtra("email")
        val array = intent.getStringArrayListExtra("array")
        arrayList.addAll(array!!)
        myRv.adapter = RecyclerViewAdapter(arrayList!!)
        myRv.layoutManager = LinearLayoutManager(this)
    }
}