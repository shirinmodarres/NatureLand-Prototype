package com.example.nature_land.ui

import android.text.Spannable
import android.text.SpannableString
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nature_land.R
import com.example.nature_land.model.Product

class ProductsAdapter
    : RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {

    private val productList = mutableListOf<Product>()

    inner class ProductsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage: ImageView = itemView.findViewById(R.id.product_image)
        val productName: TextView = itemView.findViewById(R.id.product_name)
        val productBrand: TextView = itemView.findViewById(R.id.product_brand_name)
        val productOldPrice: TextView = itemView.findViewById(R.id.product_old_price)
        val productNewPrice: TextView = itemView.findViewById(R.id.product_new_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.product_cell, parent, false)
        return ProductsViewHolder(view)
    }


    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val product = productList[position]
        holder.productImage.setImageResource(product.imageView)
        holder.productName.text = product.name
        holder.productBrand.text = product.brand.brand.name
        if (product.newPrice != 0.000) {
            val oldPriceString = SpannableString("KD ${product.oldPrice}")
            oldPriceString.setSpan(StrikethroughSpan(), 0, oldPriceString.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

            holder.productOldPrice.text = oldPriceString
            holder.productNewPrice.text = "KD ${product.newPrice}"

        } else {
            holder.productNewPrice.text = "KD ${product.oldPrice}"
        }

    }

    fun bindDataSet(dataset: List<Product>) {
        productList.clear()
        productList.addAll(dataset)
        notifyDataSetChanged()
    }
}
