package com.example.words.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.words.R
import com.example.words.adapter.DetailWordAdapter
import com.example.words.data.ListDataWord

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
            // syntax for move to WordFragment
        }
        ivCategory.setOnClickListener {
            // syntax for move to WordFragment
        }

        // get data bundle from WordFragment
        val data = arguments?.getString("KEY_WORD")
        tvCategory.text = data

        // make object for Class ListDataWord
        val listDataWord = ListDataWord()

        var adapter: DetailWordAdapter? = null

        var detailWordAdapter: DetailWordAdapter? = null

        DetailWordAdapter(listDataWord.listDataWordA)

        // percabanga untuk menentukan data yang bakal dimunculkan
        if (data == "A"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordA)
            adapter = detailWordAdapter
        }else if (data == "B"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordB)
            adapter = detailWordAdapter
        }else if (data == "C"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordC)
            adapter = detailWordAdapter
        }else if (data == "D"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordD)
            adapter = detailWordAdapter
        }else if (data == "E"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordE)
            adapter = detailWordAdapter
        }else if (data == "F"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordF)
            adapter = detailWordAdapter
        }else if (data == "G"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordG)
            adapter = detailWordAdapter
        }else if (data == "H"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordH)
            adapter = detailWordAdapter
        }else if (data == "I"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordI)
            adapter = detailWordAdapter
        }else if (data == "J"){
            detailWordAdapter = DetailWordAdapter(listDataWord.listDataWordJ)
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

        adapter?.setOnItemClickListener(object : DetailWordAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val posisi = detailWordAdapter
                val text = "you clicked $posisi"
                val duration = Toast.LENGTH_SHORT
                val aplicationContext = activity?.applicationContext

                val toast = Toast.makeText(aplicationContext,text,duration)
                toast.show()

                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=$posisi"))
                startActivity(intent)
            }
        })

        return view
    }

}