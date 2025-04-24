package com.example.qta

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.widget.Button
import android.content.Intent



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, IniciarSesionActivity::class.java)
            startActivity(intent)
        }
    }
}
