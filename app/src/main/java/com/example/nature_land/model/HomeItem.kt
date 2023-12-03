package com.example.nature_land.model

import com.example.nature_land.model.Category as CategoryModel
import com.example.nature_land.model.Banner as BannerModel

sealed class HomeItem {
    data class Banners(val list: List<BannerModel>): HomeItem()
    data class Categories(val list: List<CategoryModel>): HomeItem()
}
