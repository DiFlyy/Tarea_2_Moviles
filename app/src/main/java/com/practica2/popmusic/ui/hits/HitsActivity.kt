package com.practica2.popmusic.ui.hits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.practica2.popmusic.data.PopRepository
import com.practica2.popmusic.databinding.ActivityHitsBinding

class HitsActivity : AppCompatActivity() {
    private lateinit var b: ActivityHitsBinding
    private var decade: String = ""
    private var artist: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityHitsBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Extras recibidos
        decade = intent.getStringExtra("EXTRA_DECADE") ?: "80s"
        artist = intent.getStringExtra("EXTRA_ARTIST") ?: ""

        // Título con el artista
        b.tvArtist.text = "Canciones de $artist"

        // Obtén los hits (2 por artista)
        val hits = PopRepository.getSongsByArtist(decade, artist)

        if (hits.size >= 2) {
            // Texto de botones = nombre del hit
            b.btnHit1.text = hits[0].title
            b.btnHit2.text = hits[1].title

            // Al tocar, muestra trivia en un Snackbar
            b.btnHit1.setOnClickListener {
                Snackbar.make(b.root, hits[0].trivia, Snackbar.LENGTH_LONG).show()
            }
            b.btnHit2.setOnClickListener {
                Snackbar.make(b.root, hits[1].trivia, Snackbar.LENGTH_LONG).show()
            }
        } else {
            // Por si acaso (no debería pasar con el repo actual)
            b.btnHit1.isEnabled = false
            b.btnHit2.isEnabled = false
        }
    }
}
