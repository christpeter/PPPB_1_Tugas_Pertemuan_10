package com.example.pppb1tugaspertemuan10

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val context: Context, private val movies: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val poster: ImageView = view.findViewById(R.id.poster)
        val title: TextView = view.findViewById(R.id.title)
        val genre: TextView = view.findViewById(R.id.genre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.poster.setImageResource(movie.poster)
        holder.title.text = movie.title
        holder.genre.text = movie.genre

        holder.itemView.setOnClickListener {
            val intent = Intent(context, MovieDetailActivity::class.java)
            intent.putExtra("movie", movie)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}

private fun Intent.putExtra(s: String, movie: Movie) {

}
