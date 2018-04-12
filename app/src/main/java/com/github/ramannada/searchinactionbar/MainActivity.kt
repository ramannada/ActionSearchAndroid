package com.github.ramannada.searchinactionbar

import android.app.SearchManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.view.Menu
import android.widget.SearchView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.search_bar, menu)
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val search = menu?.findItem(R.id.menu_search)
        val searchView = search?.actionView as android.support.v7.widget.SearchView

        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))

        return true
    }
}
