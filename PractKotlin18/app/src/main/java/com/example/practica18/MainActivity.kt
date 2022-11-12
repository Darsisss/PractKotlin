package com.example.practica18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentSendDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView2) as TextViewFragment?
        fragment?.setSelectedItem(selectedItem)
    }

}