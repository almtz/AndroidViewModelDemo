package com.example.mvcdemo.model

class MensajesProvider {
    companion object {
        fun randomMensaje (): MensajeModel {
            val posicion = (mensajes.indices).random()

            return mensajes[posicion]
        }

        private val mensajes = listOf<MensajeModel>(
            MensajeModel(mensaje = "Frankly, my dear, I don’t give a damn."),
            MensajeModel(mensaje = "May the Force be with you."),
            MensajeModel(mensaje = "You talking to me?"),
            MensajeModel(mensaje = "E.T. phone home."),
            MensajeModel(mensaje = "Bond. James Bond."),
            MensajeModel(mensaje = "Show me the money!"),
            MensajeModel(mensaje = "You can't handle the truth!"),
            MensajeModel(mensaje = "Mama always said life was like a box of\n" +
                    "chocolates. You never know what you're\n" +
                    "gonna get"),
            MensajeModel(mensaje = "Keep your friends close, but your enemies\n" +
                    "closer."),
            MensajeModel(mensaje = "I´m Batman"),
            MensajeModel(mensaje = "Why So Serious???"),

            )
    }
}