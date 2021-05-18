package com.example.mvcdemo.model

import com.example.mvcdemo.R

class MensajesProvider {
    companion object {
        fun randomMensaje (): MensajeModel {
            val posicion = (mensajes.indices).random()

            return mensajes[posicion]
        }

        private val mensajes = listOf<MensajeModel>(
            MensajeModel(mensaje = "Frankly, my dear, I don’t give a damn.", imagen = R.drawable.franklyn),
            MensajeModel(mensaje = "May the Force be with you.", imagen = R.drawable.starwars),
            MensajeModel(mensaje = "You talking to me?", imagen = R.drawable.taxidriver),
            MensajeModel(mensaje = "E.T. phone home.", imagen = R.drawable.et),
            MensajeModel(mensaje = "Bond. James Bond.", imagen = R.drawable.bond),
            MensajeModel(mensaje = "Show me the money!", imagen = R.drawable.showmethemoney),
            MensajeModel(mensaje = "You can't handle the truth!", imagen = R.drawable.youcanthandlethetruth),
            MensajeModel(mensaje = "Mama always said life was like a box of\n" +
                    "chocolates. You never know what you're\n" +
                    "gonna get", imagen = R.drawable.forrestgump),
            MensajeModel(mensaje = "Keep your friends close, but your enemies\n" +
                    "closer.", imagen = R.drawable.padrino),
            MensajeModel(mensaje = "I´m Batman", imagen = R.drawable.batman),
            MensajeModel(mensaje = "Why So Serious???", imagen = R.drawable.darkknight),

            )
    }
}