package com.example.appoficial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetalhesCidadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_cidade)

        val regiao = intent.getStringExtra("local")
        // Agora você pode usar a variável região para exibir o nome da região na tela
        // Exemplo: Se você tiver um TextView com o id "regiaoTextView", você pode definir o texto assim:
        // val regiaoTextView = findViewById<TextView>(R.id.regiaoTextView)
        // regiaoTextView.text = regiao
    }
}
