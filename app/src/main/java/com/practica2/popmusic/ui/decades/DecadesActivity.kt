package com.practica2.popmusic.ui.decades

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.practica2.popmusic.databinding.ActivityDecadesBinding
import com.practica2.popmusic.ui.artists.ArtistsActivity

class DecadesActivity : AppCompatActivity() {
    private lateinit var b: ActivityDecadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        com.practica2.popmusic.util.ThemeHelper.applyTheme(this)
        super.onCreate(savedInstanceState)
        // 2. Infla el layout
        b = ActivityDecadesBinding.inflate(layoutInflater)
        setContentView(b.root)

        // 3. Configura el switch (después de inflar)
        b.switchTheme.isChecked = getSharedPreferences("user_prefs", MODE_PRIVATE)
            .getBoolean("isDarkMode", false)

        b.switchTheme.setOnCheckedChangeListener { _, isChecked ->
            com.practica2.popmusic.util.ThemeHelper.saveThemePreference(this, isChecked)
            recreate() // Reinicia la Activity con el nuevo tema
        }

        // 4. Listeners de navegación
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

