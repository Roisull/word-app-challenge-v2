package com.example.words.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.words.R
import com.example.words.data.DataDetailWord

class DetailWordAdapter(private val listDetailWord: ArrayList<DataDetailWord>):RecyclerView.Adapter<DetailWordAdapter.ViewHolder>() {

    class ViewHolder(itemDetailWordView: View):RecyclerView.ViewHolder(itemDetailWordView){
        val detWord = itemDetailWordView.findViewById<TextView>(R.id.tv_detail_word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail_word,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.detWord.text = listDetailWord[position].detWord
    }

    override fun getItemCount(): Int {
        return listDetailWord.size
    }
}