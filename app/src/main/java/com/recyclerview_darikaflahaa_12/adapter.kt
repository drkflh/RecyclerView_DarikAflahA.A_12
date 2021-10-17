package com.recyclerview_darikaflahaa_12

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter (private val context: Context, private val images: List<mobil>, val listener: (mobil) -> Unit)
    : RecyclerView.Adapter<adapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageSrc = view.findViewById<ImageView>(R.id.fotoitem)
        val title = view.findViewById<TextView>(R.id.namaitemm)
        val deskripsi = view.findViewById<TextView>(R.id.deskripsiitemm)
        fun bindView(image: mobil, listener: (mobil) -> Unit) {
            imageSrc.setImageResource(image.foto)
            title.text = image.nama
            deskripsi.text = image.deskripsi
            itemView.setOnClickListener { listener(image) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.imgitem, parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }
}