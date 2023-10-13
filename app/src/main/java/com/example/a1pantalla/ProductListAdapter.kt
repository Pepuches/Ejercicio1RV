package com.example.a1pantalla

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.a1pantalla.data.Product
import com.example.a1pantalla.databinding.FragmentsProductsListBinding
import com.example.a1pantalla.databinding.LayoutProductItemBinding

class ProductListAdapter(
    private var items : List<Product>
    ) : RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    fun submitList(productList: List<Product>){
        items = productList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutProductItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = items[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ProductViewHolder(
        itemBinding : LayoutProductItemBinding
    ): RecyclerView.ViewHolder(itemBinding.root){

        private val image = itemBinding.imageViewProduct
        private val name = itemBinding.textViewProductName
        private val price = itemBinding.textviewProductPrice

        fun bind(product : Product){

            name.text = product.name
            price.text = "$${product.price} MXN"
            image.load(product.imageURL)
        }

    }

}