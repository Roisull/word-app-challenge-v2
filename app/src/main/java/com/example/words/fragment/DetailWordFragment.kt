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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.words.R
import com.example.words.adapter.DetailWordAdapter
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

        // get data bundle from WordFragment
        val data = arguments?.getString("KEY_WORD")
        tvCategory.text = data

        // make object for Class ListDataWord
        val listDataWord = ListDataWord()

        var adapter: DetailWordAdapter? = null

        // percabanga untuk menentukan data yang bakal dimunculkan
        if (data == "A"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordA)
            adapter = detailWordAdapter
        }else if (data == "B"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordB)
            adapter = detailWordAdapter
        }else if (data == "C"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordC)
            adapter = detailWordAdapter
        }else if (data == "D"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordD)
            adapter = detailWordAdapter
        }else if (data == "E"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordE)
            adapter = detailWordAdapter
        }else if (data == "F"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordF)
            adapter = detailWordAdapter
        }else if (data == "G"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordG)
            adapter = detailWordAdapter
        }else if (data == "H"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordH)
            adapter = detailWordAdapter
        }else if (data == "I"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordI)
            adapter = detailWordAdapter
        }else if (data == "J"){
            val detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordJ)
            adapter = detailWordAdapter
        }

        // make layout manajer for detail word
        val lmLDW = LinearLayoutManager(activity)
        lmLDW.orientation = LinearLayoutManager.VERTICAL

        // memanggil recyclerView yang ada pada fragment Detai Word Fragmnet
        rvDetailWord = view.findViewById(R.id.rv_detail_word_container)

        // set layout manajer into recyclerView
        rvDetailWord.layoutManager = lmLDW

        // set adapter into recyclerView
        rvDetailWord.adapter = adapter

        return view
    }

}