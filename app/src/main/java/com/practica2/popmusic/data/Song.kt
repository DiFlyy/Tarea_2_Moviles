package com.practica2.popmusic.data

data class Song(
    val id: Int,
    val decade: String,
    val artist: String,
    val title: String,
    val year: Int,
    val trivia: String
)
