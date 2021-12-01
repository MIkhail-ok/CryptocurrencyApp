package com.bochkarev.mikhail.cryptocurrencyapp.presentation.coin_list

import com.bochkarev.mikhail.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
	val isLoading: Boolean = false,
	val coins: List<Coin> = emptyList(),
	val error: String = ""
)
