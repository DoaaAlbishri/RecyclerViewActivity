package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var ETname :EditText
    lateinit var ETloc :EditText
    lateinit var ETmobile :EditText
    lateinit var ETemail :EditText
    lateinit var button :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ETname = findViewById(R.id.ETname)
        ETloc = findViewById(R.id.ETloc)
        ETmobile = findViewById(R.id.ETmobile)
        ETemail = findViewById(R.id.ETemail)
        button = findViewById(R.id.button)
        button.setOnClickListener {
        val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("name",ETname.text.toString())
            intent.putExtra("loc",ETloc.text.toString())
            intent.putExtra("mobile",ETmobile.text.toString())
            intent.putExtra("email",ETemail.text.toString())
            intent.putExtra("array", arrayListOf(ETname.text.toString() +"\n"+ETloc.text.toString() +"\n"
                +ETmobile.text.toString()+"\n"+ETemail.text.toString()))
            startActivity(intent)
        }
    }
}