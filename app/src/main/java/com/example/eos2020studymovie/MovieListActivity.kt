package com.example.eos2020studymovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {

    val movieList : ArrayList<Movie> = arrayListOf(
        Movie("Movie1", 22.5, "설명1", "2020-00-01", R.drawable.m1),
        Movie("테넷", 22.5, "설명2", "2020-08-26", R.drawable.m2),
        Movie("Movie3", 22.5, "설명3", "2020-00-03", R.drawable.m3),
        Movie("Movie4", 22.5, "설명4", "2020-00-04", R.drawable.m4)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        val adapter = MovieAdapter(this, movieList)
        movieRecycler.adapter = adapter

        val lm = LinearLayoutManager(this)
        movieRecycler.layoutManager = lm
    }
}