package com.bochkarev.mikhail.cryptocurrencyapp.presentation.coin_detail

import com.bochkarev.mikhail.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
	val isLoading: Boolean = false,
	val coin: CoinDetail? = null,
	val error: String = ""
)
