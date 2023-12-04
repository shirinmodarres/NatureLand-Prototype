package com.example.nature_land.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
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
        holder.bannerImageView.setImageResource(banner.imageView)
    }

    fun bindDataSet(dataset: List<Banner>) {
        bannerList.clear()
        bannerList.addAll(dataset)
        notifyDataSetChanged()
    }


    fun updateDotIndicator(itemView: View, viewPager: ViewPager2, currentPosition: Int) {
        val itemCount = viewPager.adapter?.itemCount ?: 0
        if (itemCount > 1) {
            val dotIndicator: LinearLayout = itemView.findViewById(R.id.dotIndicator)
            dotIndicator.removeAllViews()
            for (i in 0 until itemCount) {
                val dotView = View(itemView.context)
                val dotSize =
                    itemView.resources.getDimensionPixelSize(if (i == currentPosition) R.dimen.dot_selected_size else R.dimen.dot_unselected_size)
                val dotMargin = itemView.resources.getDimensionPixelSize(R.dimen.dot_margin)

                val params = LinearLayout.LayoutParams(dotSize, dotSize)
                params.setMargins(dotMargin, 0, dotMargin, 0)
                dotView.layoutParams = params

                dotView.setBackgroundResource(if (i == currentPosition) R.drawable.dot_selected else R.drawable.dot_unselected)
                dotIndicator.addView(dotView)
            }
        }
    }
}