package com.practica2.popmusic.ui.artists

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.practica2.popmusic.data.PopRepository
import com.practica2.popmusic.databinding.ActivityArtistsBinding
import com.practica2.popmusic.ui.hits.HitsActivity

class ArtistsActivity : AppCompatActivity() {
    private lateinit var b: ActivityArtistsBinding
    private var decade: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        com.practica2.popmusic.util.ThemeHelper.applyTheme(this)
        super.onCreate(savedInstanceState)
        b = ActivityArtistsBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Recupera la década enviada desde DecadesActivity
        decade = intent.getStringExtra("EXTRA_DECADE") ?: "80s"

        // Obtiene los artistas de esa década
        val artists = PopRepository.getArtistsByDecade(decade)

        // Asigna nombres a los TextViews
        if (artists.size >= 2) {
            b.tvArtist1.text = artists[0]
            b.tvArtist2.text = artists[1]

            // Asigna imágenes (pon los drawables correctos según el artista)
            when (artists[0]) {
                "Michael Jackson" -> b.btnArtist1.setImageResource(com.practica2.popmusic.R.drawable.ic_mj)
                "Madonna" -> b.btnArtist1.setImageResource(com.practica2.popmusic.R.drawable.ic_madonna)
                "Lady Gaga" -> b.btnArtist1.setImageResource(com.practica2.popmusic.R.drawable.ic_gaga)
                "Bruno Mars" -> b.btnArtist1.setImageResource(com.practica2.popmusic.R.drawable.ic_bruno)
            }

            when (artists[1]) {
                "Michael Jackson" -> b.btnArtist2.setImageResource(com.practica2.popmusic.R.drawable.ic_mj)
                "Madonna" -> b.btnArtist2.setImageResource(com.practica2.popmusic.R.drawable.ic_madonna)
                "Lady Gaga" -> b.btnArtist2.setImageResource(com.practica2.popmusic.R.drawable.ic_gaga)
                "Bruno Mars" -> b.btnArtist2.setImageResource(com.practica2.popmusic.R.drawable.ic_bruno)
            }

            // Navegación hacia HitsActivity
            b.btnArtist1.setOnClickListener { openHits(artists[0]) }
            b.btnArtist2.setOnClickListener { openHits(artists[1]) }
        }

        // Muestra en el título qué década es
        b.tvDecade.text = "Artistas de los $decade"
    }

    private fun openHits(artist: String) {
        val intent = Intent(this, HitsActivity::class.java)
        intent.putExtra("EXTRA_DECADE", decade)
        intent.putExtra("EXTRA_ARTIST", artist)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}
