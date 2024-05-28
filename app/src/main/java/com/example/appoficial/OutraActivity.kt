package com.example.appoficial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OutraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        val local = intent.getStringExtra("local")
        // Faça algo com a informação do local
    }
}
