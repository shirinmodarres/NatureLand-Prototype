package com.example.nature_land

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.nature_land.model.Banner
import com.example.nature_land.model.HomeItem
import com.example.nature_land.ui.BannerAdapter
import com.example.nature_land.ui.MainAdapter

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        init()
    }

    private fun init() {
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val mainRecyclerView: RecyclerView = findViewById(R.id.mainRecyclerView)
        mainRecyclerView.layoutManager = layoutManager
        val mainAdapter = MainAdapter()
        mainAdapter.bindDataSet(
            listOf(
                HomeItem.Banners(bannerList),
                HomeItem.Categories(categoryList),
                HomeItem.DiscountedProducts(discounted),
                HomeItem.NewFromNatureLand(newFromNatureland),
                HomeItem.NewFromOtherBrands(newFromOtherBrands),
                HomeItem.ViewAllProductsBanner(listOf(Banner(R.drawable.view_all_products_banner,"View All Products"))),
                HomeItem.ShopByBrands(Brands.values().toList()),
                HomeItem.BestSelling(bestSelling)
            )
        )
        mainRecyclerView.adapter = mainAdapter

    }

}
