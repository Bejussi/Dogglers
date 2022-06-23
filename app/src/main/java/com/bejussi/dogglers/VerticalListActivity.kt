package com.bejussi.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bejussi.dogglers.adapter.DogCardAdapter
import com.bejussi.dogglers.const.Layout
import com.bejussi.dogglers.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}