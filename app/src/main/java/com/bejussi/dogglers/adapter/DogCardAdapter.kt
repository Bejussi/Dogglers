package com.bejussi.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bejussi.dogglers.R
import com.bejussi.dogglers.data.DataSource
import com.bejussi.dogglers.model.Dog

class DogCardAdapter (
    private val context: Context,
    private val layout: Int,
    ): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    /**
     * Initialize view elements
     */

    private val dataset: List<Dog> = DataSource.dogs

    class DogCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageView: ImageView = view.findViewById(R.id.imageView)
        val nameTextView: TextView = view.findViewById(R.id.name_text_view)
        val ageTextView: TextView = view.findViewById(R.id.age_text_view)
        val hobbyTextView: TextView = view.findViewById(R.id.hobby_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(when(layout) {
                1,2 -> R.layout.vertical_horizontal_list_item
                else -> R.layout.grid_list_item
                                  }, parent, false)

        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataset[position]

        holder.imageView.setImageResource(item.imageResourceId)
        holder.nameTextView.text = item.name
        holder.ageTextView.text = item.age
        holder.hobbyTextView.text = context.resources?.getString(R.string.dog_hobbies, item.hobbies)
    }
}