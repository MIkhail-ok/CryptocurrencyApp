package com.bochkarev.mikhail.cryptocurrencyapp.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Stats(
    val contributors: Int,
    val stars: Int,
    val subscribers: Int
)