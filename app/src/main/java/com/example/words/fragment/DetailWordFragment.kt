package com.example.words.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.words.R
import com.example.words.data.ListDataWord

class DetailWordFragment : Fragment() {

    lateinit var rvDetailWord: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail_word, container, false)

        // memanggil recyclerView yang ada pada fragment Detai Word Fragmnet
        rvDetailWord = view.findViewById(R.id.rv_detail_word_container)



        return view
    }

}