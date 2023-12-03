package com.example.nature_land.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nature_land.Brands
import com.example.nature_land.R
import com.example.nature_land.model.Brand

class BrandAdapter: RecyclerView.Adapter<BrandAdapter.BrandViewHolder>() {

    private val brandList= mutableListOf<Brands>()

    inner class BrandViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val brandImage: ImageView = itemView.findViewById(R.id.brand_image)
        val brandTitle: TextView = itemView.findViewById(R.id.brand_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.brand_cell, parent, false)
        return BrandViewHolder(view)
    }

    override fun getItemCount(): Int = brandList.size

    override fun onBindViewHolder(holder: BrandViewHolder, position: Int) {
        val brand = brandList[position].brand
        holder.brandImage.setImageResource(brand.imageView)
        holder.brandTitle.text = brand.name

    }

    fun bindDataSet(dataset: List<Brands>) {
        brandList.clear()
        brandList.addAll(dataset)
        notifyDataSetChanged()
    }

}