package com.practica2.popmusic.ui.decades

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.practica2.popmusic.databinding.ActivityDecadesBinding
import com.practica2.popmusic.ui.artists.ArtistsActivity

class DecadesActivity : AppCompatActivity() {
    private lateinit var b: ActivityDecadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDecadesBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Navegación hacia ArtistsActivity
        b.btn80s.setOnClickListener { openArtists("80s") }
        b.btn2010s.setOnClickListener { openArtists("2010s") }
    }

    private fun openArtists(decade: String) {
        val intent = Intent(this, ArtistsActivity::class.java)
        intent.putExtra("EXTRA_DECADE", decade)
        startActivity(intent)
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
    }
}

