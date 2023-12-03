package com.example.nature_land.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.nature_land.R
import com.example.nature_land.model.Banner

class BannerAdapter : PagerAdapter() {
    private val bannerList = mutableListOf<Banner>()

    override fun getCount(): Int {
        return bannerList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(container.context)
            .inflate(R.layout.banner_item, container, false)

        val bannerImageView: ImageView = view.findViewById(R.id.banner_item)
        val banner = bannerList[position]
        bannerImageView.setImageResource(banner.imageView)

        container.addView(view)

        return view
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }
    fun bindDataSet(dataset: List<Banner>) {
        bannerList.clear()
        bannerList.addAll(dataset)
        notifyDataSetChanged()
    }
}
