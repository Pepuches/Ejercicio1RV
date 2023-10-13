package com.example.a1pantalla

import androidx.lifecycle.ViewModel
import com.example.a1pantalla.data.Product
import com.example.a1pantalla.data.getProducts
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProductListViewModel : ViewModel(){

    private var _productList = MutableStateFlow<List<Product>>(emptyList())
    val productList : StateFlow<List<Product>> = _productList

    init {
        _productList.value = getProducts()
    }

}