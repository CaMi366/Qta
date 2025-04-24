package com.example.qta

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DosMitadesActivity : AppCompatActivity() {

    // Declara todas las vistas como propiedades de clase
    private lateinit var editTextCadena: EditText
    private lateinit var botonSolucionar: Button
    private lateinit var textViewResultado: TextView
    private lateinit var errorTextView: TextView  // Añade esta línea

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dosmitades)

        // Inicializa todas las vistas usando las propiedades de clase
        editTextCadena = findViewById(R.id.editTextCadena)
        botonSolucionar = findViewById(R.id.botonSolucionar)
        textViewResultado = findViewById(R.id.textViewResultado)
        errorTextView = findViewById(R.id.textViewError)  // Inicializa correctamente

        botonSolucionar.setOnClickListener {
            val cadenaIngresada = editTextCadena.text.toString()
            val resultado = dividirYReordenarCadena(cadenaIngresada)

            if (resultado != null) {
                textViewResultado.text = resultado
                textViewResultado.visibility = View.VISIBLE
                errorTextView.visibility = View.GONE
            } else {
                errorTextView.text = "Ups! algo salió mal revisa tu cadena."
                errorTextView.visibility = View.VISIBLE
                textViewResultado.visibility = View.GONE
            }
        }
    }

    private fun dividirYReordenarCadena(cadena: String): String {
        val longitud = cadena.length
        if (longitud < 2) {
            return cadena
        }

        val mitad = longitud / 2
        val primeraMitad: String
        val segundaMitad: String

        if (longitud % 2 == 0) {
            primeraMitad = cadena.substring(0, mitad)
            segundaMitad = cadena.substring(mitad)
        } else {
            primeraMitad = cadena.substring(0, mitad + 1)
            segundaMitad = cadena.substring(mitad + 1)
        }

        return segundaMitad + primeraMitad
    }
}