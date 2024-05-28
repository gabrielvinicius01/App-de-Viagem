package com.example.appoficial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val createAccountTextView = findViewById<TextView>(R.id.createAccountTextView)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                // Navegar para a tela de detalhes da passagem
                val intent = Intent(this, DetalhesPassagemActivity::class.java)
                startActivity(intent)
            }
        }

        createAccountTextView.setOnClickListener {
            // Navegar para a tela de criação de conta (se houver)
            Toast.makeText(this, "Navegar para a criação de conta", Toast.LENGTH_SHORT).show()
        }
    }
}
