package com.bochkarev.mikhail.cryptocurrencyapp.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Parent(
    val id: String,
    val name: String,
    val symbol: String
)