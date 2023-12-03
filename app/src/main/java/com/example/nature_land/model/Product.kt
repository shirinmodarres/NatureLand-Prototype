package com.example.nature_land.model

import com.example.nature_land.Brands

data class Product(
    val name: String,
    val imageView: Int,
    val brand: Brands,
    var oldPrice: Double,
    var newPrice: Double = 0.000
)