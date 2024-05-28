package com.example.appoficial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LocalAdapter(
    private val locais: List<Local>,
    private val clickListener: (Local) -> Unit
) : RecyclerView.Adapter<LocalAdapter.LocalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_local, parent, false)
        return LocalViewHolder(view)
    }

    override fun onBindViewHolder(holder: LocalViewHolder, position: Int) {
        holder.bind(locais[position], clickListener)
    }

    override fun getItemCount(): Int {
        return locais.size
    }

    class LocalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val localImageView: ImageView = itemView.findViewById(R.id.localImageView)
        private val localTextView: TextView = itemView.findViewById(R.id.localTextView)
        private val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)

        fun bind(local: Local, clickListener: (Local) -> Unit) {
            localImageView.setImageResource(local.imagem)
            localTextView.text = local.nome
            ratingBar.rating = local.avaliacao.toFloat()

            // Adiciona um listener de clique ao item local
            itemView.setOnClickListener { clickListener(local) }
        }
    }
}
