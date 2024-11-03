package com.example.pppb1tugaspertemuan10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movie = intent.getParcelableExtra<Movie>("movie")

        val poster = findViewById<ImageView>(R.id.moviePoster)
        val title = findViewById<TextView>(R.id.movieTitle)
        val genre = findViewById<TextView>(R.id.movieGenre)
        val synopsis = findViewById<TextView>(R.id.movieSynopsis)

        if (movie != null) {
            poster.setImageResource(movie.poster)
            title.text = movie.title
            genre.text = movie.genre
            synopsis.text = movie.synopsis
        }
    }
}
