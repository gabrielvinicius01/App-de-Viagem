package com.example.appoficial

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalhesPassagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_passagem)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val locais = listOf(
            Local("Norte", R.drawable.norte, 4.0),
            Local("Sul", R.drawable.sul, 4.5),
            Local("Sudeste", R.drawable.sudeste, 5.0),
            Local("Centro-Oeste", R.drawable.oeste, 3.5),
            Local("Nordeste", R.drawable.nordeste, 4.0)
        )

        val adapter = LocalAdapter(locais) { local ->
            val intent = Intent(this, DetalhesCidadeActivity::class.java)
            intent.putExtra("local", local.nome)
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                startActivity(Intent(this, SettingsActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

