package com.example.remotecontroljoystick

import android.view.View
import android.widget.EditText
import androidx.lifecycle.ViewModel
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ViewModelApp : ViewModel() {
    /**
    // The IP and Port properties
    private var _editPort = MutableLiveData<Int>()
    private var _editIP = MutableLiveData<Int>()


    val editPort: LiveData<Int>
    get() = _editPort
    }

    val editIP: LiveData<Int>
    get() = _editIP
    }


     **/

    val vmIP = MutableLiveData<String>()
    val vmPort = MutableLiveData<Int>()

    fun onClick(){
        println("hello")
        println()
        val ip:String = vmIP.getValue().toString()
        val port = vmPort.getValue()
        println("i")
        if (ip != null) {
            println("p")
        }
        Model.initModel("ip",800)

    }


    val _isOn = MutableLiveData<String>()




    val isOn: LiveData<String>
        get() = Model.Current



}




