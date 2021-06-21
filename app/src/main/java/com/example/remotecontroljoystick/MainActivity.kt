package com.example.remotecontroljoystick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.remotecontroljoystick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProviders.of(this).get(ViewModelApp::class.java)

        DataBindingUtil.setContentView<ActivityMainBinding>(
            this, R.layout.activity_main
        ).apply {
            this.setLifecycleOwner(this@MainActivity)
            this.viewModel = mainViewModel
        }



        findViewById<Button>(R.id.button).setOnClickListener{
                onClick(it)
        }
    }

    // called when clicking on the connect button
    public final fun onClick(view: View) {
        println("before")
        val IP: String= view.findViewById<EditText>(R.id.IPAddress).toString()
        val Port:Int = view.findViewById<EditText>(R.id.Port).toString().toInt()
        println("model")
    }


}