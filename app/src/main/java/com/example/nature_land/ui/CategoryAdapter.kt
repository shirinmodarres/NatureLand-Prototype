package com.example.nature_land.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nature_land.R
import com.example.nature_land.model.Category

class CategoryAdapter :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private val categoryList= mutableListOf<Category>()

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage: ImageView = itemView.findViewById(R.id.categoryImage)
        val categoryTitle: TextView = itemView.findViewById(R.id.categoryTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categoryList[position]
        holder.categoryImage.setImageResource(category.categoryImageView)
        holder.categoryTitle.text = category.name

    }

    fun bindDataSet(dataset: List<Category>) {
        categoryList.clear()
        categoryList.addAll(dataset)
        notifyDataSetChanged()
    }

}