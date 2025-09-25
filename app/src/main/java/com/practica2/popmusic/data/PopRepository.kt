package com.practica2.popmusic.data

object PopRepository {
    val songs = listOf(
        // 80s
        Song(1, "80s", "Michael Jackson", "Billie Jean", 1983,
            "Uno de los mayores éxitos de MJ, revolucionó el pop con su videoclip."),
        Song(2, "80s", "Michael Jackson", "Thriller", 1982,
            "El videoclip más famoso de la historia."),
        Song(3, "80s", "Madonna", "Like a Virgin", 1984,
            "Canción que consolidó a Madonna como la Reina del Pop."),
        Song(4, "80s", "Madonna", "Material Girl", 1985,
            "Himno de los 80s inspirado en Marilyn Monroe."),

        // 2010s
        Song(5, "2010s", "Lady Gaga", "Bad Romance", 2010,
            "Uno de los mayores éxitos de Gaga."),
        Song(6, "2010s", "Lady Gaga", "Born This Way", 2011,
            "Himno a la autoaceptación."),
        Song(7, "2010s", "Bruno Mars", "Just the Way You Are", 2010,
            "Canción romántica que lo catapultó a la fama."),
        Song(8, "2010s", "Bruno Mars", "Uptown Funk", 2014,
            "Colaboración con Mark Ronson que arrasó en listas.")
    )

    fun getSongsByDecade(decade: String) = songs.filter { it.decade == decade }

    fun getSongsByArtist(decade: String, artist: String) =
        songs.filter { it.decade == decade && it.artist == artist }

    fun getArtistsByDecade(decade: String): List<String> =
        songs.filter { it.decade == decade }
            .map { it.artist }
            .distinct()
}
