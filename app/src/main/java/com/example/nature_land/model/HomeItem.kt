package com.example.nature_land.model

import com.example.nature_land.model.Banner as BannerModel
import com.example.nature_land.model.Category as CategoryModel
import com.example.nature_land.model.Product as ProductModel
import com.example.nature_land.Brands as BrandModel

sealed class HomeItem {
    data class Banners(val list: List<BannerModel>) : HomeItem()
    data class Categories(val list: List<CategoryModel>) : HomeItem()
    data class DiscountedProducts(val list: List<ProductModel>) : HomeItem()
    data class NewFromNatureLand(val list: List<ProductModel>) : HomeItem()
    data class NewFromOtherBrands(val list: List<ProductModel>) : HomeItem()
    data class ViewAllProductsBanner(val list: List<BannerModel>) : HomeItem()
    data class ShopByBrands(val list: List<BrandModel>) : HomeItem()
    data class BestSelling(val list: List<ProductModel>) : HomeItem()
}
