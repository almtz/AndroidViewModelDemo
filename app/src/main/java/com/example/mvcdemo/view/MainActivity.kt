package com.example.mvcdemo.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mvcdemo.R
import com.example.mvcdemo.databinding.ActivityMainBinding
import com.example.mvcdemo.viewmodel.MensajesViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val mensajesViewModel : MensajesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        setContentView(binding.root)
        mensajesViewModel.mensajesModelo.observe(
            this, Observer { objectoModelo ->
                //Actualización la GUI
                binding.texto.text = objectoModelo.mensaje
                binding.container.setBackgroundResource(objectoModelo.imagen)
            })

        binding.container.setOnClickListener{ mensajesViewModel.mensajeRandom() }
    }
}