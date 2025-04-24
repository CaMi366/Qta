package com.example.qta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IniciarSesionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etCommission = findViewById<EditText>(R.id.etCommission)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val commission = etCommission.text.toString()

            if (email.isEmpty() || commission.isEmpty()) {
                Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Navegar a DosMitadesActivity
                val intent = Intent(this, DosMitadesActivity::class.java)
                startActivity(intent)
                finish() // Opcional: cierra esta actividad para no volver atrás
            }
        }
    }
}