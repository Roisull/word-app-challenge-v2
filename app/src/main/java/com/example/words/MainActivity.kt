package com.example.words

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.words.fragment.DetailWordFragment
import com.example.words.fragment.WordFragment

class MainActivity : AppCompatActivity() {

    private var wordFragment = WordFragment()
    private var detailWordFragment = DetailWordFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // replace for first fragment = WordFragment.kt
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_main, wordFragment).commit()
    }
}