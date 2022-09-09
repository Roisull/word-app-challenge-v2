package com.example.words.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.words.R
import com.example.words.data.DataDetailWord
import com.example.words.data.DataWord
import com.example.words.data.ListDataWord
import java.io.Serializable

class DetailWordFragment : Fragment() {

    lateinit var rvDetailWord: RecyclerView

    lateinit var tvCategory: TextView
    lateinit var ivCategory: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail_word, container, false)

        // click action category
        tvCategory = view.findViewById(R.id.tv_category_word)
        ivCategory = view.findViewById(R.id.iv_category_word)
        tvCategory.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_detailWordFragment_to_wordFragment)
        }
        ivCategory.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_detailWordFragment_to_wordFragment)
        }



        // memanggil recyclerView yang ada pada fragment Detai Word Fragmnet
        rvDetailWord = view.findViewById(R.id.rv_detail_word_container)



        return view
    }

}