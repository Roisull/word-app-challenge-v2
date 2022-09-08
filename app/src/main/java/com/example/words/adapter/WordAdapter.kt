package com.example.words.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.words.R
import com.example.words.data.DataWord

class WordAdapter(private val listWord: ArrayList<DataWord>): RecyclerView.Adapter<WordAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val kata = itemView.findViewById<TextView>(R.id.tv_word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_word, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.kata.text = listWord[position].word
    }

    override fun getItemCount(): Int {
        return listWord.size
    }
}