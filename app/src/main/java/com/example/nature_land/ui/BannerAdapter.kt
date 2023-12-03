package com.example.nature_land.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nature_land.R
import com.example.nature_land.model.Banner

class BannerAdapter :
    RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    private val bannerList = mutableListOf<Banner>()

    inner class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bannerImageView: ImageView = itemView.findViewById(R.id.banner_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.banner_item, parent, false)
        return BannerViewHolder(view)
    }

    override fun getItemCount(): Int = bannerList.size

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        val banner = bannerList[position]
        holder.bannerImageView.setImageResource(banner.bannerImageView)
    }

    fun bindDataSet(dataset: List<Banner>) {
        bannerList.clear()
        bannerList.addAll(dataset)
        notifyDataSetChanged()
    }
}