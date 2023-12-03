package com.example.nature_land

import com.example.nature_land.model.Banner
import com.example.nature_land.model.Brand
import com.example.nature_land.model.Category
import com.example.nature_land.model.Product

enum class Brands(brand: Brand) {
    NATURE_LAND(
        Brand(
            "Natureland",
            R.drawable.natureland
        )
    ),
    EARTH(
        Brand(
            "Earth",
            R.drawable.earth
        )
    ),
    BONATO(
        Brand(
            "Bonato",
            R.drawable.bonato
        )
    ),
    RAHA_BAKEHOUSE(
        Brand(
            "Raha Bakehouse",
            R.drawable.raha_bakehouse
        )
    ),
    NABAT(
        Brand(
            "Nabat",
            R.drawable.nabat
        )
    ),
    RAPUNZEL(
        Brand(
            "Rapunzel",
            R.drawable.rapunzel
        )
    ),
    KIKI_HEALTH(
        Brand(
            "KIKI Health",
            R.drawable.kiki_health
        )
    ),
    VITAL_PROTEINS(
        Brand(
            "Vital Proteins",
            R.drawable.vital_proteins
        )
    ),
    PUKKA(
        Brand(
            "Pukka",
            R.drawable.pukka
        )
    )
}

val bannerList = listOf(
    Banner(R.drawable.banner1, "banner1"),
    Banner(R.drawable.banner2, "banner2"),
    Banner(R.drawable.banner3, "banner3"),
    Banner(R.drawable.banner4, "banner4"),
    Banner(R.drawable.banner5, "banner5"),
    Banner(R.drawable.banner6, "banner6")
)

val categoryList = listOf(
    Category(R.drawable.fruits_vegetables, "Fruits & Vegetables"),
    Category(R.drawable.dairy_eggs, "Dairy & Eggs"),
    Category(R.drawable.frozen_foods, "Frozen Foods"),
    Category(R.drawable.bakery, "Bakery"),
    Category(R.drawable.baking_needs, "Baking Needs"),
    Category(R.drawable.honey_sweeteners, "Honey & Sweeteners"),
    Category(R.drawable.nutbutters_spreads, "Nut Butters & Spreads"),
    Category(R.drawable.breakfast_cereals, "Breakfast Cereals"),
    Category(R.drawable.spices_salts, "Spices & Salts"),
    Category(R.drawable.oils_vinegars, "Oils & Vinegars"),
)

val discounted = listOf(
    Product(
        name = "Frozen Whole Wheat Arabic",
        imageView = R.drawable.frozen_whole_wheat_arabic,
        brand = Brands.RAHA_BAKEHOUSE,
        oldPrice = 0.700,
        newPrice = 0.595
    ),
    Product(
        name = "Frozen Whole Spelt Arabic Bread",
        imageView = R.drawable.frozen_whole_spelt_arabic_bread,
        brand = Brands.RAHA_BAKEHOUSE,
        oldPrice = 0.900,
        newPrice = 0.765
    ),
    Product(
        name = "Frozen Whole Rye Arabic Bread",
        imageView = R.drawable.frozen_whole_rye_arabic_bread,
        brand = Brands.RAHA_BAKEHOUSE,
        oldPrice = 0.750,
        newPrice = 0.640
    ),
    Product(
        name = "Frozen_black_rice_arabic_bread",
        imageView = R.drawable.frozen_black_rice_arabic_bread,
        brand = Brands.RAHA_BAKEHOUSE,
        oldPrice = 0.900,
        newPrice = 0.765
    ),
    Product(
        name = "Medium Rye 1370 Flour",
        imageView = R.drawable.medium_rye_1370_flour,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.650,
        newPrice = 2.000
    ),
    Product(
        name = "Medium Spelt 1050 Flour",
        imageView = R.drawable.medium_spelt_1050_flour,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850,
        newPrice = 2.150
    )
)

val newFromNatureland = listOf(
    Product(
        name = "Choco Hazelnut Ice Cream",
        imageView = R.drawable.choco_hazelnut_ice_cream,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850,
        newPrice = 0.000
    ),
    Product(
        name = "Lemon Ginger Sorbet",
        imageView = R.drawable.lemon_ginger_sorbet,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850
    ),
    Product(
        name = "Bourbon Vanilla Ice Cream",
        imageView = R.drawable.bourbon_vanilla_ice_cream,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850
    ),
    Product(
        name = "Honey Mango Sorbet",
        imageView = R.drawable.honey_mango_sorbet,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850
    ),
    Product(
        name = "Honey Cacao Ice Cream",
        imageView = R.drawable.honey_cacao_ice_cream,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850
    ),
    Product(
        name = "Cream & Honey Ice Cream",
        imageView = R.drawable.cream_honey_ice_cream,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.850
    )
)

val newFromOtherBrands = listOf(
    Product(
        name = "Desiccated Coconut Medium",
        imageView = R.drawable.desiccated_coconut_medium,
        brand = Brands.BONATO,
        oldPrice = 0.650
    ),
    Product(
        name = "Yellow Split Lentils",
        imageView = R.drawable.yellow_split_lentils,
        brand = Brands.BONATO,
        oldPrice = 1.600
    ),
    Product(
        name = "Red Lentils",
        imageView = R.drawable.red_lentils,
        brand = Brands.BONATO,
        oldPrice = 1.350
    ),
    Product(
        name = "Medium White Beans",
        imageView = R.drawable.medium_white_beans,
        brand = Brands.BONATO,
        oldPrice = 1.500
    ),
    Product(
        name = "Gluten Free Fine Oats",
        imageView = R.drawable.gluten_free_fine_oats,
        brand = Brands.BONATO,
        oldPrice = 1.650
    ),
    Product(
        name = "Golden Flax Seeds",
        imageView = R.drawable.golden_flax_seeds,
        brand = Brands.BONATO,
        oldPrice = 1.650
    )
)

val bestSelling = listOf(
    Product(
        name = "Virgin Coconut Oil",
        imageView = R.drawable.virgin_coconut_oil,
        brand = Brands.NATURE_LAND,
        oldPrice = 3.950
    ),
    Product(
        name = "Cider Vinegar",
        imageView = R.drawable.cider_vinegar,
        brand = Brands.NATURE_LAND,
        oldPrice = 1.850
    ),
    Product(
        name = "Demeter Brown Basmati Rice",
        imageView = R.drawable.demeter_brown_basmati_rice,
        brand = Brands.NATURE_LAND,
        oldPrice = 1.850
    ),
    Product(
        name = "Noreez",
        imageView = R.drawable.noreez,
        brand = Brands.NATURE_LAND,
        oldPrice = 0.500
    ),
    Product(
        name = "Tortilla Chips-Bluecorn",
        imageView = R.drawable.tortilla_chips_bluecorn,
        brand = Brands.NATURE_LAND,
        oldPrice = 2.300
    ),
    Product(
        name = "Orange Juice",
        imageView = R.drawable.orange_juice,
        brand = Brands.NATURE_LAND,
        oldPrice = 1.950
    )
)