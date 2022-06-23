package com.bejussi.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bejussi.dogglers.adapter.DogCardAdapter
import com.bejussi.dogglers.const.Layout
import com.bejussi.dogglers.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        // Specify fixed size to improve performance
        binding.horizontalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}