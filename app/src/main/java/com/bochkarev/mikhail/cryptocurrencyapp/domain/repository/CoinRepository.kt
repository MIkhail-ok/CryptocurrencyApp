package com.bochkarev.mikhail.cryptocurrencyapp.domain.repository

import com.bochkarev.mikhail.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.bochkarev.mikhail.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

	suspend fun getCoins(): List<CoinDto>

	suspend fun getCoinById(coinId: String): CoinDetailDto
}