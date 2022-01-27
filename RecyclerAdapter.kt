package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(private var movieList: ArrayList<Movie>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context);
        val view = layoutInflater.inflate(R.layout.recycler_row, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie=movieList[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int =movieList.size

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        init {
            itemView.setOnClickListener{
                val snack:String = "item position clicked: $absoluteAdapterPosition"
                Snackbar.make(itemView,snack,Snackbar.LENGTH_SHORT).show()
            }
        }

        fun bind(movie: Movie)
        {
            itemView.moviename_textview.text=movie.name
            itemView.rating_textview.text= movie.rating.toString()
        }
    }
}
