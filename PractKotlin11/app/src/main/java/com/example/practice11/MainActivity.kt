package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var isOn : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var imageButton: ImageButton = findViewById(R.id.imageButton) //Раскомментировать для сдачи номера 1
        //imageButton.setImageResource(R.drawable.btn_check_buttonless_off)
    }
    fun loadImageButton(view: View){
        var image2: ImageView = findViewById(R.id.imageView2)
        image2.setImageResource(R.drawable.grape)
        image2.contentDescription = "This is grape photo"
    }
    fun loadImageIntoButton(view: View){
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        if(isOn){
            imageButton.setImageResource(R.drawable.btn_check_buttonless_off)
            isOn = false
        }
        else{
            imageButton.setImageResource(R.drawable.btn_check_buttonless_on)
            isOn = true
        }
    }
}