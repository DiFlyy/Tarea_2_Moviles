package com.practica2.popmusic.util

import android.content.Context
import com.practica2.popmusic.R

object ThemeHelper {
    private const val PREFS_NAME = "user_prefs"
    private const val KEY_DARK_MODE = "isDarkMode"

    fun applyTheme(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val isDarkMode = prefs.getBoolean(KEY_DARK_MODE, false)

        if (isDarkMode) {
            context.setTheme(R.style.Theme_PopMusic_Dark)
        } else {
            context.setTheme(R.style.Theme_PopMusic_Light)
        }
    }

    fun saveThemePreference(context: Context, darkMode: Boolean) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit().putBoolean(KEY_DARK_MODE, darkMode).apply()
    }
}
