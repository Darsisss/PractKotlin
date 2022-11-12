package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioButtonApple_Click(view: View) {
        val imageViewMain: ImageView =findViewById(R.id.imageViewMain)
        imageViewMain.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.apple))
    }
    fun radioButtonPearClick(view: View) {
        val imageViewMain:ImageView=findViewById(R.id.imageViewMain)
        imageViewMain.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pear))
    }
    fun radioButtonGrape_Click(view: View) {
        val imageViewMain:ImageView=findViewById(R.id.imageViewMain)
        imageViewMain.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.grape))
    }
    fun checkBoxApple_Click(view: View) {
        var imageViewApple:ImageView=findViewById(R.id.imageViewApple)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.apple))
        val checkBoxApple: CheckBox =findViewById(R.id.checkBoxApple)
        if (checkBoxApple.isChecked==false)
            imageViewApple.setImageDrawable(null)
    }
    fun checkBoxPear_Click(view: View) {
        val imageViewPear:ImageView=findViewById(R.id.imageViewPear)
        imageViewPear.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pear))
        val checkBoxPear:CheckBox=findViewById(R.id.checkBoxPear)
        if (checkBoxPear.isChecked==false)
            imageViewPear.setImageDrawable(null)
    }
    fun checkBoxGrape_Click(view: View) {
        val imageViewGrape:ImageView=findViewById(R.id.imageViewGrape)
        imageViewGrape.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.grape))
        val checkBoxGrape:CheckBox=findViewById(R.id.checkBoxGrape)
        if (checkBoxGrape.isChecked==false)
            imageViewGrape.setImageDrawable(null)
    }
}