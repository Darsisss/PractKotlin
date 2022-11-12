package com.example.p10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonOnClick(view: View)
    {
        val button1: Button =findViewById(R.id.button2)
        val button2: Button=findViewById(R.id.button1)
        button1.visibility=View.GONE
        button2.visibility=View.VISIBLE
    }
    fun buttonOnClick1(view:View)
    {
        val button1: Button=findViewById(R.id.button2)
        val button2: Button=findViewById(R.id.button1)
        button1.visibility=View.VISIBLE
        button2.visibility=View.GONE
    }

}