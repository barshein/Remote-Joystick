package com.example.remotecontroljoystick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // called when clicking on the connect button
    fun onClick(view: View) {
        val IP = view.findViewById<EditText>(R.id.IPAddress)
        val Port = view.findViewById<EditText>(R.id.Port)
        model.connect(IP.toString().toInt(), Port.toString().toInt())
    }
}