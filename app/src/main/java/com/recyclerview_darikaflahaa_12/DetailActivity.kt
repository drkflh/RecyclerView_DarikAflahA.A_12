package com.recyclerview_darikaflahaa_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val image = intent.getParcelableExtra<mobil>(MainActivity.INTENT_PARCELABLE)

        val img = findViewById<ImageView>(R.id.gambardetail)
        val nama = findViewById<TextView>(R.id.namadetail)
        val deskripsi = findViewById<TextView>(R.id.deskdetail)

        if (image != null) {
            img.setImageResource(image.foto)
            nama.text = image.nama
            deskripsi.text = image.deskripsi
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}