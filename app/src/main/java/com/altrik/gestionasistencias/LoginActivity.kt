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

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)
    }

    private fun irRegistro() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        this.finish()
    }

    public fun validarLogin() {
        val campo_correo = findViewById<EditText>(R.id.InputCorreo)
        val campo_contrasena = findViewById<EditText>(R.id.InputContraseña)

        var correo = campo_correo.text.toString()
        var contrasena = campo_contrasena.text.toString()

        if (correo == "" || contrasena == "") {
            Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show()
            return
        }


    }
}