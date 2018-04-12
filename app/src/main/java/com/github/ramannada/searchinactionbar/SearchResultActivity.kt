package com.github.ramannada.searchinactionbar

import android.app.SearchManager
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SearchResultActivity : AppCompatActivity() {
    lateinit var mTvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_result)

        mTvResult = findViewById(R.id.tv_search_result)

        if (Intent.ACTION_SEARCH.equals(intent.action))
            handleSearch(intent.getStringExtra(SearchManager.QUERY))
    }

    private fun handleSearch(query: String) {
        mTvResult.text = query
    }
}
