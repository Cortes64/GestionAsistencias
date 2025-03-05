package com.altrik.gestionasistencias

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.sql.PreparedStatement
import java.sql.SQLException
import java.sql.Statement

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_layout)
    }

    private fun irInicioSesion() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        this.finish()
    }

    public fun validarSignIn() {
        val campo_correo = findViewById<EditText>(R.id.InputCorreo)
        val campo_contrasena = findViewById<EditText>(R.id.InputContraseña)
        val campo_repetir_contrasena = findViewById<EditText>(R.id.InputRepetirContraseña)

        var correo = campo_correo.text.toString()
        var contrasena = campo_contrasena.text.toString()
        var repetir_contrasena = campo_repetir_contrasena.text.toString()

        if (correo == "" || contrasena == "" || repetir_contrasena == "") {
            Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show()
            return
        }

        if (contrasena != repetir_contrasena) {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            return
        }
    }
}