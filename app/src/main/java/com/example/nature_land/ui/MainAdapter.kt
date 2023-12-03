package com.example.nature_land.ui

import android.os.HardwarePropertiesManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.nature_land.Brands
import com.example.nature_land.R
import com.example.nature_land.model.Banner
import com.example.nature_land.model.Brand
import com.example.nature_land.model.Category
import com.example.nature_land.model.HomeItem
import com.example.nature_land.model.Product

class MainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mutableDataSet = mutableListOf<HomeItem>()

    fun bindDataSet(dataset: List<HomeItem>) {
        mutableDataSet.clear()
        mutableDataSet.addAll(dataset)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 1) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.banner_recycleview, parent, false)
            BannerRecyclerViewHolder(view)
        } else if (viewType == 2) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.category_recycleview, parent, false)
            CategoryRecyclerViewHolder(view)
        } else if (viewType == 3) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.product_recyclerview, parent, false)
            ProductRecyclerViewHolder(view)
        } else if (viewType == 4) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.product_recyclerview, parent, false)
            ProductRecyclerViewHolder(view)
        } else if (viewType == 5) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.product_recyclerview, parent, false)
            ProductRecyclerViewHolder(view)
        } else if (viewType == 6) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.banner_recycleview, parent, false)
            BannerRecyclerViewHolder(view)
        } else if (viewType == 7) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.brand_recyclerview, parent, false)
            BrandRecyclerViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.product_recyclerview, parent, false)
            ProductRecyclerViewHolder(view)
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (mutableDataSet[position]) {
            is HomeItem.Banners -> {
                holder as BannerRecyclerViewHolder
                holder.onBind((mutableDataSet[position] as HomeItem.Banners).list)
            }

            is HomeItem.Categories -> {
                holder as CategoryRecyclerViewHolder
                holder.onBind((mutableDataSet[position] as HomeItem.Categories).list)
            }

            is HomeItem.DiscountedProducts -> {
                holder as ProductRecyclerViewHolder
                holder.onBind(
                    (mutableDataSet[position] as HomeItem.DiscountedProducts).list,
                    "Discounted Products"
                )
            }

            is HomeItem.NewFromNatureLand -> {
                holder as ProductRecyclerViewHolder
                holder.onBind(
                    (mutableDataSet[position] as HomeItem.NewFromNatureLand).list,
                    "New From Natureland"
                )
            }

            is HomeItem.NewFromOtherBrands -> {
                holder as ProductRecyclerViewHolder
                holder.onBind(
                    (mutableDataSet[position] as HomeItem.NewFromOtherBrands).list,
                    "New From Other Brands"
                )
            }

            is HomeItem.ViewAllProductsBanner -> {
                holder as BannerRecyclerViewHolder
                holder.onBind((mutableDataSet[position] as HomeItem.ViewAllProductsBanner).list)
            }

            is HomeItem.ShopByBrands -> {
                holder as BrandRecyclerViewHolder
                holder.onBind(
                    (mutableDataSet[position] as HomeItem.ShopByBrands).list,
                    "Shop By Brands"
                )
            }

            is HomeItem.BestSelling -> {
                holder as ProductRecyclerViewHolder
                holder.onBind(
                    (mutableDataSet[position] as HomeItem.BestSelling).list,
                    "Best Selling"
                )
            }
        }
    }

    override fun getItemCount() = mutableDataSet.size

    override fun getItemViewType(position: Int): Int {
        return when (mutableDataSet[position]) {
            is HomeItem.Banners -> 1
            is HomeItem.Categories -> 2
            is HomeItem.DiscountedProducts -> 3
            is HomeItem.NewFromNatureLand -> 4
            is HomeItem.NewFromOtherBrands -> 5
            is HomeItem.ViewAllProductsBanner -> 6
            is HomeItem.ShopByBrands -> 7
            is HomeItem.BestSelling -> 8
        }
    }

    inner class BannerRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val bannerRecyclerView: RecyclerView =
            itemView.findViewById(R.id.banner_recycleView)
        private val bannerAdapter = BannerAdapter()

        init {
            bannerRecyclerView.setHasFixedSize(true)
            val layoutManager =
                LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL, false)

            bannerRecyclerView.layoutManager = layoutManager

            bannerRecyclerView.adapter = bannerAdapter

            val snapHelper: SnapHelper = LinearSnapHelper()
            snapHelper.attachToRecyclerView(bannerRecyclerView)
        }

        fun onBind(dataset: List<Banner>) {
            bannerAdapter.bindDataSet(dataset)
        }
    }

    inner class CategoryRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryHeaderTitle: TextView =
            itemView.findViewById(R.id.category_header_title)
        private val categoryRecyclerView: RecyclerView =
            itemView.findViewById(R.id.category_recycleview)
        private val categoryAdapter = CategoryAdapter()

        init {
            val layoutManager =
                LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL, false)

            categoryHeaderTitle.text = "Categories"
            categoryRecyclerView.setHasFixedSize(true)
            categoryRecyclerView.layoutManager = layoutManager

            categoryRecyclerView.adapter = categoryAdapter
        }

        fun onBind(dataset: List<Category>) {
            categoryAdapter.bindDataSet(dataset)
        }
    }

    inner class ProductRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productHeaderTitle: TextView =
            itemView.findViewById(R.id.product_header_title)
        private val productRecyclerView: RecyclerView =
            itemView.findViewById(R.id.product_recycleview)
        private val productAdapter = ProductsAdapter()

        init {
            val layoutManager =
                LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL, false)

            productRecyclerView.setHasFixedSize(true)
            productRecyclerView.layoutManager = layoutManager

            productRecyclerView.adapter = productAdapter
        }

        fun onBind(dataset: List<Product>, header: String) {
            productAdapter.bindDataSet(dataset)
            productHeaderTitle.text = header
        }
    }

    inner class BrandRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val brandHeaderTitle: TextView =
            itemView.findViewById(R.id.brand_header_title)
        private val brandRecyclerView: RecyclerView =
            itemView.findViewById(R.id.brand_recycleview)
        private val brandAdapter = BrandAdapter()

        init {
            val layoutManager =
                LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL, false)

            brandRecyclerView.setHasFixedSize(true)
            brandRecyclerView.layoutManager = layoutManager

            brandRecyclerView.adapter = brandAdapter
        }

        fun onBind(dataset: List<Brands>, header: String) {
            brandAdapter.bindDataSet(dataset)
            brandHeaderTitle.text = header
        }
    }

    /*    fun updateDotIndicator(itemView: View, currentPosition: Int) {
            val dotIndicator: LinearLayout = itemView.findViewById(R.id.dotIndicator)

            dotIndicator.removeAllViews()

            val itemCount = bannerAdapter.itemCount
            for (i in 0 until itemCount) {
                val dotView = View(context)
                val dotSize =
                    resources.getDimensionPixelSize(if (i == currentPosition) R.dimen.dot_selected_size else R.dimen.dot_unselected_size)
                val dotMargin = resources.getDimensionPixelSize(R.dimen.dot_margin)

                val params = LinearLayout.LayoutParams(dotSize, dotSize)
                params.setMargins(dotMargin, 0, dotMargin, 0)
                dotView.layoutParams = params

                dotView.setBackgroundResource(if (i == currentPosition) R.drawable.dot_selected else R.drawable.dot_unselected)
                dotIndicator.addView(dotView)

            }

        }*/
}