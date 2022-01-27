package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var movie = Movie(name = "Captain america", rating = 9)

//        var movielist: ArrayList<Movie> = ArrayList();
//        movielist.add(Movie("Iron Man", rating = 7))

        var movieList = arrayListOf<Movie>(
            Movie(name = "iron Man", rating = 7),
            Movie(name = "iron Man 2", rating = 6),
        Movie(name = "iron Man 3", rating = 5),
        Movie(name = "iron Man 4", rating = 3),
        Movie(name = "iron Man 5", rating = 2),
        Movie(name = "iron Man 6", rating = 1),
        Movie(name = "iron Man 7", rating = 9)
        )

        val recyclerAdapter = RecyclerAdapter(movieList)
//        recyclerView.adapter = recyclerAdapter
//        recyclerView.addItemDecoration(DividerItemDecoration(this
//        ,DividerItemDecoration.VERTICAL))
//        recyclerView.setHasFixedSize(true)
        recyclerView.apply {
            adapter = recyclerAdapter
            addItemDecoration(DividerItemDecoration(this@MainActivity
        ,DividerItemDecoration.VERTICAL))
            setHasFixedSize(true)
        }
    }
}
