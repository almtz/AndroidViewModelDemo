package com.example.mvcdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvcdemo.model.MensajeModel
import com.example.mvcdemo.model.MensajesProvider

class MensajesViewModel : ViewModel() {
    val mensajesModelo = MutableLiveData<MensajeModel>()
    fun mensajeRandom(){
        val mensaje = MensajesProvider.randomMensaje()
        mensajesModelo.postValue(mensaje)
    }
}