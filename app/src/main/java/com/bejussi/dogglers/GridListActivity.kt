package com.bejussi.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bejussi.dogglers.adapter.DogCardAdapter
import com.bejussi.dogglers.const.Layout
import com.bejussi.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}